package JavaBasicProgram;

public class FinalKewordDemo {
	
	final int speedlimit=90;//final variable  
	  int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Welcome");
		FinalKewordDemo fd=new FinalKewordDemo();
		fd.a=20;
		//We can not change the final variable value
		//fd.speedlimit=110;
		System.out.println(fd.speedlimit);
		System.out.println(fd.a);
		
		  

	}

}
