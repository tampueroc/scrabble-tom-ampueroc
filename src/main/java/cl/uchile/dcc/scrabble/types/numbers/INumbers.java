package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.ITypes;

public interface INumbers extends ITypes{
    SFloat asFloat();

    SFloat addToFloat(SFloat addend);

    SFloat subtractToFloat(SFloat subtrahend);

    INumbers subtractToInt(SInt subtrahend);

    SFloat multiplyToFloat(INumbers product);

    SFloat divideToFloat(INumbers divisor);

    INumbers addToInt(SInt addend);

    INumbers multiplyToInt(SInt product);

    INumbers divideToInt(SInt dividend);
}
