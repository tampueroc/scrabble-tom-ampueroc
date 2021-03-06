package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class visitorIf implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    SBoolean SFalse = new SBoolean(false);
    Map<String, ITypes> map = getMapVar();
    /**
     * Evaluates either the true cause or false cause based on the truth value of the condition.
     * @param control
     * @return
     */
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
