package cl.uchile.dcc.scrabble.fluxControl;

import cl.uchile.dcc.scrabble.AST.operands.comparision.ASTequal;
import cl.uchile.dcc.scrabble.AST.operands.comparision.ASTgreater;
import cl.uchile.dcc.scrabble.AST.operands.numerical.ASTadd;
import cl.uchile.dcc.scrabble.AST.operands.numerical.ASTsubtract;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ifVisitorTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void visit() {
        SInteger a = new SInteger(5);
        SInteger b = new SInteger(5);
        ASTequal condIf = new ASTequal(a, b);
        ASTsubtract if1 = new ASTsubtract(a, b);
        ASTadd if2 = new ASTadd(b, a);

        ifVisitor ifV = new ifVisitor();
        assertEquals(condIf.acceptIf(ifV, if1, if2), if1.operate());
    }

}