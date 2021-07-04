package cl.uchile.dcc.scrabble.ast.logicalOperands;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.ast.twoChildAST;
import cl.uchile.dcc.scrabble.ast.astNode;

public class and extends twoChildAST{
    public and(astNode leftNode, astNode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().and(this.getRightChild().operate());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof and){
            var other = (and) obj;
            return other.operate().equals(this.operate());
        }
        return false;
    }
}
