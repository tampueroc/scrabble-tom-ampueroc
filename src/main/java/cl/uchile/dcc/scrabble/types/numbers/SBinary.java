package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class SBinary extends abstractTypes implements ITypes{
    private final String value;

    /**
     * Creates a Scrabble Binary object
     * @param value
     */
    public SBinary(String value) {
        this.value = value;
    }

    /**
     * Returns an identical Scrabble Binary representation of this Scrabble Binary object
     * @return
     */
    @Override
    public SBinary asBinary() {
        return new SBinary(this.getValue());
    }

    /**
     * Returns a Scrabble Float representation of this Scrabble Binary object
     * @return
     */
    @Override
    public SFloat asFloat() {
        return this.asInteger().asFloat();
    }

    /**
     * Returns a Scrabble Integer representation of this Scrabble Binary object
     */
    @Override
    public SInteger asInteger() {
        if(bitToInt(this.getValue().charAt(0)) == 0){
            return new SInteger(positiveBinToInt(this.getValue()));
        }
        else {
            return new SInteger(negativeBinaryToInt(this.getValue()));
        }
    }

    /** TODO
     * Returns the Scrabble Float result of the sum of this Scrabble Binary object
     * and a given Scrabble Float
     */
    @Override
    public ITypes addToBinary(SBinary addend) {
        int result = addend.asInteger().getValue() + this.asInteger().getValue();
        SInteger SInt =new SInteger(result);
        return SInt.asBinary();
    }

    /**
     * Returns the Scrabble Float result of the sum of this Scrabble Binary object
     * and a given Scrabble Float
     */
    @Override
    public ITypes addToFloat(SFloat addend) {
        return new SFloat(addend.getValue() + this.asFloat().getValue());
    }

    /**
     * TODO
     */
    @Override
    public ITypes divideToFloat(SFloat divisor) {
        return null;
    }

    /**
     * Returns the Scrabble Integer result of the sum of this Scrabble Binary object
     * and a given Scrabble Integer
     */
    @Override
    public ITypes addToInteger(SInteger addend) {
        return new SInteger(addend.getValue() + this.asInteger().getValue());
    }
    /** TODO
     *
     */
    @Override
    public ITypes add(ITypes addend) {
        return addend.addToBinary(this);
    }
    private int negativeBinaryToInt(String binary){
        int n = binary.length() - 1;
        int w = -bitToInt(binary.charAt(0)) * (int) Math.pow(2, n);
        for (int i = n, j = 0; i > 0; i--, j++){
            w += (int) Math.pow(2, j) * (binary.charAt(i) == '1' ? 1 : 0);
        }
        return w;
    }
    private int positiveBinToInt(String binary){
        int w = 0;
        for (int i = binary.length() - 1, j = 0; i > 0; i--, j++){
            w += (int) Math.pow(2, j) * bitToInt(binary.charAt(i));
        }
        return w;
    }
    private int bitToInt(char bit){
        return bit == '0' ? 0 : 1;
    }
    /**
     * Returns this Scrabble Binary object's value.
     */
    public String getValue() {
        return value;
    }

    /**
     * TODO
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    /** TODO
     *
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
