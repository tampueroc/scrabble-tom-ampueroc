package cl.uchile.dcc.scrabble.types;

import java.util.Objects;

public class SString extends abstractTypes{
    private final String value;

    /**
     * Creates a Scrabble String object
     * @param value
     */
    public SString(String value) {
        this.value = value;
    }

    /** TODO
     * Returns this Scrabble String value
     **/
    @Override
    public String toString(){
        return this.getValue();
    }


    /**
    Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SString.class);
    }

    /**
    Receives an object and determines if its equal to this object by returning a
    boolean value.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SString) {
            var other = (SString) obj;
            return other.toString().equals(this.toString());
        }
        return false;
    }

    /*
    Returns the Scrabble representation of the object
     */
    @Override
    public SString asString() {
        return new SString(value);
    }

    /** TODO
     * Receives an ITypes object and summons it's addToString method. It
     * uses this SString object as an input. It returns the concatenation of
     * it's value and it's toString() representation
     **/
    public SString add(ITypes addend) {
        return addend.addToString(this);
    }

    /**
     * TODO
     * @return
     */
    public String getValue() {
        return value;
    }
}
