package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

public class visitorWhile implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    @Override
    public ITypes visitIf(ASTif control) {
        return null;
    }

    @Override
    public void visitWhile(ASTwhile control) {
        INodes cond = control.getLeftChild();
        INodes whileTrue = control.getRightChild();
        if (cond.operate()==STrue){
            whileTrue.operate();
        }
    }
}
