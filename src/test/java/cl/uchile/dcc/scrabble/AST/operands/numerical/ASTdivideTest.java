package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ASTdivideTest {
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

        SFloat SFlt_1 = new SFloat(random_dbl_1);
        SInteger SInt_1 = new SInteger(random_1);
        SInteger SInt_2 = new SInteger(random_2);

        INodes AST_1 = new ASTdivide(new ASTdivide(SInt_1, SInt_2), new ASTdivide(SInt_1, SFlt_1));
        ITypes actual = AST_1.operate();
        double expectedValue = (SInt_1.getValue()/ SInt_2.getValue()) / (SInt_1.getValue() / SFlt_1.getValue());
        SFloat expected = new SFloat(expectedValue);
        assertEquals(expected, actual);
    }
}