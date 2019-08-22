package lab2;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangle retangle = new Retangle("yellow", 2, 2);
		System.out.println("color:" + retangle.color);
		System.out.println("length:" + retangle.length);
		System.out.println("width :" + retangle.width);
		System.out.println("Area  :" + retangle.getArea(2,2));
		Triangle triangle = new Triangle("pink", 3, 4);
		System.out.println("color:" + triangle.color);
		System.out.println("base:" + triangle.base);
		System.out.println("height:" + triangle.height);
		System.out.println("Area  :" + triangle.getArea(3,4));

	}

}
