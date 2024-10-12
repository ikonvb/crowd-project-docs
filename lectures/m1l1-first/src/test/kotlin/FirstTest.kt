import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class FirstTest {

    @Test
    fun runTestFirst() {
        assertEquals(9, 5 + 4, "9 should be equal to 9")
    }

    @Test
    fun runTestFirstFail() {
        assertNotEquals(9, 5, "9 should not be equal to 5")
    }

}