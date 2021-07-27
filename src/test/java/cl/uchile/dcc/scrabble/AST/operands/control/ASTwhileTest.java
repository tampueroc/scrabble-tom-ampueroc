package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.operands.compare.ASTgreater;
import cl.uchile.dcc.scrabble.AST.operands.numerical.ASTadd;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;
import static org.junit.jupiter.api.Assertions.*;

class ASTwhileTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void accept() {
        varNode a = new varNode();
        SInteger SInt_1 = new SInteger(10);
        SInteger SInt_2 = new SInteger(4);
        SInteger SInt_3 = new SInteger(1);
        a.use("a", SInt_1);
        a.use("b", SInt_2);
        a.use("1", SInt_3);
        Map<String, ITypes> map = getMapVar();
        System.out.println("Original values");
        System.out.println(map.get("a").asInteger().getValue());
        System.out.println(map.get("b").asInteger().getValue());

        ASTgreater cond = new ASTgreater("a", "b");
        ASTadd whileTrue = new ASTadd("b", "1");

        System.out.println("Cond value");
        System.out.println(cond.operate());
        System.out.println(map.get("a").asInteger().getValue());

        ASTwhile poto = new ASTwhile(cond, whileTrue);
        System.out.println("Empieza el test owo");
        poto.operate();
        System.out.println(map.get("a").asInteger().getValue());
    }
}