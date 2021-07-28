package cl.uchile.dcc.scrabble.AST.operands.comparators;

public abstract class abstractComparator implements ICompare{
    public String leftVarName;
    public String rightVarName;

    public abstractComparator(String leftVarName, String rightVarName) {
        this.leftVarName = leftVarName;
        this.rightVarName = rightVarName;
    }
}
