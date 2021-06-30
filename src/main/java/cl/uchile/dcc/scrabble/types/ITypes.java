package cl.uchile.dcc.scrabble.types;

public interface ITypes {
    /*
    Returns a Scrabble representation of this object
     */
    SString asString();

    SString addToString(SString addend);
}
