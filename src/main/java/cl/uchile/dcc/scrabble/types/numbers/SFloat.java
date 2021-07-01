package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;

public class SFloat extends abstractTypes implements ITypes{
    private final double value;

    /**
     * Creates a Scrabble Float object
     * @param value
     */
    public SFloat(double value) {
        this.value = value;
    }
    /**
     * Returns this Scrabble Float object's value
     */
    public double getValue() {
        return value;
    }
}
