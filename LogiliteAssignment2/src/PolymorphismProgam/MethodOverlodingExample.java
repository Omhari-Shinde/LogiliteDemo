package PolymorphismProgam;

public class MethodOverlodingExample {
	
	public void Shape(int a) 
    {
     int result=a*a;
     System.out.println("area of squre="+result);
    }
    public void shape(int l,int b)
    {
    	double result=l*b;
    	System.out.println("area of rectangle="+result);
    }
    public void shape(double a,int b,int c)
    {
    	double result=a*b*c;
    	System.out.println("area of trangle="+result);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlodingExample m=new MethodOverlodingExample();
		m.Shape(5);
		m.shape(5, 3);
		m.shape(0.5, 3, 2);

	}

}
