fun feetToMeters(feet: Double): Double {
    return feet * 0.3048
}

fun metersToFeet(meters: Double): Double {
    return meters / 0.3048
}

fun metersToArshins(meters: Double): Double {
    return meters * 0.71
}

fun arshinsToMeters(arshins: Double): Double {
    return arshins / 0.71
}

fun kilogramsToPounds(kilograms: Double): Double {
    return kilograms * 2.20462
}

fun poundsToKilograms(pounds: Double): Double {
    return pounds / 2.20462
}

fun kilogramsToPoods(kilograms: Double): Double {
    return kilograms * 0.061048
}

fun poodsToKilograms(poods: Double): Double {
    return poods / 0.061048
}
fun main(args: Array<String>) {

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}