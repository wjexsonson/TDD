import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class TemperatureConverterTest {

    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, celsiusToFahrenheit(0.0), 0.001)
        assertEquals(212.0, celsiusToFahrenheit(100.0), 0.001)
        assertEquals(-40.0, celsiusToFahrenheit(-40.0), 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, fahrenheitToCelsius(32.0), 0.001)
        assertEquals(100.0, fahrenheitToCelsius(212.0), 0.001)
        assertEquals(-40.0, fahrenheitToCelsius(-40.0), 0.001)
    }

    @Test
    fun testCelsiusToReaumur() {
        assertEquals(0.0, celsiusToReaumur(0.0), 0.001)
        assertEquals(80.0, celsiusToReaumur(100.0), 0.001)
        assertEquals(-32.0, celsiusToReaumur(-40.0), 0.001)
    }

    @Test
    fun testReaumurToCelsius() {
        assertEquals(0.0, reaumurToCelsius(0.0), 0.001)
        assertEquals(100.0, reaumurToCelsius(80.0), 0.001)
        assertEquals(-40.0, reaumurToCelsius(-32.0), 0.001)
    }

}