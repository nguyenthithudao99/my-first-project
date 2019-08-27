package labsummary;

import java.util.Scanner;

public class CongNhan extends Canbo {
	public String bac;
	public CongNhan(String bac,String hoten,int namsinh,boolean  gioitinh,int diachi) {
		super(hoten,namsinh,gioitinh,diachi);
		this.bac=bac;
	}
	public String getBac() {
		return bac;
	}
	public void setBac(String bac) {
		this.bac = bac;
	}
	public void CongNhan()
	{
		super.Canbo();
		Scanner CongNhan = new Scanner(System.in);
		System.out.println("Nhap thu bac:");
		this.bac= CongNhan.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "getBac: " + getBac();
	
	}
}
