package cl.uchile.dcc.scrabble.operands;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SInt;
import cl.uchile.dcc.scrabble.types.numbers.INumbers;

//TODO documentacion
public interface binaryOperand {
    SBinary addToBinary(SBinary addend);

    SBinary subtractToBinary(SBinary subtractor);

    SBinary multiplyToBinary(SBinary product);

    SBinary divideToBinary(SBinary dividend);

    SInt asInt();

    SBinary asBinary();
}
