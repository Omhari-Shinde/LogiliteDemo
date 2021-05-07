package InheritanceProgram;

class Faculty1
{  
float total_sal=0, salary=30000;  
}  

class HRA extends Faculty1
{  
float hra=3000;  
}  

class DA extends HRA
{  
float da=2000;  
}  

class Science1 extends DA
{ 
float bonous=2000;

}

public class MultilevalInheritance extends Science1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevalInheritance obj=new MultilevalInheritance();
		obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonous;
		System.out.println("Total Salary is:"+obj.total_sal); 
	}

}
