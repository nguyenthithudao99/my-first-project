package baitap;

public class MainProgram {
	public static void main(String[] args) {
		Sinhvien  sinhvien1 = new Sinhvien("Dave", 6 , "boy");
		Sinhvien  sinhvien2 = new Sinhvien("Jack", 7 , "girl");
		Sinhvien  sinhvien3 = new Sinhvien("Lía", 6 , "boy");
		
		System.out.println("Sinh Vien 1:Name:"+sinhvien1.name+",Age:"+sinhvien1.age+",Gender:"+sinhvien1.gender);
		System.out.println("Sinh Vien 2:Name:"+sinhvien2.name+",Age:"+sinhvien2.age+",Gender:"+sinhvien2.gender);
		System.out.println("Sinh Vien 3:Name:"+sinhvien3.name+",Age:"+sinhvien3.age+",Gender:"+sinhvien3.gender);
	}
}
