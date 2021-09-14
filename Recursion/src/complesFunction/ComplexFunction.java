package complesFunction;

public class ComplexFunction {
	
	int calculateFactorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return (n*calculateFactorial(n-1));
		}
		
	}
	
//	//calculateFactorial(5)
//	calculateFactorial(4)
//	calculateFactorial(3)
//	calculateFactorial(2)
//	calculateFactorial(1)
//	return 1
//		return 2*1=2
//				return 3*2=6
//						return  4*6=24
	//                        return 5*24=120
//		

}
