package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.types.typesFactories.SFloatFactory.getMapSFloat;
import static org.junit.jupiter.api.Assertions.*;

class SFloatFactoryTest {
    private Random rng;
    private int seed;

    @BeforeEach
    void setUp() {
        seed = new Random().nextInt();
        rng = new Random(seed);
    }

    @Test
    void createSFloat() {
        int random_1 = rng.nextInt();
        int random_2 = rng.nextInt();
        int random_3 = rng.nextInt();

        double random_between_0_1 = new Random().nextDouble();
        double random_dbl_1 = random_1 * random_between_0_1;
        double random_dbl_2 = random_2 * random_between_0_1;
        double random_dbl_3 = random_3 * random_between_0_1;

        Map<Double, SFloat> mapSFloat_1 = getMapSFloat();
        assert mapSFloat_1.size() == 0;

        SFloat SFlt_1 = SFloatFactory.createSFloat(random_dbl_1);
        assert mapSFloat_1.size() == 1;

        SFloat SFlt_2 = SFloatFactory.createSFloat(random_dbl_2);
        assert mapSFloat_1.size() == 2;

        SFloatFactory.createSFloat(random_dbl_3);
        assert mapSFloat_1.size() == 3;
        SFloatFactory.createSFloat(random_dbl_3);
        assert mapSFloat_1.size() == 3;

        Map<Double, SFloat> mapSFloat_2 = getMapSFloat();

        assertEquals(mapSFloat_1, mapSFloat_2);

        SFloat SFlt_2_2 = SFloatFactory.createSFloat(random_dbl_2);
        assert mapSFloat_1.size() == 3;

        assertEquals(SFlt_2, SFlt_2_2);
        assertEquals(SFlt_2.hashCode(), SFlt_2_2.hashCode());

    }
}