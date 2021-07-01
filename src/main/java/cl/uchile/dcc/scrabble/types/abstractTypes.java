package cl.uchile.dcc.scrabble.types;

public abstract class abstractTypes implements  ITypes{
    @Override
    public SString addToString(SString addend) {
        return new SString(addend.toString() + this.asString().asString()); //TODO is it okay to use asString?
    }

    /*
    @Override
    public SBinary addToBinary(SBinary addend) {
        return null;
    }

    @Override
    public SBinary subtractToBinary(SBinary subtract) {
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
    public SFloat addToFloat(SFloat addend) {
        return null;
    }

    @Override
    public SFloat subtractToFloat(SFloat subtrahend) {
        return null;
    }

    @Override
    public ITypes subtractToInt(SInt subtrahend) {
        return null;
    }

    @Override
    public SFloat multiplyToFloat(ITypes product) {
        return null;
    }

    @Override
    public SFloat divideToFloat(ITypes divisor) {
        return null;
    }

    @Override
    public ITypes addToInt(SInt addend) {
        return null;
    }

    @Override
    public ITypes multiplyToInt(SInt product) {
        return null;
    }

    @Override
    public ITypes divideToInt(SInt dividend) {
        return null;
    }
    */
}
