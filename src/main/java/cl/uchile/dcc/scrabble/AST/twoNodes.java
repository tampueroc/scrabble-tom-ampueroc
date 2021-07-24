package cl.uchile.dcc.scrabble.AST;


import cl.uchile.dcc.scrabble.fluxControl.IVisitorIf;
import cl.uchile.dcc.scrabble.fluxControl.IVisitorWhile;
import cl.uchile.dcc.scrabble.types.ITypes;

public abstract class twoNodes implements INodes {
    private final INodes leftChild;
    private final INodes rightChild;

    /**
     * Creates a Node object that has two Node Type children.
     */
    public twoNodes(INodes leftChild, INodes rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Returns the left child Node.
     */
    public INodes getLeftChild() {
        return leftChild;
    }

    /**
     * Returns the right child Node.
     */
    public INodes getRightChild() {
        return rightChild;
    }


    @Override
    public ITypes acceptIf(IVisitorIf visitor, INodes ifTrue, INodes ifFalse) {
        return null;
    }

    @Override
    public void acceptWhile(IVisitorWhile visitor, INodes whileTrue) {

    }
}

