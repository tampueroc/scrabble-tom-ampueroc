package cl.uchile.dcc.scrabble.visitor;

import cl.uchile.dcc.scrabble.AST.operands.control.ASTif;
import cl.uchile.dcc.scrabble.AST.operands.control.ASTwhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public interface IVisitor {
    /**
     * Executes the operation for the ASTif object, based on its defined condition and possible executions (ifTrue and
     * ifFalse operations), returning their respective result in each case.
     * @param control
     * @return
     */
    ITypes visitIf(ASTif control);

    /**
     * Executes the operation for the ASTwhile object, based on it's cond and whileTrue attributes.
     * @param control
     */
    void visitWhile(ASTwhile control);
}
