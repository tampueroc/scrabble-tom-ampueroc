package cl.uchile.dcc.scrabble.types;

import java.util.Objects;

public class SString extends abstractTypes{
    private final String value;

    /*
    Creates a SString object
     */
    public SString(String value) {
        this.value = value;
    }

    /*
    TODO
     */
    public SString add(ITypes addend) {
        return addend.addToString(this);
    }

    /*
    Returns this object's hash value
     */
    @Override
    public int hashCode() {
        return Objects.hash(SString.class);
    }

    /*
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
    Returns this object's SString value
     */
    @Override
    public String toString(){
        return value;
    }

    /*
    Returns the Scrabble representation of the object
     */
    @Override
    public SString asString() {
        return new SString(value);
    }
}
