package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private int int_0 = 0;
    private int int_N1 = -1;
    private int int_1250 = 1250;
    private int int_484 = 484;
    private double fl_1250 = 1250;

    private String bin_0 = "0";
    private String bin_1 = "1";
    private String bin_484 = "0111100100";
    private String str_0 = "hello";

    private SInteger SInt_0;
    private SInteger SInt_484;
    private SInteger SInt_1250;
    private SInteger SInt_1250_2;
    private SInteger SInt_N1;

    private SBinary SBin_0;
    private SBinary SBin_484;
    private SBinary SBin_1;

    private SFloat SFl_1250;

    private SString SStr_0;


    @BeforeEach
    void setUp() {
        SInt_0 = new SInteger(int_0);
        SInt_1250 = new SInteger(int_1250);
        SInt_1250_2 = new SInteger(int_1250);
        SInt_484 = new SInteger(int_484);
        SInt_N1 = new SInteger(int_N1);

        SBin_0 = new SBinary(bin_0);
        SBin_1 = new SBinary(bin_1);
        SBin_484 = new SBinary(bin_484);

        SFl_1250 = new SFloat(fl_1250);

        SStr_0 = new SString(str_0);

    }

    @Test
    void asBinary() {
        SBinary expectedResult = new SBinary(bin_484);
        SBinary actualResult = SInt_484.asBinary();
        assertEquals(expectedResult, actualResult);

        SBinary expectedResult2 = new SBinary("0");
        SBinary actualResult2 = SInt_0.asBinary();
        assertEquals(expectedResult2, actualResult2);

        SBinary actualResult3 = SInt_N1.asBinary();

        System.out.println(actualResult3);
    }

    @Test
    void asFloat() {
        SFloat expectedResult = new SFloat(fl_1250);
        SFloat actualResult = SInt_1250.asFloat();
        assert expectedResult.getValue() == actualResult.getValue();
    }

    @Test
    void asInteger() {
        SInteger expectedResult = new SInteger(int_484);
        SInteger actualResult = SBin_484.asInteger();
        assertEquals(expectedResult, actualResult);

        SInteger expectedResult2 = new SInteger(0);
        SInteger actualResult2 = SBin_0.asInteger();
        assertEquals(expectedResult2, actualResult2);

        SInteger actualResult3 = SBin_1.asInteger();
        System.out.println(actualResult3);

        SBinary eq1 = new SBinary("1");
        SBinary eq2 = new SBinary("11");
        assertEquals(eq1, eq2);
        assertEquals(eq1.asInteger(), eq2.asInteger());
    }

    @Test
    void add() {
        SInteger expectedResult = new SInteger(int_1250+int_1250);
        ITypes actual_result = SInt_1250.add(SInt_1250_2);
        assertEquals(expectedResult, actual_result);
        assertEquals(expectedResult.hashCode(), actual_result.hashCode());
        SFloat expectedResult_2 = new SFloat(fl_1250+fl_1250);
        SFloat expectedResult_3 = new SFloat(fl_1250+int_1250);
        ITypes actual_result_2 = SFl_1250.add(SFl_1250);
        ITypes actual_result_3 = SInt_1250.add(SFl_1250);
        ITypes actual_result_3b = SFl_1250.add(SInt_1250);
        ITypes different_result = SInt_484.add(SFl_1250);

        assertEquals(expectedResult_2, actual_result_2);
        assertEquals(expectedResult_3, actual_result_3);
        assertEquals(actual_result_3, actual_result_3b);
        assertNotEquals(different_result, actual_result_3);

        SString expectedResult4 =  new SString("hello484");
        SString actualResult4 = SStr_0.add(SInt_484);
        assertEquals(expectedResult4, actualResult4);


    }
}