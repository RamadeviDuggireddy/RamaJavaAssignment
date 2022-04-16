package Mar22.week1.day2;

public class InstanceVariabale {
	String intvar="my istance variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariabale var1=new  InstanceVariabale();
		InstanceVariabale var2=new  InstanceVariabale();
		InstanceVariabale var3=new  InstanceVariabale();
		 InstanceVariabale var4=new  InstanceVariabale();
		 System.out.println(var1.intvar);
		 System.out.println(var2.intvar);
		 System.out.println(var3.intvar);
		 System.out.println(var4.intvar);
		 var1.intvar="now changed my text";
		 System.out.println(var1.intvar);
		 System.out.println(var2.intvar);
		 System.out.println(var3.intvar);
		 System.out.println(var4.intvar); 
		 
		 
	}

}
