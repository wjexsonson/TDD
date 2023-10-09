import org.junit.Test
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class WeightConverterTest {

    @Test
    fun testKilogramsToPounds() {
        val kilograms = 1.0
        val expectedPounds = 2.20462
        assertEquals(expectedPounds, kilogramsToPounds(kilograms), 0.001)
    }

    @Test
    fun testNegativeKilogramsToPounds() {
        val kilograms = -1.0
        val expectedPounds = -2.20462
        assert(kilogramsToPounds(kilograms) == null)
    }

    @Test
    fun testPoundsToKilograms() {
        val pounds = 2.20462
        val expectedKilograms = 1.0
        assertEquals(expectedKilograms, kilogramsToPounds(pounds), 0.001)
    }

    @Test
    fun testNegativePoundsToKilograms() {
        val pounds = -2.20462
        val expectedKilograms = -1.0
        assert(poundsToKilograms(pounds) == null)
    }

    @Test
    fun testKilogramsToPoods() {
        val kilograms = 1.0
        val expectedPoods = 0.061048
        assertEquals(expectedPoods, kilogramsToPoods(kilograms), 0.001)
    }

    @Test
    fun testNegativeKilogramsToPoods() {
        val kilograms = -1.0
        val expectedPoods = -0.061048
        assert(kilogramsToPoods(kilograms) == null)
    }

    @Test
    fun testPoodsToKilograms() {
        val poods = 0.061048
        val expectedKilograms = 1.0
        assertEquals(expectedKilograms, poodsToKilograms(poods), 0.001)
    }

    @Test
    fun testNegativePoodsToKilograms() {
        val poods = -0.061048
        val expectedKilograms = -1.0
        assert(poodsToKilograms(poods) == null)
    }
}