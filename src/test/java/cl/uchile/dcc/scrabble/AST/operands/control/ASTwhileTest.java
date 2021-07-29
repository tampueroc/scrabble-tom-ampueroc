package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.operands.varComparator.ASTgreater;
import cl.uchile.dcc.scrabble.AST.operands.varNumericalOperand.addTo;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

class ASTwhileTest {

    @Test
    void operate() {
        SInteger SInt_1 = new SInteger(10);
        SInteger SInt_2 = new SInteger(4);
        SInteger SInt_3 = new SInteger(1);

        varNode a = new varNode("a", SInt_1);
        varNode b = new varNode("b", SInt_2);
        varNode c = new varNode("c", SInt_3);
        a.operate();
        b.operate();
        c.operate();

        Map<String, ITypes> map = getMapVar();

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));

        ASTgreater cond = new ASTgreater("a", "b");
        addTo whileTrue = new addTo("b", SInt_3);

        whileTrue.operate();
        System.out.println(map.get("b"));

        ASTwhile w1 = new ASTwhile(cond, whileTrue);

        w1.operate();
        System.out.println(map.get("b"));
    }
}