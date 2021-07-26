package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;

public abstract class threeNodes implements INodes{
    private final INodes leftChild;
    private final INodes middleChild;
    private final INodes rightChild;

    public threeNodes(INodes leftChild, INodes middleChild, INodes rightChild) {
        this.leftChild = leftChild;
        this.middleChild = middleChild;
        this.rightChild = rightChild;
    }

    @Override
    public ITypes operate() {
        return null;
    }

    public INodes getLeftChild() {
        return leftChild;
    }

    public INodes getMiddleChild() {
        return middleChild;
    }

    public INodes getRightChild() {
        return rightChild;
    }
}
