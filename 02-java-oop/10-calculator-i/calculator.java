import sun.jvmstat.perfdata.monitor.CountedTimerTask;
import sun.tools.jstat.SymbolResolutionClosure;

public class calculator {
    public double operandOne;
    public double operandtwo;

public calculator(double operandOne, double operandtwo) {
    this.operandOne = operandOne;
    this.operandtwo = operandtwo;
}

public double add() {
    return operandOne + operandtwo;
}

public double subtract() {
    return operandOne - operandtwo;
}
}