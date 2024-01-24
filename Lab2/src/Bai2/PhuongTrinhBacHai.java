package Bai2;

import java.util.Scanner;

public class PhuongTrinhBacHai {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

        scanner.close();
	}

}

