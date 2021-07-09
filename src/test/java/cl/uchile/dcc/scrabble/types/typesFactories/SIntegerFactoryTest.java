package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import cl.uchile.dcc.scrabble.types.numbers.SInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.types.typesFactories.SFloatFactory.getMapSFloat;
import static cl.uchile.dcc.scrabble.types.typesFactories.SIntegerFactory.getMapSInteger;
import static org.junit.jupiter.api.Assertions.*;

class SIntegerFactoryTest {
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
    }

    @Test
    void createSInteger() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        int random_3 = rng.nextInt();

        Map<Integer, SInteger> mapFSInt_1 = getMapSInteger();
        assert mapFSInt_1.size() == 0;

        SInteger SInt_1 = SIntegerFactory.createSInteger(random_1);
        assert mapFSInt_1.size() == 1;

        SInteger SInt_2 = SIntegerFactory.createSInteger(random_2);
        assert mapFSInt_1.size() == 2;

        SInteger SInt_3 = SIntegerFactory.createSInteger(random_3);
        assert mapFSInt_1.size() == 3;

        SIntegerFactory.createSInteger(random_3);
        SIntegerFactory.createSInteger(random_3);

        Map<Integer, SInteger> mapFSInt_2 = getMapSInteger();

        assertEquals(mapFSInt_1, mapFSInt_2);

        SInteger SInt_2_2 = SIntegerFactory.createSInteger(random_2);
        assert mapFSInt_1.size() == 3;

        assertEquals(SInt_2, SInt_2_2);
        assertEquals(SInt_2.hashCode(), SInt_2_2.hashCode());

    }

}