package lab3;

public class MainShape {
public static void main(String argr[]) { 
	Rectangle rectangle = new Rectangle();
	Triangle triangle = new Triangle();
	rectangle.input();
	triangle.input();
	System.out.println(rectangle.toString());
	System.out.println(triangle.toString());

} 

}
