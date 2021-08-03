package cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand;

import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;
import static org.junit.jupiter.api.Assertions.*;

class subtractToTest {
    private Random rng;

    @RepeatedTest(100)
    void operate() {
        Map<String, ITypes> map = getMapVar();
        int random_1 = rng.nextInt();
        double random_dbl = new Random().nextDouble();
        double random_dbl_1 = random_1*random_dbl;

        SFloat SFlt_1 = new SFloat(random_dbl_1);
        SInteger SInt_1 = new SInteger(random_1);

        varNode a = new varNode("a", SFlt_1);
        varNode b = new varNode("b", SInt_1);
        a.operate();
        b.operate();

        subtractTo add_1 = new subtractTo("a", "b");
        double expectedValue_1 = SFlt_1.subtract(SInt_1).operate().asFloat().getValue();
        SFloat expected_1 = new SFloat(expectedValue_1);
        add_1.operate();
        assertEquals(expected_1, map.get("a"));
    }

    @BeforeEach
    void setUp() {
        int seed = new Random().nextInt();
        rng = new Random(seed);
    }
}