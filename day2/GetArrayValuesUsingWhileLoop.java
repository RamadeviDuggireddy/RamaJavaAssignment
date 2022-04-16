package Mar22.week1.day2;

import java.lang.reflect.Array;

public class GetArrayValuesUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
		int array[]=new int[5];
array[0]=20;
array[1]=30;
array[2]=40;
array[3]=50;
array[4]=60;
while(i<array.length)
{
	
System.out.println("array values:"+array[i]);
i++;
}


	}

}
