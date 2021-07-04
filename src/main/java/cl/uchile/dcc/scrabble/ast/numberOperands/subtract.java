package cl.uchile.dcc.scrabble.ast.numberOperands;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.ast.twoChildAST;
import cl.uchile.dcc.scrabble.ast.astNode;

public class subtract extends twoChildAST {

    public subtract(astNode leftNode, astNode rightNode) {
        super(leftNode, rightNode);
    }

    @Override
    public ITypes operate() {
        return this.getLeftChild().operate().subtract(this.getRightChild().operate());
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof add){
            var other = (add) obj;
            return other.operate().equals(this.operate());
        }
        return false;
    }
}
