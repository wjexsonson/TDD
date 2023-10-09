import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Выберите тип конвертации:")
    println("1. Длина")
    println("2. Масса")
    println("3. Температура")
    val choice = scanner.nextInt()

    when (choice) {
        1 -> {
            handleLengthConversion(scanner)
        }
        2 -> {
            handleWeightConversion(scanner)
        }
        3 -> {
            handleTemperatureConversion(scanner)
        }
        else -> println("Неправильный выбор")
    }
}

fun handleLengthConversion(scanner: Scanner) {
    println("Выберите единицы измерения для конвертации:")
    println("1. Метры в футы")
    println("2. Футы в метры")
    println("3. Метры в аршины")
    println("4. Аршины в метры")
    val lengthChoice = scanner.nextInt()

    when (lengthChoice) {
        1 -> handleConversion("метров", "футов", ::metersToFeet, scanner)
        2 -> handleConversion("футов", "метров", ::feetToMeters, scanner)
        3 -> handleConversion("метров", "аршинов", ::metersToArshins, scanner)
        4 -> handleConversion("аршинов", "метров", ::arshinsToMeters, scanner)
        else -> println("Неправильный выбор")
    }
}

fun handleWeightConversion(scanner: Scanner) {
    println("Выберите единицы измерения для конвертации:")
    println("1. Килограммы в фунты")
    println("2. Фунты в килограммы")
    println("3. Килограммы в пуды")
    println("4. Пуды в килограммы")
    val weightChoice = scanner.nextInt()

    when (weightChoice) {
        1 -> handleConversion("килограмм", "фунтов", ::kilogramsToPounds, scanner)
        2 -> handleConversion("фунтов", "килограмм", ::poundsToKilograms, scanner)
        3 -> handleConversion("килограмм", "пудов", ::kilogramsToPoods, scanner)
        4 -> handleConversion("пудов", "килограмм", ::poodsToKilograms, scanner)
        else -> println("Неправильный выбор")
    }
}

fun handleTemperatureConversion(scanner: Scanner) {
    println("Выберите единицы измерения для конвертации:")
    println("1. Цельсий в Фаренгейт")
    println("2. Фаренгейт в Цельсий")
    println("3. Цельсий в Реомюр")
    println("4. Реомюр в Цельсий")
    val temperatureChoice = scanner.nextInt()

    when (temperatureChoice) {
        1 -> handleConversion("градусов Цельсия", "градусов Фаренгейта", ::celsiusToFahrenheit, scanner)
        2 -> handleConversion("градусов Фаренгейта", "градусов Цельсия", ::fahrenheitToCelsius, scanner)
        3 -> handleConversion("градусов Цельсия", "градусов Реомюра", ::celsiusToReaumur, scanner)
        4 -> handleConversion("градусов Реомюра", "градусов Цельсия", ::reaumurToCelsius, scanner)
        else -> println("Неправильный выбор")
    }
}

fun handleConversion(inputUnit: String, outputUnit: String, converter: (Double) -> Double, scanner: Scanner) {
    println("Введите значение в $inputUnit(Если необходимо ввести не целые числа, ввод осуществляется через запятую):")
    val inputValue = scanner.nextDouble()
    val result = converter(inputValue)
    println("$inputValue $inputUnit = $result $outputUnit")

}
fun feetToMeters(feet: Double): Double {
    if (feet>=0){
    return feet * 0.3048
    }
    else{
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun metersToFeet(meters: Double): Double {
    if (meters>=0){
    return meters / 0.3048
    }
    else{
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun metersToArshins(meters: Double): Double {
    if (meters>=0){
    return meters * 0.71}
    else {
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun arshinsToMeters(arshins: Double): Double {
    if (arshins>=0){
    return arshins / 0.71
    }
    else{
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun kilogramsToPounds(kilograms: Double): Double {
    if (kilograms>=0){
    return kilograms * 2.20462
    }
    else {
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun poundsToKilograms(pounds: Double): Double {
    if (pounds>=0){
    return pounds / 2.20462
    }
    else{
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun kilogramsToPoods(kilograms: Double): Double {
    if (kilograms>=0){
    return kilograms * 0.061048
    }
    else {
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}

fun poodsToKilograms(poods: Double): Double {
    if (poods>=0) {
        return poods / 0.061048
    }
    else {
        throw IllegalArgumentException("Значение должно быть неотрицательным")
    }
}
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun celsiusToReaumur(celsius: Double): Double {
    return celsius * 4 / 5
}

fun reaumurToCelsius(reaumur: Double): Double {
    return reaumur * 5 / 4
}

