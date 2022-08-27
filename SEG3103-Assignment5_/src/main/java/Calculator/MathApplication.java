package Calculator;

public class MathApplication {

    private CalculatorService calcService;

    public void setCalculatorService(CalculatorService calcService){
        this.calcService = calcService;
    }

    public double subtract(int input1, int input2){
        calcService.serviceUsed();
        calcService.serviceUsed();
        calcService.serviceUsed();
        calcService.serviceUsed();
        return calcService.subtract(input1, input2);
    }
}








