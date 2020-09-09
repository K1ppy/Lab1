package Test;

import static org.junit.jupiter.api.Assertions.*;

import com.company.Main;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void testCalcValue() {
        double x = 0;
        double eps = Math.pow(10, -10);
        double actual = Main.calcValue(x, eps);
        double expected = Math.sin(x);
        assertEquals(expected, actual,eps);
        x = -0.5;
        actual = Main.calcValue(x, eps);
        expected = Math.sin(x);
        assertEquals(expected, actual,eps);
        x = 0.5;
        actual = Main.calcValue(x, eps);
        expected = Math.sin(x);
        assertEquals(expected, actual,eps);
    }
}