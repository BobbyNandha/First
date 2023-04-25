package loopsAssignments;

public class Factorial {
	
	 static void Factorials(int number) {
		//factorial=factorial*i
		long fact=1;
		for(int i=1;i<=number;++i) {
			fact=fact*i;
			
			
		}
		
		
		System.out.println("the factorial of number "+number+" is "+fact);
		
	}

}
