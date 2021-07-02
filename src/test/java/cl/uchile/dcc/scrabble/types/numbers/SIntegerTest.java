package cl.uchile.dcc.scrabble.types.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SIntegerTest {

    private int i = 1005;
    private String b4 = "01101110101111011";
    private int i4 = 56699;
    private double fl = 1005;
    private int i2 = 1200;
    private String s = String.valueOf(i);
    private SInteger I;
    private SInteger I4;
    private SBinary bin4;
    private SInteger I2;
    private SFloat F;
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp(){
        I = new SInteger(i);
        I2 = new SInteger(i2);
        I4 = new SInteger(i4);
        bin4 = new SBinary(b4);
        F = new SFloat(fl);
        seed = new Random().nextInt();
        rng = new Random(seed);

    }

    @Test
    void constructorTest() {
        var expectedInt = new SInteger(i);
        assertEquals(expectedInt, I);
        assertEquals(expectedInt.hashCode(), I.hashCode());
        assertEquals(I2.hashCode(), expectedInt.hashCode());
        assertNotEquals(I, F);
    }

    @RepeatedTest(25)
    void getValue() {
        int random_integer = rng.nextInt(50000);
        SInteger random_Integers = new SInteger(random_integer);
        assert random_integer == random_Integers.getValue();
    }

    @Test
    void asBinary() {
        SBinary expectedResult = bin4;
        SBinary actualResult = I4.asBinary();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testToString() {
        assertEquals(s, I.toString());
    }

    @Test
    void asInteger() {
        assertEquals(I, I.asInteger());
    }
}