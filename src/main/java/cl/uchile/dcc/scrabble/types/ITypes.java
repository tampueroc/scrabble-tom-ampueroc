package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;

public interface ITypes {
    // TODO Documentacion

    // Transformations
    /**
     * Returns a Scrabble String representation of this object
     **/
    SString asString();
    /**
     * Returns a Scrabble Binary representation of this object
     *
     * @return*/
    SBinary asBinary();
    /**
     * Returns a Scrabble Float representation of this object
     * @return
     */
    SFloat asFloat();
    /**
     * Returns a Scrabble Integer representation of this object
     *
     * @return*/
    SInteger asInteger();
    /**
     * Returns a Scrabble Boolean representation of this object
     **/
    SBoolean asBoolean();

    // BinaryOperands
    /**
     * Returns the ITypes result of the sum of this object Scrabble Type
     * representation and the given Scrabble Binary object.
    **/
    ITypes addToBinary(SBinary addend);
    /**
     * Returns the ITypes result of the subtraction of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     */
    ITypes subtractToBinary(SBinary subtrahend);
    /**
    * Returns the ITypes result of the multiplication of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     */
    ITypes multiplyToBinary(SBinary product);
    /**
     * Returns the ITypes result of the division of this object Scrabble Type
     * representation and the given Scrabble Binary object.
     */
    ITypes divideToBinary(SBinary dividend);

    // LogicalOperands
    /**
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given one
     **/
    ITypes and(ITypes conjunct);
    /**
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     **/
    ITypes andBool(SBoolean bool);
    /**
     * Returns the Scrabble Type result of the 'AND' operation between this Scrabble Type and a given
     * Scrabble Binary object
     **/
    ITypes andBinary(SBinary sBinary);
    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given one
     **/
    ITypes or(ITypes operand);
    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Boolean object
     *
     * @param operand*/
    ITypes orBool(SBoolean operand);
    /**
     * Returns the Scrabble Type result of the 'OR' operation between this Scrabble Type and a given
     * Scrabble Binary object
     **/
    ITypes orBinary(SBinary operand);



    //Numbers Operands
    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Float
     **/
    ITypes addToFloat(SFloat addend);
    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Float
     **/
    ITypes subtractToFloat(SFloat subtrahend);
    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Integer
     **/
    ITypes subtractToInt(SInteger subtrahend);
    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Float
     **/
    ITypes multiplyToFloat(SFloat product);
    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Float
     **/
    ITypes divideToFloat(SFloat divisor);
    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Integer
     */
    ITypes addToInteger(SInteger addend);
    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Integer
     */
    ITypes multiplyToInt(SInteger product);
    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Integer
     **/
    ITypes divideToInt(SInteger dividend);

    // Operands
    /**
     * Returns the Scrabble Type result of the sum of this Scrabble Type and a given
     * Scrabble Type
     **/
    ITypes add(ITypes addend);
    /**
     * Returns the Scrabble Type result of the subtraction of this Scrabble Type and a given
     * Scrabble Type
     **/
    ITypes subtract(ITypes subtrahend);
    /**
     * Returns the Scrabble Type result of the multiplication of this Scrabble Type and a given
     * Scrabble Type
     **/
    ITypes multiply(ITypes product);
    /**
     * Returns the Scrabble Type result of the division of this Scrabble Type and a given
     * Scrabble Type
     **/
    ITypes divide(ITypes dividend);

    // String Operands
    /**
     * Returns the Scrabble String result of the concatanation of this Scrabble String and a given
     * Scrabble String
     **/
    SString addToString(SString addend);

}
