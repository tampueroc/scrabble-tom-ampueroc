package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SBoolean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SBooleanFactoryTest {
    private boolean T = true;
    private boolean F = false;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSBoolean() {
        SBooleanFactory FSBoolean = new SBooleanFactory();
        Map<Boolean, SBoolean> mapFSBoolean = FSBoolean.getMapSBoolean();
        assert mapFSBoolean.size() == 0;

        SBoolean SBool_1 = SBooleanFactory.createSBoolean(T);
        assert mapFSBoolean.size()==1;

        SBoolean SBool_2 = SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean.size()==2;

        SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean.size()==2;
        SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean.size()==2;

        SBoolean SBool_2_2 = SBooleanFactory.createSBoolean(F);
        assert mapFSBoolean.size()==2;

        assertEquals(SBool_2, SBool_2_2);
        assertEquals(SBool_2.hashCode(), SBool_2_2.hashCode());
    }
}