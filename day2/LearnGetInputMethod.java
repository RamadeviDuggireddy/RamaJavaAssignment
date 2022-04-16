package Mar22.week1.day2;

public class LearnGetInputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnGetInputMethod  var= new LearnGetInputMethod ();
		var.getEmpName("rama");
		
		var.getEmpId(5);
		
	}
public String getEmpName(String empname)
{
	System.out.println("my name and id  is:"+empname );
	return empname;
}
public int getEmpId(int empid)
{
	System.out.println("my name and id  is:"+empid );
	return empid;
	
}
}
