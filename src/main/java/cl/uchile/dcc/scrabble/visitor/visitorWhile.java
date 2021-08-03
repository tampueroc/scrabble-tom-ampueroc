package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class visitorWhile implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    Map<String, ITypes> map = getMapVar();
    @Override
    public ITypes visitIf(ASTif control) {
        return null;
    }
    /**
     * Operates the While Node operation if the associated condition is true
     * @param control
     * @return
     */
    @Override
    public void visitWhile(ASTwhile control) {
        INodes cond = control.getCond();
        INodes whileTrue = control.getWhileTrue();
        while (cond.operate().equals(STrue)){
            whileTrue.operate();
        }
    }
}
