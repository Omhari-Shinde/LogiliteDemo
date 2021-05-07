package EncapsulationProgram;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRollNumber(01);
		s.setName("abc");
		s.setMarks(81);
		
		System.out.println("Roll is="+s.getRollNumber());
		System.out.println("Name is="+s.getName());
		System.out.println("Marks is="+s.getMarks());
		

	}

}
