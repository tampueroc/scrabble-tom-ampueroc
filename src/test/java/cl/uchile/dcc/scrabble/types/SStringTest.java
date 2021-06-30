package cl.uchile.dcc.scrabble.types;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SStringTest {

    private SString str1;
    private SString str2;
    private Random rng;
    private int seed;
    private int strSize_1;
    private int strSize_2;
    private String random_string_1;
    private String random_string_2;



    @BeforeEach
    void setUp() {
        str1 = new SString("Hola");
        str2 = new SString("Chao");
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize_1 = rng.nextInt(20) + 1;
        strSize_2 = rng.nextInt(20);
        random_string_1 = RandomStringUtils.random(strSize_1, 0, Character.MAX_CODE_POINT, true, false, null, rng);
        random_string_2 = RandomStringUtils.random(strSize_2, 0, Character.MAX_CODE_POINT, true, false, null, rng);

    }

    @Test
    void constructorTest(){
        var expectedSString = new SString("Hola");
        assertEquals(expectedSString.hashCode(), str1.hashCode());
        assertEquals(expectedSString, str1);
        assertNotEquals(expectedSString, str2);
        //assertNotEquals(str1, b); TODO
    }

    @RepeatedTest(100)
    void asString() {
        int random_1 = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double random_double_1 = random_1 * random_between_0_1;
        //integers I = new integers(first_random); TODO
        //floats F = new floats(first_double_random); TODO
        //binary bin1 = new binary(first_random_binary_value); TODO
        SString S1 = new SString(random_string_1);
        SString S2 = new SString(random_string_2);

        String expectedResult_S_value = S1.toString();
        SString expectedResult_S = new SString(expectedResult_S_value);
        SString actualResult_S = S1.asString();
        assertEquals(expectedResult_S, actualResult_S);

        /*TODO
        String expectedResult_value = I.toString();
        Strings expectedResult = new Strings(expectedResult_value);
        Strings actualResult = I.transform_to_string();
        assertEquals(expectedResult, actualResult);
        */
        /* TODO
        String expectedResult_value2 = F.toString();
        Strings expectedResult2 = new Strings(expectedResult_value2);
        Strings actualResult2 = F.transform_to_string();
        assertEquals(expectedResult2, actualResult2);
        */
        /*TODO
        String expectedResult_value3 = bin1.toString();
        Strings expectedResult3 = new Strings(expectedResult_value3);
        Strings actualResult3 = bin1.transform_to_string();
        assertEquals(expectedResult3, actualResult3);
        */
        /*TODO
        String expectedResult_value4 = b.toString();
        Strings expectedResult4 = new Strings(expectedResult_value4);
        Strings actualResult4 = b.transform_to_string();
        assertEquals(expectedResult4, actualResult4);
        */
        /*TODO
        String expectedResult_value5 = f.toString();
        Strings expectedResult5 = new Strings(expectedResult_value5);
        Strings actualResult5 = f.transform_to_string();
        assertEquals(expectedResult5, actualResult5);
        */
    }

    @RepeatedTest(100)
    void add() {
        int random_1 = rng.nextInt();
        double random_between_0_1 = new Random().nextDouble();
        double random_double_1 = random_1 * random_between_0_1;
        //integers I = new integers(first_random); TODO
        //floats F = new floats(first_double_random); TODO
        //binary bin1 = new binary(first_random_binary_value); TODO
        SString S1 = new SString(random_string_1);
        SString S2 = new SString(random_string_2);

        String expectedResult_value_S = S1.toString() + S2.toString();
        SString expectedResult_S = new SString(expectedResult_value_S);
        SString actualResult_S = S1.add(S2);
        assertEquals(expectedResult_S, actualResult_S);

        /*TODO
        String expectedResult_value = I.toString();
        Strings expectedResult = new Strings(expectedResult_value);
        Strings actualResult = I.transform_to_string();
        assertEquals(expectedResult, actualResult);
        */
        /* TODO
        String expectedResult_value2 = F.toString();
        Strings expectedResult2 = new Strings(expectedResult_value2);
        Strings actualResult2 = F.transform_to_string();
        assertEquals(expectedResult2, actualResult2);
        */
        /*TODO
        String expectedResult_value3 = bin1.toString();
        Strings expectedResult3 = new Strings(expectedResult_value3);
        Strings actualResult3 = bin1.transform_to_string();
        assertEquals(expectedResult3, actualResult3);
        */
        /*TODO
        String expectedResult_value4 = b.toString();
        Strings expectedResult4 = new Strings(expectedResult_value4);
        Strings actualResult4 = b.transform_to_string();
        assertEquals(expectedResult4, actualResult4);
        */
        /*TODO
        String expectedResult_value5 = f.toString();
        Strings expectedResult5 = new Strings(expectedResult_value5);
        Strings actualResult5 = f.transform_to_string();
        assertEquals(expectedResult5, actualResult5);
        */

    }

    @Test
    void testToString() {
        String str_content = "Hola";
        String Sstr_content = str1.toString();
        assertEquals(str_content, Sstr_content);
    }
}