package cl.uchile.dcc.scrabble.ast;

public abstract class twoChildAST implements astNode{
    private astNode leftChild;
    private astNode rightChild;

    protected twoChildAST(astNode leftNode, astNode rightNode){
        this.leftChild = leftNode;
        this.rightChild = rightNode;
    }

    public astNode getLeftChild() {
        return leftChild;
    }

    public astNode getRightChild() {
        return rightChild;
    }
}
