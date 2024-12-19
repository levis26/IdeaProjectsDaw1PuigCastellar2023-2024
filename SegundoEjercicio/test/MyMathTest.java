import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class MyMathTest {

    @Test
    public void testDivTwoParameters() {
        assertEquals(5, MyMath.div(10, 2), 0.001);
        assertEquals(2, MyMath.div(10, 5), 0.001);
    }

    @Test
    public void testDivThreeParameters() {
        assertEquals(5, MyMath.div(30, 3, 2), 0.001);
        assertEquals(1, MyMath.div(30, 5, 6), 0.001);
    }
}