package cl.uchile.dcc.scrabble.types;

public abstract class abstractTypes implements  ITypes{
    /**
     * Returns the Scrabble String represenation of this object
     **/
    @Override
    public SString asString() {
        return new SString(this.toString());
    }

    /** TODO
     * Returns a Scrabble Boolean representation of this object
     **/
    @Override
    public SBoolean asBoolean() {
        return null;
    }
}
