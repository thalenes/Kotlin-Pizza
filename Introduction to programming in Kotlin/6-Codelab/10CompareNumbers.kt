fun main(){
    println(tiempoPerdido(timeSpentToday = 30, timeSpentYesterday = 40))
}

fun tiempoPerdido(timeSpentToday: Int, timeSpentYesterday: Int) : Boolean{
   val perdisteTiempo: Boolean = timeSpentToday > timeSpentYesterday

   return perdisteTiempo
}