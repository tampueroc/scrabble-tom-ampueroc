package cl.uchile.dcc.scrabble.AST.operands.control;

import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

public interface IControl {
    ITypes accept(IVisitor visitor);
}
