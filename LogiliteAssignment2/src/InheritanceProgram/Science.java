package InheritanceProgram;
//Single Inheritance
class faculty
{
	float salary=30000;
}

public class Science extends faculty {

	float bonous=2000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Science obj=new Science(); 
		System.out.println("Salary is:"+obj.salary);  
		System.out.println("Bonous is:"+obj.bonous); 

	}

}
