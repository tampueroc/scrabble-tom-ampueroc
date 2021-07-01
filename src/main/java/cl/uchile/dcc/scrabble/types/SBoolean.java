package cl.uchile.dcc.scrabble.types;

public class SBoolean implements ITypes{
    private boolean value;

    /**
     * Creates a Scrabble Boolean object
     * @param value
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
}
