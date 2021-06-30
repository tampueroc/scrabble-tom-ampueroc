package cl.uchile.dcc.scrabble.types;

import cl.uchile.dcc.scrabble.operands.logical;
import cl.uchile.dcc.scrabble.types.numbers.SBinary;

public class SBoolean implements ITypes, logical{
    private final boolean value;

    public SBoolean(boolean value) {
        this.value = value;
    }

    public SBoolean asBool() {
        return new SBoolean(this.value);
    }

    public SBinary asBinary() {
        return new SBinary(value ? "1" : "0");
    }

    @Override
    public SString asString() {
        return new SString(Boolean.toString(value));
    }

    @Override
    public SString addToString(SString addend) {
        return null;
    }

    @Override
    public logical and(logical conjunct) {
        return conjunct.andBool(this);
    }

    @Override
    public logical andBool(SBoolean bool) {
        return null;
    }

    @Override
    public logical or(logical operand) {
        return null;
    }

    @Override
    public logical orBool(logical operand) {
        return null;
    }

    @Override
    public logical andBinary(SBinary sBinary) {
        return null;
    }
}
