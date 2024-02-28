package bai4;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta: " + canDelta);
        } else {
            System.out.println("Delta là số âm, không thể tính căn delta.");
        }

        scanner.close();
    }
}
