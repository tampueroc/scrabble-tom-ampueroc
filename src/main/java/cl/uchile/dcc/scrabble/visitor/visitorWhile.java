package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.compare.ICompare;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.AST.varNode;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.types.SBoolean;

import java.util.Map;

import static cl.uchile.dcc.scrabble.AST.varNode.getMapVar;

public class visitorWhile implements IVisitor{
    SBoolean STrue = new SBoolean(true);
    varNode a = new varNode();
    Map<String, ITypes> map = getMapVar();
    @Override
    public ITypes visitIf(ASTif control) {
        return null;
    }

    @Override
    public void visitWhile(ASTwhile control) {
        ICompare cond = control.getCond();
        INodes whileTrue = control.getWhileTrue();
        while(cond.operate().asBoolean().isValue()){
            System.out.println(map.get("b"));
            whileTrue.operate();
        }
    }
}
