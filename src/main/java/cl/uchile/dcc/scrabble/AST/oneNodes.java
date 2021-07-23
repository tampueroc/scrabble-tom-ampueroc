package cl.uchile.dcc.scrabble.AST;

import cl.uchile.dcc.scrabble.types.ITypes;

public abstract class oneNodes implements INodes{
    private INodes child;

    /**
     * Creates a Node object that has only one Node Type child
     * @param child
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

}
