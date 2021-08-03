package cl.uchile.dcc.scrabble.types.numbers;

import org.jetbrains.annotations.NotNull;

public interface INumber extends Comparable<INumber>{

    @Override
    int compareTo(INumber o);
}
