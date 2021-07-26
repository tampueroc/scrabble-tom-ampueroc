package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.SString;
import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;
import cl.uchile.dcc.scrabble.visitor.IVisitor;

import java.util.Objects;

public class SBinary extends abstractTypes implements ITypes, INumber{
    private final String value;

    /**
     * Creates a Scrabble Binary object
     */
    public SBinary(String value) {
        this.value = value;
    }

    /**
     * Returns an identical Scrabble Binary representation of this
     * Scrabble Binary object
     */
    @Override
    public SBinary asBinary() {
        return new SBinary(this.getValue());
    }

    /**
     * Returns a Scrabble Float representation of
     * this Scrabble Binary object
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

    /**
     * Returns the Scrabble Binary result of the addition of this Scrabble Binary object
     * and a given Scrabble Binary.
     */
    @Override
    public SBinary addToBinary(SBinary addend) {
        int result = addend.asInteger().getValue() + this.asInteger().getValue();
        SInteger SInt =new SInteger(result);
        return SInt.asBinary();
    }

    /**
     * Returns the Scrabble Binary result of the subtraction of this Scrabble Binary object
     * and a given Scrabble Binary.
     */
    @Override
    public SBinary subtractToBinary(SBinary subtrahend) {
        int result =subtrahend.asInteger().getValue() - this.asInteger().getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /**
     * Returns the Scrabble Binary result of the multiplication of this Scrabble Binary object
     * and a given Scrabble Binary.
     */
    @Override
    public SBinary multiplyToBinary(SBinary product) {
        int result = product.asInteger().getValue() * this.asInteger().getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /**
     * Returns the Scrabble Binary result of the division of this Scrabble Binary object
     * and a given Scrabble Binary.
     */
    @Override
    public SBinary divideToBinary(SBinary dividend) {
        int result = dividend.asInteger().getValue() / this.asInteger().getValue();
        SInteger SInt = new SInteger(result);
        return SInt.asBinary();
    }

    /**
     * Returns the Scrabble Type result of the 'AND' operation between this
     * Scrabble Binary and a given Scrabble Type
     */
    @Override
    public ITypes and(ITypes conjunct) {
        return conjunct.andBinary(this);
    }

    /**
     * Returns the Scrabble Type result of the 'AND' operation between this
     * Scrabble Binary and a given Scrabble Boolean. TODO ELABORATE?
     */
    @Override
    public ITypes andBool(SBoolean bool) {
        int L = this.getValue().length();
        String str = this.getValue();
        StringBuilder result = new StringBuilder();
        if(bool.isValue()){
            return new SBinary(str);
        }
        else{
            result.append("0".repeat(L));
            String strResult = result.toString();
            return new SBinary(strResult);
        }
    }

    /**
     * Returns the Scrabble Type result of the 'AND' operation between this
     * Scrabble Binary and a given Scrabble Binary. TODO ELABORATE?
     */
    @Override
    public ITypes andBinary(SBinary sBinary) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int l1 = this.getValue().length();
        int l2 = sBinary.getValue().length();
        int max_length = java.lang.Math.max(l1, l2);
        int n1 = this.asInteger().getValue();
        int n2 = sBinary.asInteger().getValue();

        if(n1 < 0){
            while(l1 < max_length){
                s1.append("1");
                l1 ++;
            }
        }
        if(n1 >= 0){
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
        }
        if(n2 < 0){
            while(l2 < max_length){
                s2.append("1");
                l2 ++;
            }
        }
        if(n2 >= 0){
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
        }

        s1.append(this.getValue());
        s2.append(sBinary.getValue());
        String binary_value1 = s1.toString();
        String binary_value2 = s2.toString();

        for(int i = 0; i < max_length; i++){
            if(binary_value1.charAt(i) != binary_value2.charAt(i)){
                result.append("0");
            }
            else if((binary_value1.charAt(i) == binary_value2.charAt(i)) && binary_value1.charAt(i) == '1'){
                result.append("1");
            }
            else {
                result.append("0");
            }
        }
        String resultStr = result.toString();
        return new SBinary(resultStr);
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this
     * Scrabble Binary and a given Scrabble Type
     */
    @Override
    public ITypes or(ITypes operand) {
        return operand.orBinary(this);
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this
     * Scrabble Binary and a given Scrabble Boolean
     */
    @Override
    public ITypes orBool(SBoolean operand) {
        int l = this.getValue().length();
        String str = this.getValue();
        StringBuilder result = new StringBuilder();
        if(!operand.asBoolean().isValue()){
            return new SBinary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return new SBinary(strResult);
        }
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this
     * Scrabble Binary and a given Scrabble Binary
     */
    @Override
    public ITypes orBinary(SBinary operand) {
        StringBuilder s1 = new StringBuilder(); //TODO
        StringBuilder s2 = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int l1 = this.getValue().length();
        int l2 = operand.getValue().length();
        int max_length = java.lang.Math.max(l1, l2);
        int n1 = this.asInteger().getValue();
        int n2 = operand.asInteger().getValue();

        if(n1 < 0){
            while(l1 < max_length){
                s1.append("1");
                l1 ++;
            }
        }
        if(n1 >= 0){
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
        }
        if(n2 < 0){
            while(l2 < max_length){
                s2.append("1");
                l2 ++;
            }
        }
        if(n2 >= 0){
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
        }

        s1.append(this.getValue());
        s2.append(operand.getValue());
        String binary_value1 = s1.toString();
        String binary_value2 = s2.toString();

        for(int i = 0; i < max_length; i++){

            if(binary_value1.charAt(i) == '1' || binary_value2.charAt(i) == '1'){
                result.append("1");
            }
            else {
                result.append("0");
            }
        }
        String resultStr = result.toString();
        return new SBinary(resultStr);
    }

    /**
     * Returns the negation of this Scrabble Binary object value
     */
    @Override
    public SBinary negate() {
        int l = this.getValue().length();
        String str = this.getValue();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < l; i++){
            if(str.charAt(i) == '1'){
                result.append("0");
            }
            else{
                result.append("1");
            }
        }
        String result_value = result.toString();
        return new SBinary(result_value);
    }


    /**
     * Returns the Scrabble Integer result of the addition of this Scrabble Binary and a given
     * Scrabble Float, based on the values of both.
     */
    @Override
    public ITypes addToFloat(SFloat addend) {
        return new SFloat(addend.getValue() + this.asFloat().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the subtraction of this Scrabble Binary and a given
     * Scrabble Float, based on the values of both.
     */
    @Override
    public ITypes subtractToFloat(SFloat subtrahend) {
        return new SFloat(subtrahend.getValue() - this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the subtraction of this Scrabble Binary and a given
     * Scrabble Integer, based on the values of both.
     */
    @Override
    public ITypes subtractToInteger(SInteger subtrahend) {
        return new SInteger(subtrahend.getValue() - this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the multiplication of this Scrabble Binary and a given
     * Scrabble Float, based on the values of both.
     */
    @Override
    public ITypes multiplyToFloat(SFloat product) {
        return new SFloat(product.getValue() * this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the division of this Scrabble Binary and a given
     * Scrabble Float, based on the values of both.
     */
    @Override
    public ITypes divideToFloat(SFloat divisor) {
        return new SFloat(divisor.getValue() / this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the addition of this Scrabble Binary and a given
     * Scrabble Integer, based on the values of both.
     */
    @Override
    public ITypes addToInteger(SInteger addend) {
        return new SInteger(addend.getValue() + this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the multiplication of this Scrabble Binary and a given
     * Scrabble Integer, based on the values of both.
     */
    @Override
    public ITypes multiplyToInteger(SInteger product) {
        return new SInteger(product.getValue() * this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Integer result of the division of this Scrabble Binary and a given
     * Scrabble Integer, based on the values of both.
     */
    @Override
    public ITypes divideToInteger(SInteger dividend) {
        return new SInteger(dividend.getValue() / this.asInteger().getValue());
    }

    /**
     * Returns the Scrabble Type result of the addition of this Scrabble Binary and a given
     * Scrabble Type, using the addToBinary method.
     */
    @Override
    public ITypes add(ITypes addend) {
        return addend.addToBinary(this);
    }

    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Binary and a given
     * Scrabble Type, using the subtractToBinary method.
     */
    @Override
    public ITypes subtract(ITypes subtrahend) {
        return subtrahend.subtractToBinary(this);
    }

    /**
     * Returns the Scrabble Type result of the multiply of this Scrabble Binary and a given
     * Scrabble Type, using the multiplyToBinary method.
     */
    @Override
    public ITypes multiply(ITypes product) {
        return product.multiplyToBinary(this);
    }

    /**
     * Returns the Scrabble Type result of the divide of this Scrabble Binary and a given
     * Scrabble Type, using the divideToBinary method.
     */
    @Override
    public ITypes divide(ITypes dividend) {
        return dividend.divideToBinary(this);
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
     * Returns the Scrabble Binary Type object's value
     */
    public String getValue() {
        return value;
    }

    /**
     Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SBinary.class);
    }

    /**
     * Receives an object and determines if its equal to this object by returning a
     * boolean value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SBinary) {
            var other = (SBinary) obj;
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            int l1 = this.getValue().length();
            int l2 = other.getValue().length();
            int max_length = java.lang.Math.max(l1, l2);
            int n1 = this.asInteger().getValue();
            int n2 = other.asInteger().getValue();
            if ((n1 > 0 && n2 < 0) || (n2 > 0 && n1 < 0)){
                return false;
            }
            else if(n1 < 0 && n2 < 0){
                while(l1 < max_length){
                    s1.append("1");
                    l1 ++;
                }
                while(l2 < max_length){
                    s2.append("1");
                    l2 ++;
                }
            }
            while(l1 < max_length){
                s1.append("0");
                l1 ++;
            }
            while(l2 < max_length){
                s2.append("0");
                l2 ++;
            }
            s1.append(this.getValue());
            s2.append(other.getValue());
            String binary_value1 = s1.toString();
            String binary_value2 = s2.toString();
            return binary_value1.equals(binary_value2);
        }
        return false;
    }
    /**
     * Returns this Scrabble Binary String value.
     */
    @Override
    public String toString() {
        return this.getValue();
    }
}
