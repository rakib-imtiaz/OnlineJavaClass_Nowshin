package class_4;

public class question_2 {
	
//	1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 +……+ 1/n

	
	

	public static void main(String[] args) {
//		Write down a program that will count how many numbers are there between n1 and n2 that are
//		divisible by 3 but not divisible by 5. Both n1 and n2 will e input to your program. Assume that
//		n1<n2.
		int n1=99;
		int n2=116;
//		
//		int counter=0;
//		
//		for(int i=n1;i<=n2;i++)
//		{
//			if(i%3==0 && i%5!=0)
//			{
//				counter++;
//				
//			}
//			
//		}
//		
//		System.out.println("total numbers: "+counter);
		
		
		
////		---------------------------------------------------
//		Write a java program that prints all even numbers between m and n(m,n are user inputs) except
//		the ones which are divisible by 3.	
//		for(int i=n1;i<=n2;i++)
//		{
//			if(i%2==0 && i%3!=0)
//			{
//				System.out.println(i);
//			}
//			
//		}
		
//		1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 +……+ 1/n
		
		int n=10;
		
		double sum=0;
		
		for(int i=1;i<=n;i++)
		{
			
			sum=sum+(1.0/i);
			
			
		}

		
		System.out.println(sum);
		
		
		
		
	}

}
