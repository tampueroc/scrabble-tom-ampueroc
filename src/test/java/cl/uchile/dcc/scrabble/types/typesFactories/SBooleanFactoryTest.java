package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.types.typesFactories.SBooleanFactory.getMapSBoolean;
import static org.junit.jupiter.api.Assertions.*;

class SBooleanFactoryTest {
    private boolean T = true;
    private boolean F = false;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSBoolean() {
        Map<Boolean, SBoolean> mapFSBoolean_1 = getMapSBoolean();
        assert mapFSBoolean_1.size() == 0;

        SBoolean SBool_1 = SBooleanFactory.createSBoolean(T);
        assert mapFSBoolean_1.size()==1;

        SBoolean SBool_2 = SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean_1.size()==2;

        Map<Boolean, SBoolean> mapFSBoolean_2 = getMapSBoolean();

        assertEquals(mapFSBoolean_1, mapFSBoolean_2);

        SBoolean SBool_2_2 = SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean_1.size()==2;

        assertEquals(SBool_2, SBool_2_2);
        assertEquals(SBool_2.hashCode(), SBool_2_2.hashCode());
    }
}