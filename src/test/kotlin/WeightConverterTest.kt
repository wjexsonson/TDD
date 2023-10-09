import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class WeightConverterTest {

    @Test
    fun testKilogramsToPounds() {
        assertEquals(2.20462, kilogramsToPounds(1.0), 0.001)
        assertEquals(22.0462, kilogramsToPounds(10.0), 0.001)
        assertEquals(0.0, kilogramsToPounds(0.0), 0.001)
    }

    @Test
    fun testNegativeKilogramsToPounds() {
        assertFailsWith<IllegalArgumentException> {
            kilogramsToPounds(-1.0)
        }
    }

    @Test
    fun testPoundsToKilograms() {
        assertEquals(0.4536, poundsToKilograms(1.0), 0.001)
        assertEquals(4.536, poundsToKilograms(10.0), 0.001)
        assertEquals(0.0, poundsToKilograms(0.0), 0.001)
    }

    @Test
    fun testNegativePoundsToKilograms() {
        assertFailsWith<IllegalArgumentException> {
            poundsToKilograms(-1.0)
        }
    }

    @Test
    fun testKilogramsToPoods() {
        assertEquals(0.061, kilogramsToPoods(1.0), 0.001)
        assertEquals(0.61, kilogramsToPoods(10.0), 0.001)
        assertEquals(0.0, kilogramsToPoods(0.0), 0.001)
    }

    @Test
    fun testNegativeKilogramsToPoods() {
        assertFailsWith<IllegalArgumentException> {
            kilogramsToPoods(-1.0)
        }
    }

    @Test
    fun testPoodsToKilograms() {
        assertEquals(16.3805, poodsToKilograms(1.0), 0.001)
        assertEquals(163.805, poodsToKilograms(10.0), 0.001)
        assertEquals(0.0, poodsToKilograms(0.0), 0.001)
    }

    @Test
    fun testNegativePoodsToKilograms() {
        assertFailsWith<IllegalArgumentException> {
            poodsToKilograms(-1.0)
        }
    }

}