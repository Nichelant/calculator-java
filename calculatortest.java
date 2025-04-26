// File: CalculatorTest.java    

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // Test sabiranja
        assertEquals("5 + 3 = 8", "8", Calculator.Run("5+3"));
    }

    @Test
    public void testSubtraction() {
        // Test oduzimanja
        assertEquals("5 - 3 = 2", "2", Calculator.Run("5-3"));
    }

    @Test
    public void testMultiplication() {
        // Test množenja
        assertEquals("4 * 2 = 8", "8", Calculator.Run("4*2"));
    }

    @Test
    public void testDivision() {
        // Test deljenja
        assertEquals("8 / 2 = 4", "4", Calculator.Run("8/2"));
    }

    @Test
    public void testDivisionByZero() {
        // Test za deljenje sa nulom
        assertEquals("5 / 0 = Infinity", "Infinity", Calculator.Run("5/0"));
    }

    @Test
    public void testInvalidExpression() {
        // Test za nevalidni izraz (npr. "5++3")
        assertEquals("Invalid expression", "ERROR", Calculator.Run("5++3"));
    }

    @Test
    public void testExpressionWithSpaces() {
        // Test za izraz sa razmacima
        assertEquals("Expression with spaces", "ERROR", Calculator.Run("5 + 3"));
    }

    @Test
    public void testPriorityOfOperations() {
        // Test prioritet operacija (multiplikacija pre sabiranja)
        assertEquals("2 + 3 * 4 = 14", "14", Calculator.Run("2+3*4"));
    }

    @Test
    public void testExpressionStartingWithPlus() {
        // Test za izraz koji počinje sa "+"
        assertEquals("+5 + 3 = 8", "8", Calculator.Run("+5+3"));
    }

    @Test
    public void testExpressionStartingWithMinus() {
        // Test za izraz koji počinje sa "-"
        assertEquals("-5 + 2 = -3", "-3", Calculator.Run("-5+2"));
    }
}
