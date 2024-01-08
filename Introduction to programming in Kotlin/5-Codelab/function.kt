fun main(){
   // farnese()
   println(farneseString())
   println(farneseParametro( name = "Farnese", age = 18))
}

fun farnese() : Unit {
    println("My name is Farnese")
    println("I have 18 years")
}

fun farneseString() : String {
    val name: String = "Farnese"
    return "$name"
}

fun farneseParametro(name: String, age: Int) : String {
    val par : String = "Hello $name"
    var parAge : String = "Wow!, You have $age years old" 
    
    return "$par\n$parAge"
}