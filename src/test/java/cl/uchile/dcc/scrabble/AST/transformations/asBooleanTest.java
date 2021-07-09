package cl.uchile.dcc.scrabble.AST.transformations;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.logical.ASTand;
import cl.uchile.dcc.scrabble.AST.operands.logical.ASTnegate;
import cl.uchile.dcc.scrabble.AST.operands.logical.ASTor;
import cl.uchile.dcc.scrabble.AST.operands.numerical.ASTadd;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import cl.uchile.dcc.scrabble.types.typesFactories.SBooleanFactory;
import cl.uchile.dcc.scrabble.types.typesFactories.SIntegerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class asBooleanTest {
    private boolean T = true;
    private boolean F = false;
    private SBoolean STrue;
    private SBoolean SFalse;
    private INodes NodeT;
    private int int_1 = 10;
    private SInteger SInt_1;

    @BeforeEach
    void setUp() {
        STrue = new SBoolean(T);
        SFalse = new SBoolean(F);
        SInt_1 = new SInteger(int_1);
    }

    @Test
    void operate() {
        INodes AST_1 = new ASTand(new ASTand(STrue, SFalse), new ASTor(SFalse, new ASTnegate(STrue)));
        INodes AST_1_bool = new asBoolean(AST_1);
        ITypes actual = AST_1_bool.operate();
        System.out.println(actual);
        ITypes expectedValue = ((STrue.and(SFalse)).and(SFalse.or(STrue.negate())));
        assertEquals(actual, expectedValue);
    }
}