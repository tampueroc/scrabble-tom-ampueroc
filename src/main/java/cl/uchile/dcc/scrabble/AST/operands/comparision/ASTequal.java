package cl.uchile.dcc.scrabble.AST.operands.comparision;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.typesFactories.SBooleanFactory;

public class ASTequal extends twoNodes {
    public ASTequal(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }

    /**
     * Operates this Node Type to return the Scrabble Type representation of itself
     */
    @Override
    public ITypes operate() {
        if (this.getLeftChild().operate().compareTo(this.getRightChild().operate()) == 0){
            return SBooleanFactory.createSBoolean(true);
        }
        else{
            return SBooleanFactory.createSBoolean(false);
        }
    }

}
