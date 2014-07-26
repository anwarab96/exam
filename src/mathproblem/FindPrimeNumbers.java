package mathproblem;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		// set up outer for loop
		int count = 0 ;
		for(int i = 2; i < 1000; i++){
			// set up inner for loop
			for(int j = 1; j<=i; j++){
				// prime numbers are only divisible by  1 and itself;
				if (i % j == 0){
					count++;
					
					
				}//first if end 
				
			}//inner for loop end 
			if (count<=2){
				// print prime numbers from 2 to 1000
				System.out.println("The prime numbers are " + i);
				
			}//second if end
			
			count = 0;
			
				
			
			
			
			
			
		}//outer loop end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main method end
	
	}
		
