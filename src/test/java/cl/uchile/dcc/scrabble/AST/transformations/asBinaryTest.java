package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.types.SString;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class asBinaryTest {
    private int i3 = 484;
    private String str = "hello";
    private String bn = "011001";
    private String nb = "11010110";
    private SBinary SBin0;
    private SBinary SBin1;
    private SBinary SBin11;
    private SBinary SBin_1;
    private SBinary SBin_nb_1;
    private SBinary SBin_nb_2;
    private SBinary SBin_bn_1;
    private SBinary SBin_bn_2;
    private SBinary SBin_3;
    private SInteger SInt;
    private String random_binary_value_1;
    private String random_binary_value_2;
    private char[] zeroOne = {'0','1'};



    @BeforeEach
    void setUp() {
        int i0 = 0;
        SInteger i01 = new SInteger(i0);
        int i = 1005;
        SInt = new SInteger(i);
        int i1 = -1;
        SInteger i11 = new SInteger(i1);
        SInteger i21 = new SInteger(i);
        int i2 = 500;
        SInteger i31 = new SInteger(i2);
        SInteger i41 = new SInteger(i3);
        SString s1 = new SString("hello");
        double fl = 1005;
        SFloat f = new SFloat(fl);
        String b0 = "0";
        SBin0 = new SBinary (b0);
        String b_1 = "1";
        SBin1 = new SBinary(b_1);
        String b11 = "0111100100";
        SBin11 = new SBinary(b11);
        SBin_nb_1 = new SBinary(nb);
        String nb2 = "11111010110";
        SBin_nb_2 = new SBinary(nb2);
        SBin_bn_1 = new SBinary(bn);
        String bn2 = "000011001";
        SBin_bn_2 = new SBinary(bn2);
        String b4 = "01101110101111011";
        SBin_3 = new SBinary(b4);
        int seed = new Random().nextInt();
        Random rng = new Random(seed);
        seed = new Random().nextInt();
        rng = new Random(seed);
        int strSize = rng.nextInt(20) + 1;
        random_binary_value_1 = RandomStringUtils.random(strSize, zeroOne);
        random_binary_value_2 = RandomStringUtils.random(strSize, zeroOne);
    }

    @Test
    void operate() {

        SBin1 = new SBinary(random_binary_value_1);
        assertEquals(SBin1, SBin1.asBinary());
    }
}