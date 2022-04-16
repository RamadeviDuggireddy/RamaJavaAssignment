package Mar22.week1.day1;

public class FibinacciSeries {
	public static int num1=0; 
	public static int num2=1;

	public static int n=10;
	public static void main(String[] args) {
	

		
		for(int i=1;i<n;++i)
		{
			System.out.println(num1+" ");
			int sumofpreviousnums=num1+num2;
			
			num1=num2;		
			num2=sumofpreviousnums;
		
		
	
	}
}
}