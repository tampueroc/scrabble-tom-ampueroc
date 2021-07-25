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
}
