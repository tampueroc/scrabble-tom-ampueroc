package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class asBooleanTest {
    private boolean T = true;
    private boolean F = false;
    private SBoolean STrue;
    private SBoolean SFalse;
    private int int_1 = 10;
    private SInteger I;

    @BeforeEach
    void setUp() {
        STrue = new SBoolean(T);
        SFalse = new SBoolean(F);
        I = new SInteger(int_1);
    }

    @Test
    void operate() {
        //TODO
    }
}