package cl.uchile.dcc.scrabble.types;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SStringTest {

    private SString str1;
    private SString str2;



    @BeforeEach
    void setUp() {
        str1 = new SString("Hola");
        str2 = new SString("Chao");
    }

    @Test
    void constructorTest(){
        var expectedSString = new SString("Hola");
        assertEquals(expectedSString.hashCode(), str1.hashCode());
        assertEquals(expectedSString, str1);
        assertNotEquals(expectedSString, str2);
    }

    @Test
    void asString() {
    }

    @Test
    void add() {
    }

    @Test
    void testToString() {
    }
}