package cl.uchile.dcc.scrabble.AST.operands.logical;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.transformations.asBoolean;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.SString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASTandTest {
    private boolean T = true;
    private boolean F = false;
    private String str_t = "true";
    private String str_f = "false";
    private SBoolean b;
    private SBoolean f;

    @BeforeEach
    void setUp() {
        b = new SBoolean(T);
        f = new SBoolean(F);
    }

    @Test
    void operate() {

        ITypes expected = b.and(f);
        ITypes actual = new ASTand(b, f).operate();
        assertEquals(actual, expected);

    }
}