package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;
import cl.uchile.dcc.scrabble.visitor.visitorWhile;

public class ASTwhile implements IControl, INodes {
    INodes cond;
    INodes whileTrue;

    public INodes getCond() {
        return cond;
    }

    public INodes getWhileTrue() {
        return whileTrue;
    }

    /**
     * Creates a while node operand that establishes the if flow control operation given a condition and a given operation.
     */
    public ASTwhile(INodes cond, INodes whileTrue) {
        this.cond = cond;
        this.whileTrue = whileTrue;
    }
    /**
     * Uses this defined while Node Operand as an input for the visitor object, which will execute all the operations for
     * the flow control process.
     * @param visitor
     * @return
     */
    @Override
    public ITypes accept(IVisitor visitor) {
        visitor.visitWhile(this);
        return null;
    }
    /**
     * Operates this while Node Operand using specifically a while visitor.
     * @return
     */
    @Override
    public ITypes operate() {
        visitorWhile visitor = new visitorWhile();
        return accept(visitor);
    }
}
