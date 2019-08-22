package lab2;

public class Triangle extends Shape {
	public int base ;
	public int height;
	public Triangle(String color,int base,int height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	public double getArea(int base,int height)
 {
		return 0.5*base*height;
	}
}
