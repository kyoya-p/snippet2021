import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.Clock
import java.time.Duration
import kotlin.time.ExperimentalTime

@ExperimentalTime
fun main() = runBlocking {
    //main1()
    //main2()
    main3()
}

@ExperimentalTime
suspend fun main1() {
    // 結果(100ms+200ms)*repeat(10)=3000msの時間がかかる
    // 直列動作なのでソースとシンクで必要な時間の総和が全体の処理時間となる

    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(10) { i ->
            println("[${now()}] emit:$i")
            emit(i)
            delay(100)
        }
    }.collect { i -> // 1回/200ms で処理するシンク
        delay(200)
        println("[${now()}] process complete:$i")
    }
}

@ExperimentalTime
suspend fun main2() {
    // buffer(): イベント処理をバッファする場合
    // 結果200ms*repeat(10)=2000msの時間がかかる
    // この例ではバッファが十分にあるためソース生成に必要な時間の後すぐに次のイベントを送信できる
    // この例ではソースよりシンク処理に時間がかかるため、シンクに必要な時間の総和が全体の処理時間になる
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(10) { i ->
            println("[${now()}] emit:$i")
            emit(i)
            delay(100)
        }
    }
        .buffer(10)
        .collect { i -> // 1回/200ms で処理するシンク
            delay(200)
            println("[${now()}] process complete:$i")
        }

}

@ExperimentalTime
suspend fun main3() {
    // collectLatest{} イベントが発生したとき、実行中のcollect内の処理を中断する。
    // この例ではイベントの処理中かならず次のイベントが発生する。その場合処理が中断する。
    // この例では最後のイベントのみ完了し、それ以外はすべて中断される。
    val start = Clock.System.now()
    fun now() = (Clock.System.now() - start).inWholeMilliseconds

    flow { // 1回/100msで発生するソース
        repeat(10) { i ->
            println("[${now()}] emit:$i")
            emit(i)
            delay(100)
        }
        }.collectLatest { i -> // 1回/200ms で処理するシンク
        println("[${now()}] process start:$i")
        delay(200)
        println("[${now()}] process complete:$i")
    }
}
