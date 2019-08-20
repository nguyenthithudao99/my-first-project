package godan;

public class Dog {
	public String name;
	private int age;
	private String color;
	public Dog(String name,int age,String color)
	{
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
	}
	public static void wagging(String desciption) {
		System.out.println("wagging:" + desciption);
	}
	public static void barking(String desciption) {
		System.out.println("barking:" + desciption);
	}
	public static void eating(String desciption ) {
		System.out.println("eating:" + desciption);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
}
