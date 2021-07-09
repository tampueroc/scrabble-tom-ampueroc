package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.numerical.ASTadd;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SString;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import cl.uchile.dcc.scrabble.types.typesFactories.SFloatFactory;
import cl.uchile.dcc.scrabble.types.typesFactories.SIntegerFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class asBinaryTest {
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
    }

    @RepeatedTest(100)
    void operate() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        double random_dbl = new Random().nextDouble();
        double random_dbl_1 = random_1*random_dbl;

        SFloat SFlt_1 = SFloatFactory.createSFloat(random_dbl_1);
        SInteger SInt_1 = SIntegerFactory.createSInteger(random_1);
        SInteger SInt_2 = SIntegerFactory.createSInteger(random_2);

        INodes AST_1 = new ASTadd(new ASTadd(SInt_1, SInt_2), new ASTadd(SInt_1, SFlt_1));
        INodes AST_1_Bin = new asBinary(AST_1);
        ITypes actual = AST_1_Bin.operate();
        double expectedValue = (SInt_1.getValue()+ SInt_2.getValue()) + (SInt_1.getValue() + SFlt_1.getValue());
        SBinary expected = new SFloat(expectedValue).asBinary();
        assertEquals(expected, actual);
    }
}