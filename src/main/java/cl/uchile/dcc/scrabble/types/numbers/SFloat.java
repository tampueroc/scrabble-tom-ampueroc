package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.SString;


public class SFloat implements INumbers{
    protected double value;

    public SFloat(double value) {
        this.value = value;
    }

    // region : Cast
    @Override
    public SString asString() {
        return new SString(Double.toString(value));
    }

    @Override
    public SString addToString(SString addend) {
        return null;
    }

    public SFloat asFloat() {
        return new SFloat(value);
    }
    // endregion

    // region : operations
    public SFloat add(SNumber addend) {
        return addend.addToFloat(this);
    }

    public SFloat subtract(SNumber subtractor) {
        return subtractor.subtractToFloat(this);
    }

    public SFloat multiply(SNumber product) {
        return product.multiplyToFloat(this);
    }

    public SFloat divide(SNumber divisor) {
        return divisor.divideToFloat(this);
    }
    // endregion

    // region : Double Dispatch
    @Override
    public SFloat addToFloat(SFloat addend) {
        return null;
    }

    @Override
    public SNumber subtractToInt(SInt subtrahend) {
        return null;
    }

    @Override
    public SFloat subtractToFloat(SFloat subtrahend) {
        return null;
    }

    @Override
    public SFloat multiplyToFloat(SNumber product) {
        return null;
    }

    @Override
    public SFloat divideToFloat(SNumber divisor) {
        return null;
    }

    @Override
    public SFloat addToInt(SInt addend) {
        return null;
    }

    @Override
    public SFloat multiplyToInt(SInt product) {
        return null;
    }

    @Override
    public SFloat divideToInt(SInt dividend) {
        return null;
    }
}
