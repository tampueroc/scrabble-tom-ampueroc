package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.operands.varComparator.ASTgreater;
import cl.uchile.dcc.scrabble.AST.operands.varComparator.ASTnotEqual;
import cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand.subtractTo;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;
import static org.junit.jupiter.api.Assertions.*;

class ASTifTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void operate() {
        SInteger SInt_1 = new SInteger(24);
        SInteger SInt_2 = new SInteger(18);
        SInteger SInt_0 = new SInteger(0);

        varNode a = new varNode("a", SInt_1);
        varNode b = new varNode("b", SInt_2);

        varNode const_0 = new varNode("0", SInt_0);
        a.operate();
        b.operate();
        const_0.operate();

        Map<String, ITypes> map = getMapVar();

        ASTnotEqual cond_1 = new ASTnotEqual("b", "0");

        ASTgreater cond_2 = new ASTgreater("a", "b");

        subtractTo ifTrue = new subtractTo("a", "b");
        subtractTo ifFalse = new subtractTo("b", "a");


        ASTif whileTrue = new ASTif(cond_2, ifTrue, ifFalse);
        ASTwhile w1 = new ASTwhile(cond_1, whileTrue);
        w1.operate();

        System.out.println("EL MCD ES: " + map.get("a"));
    }
}