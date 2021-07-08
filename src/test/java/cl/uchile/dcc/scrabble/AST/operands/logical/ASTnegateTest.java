package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASTnegateTest {
    private boolean T = true;
    private boolean F = false;
    private SBoolean b;
    private SBoolean f;


    @BeforeEach
    void setUp() {
        b = new SBoolean(T);
        f = new SBoolean(F);
    }


    @Test
    void operate() {
        ITypes expected_1 = f.negate();
        ITypes actual_1 = new ASTnegate(f).operate();
        ITypes expected_2 = b.negate();
        ITypes actual_2 = new ASTnegate(b).operate();
        assertEquals(expected_2, actual_2);
        assertEquals(expected_1, actual_1);
    }
}