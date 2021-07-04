package cl.uchile.dcc.scrabble.ast;

public abstract class oneChildAST implements astNode{
    private final astNode child;

    protected oneChildAST(astNode node){
        this.child = node;
    }

    public astNode getChild(){
        return child;
    }
}
