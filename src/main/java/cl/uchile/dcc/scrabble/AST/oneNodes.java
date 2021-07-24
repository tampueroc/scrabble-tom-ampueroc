package cl.uchile.dcc.scrabble.AST;


import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public abstract class oneNodes implements INodes{
    private final INodes child;

    /**
     * Creates a Node object that has only one Node Type child
     */
    public oneNodes(INodes child) {
        this.child = child;
    }

    /**
     * Returns the Node child
     */
    public INodes getChild() {
        return child;
    }


    @Override
    public ITypes acceptIf(IVisitorIf visitor, INodes ifTrue, INodes ifFalse) {
        return null;
    }

    @Override
    public void acceptWhile(IVisitorWhile visitor, INodes whileTrue) {

    }

}
