import org.junit.Test
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class TemperatureConverterTest {

    @Test
    fun testCelsiusToFahrenheit() {
        val celsius = 1.0
        val expectedFahrenheit = 33.8
        assertEquals(expectedFahrenheit, сelsiusToFahrenheit(celsius), 0.001)
    }


    @Test
    fun testFahrenheitToCelsius() {
        val fahrenheit = 33.8
        val expectedCelsius = 1.0
        assertEquals(expectedCelsius, fahrenheitToCelsius(fahrenheit), 0.001)
    }


    @Test
    fun testCelsiusToReaumur() {
        val celsius = 1.25
        val expectedReaumur = 1.0
        assertEquals(expectedReaumur, celsiusToReaumur(celsius), 0.001)
    }


    @Test
    fun testReaumurToCelsius() {
        val reaumur = 1.0
        val expectedCelsius = 1.25
        assertEquals(expectedCelsius, reaumurToCelsius(reaumur), 0.001)
    }

}