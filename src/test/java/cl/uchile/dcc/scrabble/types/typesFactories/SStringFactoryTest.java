package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.SString;
import cl.uchile.dcc.scrabble.types.numbers.SFloat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static cl.uchile.dcc.scrabble.types.typesFactories.SFloatFactory.getMapSFloat;
import static cl.uchile.dcc.scrabble.types.typesFactories.SStringFactory.getMapSString;
import static org.junit.jupiter.api.Assertions.*;

class SStringFactoryTest {
    private String str_0 = "hello";
    private String str_1 = "chao";
    private String str_2 = "goodbye";
    private String str_3 = "hola";

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSString() {

        SStringFactory FSString = new SStringFactory();
        Map<String, SString> mapFSString_1 = getMapSString();
        assert mapFSString_1.size()==0;

        SString SString_1 = SStringFactory.createSString(str_0);
        assert mapFSString_1.size()==1;

        SString SString_2 = SStringFactory.createSString(str_1);
        assert mapFSString_1.size()==2;

        SStringFactory.createSString(str_2);
        assert mapFSString_1.size()==3;
        SStringFactory.createSString(str_2);
        assert mapFSString_1.size()==3;

        Map<String, SString> mapFSString_2 = getMapSString();

        assertEquals(mapFSString_1, mapFSString_2);

        SString SString_2_2 = SStringFactory.createSString(str_1);
        assert mapFSString_1.size()==3;

        assertEquals(SString_2, SString_2_2);
        assertEquals(SString_2.hashCode(), SString_2_2.hashCode());


    }
}