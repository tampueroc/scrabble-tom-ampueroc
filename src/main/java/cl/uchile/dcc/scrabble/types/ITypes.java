package cl.uchile.dcc.scrabble.types;

public interface ITypes {
    /*
    Returns a Scrabble representation of this object
     */
    SString asString();
    /* TODO
    Receives an ITypes object and summons it's addToString method. It
    uses this SString object as an input. It returns the concatanation of
    it's value and it's toString() representation
    */
    SString addToString(SString addend);
}
