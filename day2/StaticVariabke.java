package Mar22.week1.day2;

public class StaticVariabke {
	public static String stavar="My cute lucky";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariabke  obj1=new StaticVariabke();
		StaticVariabke  obj2=new StaticVariabke();
		StaticVariabke  obj3=new StaticVariabke();
		
		
System.out.println(obj1.stavar);
System.out.println(obj2.stavar);
System.out.println(obj3.stavar);

obj1.stavar="changed text";
System.out.println(obj1.stavar);
System.out.println(obj2.stavar);
System.out.println(obj3.stavar);
	}

}
