package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

public class visitorIf implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    SBoolean SFalse = new SBoolean(false);
    @Override
    public ITypes visitIf(ASTif control) {
        INodes cond = control.getCond();
        INodes ifTrue = control.getIfTrue();
        INodes ifFalse = control.getIfFalse();
        if (cond.operate().equals(STrue)){
            return ifTrue.operate();
        }
        if (cond.operate().equals(SFalse)){
            return ifFalse.operate();
        }
        return null;
    }

    @Override
    public void visitWhile(ASTwhile control) {
    }
}
