package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.operands.binaryOperand;
import cl.uchile.dcc.scrabble.operands.logical;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.SString;

//TODO todos los metodos
public class SBinary extends abstractTypes implements INumbers, binaryOperand, logical{
    private final String value;


    public SBinary(String value) {
        this.value = value;
    }

    // region : CAST
    @Override
    public SString asString() {
        return new SString(value);
    }

    @Override
    public SFloat asFloat() {
        return null;
    }

    @Override
    public SInt asInt() {
        return null;
    }

    @Override
    public SBinary asBinary() {
        return null;
    }
    // endregion

    // region : OPERATIONS
    @Override
    public logical and(logical conjunct) {
        return conjunct.andBinary(this);
    }

    @Override
    public logical or(logical operand) {
        return null;
    }

    public binaryOperand add(binaryOperand addend) {
        return addend.addToBinary(this);
    }

    public binaryOperand multiply(binaryOperand product) {
        return product.multiplyToBinary(this);
    }

    public binaryOperand subtract(binaryOperand subtractor) {
        return subtractor.subtractToBinary(this);
    }

    public binaryOperand divide(binaryOperand divisor) {
        return divisor.divideToBinary(this);
    }
    // endregion

    // region : DOUBLE DISPATCH
    @Override
    public SString addToString(SString addend) {
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

    @Override
    public logical andBool(SBoolean bool) {
        return null;
    }

    @Override
    public logical orBool(logical operand) {
        return null;
    }

    @Override
    public logical andBinary(SBinary sBinary) {
        return null;
    }

    @Override
    public SFloat addToFloat(SFloat addend) {
        return null;
    }

    @Override
    public SFloat subtractToFloat(SFloat subtrahend) {
        return null;
    }

    @Override
    public INumbers subtractToInt(SInt subtrahend) {
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
    public SBinary addToInt(SInt addend) {
        return null;
    }

    @Override
    public SBinary multiplyToInt(SInt product) {
        return null;
    }

    @Override
    public SBinary divideToInt(SInt dividend) {
        return null;
    }
    // endregion
}
