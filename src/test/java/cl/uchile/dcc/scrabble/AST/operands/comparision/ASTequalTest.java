package cl.uchile.dcc.scrabble.AST.operands.comparision;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ASTequalTest {
    private Random rng;
    SBoolean STrue = new SBoolean(true);
    SBoolean SFalse = new SBoolean(false);

    @BeforeEach
    void setUp() {
        int seed = new Random().nextInt();
        rng = new Random(seed);
    }
    // TODO Test con diferentes tiposc
    @RepeatedTest(100)
    void operate() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();

        SInteger SInt_1 = new SInteger(random_1);
        SInteger SInt_2 = new SInteger(random_2);

        INodes cond_1 = new ASTequal( SInt_1, SInt_2);
        ITypes cond_1_value = cond_1.operate();
        assertEquals(SFalse, cond_1_value);

        INodes cond_2 = new ASTequal( SInt_1, SInt_1);
        ITypes cond_2_value = cond_2.operate();
        assertEquals(STrue, cond_2_value);
    }
}