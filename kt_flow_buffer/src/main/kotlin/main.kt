import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime

@FlowPreview
@ExperimentalCoroutinesApi
@ExperimentalTime
fun main() = runBlocking {
    main_collect()
    main_buffer()
    main_collectLatest()
    main_flatMapLatest()
    main_flatMapConcat()
    main_flatMapMerge()
}

@ExperimentalTime
suspend fun main_collect() {
    println("main_collect()")
    // collect() すべての入力を処理する。入力処理が終わるまで次の入力を受け付けない。
    // デフォルトでは出力と入力処理に必要な時間の総和が全体の処理時間となる
    // この例では、(100ms+200ms)*repeat(4)=900msの時間がかかる
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで出力するソース
        repeat(3) { i ->
            emit("[${now()}]flow:$i")
            delay(100)
        }
    }.collect { i -> // 1回/200ms で入力を処理するシンク
        delay(200)
        println("$i - [${now()}]collect")
    }
}

@ExperimentalTime
suspend fun main_buffer() {
    println("main_buffer()")
    // buffer(): イベントをバッファする
    // この例では、
    // バッファが十分にあるためソースは出力処理の後シンクが入力処理を終わる前に次の出力が可能
    // ソースよりシンクの処理に時間がかかるため、シンクの入力処理時間の総和が全体の処理時間になる
    // 結果200ms*repeat(3)=600msの時間がかかる
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(3) { i ->
            emit("[${now()}]flow:$i")
            delay(100)
        }
    }.buffer(10).collect { i -> // 1回/200ms で処理するシンク
        delay(200)
        println("$i - [${now()}]collect")
    }
}

@ExperimentalTime
suspend fun main_collectLatest() {
    println("main_collectLatest()")
    // collectLatest{} イベントが発生したとき、実行中のシンクの処理を中断する。
    // この例では
    // イベントの処理中かならず次のイベントが発生する。その場合処理が中断する。
    // 最後のイベントのみ完了し、それ以外はすべて中断される。
    // 200msに出力する3回目のイベントを処理し400msで完了する。
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds
    flow { // 1回/100msで出力
        repeat(3) { i ->
            emit("[${now()}]flow:$i")
            delay(100)
        }
    }.collectLatest { i -> // 1回/200ms で入力を処理
        delay(200)
        println("$i - [${now()}]collectLatest")
    }
}

@ExperimentalCoroutinesApi
@ExperimentalTime
suspend fun main_flatMapLatest() {
    println("main_flatMapLatest()")
    // flatMapLatest{} 入力があったとき、出力処理をキャンセルする。 collectLatest()同様
    // この例では
    // 100ms*3 + 60ms*3 = 480ms の全体処理時間となる
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(3) { i ->
            delay(100)
            emit("[${now()}]flow:$i")
        }
    }.flatMapLatest { i ->
        flow { //入力ごとに3回出力だが、この例では2回目の前に次の入力がありキャンセルされる
            repeat(3) {
                delay(60)
                emit("$i - [${now()}]flatMapLast:$it")
            }
        }
    }.collect { i ->
        println("$i - [${now()}]collect")
    }
}

@FlowPreview
@ExperimentalTime
suspend fun main_flatMapConcat() {
    println("main_flatMapConcat()")
    // flatMapConcat{} 入力に対応し出力する。出力処理完了まで次の入力をブロック。
    // この例では、
    // 100ms*3 + 50ms*3*3 = 750ms 全体の処理に必要
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(3) { i ->
            emit("[${now()}]flow:$i")
            delay(100)
        }
    }.flatMapConcat { i ->
        flow { //イベントを受けるごとに3回別のイベントを発生
            repeat(3) {
                emit("$i - [${now()}]flatMapConcat:$it")
                delay(50)
            }
        }
    }.collect { i -> // 1回/200ms で処理するシンク
        println("$i - [${now()}]collect")
    }
}


@FlowPreview
@ExperimentalTime
suspend fun main_flatMapMerge() {
    println("main_flatMapMerge()")
    // flatMapMerge{} 入力に対応し出力する。出力処理完了を待たず次の入力に対応し出力処理を行う。
    // この例では、
    // 300ms(3回目の出力) + 60ms*3 = 480ms が全体処理時間
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(3) { i ->
            delay(100)
            emit("[${now()}]flow:$i")
        }
    }.flatMapMerge { i ->
        flow { //入力ごとに3回出力だが、この例では2回目の前に次の入力がありキャンセルされる
            repeat(3) {
                delay(60)
                emit("$i - [${now()}]flatMapLast:$it")
            }
        }
    }.collect { i ->
        println("$i - [${now()}]collect")
    }
}
