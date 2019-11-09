package qa.base.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		String somebody = "Argo";
		hello(somebody);

		Rectangle r = new Rectangle(2,3);
		System.out.println("Area of a rectangle = " + area(r) + "mm");

		Square s = new Square(4);
		System.out.println("Area of a square = "+ s.area()+ "mm");
	}

	private static void hello(String somebody) {
		System.out.println("Hello " + somebody + "!");
	}

	private static double area(Rectangle r){
		return r.a*r.b;
	}
}