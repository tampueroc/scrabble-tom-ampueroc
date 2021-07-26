package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.compare.ICompare;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

public class visitorIf implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    SBoolean SFalse = new SBoolean(false);


    @Override
    public ITypes visitIf(ASTif control) {
        INodes cond = control.getLeftChild();
        INodes ifTrue = control.getMiddleChild();
        INodes ifFalse = control.getRightChild();
        if (cond.operate()==STrue){
            return ifTrue.operate();
        }
        if (cond.operate()==SFalse){
            return ifFalse.operate();
        }
        return null;
    }

    @Override
    public void visitWhile(ASTwhile control) {

    }
}
