package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;

import java.util.Objects;

public class SBoolean extends abstractTypes implements ITypes{
    private final boolean value;

    /**
     * Creates a Scrabble Boolean object
     */
    public SBoolean(boolean value) {
        this.value = value;
    }

    /**
     * Returns this Scrabble Boolean value
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Returns an identical Scrabble Boolean representation of this object
     **/
    @Override
    public SBoolean asBoolean() {
        return new SBoolean(this.isValue());
    }
    /**
     Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SBoolean.class);
    }
    /**
     * Returns a string representation of this object's value
     */
    @Override
    public String toString() {
        return String.valueOf(this.isValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     */
    @Override
    public ITypes andBool(SBoolean bool) {
        return new SBoolean(bool.isValue() && this.isValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     */
    @Override
    public ITypes orBool(SBoolean operand) {
        return new SBoolean(operand.isValue() || this.isValue());
    }

    /** TODO
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Binary object
     */
    @Override
    public ITypes orBinary(SBinary operand) {
        int l = operand.getValue().length();
        String str = operand.getValue();
        StringBuilder result = new StringBuilder();
        if(!this.isValue()){
            return new SBinary(str);
        }
        else{
            result.append("1".repeat(l));
            String strResult = result.toString();
            return new SBinary(strResult);
        }
    }

    /** TODO
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given one
     */
    @Override
    public ITypes and(ITypes conjunct) {
        return conjunct.andBool(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given one
     */
    @Override
    public ITypes or(ITypes operand) {
        return operand.orBool(this);
    }

    /** TODO
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Binary object
     */
    @Override
    public ITypes andBinary(SBinary sBinary) {
        int l = sBinary.getValue().length();
        String str = sBinary.getValue();
        StringBuilder result = new StringBuilder();
        if(this.isValue()){
            return new SBinary(str);
        }
        else{
            result.append("0".repeat(l));
            String strResult = result.toString();
            return new SBinary(strResult);
        }
    }

    /**
     Receives an object and determines if its equal to this object by returning a
     boolean value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SBoolean) {
            var other = (SBoolean) obj;
            return other.isValue() == this.isValue();
        }
        return false;
    }

    /**
     * Return a Scrabble Booleans object representing the negation of this Booleans value.
     */
    public SBoolean negate(){
        boolean result_value = !this.isValue();
        return new SBoolean(result_value);
    }
}
