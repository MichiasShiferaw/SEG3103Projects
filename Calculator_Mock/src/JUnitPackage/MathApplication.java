package JUnitPackage;

public class MathApplication {
	   private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   public int addAndIncrement(int a, int b){
		   int result =  calcService.add(a, b);
	       result++;
	       return result;      
	     
	   }

	}