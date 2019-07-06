const val PUB_NAME = "Unicorn's Horn"

class PubInfo {

    var pubName = ""
    var publicanName = ""
    var menu = mapOf<String, Int>()

    fun showMenu(){

        menu.forEach {

            println("[${menu.keys.indexOf(it.key) + 1}] ${it.key}: ${it.value} gold coin(s)")

        }
    }
}