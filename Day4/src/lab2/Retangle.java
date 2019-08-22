package lab2;

public class Retangle extends Shape{
	public int length;
	public int width;
	public Retangle(String color,int length,int width) {
		super(color);
		this.length=length;
		this.width=width;
	}
	public double getArea(int length,int width){
		return length*width;
		}
	
}
