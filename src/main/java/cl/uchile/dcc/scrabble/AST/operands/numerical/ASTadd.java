package cl.uchile.dcc.scrabble.AST.operands.numerical;

import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.Map;

public class ASTadd extends twoNodes {
    /**
     * Creates an Operand Add Node that establishes the addition operation between it's left and right children.
     */
    public ASTadd(String leftChild, String rightChild) {
        super(leftChild, rightChild);
    }
    /**
     * Evaluates this Node to returns it's Scrabble Type operation result by summoning the Scrabble Operation add
     */
    @Override
    public ITypes operate() {
        varNode owo = new varNode();
        Map<String, ITypes> map = owo.getMapVar();
        ITypes result = map.get(this.getLeftChild()).add(map.get(this.getRightChild()));
        map.put(this.getLeftChild(), result);
        return result;
    }
}