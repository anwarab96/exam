package mathproblem;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int [100];
		
		
		
		for (int i = 0; i<num.length; i++)
		{
		
			num [i] = i+1;
			System.out.print( num[ i ]  + " ");
			//System.out.println( " ");
		
		}
		System.out.println( );
		System.out.println( " ");
		
		for (int j = 0; j < num.length; j=j+2)
		{
			
			
			System.out.print(num[j ] + " ");
		}
		
		System.out.println( );
		System.out.println("                                              ");
		
		int total = 0;
		for(int n =0; n<num.length; n++)
			total = total + num[n];
		System.out.println(total);
				
				
			
		
	}
	
}
			
		
	
		 
		 
			 
			 
			
		
	
	
	





