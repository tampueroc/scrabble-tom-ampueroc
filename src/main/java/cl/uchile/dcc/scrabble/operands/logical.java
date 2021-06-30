package cl.uchile.dcc.scrabble.operands;

import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;

public interface logical {
    logical and(logical conjunct);

    logical andBool(SBoolean bool);

    logical or(logical operand);

    logical orBool(logical operand);

    logical andBinary(SBinary sBinary);

}
