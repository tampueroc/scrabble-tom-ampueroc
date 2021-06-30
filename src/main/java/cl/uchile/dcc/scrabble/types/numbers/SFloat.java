package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.SString;

public class SFloat implements INumbers{
    protected double value;

    /*
    Creates a SFloat object
     */
    public SFloat(double value) {
        this.value = value;
    }
    // region : Cast

    // TODO
    @Override
    public SString asString() {
        return new SString(Double.toString(value));
    }

    @Override
    public SString addToString(SString addend) {
        return null;
    }

    /*
    Returns the Scrabble representation of the object
     */
    public SFloat asFloat() {
        return new SFloat(value);
    }
    // endregion

    // region : operations
    public SFloat add(INumbers addend) {
        return addend.addToFloat(this);
    }

    public SFloat subtract(INumbers subtractor) {
        return subtractor.subtractToFloat(this);
    }

    public SFloat multiply(INumbers product) {
        return product.multiplyToFloat(this);
    }

    public SFloat divide(INumbers divisor) {
        return divisor.divideToFloat(this);
    }
    // endregion

    // region : Double Dispatch
    @Override
    public SFloat addToFloat(SFloat addend) {
        return null;
    }

    @Override
    public INumbers subtractToInt(SInt subtrahend) {
        return null;
    }

    @Override
    public SFloat subtractToFloat(SFloat subtrahend) {
        return null;
    }

    @Override
    public SFloat multiplyToFloat(INumbers product) {
        return null;
    }

    @Override
    public SFloat divideToFloat(INumbers divisor) {
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
    /*
    Return this object float value
     */
    public double getValue() {
        return value;
    }
    // endregion
}
