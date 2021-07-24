package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.ITypes;

public interface INumber extends Comparable<INumber>, ITypes {
    @Override
    int compareTo(INumber o);
}
