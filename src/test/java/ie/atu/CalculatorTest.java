package ie.atu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calculator();
        assertEquals(40,myCalc.add(20,20));
    }

    @Test
    public void testMultiply()
    {
        myCalc = new Calculator();
        assertEquals(100,myCalc.multiply(10,10));
    }

    @Test
    public void testSubtract()
    {
        myCalc = new Calculator();
        assertEquals(5,myCalc.subtract(10,5));
    }
}
