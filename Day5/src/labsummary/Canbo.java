package labsummary;

import java.util.Scanner;

public class Canbo {
	
	
	public String hoten;
	public int namsinh;
	public boolean  gioitinh;
	public int diachi;
	public  Canbo(String hoten,int namsinh,boolean  gioitinh,int diachi) {
		this.hoten=hoten;
		this.namsinh=namsinh;
		this.gioitinh=gioitinh;
		this.diachi=diachi;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getDiachi() {
		return diachi;
	}
	public void setDiachi(int diachi) {
		this.diachi = diachi;
	}
	
	public void Canbo() {
		Scanner CanboHT = new Scanner(System.in);
		System.out.println("Nhap ho ten:");
		this.hoten = CanboHT.nextLine();
		Scanner Canbo = new Scanner(System.in);
		System.out.println("Nhap nam sinh:");
		this.namsinh = Canbo.nextInt();
		System.out.println("Nhap gioi tinh:");
		this.gioitinh = Canbo.nextBoolean();
		if(isGioitinh())
		{
			String gioiTinh = "Nam";
		}
		else 
		{
			String gioiTinh = "Nu";
		}
	}
	
		@Override
		public String toString() {
			return getHoten()+"\t" + getNamsinh() +"\t" +isGioitinh() +"\t"+ getDiachi();
			
			
	}

	
}
