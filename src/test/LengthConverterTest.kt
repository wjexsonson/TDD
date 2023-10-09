import org.junit.Test
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class LengthConverterTest {

    @Test
    fun testFeetToMeters() {
        val feet = 5.0
        val expectedMeters = 1.524
        val expectedMeters = 1.524
        assertEquals(expectedMeters, feetToMeters(feet), 0.001)
    }

    @Test
    fun testNegativeFeetToMeters() {
        val feet = -5.0
        val expectedMeters = -1.524
        assertEquals(expectedMeters, feetToMeters(feet), 0.001)
        val expectedMeters = -1.524
        assert(feetToMeters(feet) == null)
    }

    @Test
    fun testMetersToFeet() {
        val meters = 1.524
        val expectedFeets = 5.0
        assertEquals(expectedFeets, feetToMeters(meters), 0.001)
    }

    @Test
    fun testNegativeMetersToFeet() {
        val feet = -5.0
        val expectedMeters = -1.524
        assert(feetToMeters(feet) == null)
    }

    @Test
    fun testArshinsToMeters() {
        val arshins = 1.0
        val expectedMeters = 0.71
        assertEquals(expectedMeters, arshinsToMeters(arshins), 0.001)
    }

    @Test
    fun testNegativeArshinsToMeters() {
        val arshins = 1.0
        val expectedMeters = 0.71
        assert(arshinsToMeters(arshins) == null)
    }

    @Test
    fun testMetersToArshins() {
        val meters = 0.71
        val expectedArshins = 1.0
        assertEquals(expectedArshins, arshinsToMeters(meters), 0.001)
    }

    @Test
    fun testNegativeMetresToArshins() {
        val meters = -0.71
        val expectedArshins = -1.0
        assert(arshinsToMeters(meters) == null)
    }
}