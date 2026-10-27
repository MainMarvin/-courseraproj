package selenium_ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    Calculator clac = new Calculator();

    @Test
    void testAddition(){
        assertEquals(5, clac.add(2,3));
    }

    @Test
    void testDivision(){
        assertEquals(2, clac.divide(10,5));
    }

    @Test
    void testDivisionByZero(){
        assertThrows(ArithmeticException.class, () -> clac.divide(10,0));
    }

}
