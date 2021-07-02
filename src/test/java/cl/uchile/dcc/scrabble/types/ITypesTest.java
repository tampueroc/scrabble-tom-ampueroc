package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private int i0 = 0;
    private int i1 = -1;
    private int i = 1005;
    private int i2 = 500;
    private int i3 = 484;
    private String s = "hello";
    private SString S;
    private double fl = 1005;
    private String b0 = "0";
    private String b1 = "0111100100";
    private String b_1 = "1";
    private SBinary bin0;
    private SBinary bin1;
    private SBinary bin_1;
    private SInteger I0;
    private SInteger I1;
    private SInteger I;
    private SInteger I2;
    private SInteger I3;
    private SInteger I4;
    private SFloat F;
    private Random rng;
    private int seed;
    private int strSize;
    private String random_string_1;
    private char[] zeroOne = {'0','1'};


    @BeforeEach
    void setUp() {
        I0 = new SInteger(i0);
        I = new SInteger(i);
        I1 = new SInteger(i1);
        I2 = new SInteger(i);
        I3 = new SInteger(i2);
        I4 = new SInteger(i3);
        S = new SString("hello");
        F = new SFloat(fl);
        bin0 = new SBinary (b0);
        bin1 = new SBinary(b1);
        bin_1 = new SBinary(b_1);
        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20);
        random_string_1 = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
    }


    @Test
    void asFloat() {
        SFloat expectedResult = new SFloat(fl);
        SFloat actualResult = I.asFloat();
        assert expectedResult.getValue()== actualResult.getValue();
    }

    @Test
    void add() {
        SInteger expectedResult = new SInteger(i + i);
        ITypes actual_result = I.add(I2);
        assertEquals(expectedResult, actual_result);
        assertEquals(expectedResult.hashCode(), actual_result.hashCode());
        SFloat expectedResult_2 = new SFloat(fl + fl);
        SFloat expectedResult_3 = new SFloat(fl + i);
        ITypes actual_result_2 = F.add(F);
        ITypes actual_result_3 = I.add(F);
        ITypes actual_result_3b = F.add(I);
        ITypes different_result = I3.add(F);

        assertEquals(expectedResult_2, actual_result_2);
        assertEquals(expectedResult_3, actual_result_3);
        assertEquals(actual_result_3, actual_result_3b);
        assertNotEquals(different_result, actual_result_3);

        SString expectedResult4 =  new SString("hello500");
        SString actualResult4 = S.add(I3);
        assertEquals(expectedResult4, actualResult4);

    }

    @Test
    void asBinary() {
        SBinary expectedResult = new SBinary(b1);
        SBinary actualResult = I4.asBinary();
        assertEquals(expectedResult, actualResult);

        SBinary expectedResult2 = new SBinary("0");
        SBinary actualResult2 = I0.asBinary();
        assertEquals(expectedResult2, actualResult2);

        SBinary actualResult3 = I1.asBinary();

        System.out.println(actualResult3);
    }

    @Test
    void asInteger() {
        SInteger expectedResult = new SInteger(i3);
        SInteger actualResult = bin1.asInteger();
        assertEquals(expectedResult, actualResult);

        SInteger expectedResult2 = new SInteger(0);
        SInteger actualResult2 = bin0.asInteger();
        assertEquals(expectedResult2, actualResult2);

        SInteger actualResult3 = bin_1.asInteger();
        System.out.println(actualResult3);

        SBinary eq1 = new SBinary("1");
        SBinary eq2 = new SBinary("11");
        assertEquals(eq1, eq2);
        assertEquals(eq1.asInteger(), eq2.asInteger());


    }


}