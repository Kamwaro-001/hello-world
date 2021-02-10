interface PracticeInterface {
    fun responses(answer: PracticeClass){}
}

class David : PracticeInterface {
    val reasonForCall= mutableListOf("to ask what to buy", "to ask whether there is food", "ask about the weather")
    val defaultStuff = listOf("milk", "Cakes")
    val otherStuff = mutableListOf("cabbage", "Sukuma", "Matchbox")

    fun query1(){
        val indexWhyCall = 0
        when (indexWhyCall) {
            0 -> {
                println("David is calling ${reasonForCall[indexWhyCall]}")
                println("Response: \"Buy ${defaultStuff}, ${otherStuff}\"")
            }
            1 -> {
                println("David is calling ${reasonForCall[indexWhyCall]}")
                println("Response: \"Yes there is\"")
            }
            2 -> {
                println("David is calling ${reasonForCall[indexWhyCall]}")
                println("Response: \"The Weather is Just fine\"")
            }
            else -> println("I have No idea why David is calling")
        }
    }

}

