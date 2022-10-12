var greetingFunction: (String) -> String = { thingToGreet ->
    "Hello $thingToGreet"
}

fun main() {
    println(greetingFunction("World"))
    println(greetingFunction("Kotlin"))
    greetingFunction = { thingToGreet ->
        "Hello $thingToGreet!"   //within a lambda you don't need to explicitly call return
    }
    println(greetingFunction.invoke("Kotlin Programming"))
}



