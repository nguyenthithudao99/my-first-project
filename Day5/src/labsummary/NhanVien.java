package labsummary;

import java.util.Scanner;

public class NhanVien extends Canbo {
	public String cv;
	public NhanVien(String cv,String hoten,int namsinh,boolean  gioitinh,int diachi) {
		super(hoten,namsinh,gioitinh,diachi);
		this.cv=cv;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public void NhanVien()
	{
		super.Canbo();
		Scanner NhanVien = new Scanner(System.in);
		System.out.println("Nhap cong viec:");
		this.cv = NhanVien.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "getCV: " + getCv();
	
	}
}
