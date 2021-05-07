package JavaBasicProgram;

import java.util.Scanner;

public class ClassObjectExample {
		
		int rollno;
		String name;
		long contactno;
		int marks;
		void getData()
		{ 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll no:");
			rollno=sc.nextInt();
			System.out.println("Enter name:");
			name=sc.next();
			System.out.println("Enter contact no:");
			contactno=sc.nextLong();
			System.out.println("Enter marks:");
			marks=sc.nextInt();
			
		}
		void display()
		{ 
			System.out.println(rollno);
			System.out.println(name);
			System.out.println(contactno);
			System.out.println(marks);
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObjectExample obj=new ClassObjectExample();
		obj.getData();
		obj.display();

	}

}
