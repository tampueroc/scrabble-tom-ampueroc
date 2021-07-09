package cl.uchile.dcc.scrabble.AST;


public abstract class twoNodes implements INodes{
    private INodes leftChild;
    private INodes rightChild;

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
}
