fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(args: Array<String>) {
    val person = Person()
    person.printInfo()
    person.printInfo()
}

