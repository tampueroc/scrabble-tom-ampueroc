package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;
import cl.uchile.dcc.scrabble.visitor.visitorIf;

public class ASTif implements IControl, INodes {
    INodes cond;
    INodes ifTrue;
    INodes ifFalse;
    /**
     * Creates an Operand if node that establishes the if flow control operation given a condition and two cases.
     */
    public ASTif(INodes cond, INodes ifTrue, INodes ifFalse) {
        this.cond = cond;
        this.ifTrue = ifTrue;
        this.ifFalse = ifFalse;
    }

    /**
     * Uses this defined if Node Operand as an input for the visitor object, which will execute all the operations for
     * the flow control process.
     * @param visitor
     * @return
     */
    @Override
    public ITypes accept(IVisitor visitor) {
        return visitor.visitIf(this);
    }

    /**
     * Operates this if Node Operand using specifically an if visitor.
     * @return
     */
    @Override
    public ITypes operate() {
        visitorIf visitor =  new visitorIf();
        return accept(visitor);
    }

    /**
     * Returns this if Node Operand condition.
     * @return
     */
    public INodes getCond() {
        return cond;
    }
    /**
     * Returns this if Node Operand operation if the given condition is true.
     * @return
     */
    public INodes getIfTrue() {
        return ifTrue;
    }
    /**
     * Returns this if Node Operand operation if the given condition is false.
     * @return
     */
    public INodes getIfFalse() {
        return ifFalse;
    }
}
