package qa.base.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("user");

		double a= 4;
		double b =3;
		System.out.println("Area of the surface = " + area1(a,b) + "mm");

		double c=2;
		System.out.println("Area of the kubik ="+ area2(c)+ "mm");
	}
	public static void hello(String somebody) {

		System.out.println("Hello " + somebody + "!");
	}

	public static double area1(double a1, double b1){
		return b1*a1;
	}

	public static double area2(double c1){
		return c1*c1;
	}
}