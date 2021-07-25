package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.oneNodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.compareVisitor;

public class ASTwhile extends oneNodes implements IControl{

    public ASTwhile(INodes child) {
        super(child);
    }

    @Override
    public ITypes operate() {
        return null;
    }

    @Override
    public void accept(compareVisitor visitor) {
        visitor.visitASTwhile(this.getChild());
    }
}
