import java.lang.Thread.sleep

class PlayerInfo(name: String){

    val playerName = name.toString().toUpperCase()
    var playerPartner: String? = ""
    var hasSteed = false
    var goldAmount = 100

    fun printProfile(){

        println("Your current profile is:\n")
        if(hasSteed)
            println("Name: $playerName\nPartner: $playerPartner\nGold amount: $goldAmount\n")
        else
            println("Name: $playerName\nPartner: No partner\nGold amount: $goldAmount\n")

    }

    fun deductGold(value: Int){

        goldAmount -= value
        println("\n$value coins have been deducted from your inventory.\n")
        sleep(2000)

    }

}