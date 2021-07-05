package cl.uchile.dcc.scrabble.AST;


public abstract class twoNodes implements INodes{
    private INodes leftChild;
    private INodes rightChild;

    public twoNodes(INodes leftChild, INodes rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public INodes getLeftChild() {
        return leftChild;
    }

    public INodes getRightChild() {
        return rightChild;
    }
}
