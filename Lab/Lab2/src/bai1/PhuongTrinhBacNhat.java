package bai1;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
	public static void main(String[] args) {
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

        scanner.close();
    }
}

