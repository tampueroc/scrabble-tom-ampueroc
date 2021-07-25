package cl.uchile.dcc.scrabble.AST.operands.compare;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

public class ASTgreater extends twoNodes implements ICompare{
    public ASTgreater(INodes leftChild, INodes rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public ITypes operate() {
        if (this.getLeftChild().operate().compareTo(this.getRightChild().operate())>0){
            return new SBoolean(true);
        }
        return null;
    }
}