
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LengthConverterTest {

    @Test
    fun testFeetToMeters() {
        assertEquals(0.3048, feetToMeters(1.0), 0.001)
        assertEquals(3.6576, feetToMeters(12.0), 0.001)
        assertEquals(0.0, feetToMeters(0.0), 0.001)
    }

    @Test
    fun testNegativeFeetToMeters() {
        assertFailsWith<IllegalArgumentException> {
            feetToMeters(-1.0)
        }
    }
    @Test
    fun testMetersToFeet() {
        assertEquals(3.2808, metersToFeet(1.0), 0.001)
        assertEquals(39.3701, metersToFeet(12.0), 0.001)
        assertEquals(0.0, metersToFeet(0.0), 0.001)
    }

    @Test
    fun testNegativeMetersToFeet() {
        assertFailsWith<IllegalArgumentException> {
            metersToFeet(-1.0)
        }
    }

    @Test
    fun testArshinsToMeters() {
        assertEquals(1.4084, arshinsToMeters(1.0), 0.001)
        assertEquals(16.9014, arshinsToMeters(12.0), 0.001)
        assertEquals(0.0, arshinsToMeters(0.0), 0.001)
    }

    @Test
    fun testNegativeArshinsToMeters() {
        assertFailsWith<IllegalArgumentException> {
            arshinsToMeters(-1.0)
        }
    }
    @Test
    fun testMetersToArshins() {
        assertEquals(0.71, metersToArshins(1.0), 0.001)
        assertEquals(8.52, metersToArshins(12.0), 0.001)
        assertEquals(0.0, metersToArshins(0.0), 0.001)
    }

    @Test
    fun testNegativeMetersToArshins() {
        assertFailsWith<IllegalArgumentException> {
           metersToArshins(-1.0)
        }
    }
}