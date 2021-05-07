package JavaBasicProgram;

public class StaticKeywordProgram {
	int rollno;
	String name;
	static String college="RSML";
	

	public StaticKeywordProgram(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeywordProgram sk=new StaticKeywordProgram(01, "omhari");
		StaticKeywordProgram sk1=new StaticKeywordProgram(02, "hariom");
		sk.display();
		sk1.display();
		
	}

}
