package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;

public abstract class abstractTypes implements  ITypes{
    /**
     * Returns the Scrabble String representation of this object
     **/
    @Override
    public SString asString() {
        return new SString(this.toString());
    }

    /**
     * Returns a Scrabble Binary representation of this object
     *
     * @return
     */
    @Override
    public SBinary asBinary() {
        return null;
    }

    /**
     * Returns a Scrabble Float representation of this object
     *
     * @return
     */
    @Override
    public SFloat asFloat() {
        return null;
    }

    /**
     * Returns a Scrabble Integer representation of this object
     *
     * @return
     */
    @Override
    public SInteger asInteger() {
        return null;
    }

    /** TODO
     * Returns a Scrabble Boolean representation of this object
     **/
    @Override
    public SBoolean asBoolean() {
        return null;
    }

    /**
     * Returns the ITypes result of the sum of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     *
     * @param addend
     */
    @Override
    public ITypes addToBinary(SBinary addend) {
        return null;
    }

    /**
     * Returns the ITypes result of the subtraction of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     *
     * @param subtrahend
     */
    @Override
    public ITypes subtractToBinary(SBinary subtrahend) {
        return null;
    }

    /**
     * Returns the ITypes result of the multiplication of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     *
     * @param product
     */
    @Override
    public ITypes multiplyToBinary(SBinary product) {
        return null;
    }

    /**
     * Returns the ITypes result of the division of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     *
     * @param dividend
     */
    @Override
    public ITypes divideToBinary(SBinary dividend) {
        return null;
    }

    /** TODO
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given one
     */
    @Override
    public ITypes and(ITypes conjunct) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     *
     * @param bool
     */
    @Override
    public ITypes andBool(SBoolean bool) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Binary object
     *
     * @param sBinary
     */
    @Override
    public ITypes andBinary(SBinary sBinary) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given one
     *
     * @param operand
     */
    @Override
    public ITypes or(ITypes operand) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     *
     * @param operand
     */
    @Override
    public ITypes orBool(SBoolean operand) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Binary object
     *
     * @param operand
     */
    @Override
    public ITypes orBinary(SBinary operand) {
        return null;
    }

    /**
     * Returns the negation of this Scrabble Type (if it exists)
     */
    @Override
    public ITypes negate() {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Float
     *
     * @param addend
     */
    @Override
    public ITypes addToFloat(SFloat addend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Float
     *
     * @param subtrahend
     */
    @Override
    public ITypes subtractToFloat(SFloat subtrahend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Integer
     *
     * @param subtrahend
     */
    @Override
    public ITypes subtractToInt(SInteger subtrahend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Float
     *
     * @param product
     */
    @Override
    public ITypes multiplyToFloat(SFloat product) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Float
     *
     * @param divisor
     */
    @Override
    public ITypes divideToFloat(SFloat divisor) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Integer
     *
     * @param addend
     */
    @Override
    public ITypes addToInteger(SInteger addend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Integer
     *
     * @param product
     */
    @Override
    public ITypes multiplyToInteger(SInteger product) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Integer
     *
     * @param dividend
     */
    @Override
    public ITypes divideToInteger(SInteger dividend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Type
     *
     * @param addend
     */
    @Override
    public ITypes add(ITypes addend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Type
     *
     * @param subtrahend
     */
    @Override
    public ITypes subtract(ITypes subtrahend) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Type
     *
     * @param product
     */
    @Override
    public ITypes multiply(ITypes product) {
        return null;
    }

    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Type
     *
     * @param dividend
     */
    @Override
    public ITypes divide(ITypes dividend) {
        return null;
    }

    /** TODO
     * Returns the Scrabble String result of the concatenation of this Scrabble String and a given
     * Scrabble String
     */
    @Override
    public SString addToString(SString addend) {
        return new SString(addend.toString() + this.toString());
    }

    /**
     * Operates the node
     */
    @Override
    public ITypes operate() {
        return this;
    }
}
