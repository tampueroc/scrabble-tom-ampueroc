package cl.uchile.dcc.scrabble.AST;


public abstract class twoNodes implements INodes{
    private String leftChild;
    private String rightChild;

    public void setLeftChild(String leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(String rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * Creates a Node object that has two Node Type children.
     */
    public twoNodes(String leftChild, String rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * Returns the left child Node.
     */
    public String getLeftChild() {
        return leftChild;
    }
    /**
     * Returns the right child Node.
     */
    public String getRightChild() {
        return rightChild;
    }
}
