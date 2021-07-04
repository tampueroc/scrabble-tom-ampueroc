package cl.uchile.dcc.scrabble.types;

import org.apache.commons.lang3.RandomStringUtils;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ITypesTest {
    private int int_0 = 0;
    private int int_N1 = -1;
    private int int_1250 = 1250;
    private int int_484 = 484;
    private int seed;
    private int strSize;
    private double fl_1250 = 1250;
    private boolean t = true;
    private boolean f = false;

    private Random rng;

    private String bin_0 = "0";
    private String bin_1 = "1";
    private String bin_A = "1101010";
    private String bin_B = "0101101";
    private String bin_484 = "0111100100";

    private String logicalBin_11 = "111";
    private String logicalBin_1_2 = "11111010101110";
    private String logicalBin_2_2 = "00000000101001101";
    private String logicalBin_4 = "1111101111";
    private String logicalBin_5 = "0101010001";

    private String logicalBin_1 = "11111010101110";
    private String logicalBin_2 = "000101001101";
    private String logicalBin_3 = "0000001100";



    private String str_0 = "hello";
    private String bin_AA = "1111101111";
    private String bin_AN = "0101010001";

    private String random_binary_1_value;
    private String random_binary_2_value;

    private SInteger SInt_0;
    private SInteger SInt_484;
    private SInteger SInt_1250;
    private SInteger SInt_1250_2;
    private SInteger SInt_N1;
    private SInteger SInt_random;

    private SBinary SBin_0;
    private SBinary SBin_484;
    private SBinary SBin_1;
    private SBinary SBin_A = new  SBinary(bin_A);
    private SBinary SBin_B = new SBinary(bin_B);
    private SBinary SBin_AN;
    private SBinary SBin_AA;

    private SBinary SBin_l11;
    private SBinary SBin_l1;
    private SBinary SBin_l1_2;
    private SBinary SBin_l2;
    private SBinary SBin_l2_2;
    private SBinary SBin_l3;
    private SBinary SBin_l4;
    private SBinary SBin_l5;

    private SBoolean T;
    private SBoolean F;


    private SFloat SFl_1250;

    private SString SStr_0;

    private char[] zeroOne = {'0','1'};

    @BeforeEach
    void setUp() {
        SInt_0 = new SInteger(int_0);
        SInt_1250 = new SInteger(int_1250);
        SInt_1250_2 = new SInteger(int_1250);
        SInt_484 = new SInteger(int_484);
        SInt_N1 = new SInteger(int_N1);

        seed = new Random().nextInt();
        rng = new Random(seed);
        strSize = rng.nextInt(20) + 1;
        random_binary_1_value = RandomStringUtils.random(strSize, zeroOne);
        random_binary_2_value = RandomStringUtils.random(strSize, zeroOne);

        SBin_0 = new SBinary(bin_0);
        SBin_1 = new SBinary(bin_1);
        SBin_484 = new SBinary(bin_484);
        SBin_AA = new SBinary(bin_AA);
        SBin_AN = new SBinary(bin_AN);

        SBin_l11 = new SBinary(logicalBin_11);
        SBin_l1 = new SBinary(logicalBin_1);
        SBin_l1_2 = new SBinary(logicalBin_1_2);
        SBin_l2 = new SBinary(logicalBin_2);
        SBin_l2_2 = new SBinary(logicalBin_2_2);
        SBin_l3 = new SBinary(logicalBin_3);
        SBin_l4 = new SBinary(logicalBin_4);
        SBin_l5 = new SBinary(logicalBin_5);



        SFl_1250 = new SFloat(fl_1250);

        SStr_0 = new SString(str_0);

        T = new SBoolean(t);
        F = new SBoolean(f);

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

    @RepeatedTest(100)
    void add() {
        int random_1 = rng.nextInt();
        SInteger SInt_random_1 = new SInteger(random_1);
        SBinary SBin_random_1 = new SBinary(random_binary_1_value);
        SInteger SInt_N1 = SBin_A.asInteger();
        SInteger SInt_N2 = SBin_B.asInteger();
        double random_between_0_1 = new Random().nextDouble();
        double random_dbl_1 = random_1 * random_between_0_1;
        SFloat SFl_random_1 = new SFloat(random_dbl_1);

        int result_int = SInt_N1.getValue() + SInt_N2.getValue();
        SInteger result_integers = new SInteger(result_int);
        SBinary expectedResult = result_integers.asBinary();
        SBinary actualResult = (SBinary) SBin_A.add(SBin_B);
        assertEquals(expectedResult, actualResult);

        int result_value = SBin_random_1.asInteger().getValue() + SInt_random_1.getValue();
        SInteger expectedResult2 = new SInteger(result_value);
        SInteger actualResult2 = (SInteger) SInt_random_1.add(SBin_random_1);
        assertEquals(expectedResult2, actualResult2);

        int expectedResult_value3 =  SBin_random_1.asInteger().getValue() + SInt_random_1.getValue();
        SInteger expectedResult3_i = new SInteger(expectedResult_value3);
        SBinary expectedResult3 = expectedResult3_i.asBinary();
        SBinary actualResult3 = (SBinary) SBin_random_1.add(SInt_random_1);
        assertEquals(expectedResult3, actualResult3);

        double expectedResult_value4 = SFl_random_1.getValue() + SBin_random_1.asFloat().getValue();
        SFloat expectedResult4 = new SFloat(expectedResult_value4);
        SFloat actualResult4 = (SFloat) SFl_random_1.add(SBin_random_1);
        assertEquals(expectedResult4, actualResult4);
    }


    @RepeatedTest(100)
    void subtract() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        SInteger SInt_random_1 = new SInteger(random_1);
        SInteger SInt_random_2 = new SInteger(random_2);
        SInteger expectedResult = new SInteger(random_1 - random_1);
        SInteger actualResult = (SInteger) SInt_random_1.subtract(SInt_random_1);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        SInteger expectedResult2 = new SInteger(random_1 - random_2);
        SInteger actualResult2 = (SInteger) SInt_random_1.subtract(SInt_random_2);
        assertEquals(expectedResult2, actualResult2);

        SInteger expectedResult3 = new SInteger(random_2 - random_1);
        SInteger actualResult3 = (SInteger) SInt_random_2.subtract(SInt_random_1);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        double random_between_0_1 = new Random().nextDouble();
        double random_dbl_1 = random_1 * random_between_0_1;

        SFloat SFl_random_1 = new SFloat(random_dbl_1);
        SFloat expectedResult4 = new SFloat(random_dbl_1 - random_1);
        SFloat actualResult4 = (SFloat) SFl_random_1.subtract(SInt_random_1);
        assertEquals(expectedResult4, actualResult4);

        SFloat expectedResult5 = new SFloat(random_1 - random_dbl_1);
        SFloat actualResult5 = (SFloat) SInt_random_1.subtract(SFl_random_1);
        assertEquals(expectedResult5, actualResult5);

        assertNotEquals(actualResult5, actualResult4);

        SFloat expectedResult6 = new SFloat(random_dbl_1 - random_dbl_1);
        SFloat actualResult6 = (SFloat) SFl_random_1.subtract(SFl_random_1);
        assertEquals(expectedResult6, actualResult6);

        SBinary SBin_random_1 = new SBinary(random_binary_1_value);
        SBinary SBin_random_2 = new SBinary(random_binary_2_value);

        int result_bin = SBin_random_1.asInteger().getValue() - SBin_random_2.asInteger().getValue();
        SBinary expectedResult_bin = new SInteger(result_bin).asBinary();
        ITypes actualResult_bin = SBin_random_1.subtract(SBin_random_2);
        assertEquals(expectedResult_bin, actualResult_bin);

        ITypes actualResult8 = SBin_random_2.subtract(SBin_random_1);
        assertEquals(actualResult_bin.asInteger().getValue(), -actualResult8.asInteger().getValue());

        int expectedResult_value9 = SInt_random_1.getValue() - SBin_random_1.asInteger().getValue();
        SInteger expectedResult9 = new SInteger(expectedResult_value9);
        SInteger actualResult9 = (SInteger) SInt_random_1.subtract(SBin_random_1);
        assertEquals(expectedResult9, actualResult9);

        double expectedResult_value10 = SFl_random_1.getValue() - SBin_random_1.asFloat().getValue();
        SFloat expectedResult10 = new SFloat(expectedResult_value10);
        SFloat actualResult10 = (SFloat) SFl_random_1.subtract(SBin_random_1);
        assertEquals(expectedResult10, actualResult10);

        int expectedResult_value11 = SBin_random_1.asInteger().getValue() - SInt_random_1.getValue();
        SInteger expectedResult11_i = new SInteger(expectedResult_value11);
        SBinary expectedResult11 = expectedResult11_i.asBinary();
        SBinary actualResult11 = (SBinary) SBin_random_1.subtract(SInt_random_1);
        assertEquals(expectedResult11, actualResult11);
    }

    @RepeatedTest(100)
    void multiply() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        SInteger SInt_random_1 = new SInteger(random_1);
        double random_between_0_1 = new Random().nextDouble();
        double random_dbl_1 = random_1 * random_between_0_1;
        SFloat SFl_random_1 = new SFloat(random_dbl_1);

        SInteger expectedResult = new SInteger(random_1 * random_1);
        SInteger actualResult = (SInteger) SInt_random_1.multiply(SInt_random_1);
        assertEquals(expectedResult, actualResult);

        SFloat expectedResult2 = new SFloat(random_dbl_1 * random_1);
        SFloat actualResult2 = (SFloat) SFl_random_1.multiply(SInt_random_1);
        assertEquals(expectedResult2, actualResult2);

        SFloat expectedResult3 = new SFloat(random_1 * random_dbl_1);
        SFloat actualResult3 = (SFloat) SInt_random_1.multiply(SFl_random_1);
        assertEquals(expectedResult3, actualResult3);

        SFloat expectedResult4 = new SFloat(random_dbl_1 * random_dbl_1);
        SFloat actualResult4 = (SFloat) SFl_random_1.multiply(SFl_random_1);
        assertEquals(expectedResult4, actualResult4);

        SBinary SBin_random_1 = new SBinary(random_binary_1_value);
        SBinary SBin_random_2 = new SBinary(random_binary_2_value);

        int result7 = SBin_random_1.asInteger().getValue() * SBin_random_2.asInteger().getValue();
        SBinary expectedResult7 = new SInteger(result7).asBinary();
        ITypes actualResult7 = SBin_random_1.multiply(SBin_random_2);
        assertEquals(expectedResult7, actualResult7);

        ITypes actualResult7_2 = SBin_random_2.multiply(SBin_random_1);
        assertEquals(actualResult7, actualResult7_2);

        int expectedResult_value8 = SInt_random_1.getValue() * SBin_random_1.asInteger().getValue();
        SInteger expectedResult8 = new SInteger(expectedResult_value8);
        SInteger actualResult8 = (SInteger) SInt_random_1.multiply(SBin_random_1);
        assertEquals(expectedResult8, actualResult8);

        double expectedResult_value9 = SFl_random_1.getValue() * SBin_random_1.asFloat().getValue();
        SFloat expectedResult9 = new SFloat(expectedResult_value9);
        SFloat actualResult9 = (SFloat) SFl_random_1.multiply(SBin_random_1);
        assertEquals(expectedResult9, actualResult9);

        int expectedResult_value10 =  SBin_random_1.asInteger().getValue() * SInt_random_1.getValue();
        SInteger expectedResult10_i = new SInteger(expectedResult_value10);
        SBinary expectedResult10 = expectedResult10_i.asBinary();
        SBinary actualResult10 = (SBinary) SBin_random_1.multiply(SInt_random_1);
        assertEquals(expectedResult10, actualResult10);
    }

    @RepeatedTest(100)
    void divide() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        SInteger SInt_random_1 = new SInteger(random_1);
        SInteger SInt_random_2 = new SInteger(random_2);
        double random_between_0_1_1 = new Random().nextDouble();
        double random_dbl_1 = random_1 * random_between_0_1_1;
        double random_between_0_1_2 = new Random().nextDouble();
        double random_dbl_2 = random_2 * random_between_0_1_2;

        SFloat SFl_random_1 = new SFloat(random_dbl_1);
        SFloat SFl_random_2 = new SFloat(random_dbl_2);

        SBinary SBin_random_1 = new SBinary(random_binary_1_value+"1");
        SBinary SBin_random_2 = new SBinary(random_binary_2_value+"1");

        SInteger expectedResult = new SInteger(random_1/random_1);
        SInteger actualResult = (SInteger) SInt_random_1.divide(SInt_random_1);
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult.hashCode(), actualResult.hashCode());

        SInteger expectedResult2 = new SInteger(random_1/random_2);
        SInteger actualResult2 = (SInteger) SInt_random_1.divide(SInt_random_2);
        assertEquals(expectedResult2, actualResult2);

        SInteger expectedResult3 = new SInteger(random_2/random_1);
        SInteger actualResult3 = (SInteger) SInt_random_2.divide(SInt_random_1);
        assertEquals(expectedResult3, actualResult3);

        assertNotEquals(actualResult2, actualResult3);

        /*TODO
        SFloat expectedResult4 = new SFloat(random_dbl_1/random_1);
        SFloat actualResult4 = (SFloat) SFl_random_1.divide(SInt_random_1);
        assertEquals(expectedResult4, actualResult4);
        */

        SFloat expectedResult5 = new SFloat(random_1/random_dbl_1);
        SFloat actualResult5 = (SFloat) SInt_random_1.divide(SFl_random_1);
        assertEquals(expectedResult5, actualResult5);

        //assertNotEquals(actualResult5, actualResult4);

        SFloat expectedResult6 = new SFloat(random_dbl_1/random_dbl_1);
        SFloat actualResult6 = (SFloat) SFl_random_1.divide(SFl_random_1);
        assertEquals(expectedResult6, actualResult6);
        int result7 = SBin_random_1.asInteger().getValue() / SBin_random_2.asInteger().getValue();

        SBinary expectedResult7 = new SInteger(result7).asBinary();
        ITypes actualResult7 = SBin_random_1.divide(SBin_random_2);
        assertEquals(expectedResult7, actualResult7);

        int expectedResult_value8 = SInt_random_1.getValue() / SBin_random_1.asInteger().getValue();
        SInteger expectedResult8 = new SInteger(expectedResult_value8);
        SInteger actualResult8 = (SInteger) SInt_random_1.divide(SBin_random_1);
        assertEquals(expectedResult8, actualResult8);

        double expectedResult_value9 = SFl_random_1.getValue() / SBin_random_1.asFloat().getValue();
        SFloat expectedResult9 = new SFloat(expectedResult_value9);
        SFloat actualResult9 = (SFloat) SFl_random_1.divide(SBin_random_1);
        assertEquals(expectedResult9, actualResult9);

        int expectedResult_value10 =  SBin_random_1.asInteger().getValue() / SInt_random_1.getValue();
        SInteger expectedResult10_i = new SInteger(expectedResult_value10);
        SBinary expectedResult10 = expectedResult10_i.asBinary();
        SBinary actualResult10 = (SBinary) SBin_random_1.divide(SInt_random_1);
        assertEquals(expectedResult10, actualResult10);
    }

    @Test
    void and() {
        SBoolean expectedResult = new SBoolean(true);
        SBoolean actualResult = (SBoolean) T.and(T);
        assertEquals(actualResult, expectedResult);

        SBoolean expectedResult2 = new SBoolean(false);
        SBoolean actualResult2 = (SBoolean) T.and(F);
        assertEquals(actualResult2, expectedResult2);

        SBoolean actualResult3 = (SBoolean) F.and(T);
        assertEquals(actualResult2, actualResult3);

        SBinary expectedResult4 = SBin_l3;
        ITypes actualResult4 = SBin_l1.and(SBin_l2);
        assertEquals(expectedResult4, actualResult4);


        SBinary expectedResult4_2 = SBin_l3;
        ITypes actualResult4_2 = SBin_l1_2.and(SBin_l2_2);
        assertEquals(expectedResult4_2, actualResult4_2);

        SBinary expectedResult4_3 = SBin_l3;
        ITypes actualResult4_3 = SBin_l2.and(SBin_l1);
        assertEquals(expectedResult4, actualResult4);


        SBinary expectedResult4_4 = SBin_l3;
        ITypes actualResult4_4 = SBin_l2_2.and(SBin_l1_2);
        assertEquals(expectedResult4_2, actualResult4_2);
        assertEquals(expectedResult4_3, actualResult4_3);
        assertEquals(expectedResult4_4, actualResult4_4);

        SBinary expectedResult5 = SBin_l1;
        SBinary actualResult5 = (SBinary) SBin_l1.and(T);
        assertEquals(expectedResult5, actualResult5);
        SBinary actualResult5_2 = (SBinary) T.and(SBin_l1);
        assertEquals(actualResult5, actualResult5_2);

        SBinary expectedResult6 = SBin_0;
        SBinary actualResult6 = (SBinary) SBin_l1.and(F);
        assertEquals(expectedResult6, actualResult6);
        SBinary actualResult6_2 = (SBinary) F.and(SBin_l1);
        assertEquals(actualResult6_2, actualResult6);
    }

    @Test
    void or() {
        SBoolean expectedResult = new SBoolean(true);
        SBoolean actualResult = (SBoolean) T.or(T);
        assertEquals(actualResult, expectedResult);

        SBoolean expectedResult2 = new SBoolean(true);
        SBoolean actualResult2 = (SBoolean) T.or(F);
        assertEquals(actualResult2, expectedResult2);

        SBoolean actualResult3 = (SBoolean) F.or(T);
        assertEquals(actualResult2, actualResult3);

        SBinary expectedResult4 = SBin_l4;
        ITypes actualResult4 = SBin_l1.or(SBin_l2);
        assertEquals(expectedResult4, actualResult4);


        SBinary expectedResult4_2 = SBin_l4;
        ITypes actualResult4_2 = SBin_l1_2.or(SBin_l2_2);
        assertEquals(expectedResult4_2, actualResult4_2);

        SBinary expectedResult4_3 = SBin_l4;
        ITypes actualResult4_3 = SBin_l2.or(SBin_l1);
        assertEquals(expectedResult4_3, actualResult4_3);

        SBinary expectedResult4_4 = SBin_l4;
        ITypes actualResult4_4 = SBin_l2_2.or(SBin_l1_2);
        assertEquals(expectedResult4_4, actualResult4_4);

        SBinary expectedResult5 = SBin_l11;
        SBinary actualResult5 = (SBinary) SBin_l1.or(T);
        assertEquals(expectedResult5, actualResult5);
        SBinary actualResult5_2 = (SBinary) T.or(SBin_l1);
        assertEquals(actualResult5, actualResult5_2);



        SBinary expectedResult6 = SBin_l1;
        SBinary actualResult6 = (SBinary) SBin_l1.or(F);
        assertEquals(expectedResult6, actualResult6);
        SBinary actualResult6_2 = (SBinary) F.or(SBin_l1);
        assertEquals(actualResult6_2, actualResult6);
    }

    @Test//TODO
    void negate() {
        SBinary expectedResult = SBin_l5;
        SBinary actualResult = SBin_l1.negate();
        assertEquals(expectedResult, actualResult);
    }

}