package Mar22.week1.day2;

public class ArmstrongNumber{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num1=370;
		 int num2;
		int temp;
		int total=0;	
		num2=num1;
		while(num2!=0)
		{
		temp=num2%10;
		total=total+temp*temp*temp;
		num2=num2/10;
				
		}
	if(total==num1)
	{
		
	
	System.out.println("given num1 is armstrong");
	}
	else
	{
		System.out.println("given num1  not is armstrong");
	}
	}
	
	}
	


