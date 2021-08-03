package cl.uchile.dcc.scrabble.AST.operands.varComparator;

import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ASTequalTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void operate() {
        SBoolean SFalse = new SBoolean(false);
        SBoolean STrue = new SBoolean(true);
        SInteger SInt_0 = new SInteger(0);
        SInteger SInt_1 = new SInteger(10);
        SInteger SInt_2 = new SInteger(0);
        SInteger SInt_3 = new SInteger(-10);

        varNode a = new varNode("a", SInt_0);
        varNode b = new varNode("b", SInt_1);
        varNode c = new varNode("c", SInt_2);
        varNode d = new varNode("d", SInt_3);

        a.operate();
        b.operate();
        c.operate();
        d.operate();

        ASTequal cond_0 = new ASTequal("a", "b");
        ASTequal cond_1 = new ASTequal("b", "a");
        ASTequal cond_2 = new ASTequal("b", "b");
        ASTequal cond_3 = new ASTequal("c", "d");
        ASTequal cond_4 = new ASTequal("d", "a");

        ITypes cond_0_actual = cond_0.operate();
        ITypes cond_1_actual = cond_1.operate();
        ITypes cond_2_actual = cond_2.operate();
        ITypes cond_3_actual = cond_3.operate();
        ITypes cond_4_actual = cond_4.operate();

        assertEquals(cond_0_actual, SFalse);
        assertEquals(cond_1_actual, SFalse);
        assertEquals(cond_2_actual, STrue);
        assertEquals(cond_3_actual, SFalse);
        assertEquals(cond_4_actual, SFalse);

    }

}