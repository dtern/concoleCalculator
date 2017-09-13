package calculator;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import calculator.Calculator;


public class CalculatorTest {
    
	@Test
    public void testSummationAction() {
        Calculator calc = new Calculator();
        double result = calc.summation(2, 2);
        assertThat(result, is(4.0d));
    }
    
    
    @Test
    public void testCompositionAction() {
        Calculator calc = new Calculator();
        double result = calc.composition(2, 2);
        assertThat(result, is(4.0d));
    }
    
    
    @Test
    public void testDivisionAction() {
        Calculator calc = new Calculator();
        double result = calc.division(2, 2);
        assertThat(result, is(1.0d));
    }
    
    @Test
    public void testSubtractionAction() {
        Calculator calc = new Calculator();
        double result = calc.subtraction(2, 2);
        assertThat(result, is(0.0d));
    }
}
