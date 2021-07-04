package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;

import java.util.Objects;

public class SFloat extends abstractTypes implements ITypes{
    private final double value;

    /**
     * Creates a Scrabble Float object
     */
    public SFloat(double value) {
        this.value = value;
    }
    /**
     * Returns this Scrabble Float object's value
     */
    public double getValue() {
        return value;
    }

    /**
     Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SFloat.class);
    }
    /**
     Receives an object and determines if its equal to this object by returning a
     boolean value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SFloat) {
            var other = (SFloat) obj;
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
    /**
     * Returns an identical Scrabble Float representation of this object
     */
    @Override
    public SFloat asFloat() {
        return new SFloat(this.getValue());
    }

    /**
     * Returns the Scrabble Float result of the sum of this Scrabble Float and a given
     * Scrabble Float
     */
    @Override
    public ITypes addToFloat(SFloat addend) {
        return new SFloat(this.getValue() + addend.getValue());
    }

    /** TODO
     * Returns the Scrabble Float result of the sum of this Scrabble Float and a given
     * Scrabble Integer
     */
    @Override
    public ITypes addToInteger(SInteger addend) {
        return new SFloat(this.getValue() + addend.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes add(ITypes addend) {
        return addend.addToFloat(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes subtract(ITypes subtrahend) {
        return subtrahend.subtractToFloat(this);
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
        return new SFloat(subtrahend.getValue() - this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes multiplyToFloat(SFloat product) {
        return new SFloat(product.getValue()* this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Float
     */
    @Override
    public ITypes divideToFloat(SFloat divisor) {
        return new SFloat(divisor.getValue()/this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes divideToInteger(SInteger divisor) {
        return new SFloat(divisor.getValue()/this.getValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes multiply(ITypes product) {
        return product.multiplyToFloat(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Type
     */
    @Override
    public ITypes divide(ITypes dividend) {
        return dividend.divideToFloat(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Integer
     */
    @Override
    public ITypes multiplyToInteger(SInteger product) {
        return new SFloat(product.getValue() * this.getValue());
    }
}
