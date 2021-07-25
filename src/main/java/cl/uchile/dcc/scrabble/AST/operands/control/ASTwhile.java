package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.AST.INodes;
import cl.uchile.dcc.scrabble.AST.operands.compare.ICompare;
import cl.uchile.dcc.scrabble.AST.twoNodes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class ASTwhile extends twoNodes {

    /**
     * Creates a Node object that has two Node Type children.
     */
    public ASTwhile(ICompare cond, INodes whileTrue) {
        super(cond, whileTrue);
    }

    @Override
    public ITypes operate() {
        return null;
    }
}
