fun main() {
   println(stateCity(city = "Ankara", lowTemp = 27, highTemp = 31, rain = 82))
   println(stateCity(city = "Tokyo", lowTemp = 17, highTemp = 24, rain = 3))
   println(stateCity(city = "CapeTown", lowTemp = 20, highTemp = 40, rain = 42))
   println(stateCity(city = "Guatemala City", lowTemp = 50, highTemp = 55, rain = 0))
}

fun stateCity(city: String, lowTemp: Int, highTemp: Int, rain: Int): String{
    
   return "City:$city\nLow Temperature:$lowTemp, High Temperature:$highTemp\nChance of Rain:$rain%\n"
}