import java.lang.Thread.sleep

fun main() {

    println("Welcome to Adventure Game, please enter your name...!")
    val playerOne = PlayerInfo(readLine()!!)
    println("\nHello ${playerOne.playerName}, glad you choose to begin your journey with us.\nDo you want to ride on a dragon or horse for the journey?(Case sensitive)")
    println("[Y]\t[N]")

    when (readLine()){

        "Y" -> {

            println("\nChoose your partner:\n[D] Dragon\t[H] Horse")
            playerOne.hasSteed = true

            when (readLine()){

                "D" -> {

                    playerOne.playerPartner = "Dragon"
                    println("\nDragon is your partner now.\n")

                }
                "H" -> {

                    playerOne.playerPartner = "Horse"
                    println("\nHorse is your partner now.\n")

                }
            }
        }
        "N" -> println("\nExcellent, walking is the most ancient and best exercise.\n")
    }

    sleep(2000)
    println("Thanks for completing your profile. Here is your reward:\n")
    sleep(2000)
    println("You received 100 gold coins.\n")
    sleep(2000)
    println("You are allowed to keep some gold coins with you as you progress through your journey.\nYou can use it to buy things from shop.\n")
    sleep(4000)
    playerOne.printProfile()
    sleep(3000)
    println("There's a pub out there, do you want to visit it?\n[Y]\t[N]")

    when (readLine()){

        "Y" -> {

            val pub = PubInfo()
            pub.publicanName = "Jack"
            pub.pubName = PUB_NAME
            pub.menu = mapOf("mead" to 50, "wine" to 100, "LaCroix" to 90)

            println("\nJack: Welcome to ${pub.pubName}, My name is ${pub.publicanName}. How may I serve you sir?\n")
            sleep(2000)
            pub.showMenu()

            when (readLine()) {

                "1" -> playerOne.deductGold(pub.menu.values.toList().get(0))
                "2" -> playerOne.deductGold(pub.menu.values.toList().get(1))
                "3" -> playerOne.deductGold(pub.menu.values.toList().get(2))

            }
            println("Jack: Here is your drink sir! I have one more thing for you.\n")
            sleep(2000)
            println("You received magical mirror from Jack.\n")
            sleep(2000)
            println("Jack: This mirror shows you mystical things at certain time, use it wisely\n")
            sleep(2000)
            println("Do you want to use it now?\n[Y]\t[N]")

            when (readLine()) {

                "Y" -> {

                    println()
                    playerOne.playerName.reversed().forEach {

                        print(it)
                        sleep(500)

                    }
                    println("\n\nYou: Ummm... That's reflection of my name")

                }
                "N" -> println("\nCome back when you wish to restart the game.")
            }
        }
        "N" -> println("\nCome back when you wish to restart the game.")
    }
}