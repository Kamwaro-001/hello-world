class Person (val firstName: String = "Job", val lastName: String = "Kamwaro"){

    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get(){
            println("the return value is $field")
            return field
        }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}
