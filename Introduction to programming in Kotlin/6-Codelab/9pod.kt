fun main() {
    val pasos: Int = 200
    val caloriasQuemadas: Double = podometroCaloriasQuemadas(pasos);
    println("Caminando $pasos pasos quemas $caloriasQuemadas calorias")
}

fun podometroCaloriasQuemadas(numeroPasos: Int): Double {
    val caloriasPorPaso = 0.04
    val totalCalorias: Double = numeroPasos * caloriasPorPaso
    return totalCalorias
}