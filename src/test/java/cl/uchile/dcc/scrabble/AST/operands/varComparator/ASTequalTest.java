package cl.uchile.dcc.scrabble.AST.operands.varComparator;

import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ASTequalTest {

    private Random rng;

    @RepeatedTest(100)
    void operate() {
        ITypes expected = new SBoolean(false);
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

        ASTequal cond = new ASTequal("a", "b");
        ITypes actual = cond.operate();
        int expectedValue_1 = SFlt_1.compare(SInt_1);
        if (expectedValue_1==0){
            expected=new SBoolean(true);
        }
        assertEquals(expected, actual);
    }

    @BeforeEach
    void setUp() {
        int seed = new Random().nextInt();
        rng = new Random(seed);
    }

}