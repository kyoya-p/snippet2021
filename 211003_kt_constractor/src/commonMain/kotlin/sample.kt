package common

var order = 0

class C(
    val obj: String,
    val v1: C0,
) {
    class C0(msg: String) {
        init {
            println(msg)
        }

        companion object {
            val v0 = println("${++order} companion object of inner class")
        }
    }

    init {
        println("${++order} init 1st")
    }

    val v3 = C0("${++order} Member")

    init {
        println("${++order} init 2nd")
    }

    constructor(c1: Int) : this("Secondary Constructor", C0("${++order} Secondary Constructor")) {
        println("${++order} Secondary Constructor")
    }

    companion object {
        val v0 = println("${++order} companion object{}")
    }
}

val staticObject = C(1)

fun main() {
    println("${++order} Main()")
    val c = C(1)
}