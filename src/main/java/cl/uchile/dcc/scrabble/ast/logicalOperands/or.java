package cl.uchile.dcc.scrabble.ast.logicalOperands;


import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.ast.twoChildAST;
import cl.uchile.dcc.scrabble.ast.astNode;

public class or extends twoChildAST{
    public or(astNode leftNode, astNode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().or(this.getRightChild().operate());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof or){
            var other = (or) obj;
            return other.operate().equals(this.operate());
        }
        return false;
    }
}
