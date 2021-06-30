package cl.uchile.dcc.scrabble.types;

public abstract class abstractTypes implements  ITypes{
    @Override
    public SString addToString(SString addend) {
        return new SString(this + addend.toString());
    }
}
