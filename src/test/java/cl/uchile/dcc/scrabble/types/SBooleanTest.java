package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SBooleanTest {
    private boolean T = true;
    private boolean F = false;
    private SBoolean STrue;
    private SBoolean SFalse;
    private int int_1 = 10;
    private SInteger I;

    @BeforeEach
    void setUp() {
        STrue = new SBoolean(T);
        SFalse = new SBoolean(F);
        I = new SInteger(int_1);
    }

    @Test
    void constructorTest() {
        var expectedBool = new SBoolean(true);
        var unexpectedBool = new SBoolean(false);
        assertEquals(expectedBool, STrue);
        assertNotEquals(unexpectedBool, STrue);
        assertEquals(expectedBool.hashCode(), STrue.hashCode());
        assertEquals(unexpectedBool.hashCode(), STrue.hashCode());
        assertNotEquals(STrue, I);
    }

    @Test
    void asBoolean() {
        assertEquals(STrue, STrue.asBoolean());
    }

    @Test
    void testToString() {
        String expectedResult_T = "true";
        String actualResult_T = STrue.toString();
        String expectedResult_F = "false";
        String actualResult_F = SFalse.toString();
        assertEquals(expectedResult_T, actualResult_T);
        assertEquals(expectedResult_F, actualResult_F);
    }

    @Test
    void negate() { //TODO
        SBoolean expectedResult = new SBoolean(false);
        SBoolean actualResult = STrue.negate();
        assertEquals(expectedResult, actualResult);
    }



}