package fr.epita.exercises.demo;

public class Factorial {
	
	
	//factorial(n) = 1 x 2 x ... x n
	// = 2 x ... x n
	
	public long calculateWithFor(int parameter){
		
		int result = 1;
		for (int i = 2; i <= parameter; i++ ) {
			result = result * i;
			//same as result *=i;
		}
		return result;
		
	}
	
	
	public long calculateWithWhile(int parameter){
		
		int i = parameter;
		int result = 1;
		while (i > 1) {
			result =  result * i;
			i--;
		}
		
		return result;
		
	}
	
	
	public long calculateWithDoWhile(int parameter){
		
		int i = parameter;
		int result = 1;
		do {
			result =  result * i;
			i--;
		} while (i > 1);
		
		return result;
	}
	
	
	
	public long calculateRecursive(int parameter){
		//		numeric series 
		// arithmetical series: Un+1 = Un + Q
		// geometrical series : Un+1 = Q.Un
		
		if (parameter == 2) {
			return 2;
		}else {
			return parameter  * calculateRecursive(parameter - 1);
		}
		
		
	}

}
