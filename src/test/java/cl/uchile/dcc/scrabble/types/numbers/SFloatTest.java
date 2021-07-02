package cl.uchile.dcc.scrabble.types.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SFloatTest {

    private SFloat f;
    private SFloat f2;
    private SInteger I;
    private String s;
    double number = 10.5;
    int number2 = 10;

    @Test
    void testToString() {
        s = String.valueOf(number);
        assertEquals(s, f.toString());
    }

    @Test
    void asFloat() {
        assertEquals(f, f.asFloat());
    }

    @BeforeEach
    void setUp() {
        f = new SFloat(number);
        f2 = new SFloat(number);
        I = new SInteger(number2);
    }

    @Test
    void constructorTest() {
        var expectedFloat = new SFloat(10.5);
        assertEquals(expectedFloat.hashCode(), f.hashCode());
        assertEquals(expectedFloat, f);

        var differentFloat = new SFloat(10.4);
        assertNotEquals(differentFloat, f, "Float values should be different");

        assertNotEquals(f, I);
    }
}