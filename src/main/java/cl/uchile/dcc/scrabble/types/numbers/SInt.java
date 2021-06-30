package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.operands.binaryOperand;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.SString;

public class SInt extends abstractTypes implements INumbers, binaryOperand{
    private final int value;
    /*
    Creates a SInt object
     */
    public SInt(int value) {
        this.value = value;
    }

    // region : Casts
    @Override
    public SString asString() {
        return new SString(Integer.toString(value));
    }

    @Override
    public SInt asInt() {
        return new SInt(value);
    }

    @Override
    public SBinary asBinary() {
        return new SBinary(this.toBinaryStr());
    }

    @Override
    public SFloat asFloat() {
        return null;
    }
    // endregion

    // region : Operations
    public INumbers add(INumbers addend) {
        return addend.addToInt(this);
    }

    public INumbers subtract(INumbers subtrahend) {
        return subtrahend.subtractToInt(this);
    }

    public INumbers multiply(INumbers product) {
        return product.multiplyToInt(this);
    }

    public INumbers divide(INumbers divisor) {
        return divisor.divideToInt(this);
    }
    // endregion

    // region : Double Dispatch
    @Override
    public SFloat addToFloat(SFloat addend) {
        return null;
    }

    @Override
    public SInt addToInt(SInt addend) {
        return null;
    }

    @Override
    public SInt subtractToInt(SInt dividend) {
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
    public SInt multiplyToInt(SInt product) {
        return null;
    }

    @Override
    public INumbers divideToInt(SInt dividend) {
        return null;
    }

    @Override
    public SBinary addToBinary(SBinary addend) {
        return null;
    }

    @Override
    public SBinary subtractToBinary(SBinary subtractor) {
        return null;
    }

    @Override
    public SBinary multiplyToBinary(SBinary product) {
        return null;
    }

    @Override
    public SBinary divideToBinary(SBinary dividend) {
        return null;
    }

    // endregion
    private String toBinaryStr() {
        return null;
    }
}
