package cl.uchile.dcc.scrabble.types.typesFactories;

import cl.uchile.dcc.scrabble.types.numbers.SBinary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static cl.uchile.dcc.scrabble.types.typesFactories.SBinaryFactory.getMapSBinary;
import static org.junit.jupiter.api.Assertions.*;

class SBinaryFactoryTest {

    private String bin_0 = "0";
    private String bin_1 = "1";
    private String bin_A = "1101010";
    private String bin_B = "0101101";
    private String bin_484 = "0111100100";

    @BeforeEach
    void setUp() {
    }

    @Test
    void createSBinary() {

        Map<String, SBinary> mapFSBinary_1 = getMapSBinary();
        assert mapFSBinary_1.size()==0;

        SBinary SBin_1 = SBinaryFactory.createSBinary(bin_0);
        assert mapFSBinary_1.size()==1;

        SBinary SBin_2 = SBinaryFactory.createSBinary(bin_1);
        assert mapFSBinary_1.size()==2;

        SBinary SBin_3 = SBinaryFactory.createSBinary(bin_484);
        assert mapFSBinary_1.size()==3;

        SBinaryFactory.createSBinary(bin_484);
        SBinaryFactory.createSBinary(bin_484);

        Map<String, SBinary> mapFSBinary_2 = getMapSBinary();

        assertEquals(mapFSBinary_1, mapFSBinary_2);

        SBinary SBin_2_2 = SBinaryFactory.createSBinary(bin_1);
        assert mapFSBinary_1.size()==3;

        assertEquals(SBin_2, SBin_2_2);
        assertEquals(SBin_2.hashCode(), SBin_2_2.hashCode());
    }
}