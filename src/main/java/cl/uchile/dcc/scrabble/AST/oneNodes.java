package cl.uchile.dcc.scrabble.AST;

public abstract class oneNodes implements INodes{
    private INodes child;

    public oneNodes(INodes child) {
        this.child = child;
    }

    public INodes getChild() {
        return child;
    }
}
