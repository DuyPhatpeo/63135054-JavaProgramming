package Lab2;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println(">>+----------MENU----------+<<");
		System.out.println("+----------------------------+");
		System.out.println("|     1.Giải PT bậc nhất     |");
		System.out.println("|     2.Giải PT bậc hai      |");
		System.out.println("|     3.Tính tiền điện       |");
		System.out.println("|     4.Kết thúc             |");
		System.out.println("+----------------------------+");

		System.out.print("\tNhập chức năng: ");
		int chucNang = scanner.nextInt();
		switch(chucNang) {
			case 1:
				giaiPT1();
				break;
			case 2:
				giaiPT2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				break;
			default:
				break;
		}
	}
	public static void giaiPT1(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập giá trị của a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập giá trị của b: ");
		double b = scanner.nextDouble();

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			double x = -b / a;
			System.out.println("Nghiệm của phương trình là: " + x);
		}
	}

	public  static  void giaiPT2(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập giá trị của a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập giá trị của b: ");
		double b = scanner.nextDouble();

		System.out.print("Nhập giá trị của c: ");
		double c = scanner.nextDouble();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình có vô số nghiệm.");
				} else {
					System.out.println("Phương trình vô nghiệm.");
				}
			} else {
				double x = -c / b;
				System.out.println("Nghiệm của phương trình là: " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép: x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("Nghiệm thứ nhất (x1) = " + x1);
				System.out.println("Nghiệm thứ hai (x2) = " + x2);
			}
		}
	}

	public static void tinhTienDien(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số điện sử dụng trong tháng: ");
		int soDien = scanner.nextInt();

		int tien;
		if(soDien <= 50){
			tien = soDien * 1000;
		}
		else {
			tien = 50 * 1000 + (soDien - 50) * 1200;
		}
		System.out.println("Số điện cần thanh toán: " + tien + "VND");
	}
}

