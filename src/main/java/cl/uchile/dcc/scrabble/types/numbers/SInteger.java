package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Objects;

import static java.lang.Math.abs;

public class SInteger extends abstractTypes implements ITypes{
    private final int value;

    /**
     * Creates a Scrabble Integer object
     * @param value An int value which represents the Scrabble Integer value
     */
    public SInteger(int value) {
        this.value = value;
    }

    /**
     * Returns this Scrabble Integer object's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a Scrabble Binary representation of this Scrabble Integer object
     */
    @Override
    public SBinary asBinary() {
        int int_value = this.getValue();
        int abs_int = abs(int_value);
        String b = positive_intToBinary(abs_int);
        if(int_value < 0){
            b = twosComplement(b);
        }
        return new SBinary(b);
    }

    /**
     * Returns a Scrabble Float representation of this object
     */
    @Override
    public SFloat asFloat() {
        return new SFloat(this.getValue());
    }

    /**
     * Returns an identical Scrabble Integer representation of this object
     */
    @Override
    public SInteger asInteger() {
        return new SInteger(this.getValue());
    }

    /** TODO
     * Returns the Scrabble Binary result of the sum of this object Scrabble Binary
     * representation and the given Scrabble Binary object.
     */
    @Override
    public ITypes addToBinary(SBinary addend) {
        int result = addend.asInteger().getValue() + this.getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /** TODO
     * Returns the SBinary result of the subtraction of this object Scrabble Binary
     * representation and the given Scrabble Binary object.
     */
    @Override
    public ITypes subtractToBinary(SBinary subtrahend) {
        int result = subtrahend.asInteger().getValue() - this.getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /** TODO
     * Returns the ITypes result of the multiplication of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     */
    @Override
    public ITypes multiplyToBinary(SBinary product) {
        int result = product.asInteger().getValue() * this.getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /** TODO
     * Returns the ITypes result of the division of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     */
    @Override
    public ITypes divideToBinary(SBinary dividend) {
        int result = dividend.asInteger().getValue() / this.getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /** TODO
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes addToFloat(SFloat addend) {
        return new SFloat(addend.getValue() + this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes subtractToFloat(SFloat subtrahend) {
        return new SFloat(subtrahend.getValue() - this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes subtractToInt(SInteger subtrahend) {
        return new SInteger(subtrahend.getValue()- this.getValue());
    }

    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes multiplyToFloat(SFloat product) {
        return new SFloat(product.getValue() * this.getValue());
    }

    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes divideToFloat(SFloat divisor) {
            return divisor.divideToInt(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes addToInteger(SInteger addend) {
        return new SInteger(addend.getValue() + this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes multiplyToInt(SInteger product) {
        return new SInteger(product.getValue() * this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes divideToInt(SInteger dividend) {
        return new SInteger(dividend.getValue() * this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes add(ITypes addend) {
        return addend.addToInteger(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes subtract(ITypes subtrahend) {
        return subtrahend.subtractToInt(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes multiply(ITypes product) {
        return product.multiplyToInt(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes divide(ITypes dividend) {
        return dividend.divideToInt(this);
    }


    private static String positive_intToBinary(int n){

        StringBuilder binaryNumString = new StringBuilder();
        binaryNumString.append("0");
        int[] binaryNumArray = new int[32];
        int i = 0;
        while(n > 0){
            binaryNumArray[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--){
            binaryNumString.append(binaryNumArray[j]);
        }
        return binaryNumString.toString();
    }

    private static String twosComplement(String string){
        StringBuilder str = new StringBuilder();
        str.append(string);
        int n = str.length();
        int i;
        for (i = n - 1; i >= 0; i--){
            if (str.charAt(i) == '1'){
                break;
            }
        }
        if (i == -1){
            return "1" + str;
        }
        for (int k = i - 1; k >= 0; k--){
            if (str.charAt(k) == '1'){
                str.replace(k, k + 1, "0");
            }
            else{
                str.replace(k, k + 1, "1");
            }
        }

        return str.toString();
    }
    /**
     Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SInteger.class);
    }

    /**
     Receives an object and determines if its equal to this object by returning a
     boolean value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SInteger) {
            var other = (SInteger) obj;
            return other.getValue() == this.getValue();
        }
        return false;
    }

    /**
     * Returns a string representation of this object's value
     */
    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
}
