package Lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cạch: ");
        double canh = scanner.nextDouble();

        double theTichLapPhuong1 = canh * canh * canh;
        double theTichLapPhuong2 = Math.pow(canh,3);

        System.out.println("Thể tích lập phương 1: " + theTichLapPhuong1);
        System.out.println("Thể tích lập phương 2: " + theTichLapPhuong2);

        scanner.close();
    }
}

