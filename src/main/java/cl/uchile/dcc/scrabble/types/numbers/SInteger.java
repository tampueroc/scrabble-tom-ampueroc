package cl.uchile.dcc.scrabble.types.numbers;

import cl.uchile.dcc.scrabble.types.abstractTypes;
import cl.uchile.dcc.scrabble.types.ITypes;

import static java.lang.Math.abs;

public class SInteger extends abstractTypes implements ITypes{
    private int value;

    /**
     * Creates a Scrabble Integer object
     * @param value
     */
    public SInteger(int value) {
        this.value = value;
    }

    /**
     * Returns this Scrabble Integer object's value
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a Scrabble Binary representation of this Scrabble Integer object
     */
    @Override
    public SBinary asBinary() {
        int int_value = this.getValue();
        int abs_int = abs(int_value);
        String b = positive_intToBinary(abs_int);
        if(int_value < 0){
            b = twosComplement(b);
        }
        return new SBinary(b);
    }

    private static String positive_intToBinary(int n){

        StringBuilder binaryNumString = new StringBuilder();
        binaryNumString.append("0");
        int[] binaryNumArray = new int[32];
        int i = 0;
        while(n > 0){
            binaryNumArray[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--){
            binaryNumString.append(binaryNumArray[j]);
        }
        return binaryNumString.toString();
    }

    private static String twosComplement(String string){
        StringBuilder str = new StringBuilder();
        str.append(string);
        int n = str.length();
        int i;
        for (i = n - 1; i >= 0; i--){
            if (str.charAt(i) == '1'){
                break;
            }
        }
        if (i == -1){
            return "1" + str;
        }
        for (int k = i - 1; k >= 0; k--){
            if (str.charAt(k) == '1'){
                str.replace(k, k + 1, "0");
            }
            else{
                str.replace(k, k + 1, "1");
            }
        }

        return str.toString();
    }
}
