package labsummary;

import java.util.Scanner;

public class KySu extends Canbo {
	public String ndt;
	public KySu (String ndt,String hoten,int namsinh,boolean  gioitinh,int diachi) {
		super(hoten,namsinh,gioitinh,diachi);
		this.ndt=ndt;
	}
	public String getNdt() {
		return ndt;
	}
	public void setNdt(String ndt) {
		this.ndt = ndt;
	}
	public void KySu()
	{
		super.Canbo();
		Scanner KySu = new Scanner(System.in);
		System.out.println("Nhap nganh dao tao:");
		this.ndt= KySu.nextLine();
	}
	@Override
	public String toString() {
		return super.toString() + "\n" + "getNdt: " + getNdt();
	
	}
}
