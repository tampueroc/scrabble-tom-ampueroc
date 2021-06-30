package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.ITypes;

public interface INumbers extends ITypes{
    SFloat asFloat();

    SFloat addToFloat(SFloat addend);

    SFloat subtractToFloat(SFloat subtrahend);
}
