package class_3;

public class callingWithInFunction {
	
	
	static boolean isEven(int n){
		
		if(n%2==0)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	static boolean isPositive(int n){
		
		if(n>0)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	static void calc(int n)
	{
		boolean iseven=isEven(n);
		boolean isPos=isPositive(n);
		
		if(iseven==true && isPos==true)
		{
			System.out.println("EVEN AND POSITIVE");
	
			
		}
		else if(iseven==true && isPos==false)

		{			System.out.println("EVEN AND NEGATIVE");

			
		}
		else if(iseven==false && isPos==true)
			
		{			System.out.println("ODD AND POSITIVE");
		
		
		}
		
		else if(iseven==false && isPos==false)
			
		{			System.out.println("ODD AND NEGATIVE");
		
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
