package cl.uchile.dcc.scrabble.types;

public interface ITypes {
    // TODO Documentacion

    // Transformaciones
    /*
    Returns a String Scrabble representation of this object
     */
    SString asString();

    /*


    /*
    Returns a Integer Scrabble representation of this object
    */
    //SInt asInt();

    /*
    Returns a Binary Scrabble representation of this object
    */
    //SBinary asBinary();

    /*
    Returns a Float Scrabble representation of this object
    */
    //SFloat asFloat();

    /*
    Returns a Boolean Scrabble representation of this object
    */
    //SBoolean asBoolean();



    /*
    */
    SString addToString(SString addend);
    /*
    // BinaryOperands
    SBinary addToBinary(SBinary addend);

    SBinary subtractToBinary(SBinary subtractor);

    SBinary multiplyToBinary(SBinary product);

    SBinary divideToBinary(SBinary dividend);


    // LogicalOperands
    ITypes and(ITypes conjunct);

    ITypes andBool(SBoolean bool);

    ITypes or(ITypes operand);

    ITypes orBool(ITypes operand);

    ITypes andBinary(SBinary sBinary);

    //Numbers Operands
    SFloat addToFloat(SFloat addend);

    SFloat subtractToFloat(SFloat subtrahend);

    ITypes subtractToInt(SInt subtrahend);

    SFloat multiplyToFloat(ITypes product);

    SFloat divideToFloat(ITypes divisor);

    ITypes addToInt(SInt addend);

    ITypes multiplyToInt(SInt product);

    ITypes divideToInt(SInt dividend);


     */
}
