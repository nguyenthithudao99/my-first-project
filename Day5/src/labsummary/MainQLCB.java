package labsummary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainQLCB {

	public static boolean isEndProgram = false;
	public static Scanner scanner = new Scanner(System.in);
	public static int inputNumber = 0;

	public static void main(String argr[]) {
		List<NhanVien> nhanvien = new ArrayList<NhanVien>();
		List<KySu> kysu = new ArrayList<KySu>();
		List<CongNhan> congnhan = new ArrayList<CongNhan>();
		showMenu();
	}

	public static void showMenu() {
			do {
				if (isEndProgram) {
					break;
				}
	
				
				System.out.println("Choose one numbers below : ");
				System.out.println("1: Nhap thong tin can bo");
				System.out.println("2: Hien thi thong tin can bo");
				System.out.println("3: Tim kiem thong tin can bo");
				System.out.println("-------------------------------");
				inputNumber = scanner.nextInt();
				switch (inputNumber) {
				case 1:
					addNhap();
					break;
				case 2:
					addHienthi();
					break;
				case 3:
					addTimkiem();
					
					break;
				}

			} while (inputNumber != 3);
		}

	private static void addTimkiem() {
		// TODO Auto-generated method stub
		System.out.println("Tim kiem can bo \n");
		System.out.println("1.Tim kiem  danh sach nhan vien \n");
		System.out.println("2.Tim kiem  danh sach ky su \n");
		System.out.println("3.Tim kiem  danh sach nhan vien \n");
		System.out.println("--------------");
		System.out.println("Type your input number :");
		Scanner Nhap = new Scanner(System.in);
		int input = Nhap.nextInt();
		switch (input) {
		case 1:
			System.out.println("1.Tim kiem  Danh sach cong nhan \n");
			HienthiCN();
			break;

		case 2:
			System.out.println("2.Tim kiem  danh sach ky su \n");
			HienthiKS();
			break;
		case 3:
			System.out.println("3.Tim kiem  danh sach nhan vien \n");
			HienthiNV();
			break;
		default:
			break;
		}
	}
	

	private static void addHienthi() {
		// TODO Auto-generated method stub
		
		System.out.println("Hien thi can bo \n");
		System.out.println("1.Hien thi danh sach nhan vien \n");
		System.out.println("2.Hien thi danh sach ky su \n");
		System.out.println("3.Hien thi danh sach nhan vien \n");
		System.out.println("--------------");
		System.out.println("Type your input number :");
		Scanner Nhap = new Scanner(System.in);
		int input = Nhap.nextInt();
		switch (input) {
		case 1:
			System.out.println("1.Hien thi Danh sach cong nhan \n");
			HienthiCN();
			break;

		case 2:
			System.out.println("2.Hien thi danh sach ky su \n");
			HienthiKS();
			break;
		case 3:
			System.out.println("3.Hien thi danh sach nhan vien \n");
			HienthiNV();
			break;
		default:
			break;
		}
	}

	private static void HienthiNV() {
		// TODO Auto-generated method stub
		
	}

	private static void HienthiKS() {
		// TODO Auto-generated method stub
		
	}

	private static void HienthiCN() {
		// TODO Auto-generated method stub
		
	}

	private static void addNhap() {
		// TODO Auto-generated method stub
		System.out.println("Nhap can bo \n");
		System.out.println("1.Nhap Danh sach nhan vien \n");
		System.out.println("2.Nhap danh sach ky su \n");
		System.out.println("3.Nhap danh sach nhan vien \n");
		System.out.println("--------------");
		System.out.println("Type your input number :");
		Scanner Nhap = new Scanner(System.in);
		int input = Nhap.nextInt();
		switch (input) {
		case 1:
			System.out.println("1.Nhap Danh sach cong nhan \n");
			NhapCN();
			break;

		case 2:
			System.out.println("2.Nhap danh sach ky su \n");
			NhapKS();
			break;
		case 3:
			System.out.println("3.Nhap danh sach nhan vien \n");
			NhapNV();
			break;
		default:
			break;
		}
		
		
	}

	private static void NhapNV() {
		// TODO Auto-generated method stub
		
	}

	private static void NhapKS() {
		// TODO Auto-generated method stub
		
	}

	private static void NhapCN() {
		// TODO Auto-generated method stub
		
	}

	
		
	}
	
				
		

