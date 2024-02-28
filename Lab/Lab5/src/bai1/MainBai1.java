package bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.print("Nhập một số thực: ");
            double x = scanner.nextDouble();
            list.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); // Đọc dòng trắng sau khi nhập số để tránh lỗi khi nhập ký tự Y/N
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Xuất danh sách vừa nhập
        System.out.println("Danh sách số thực vừa nhập:");
        for (double num : list) {
            System.out.print(num + " ");
        }

        // Tính tổng của danh sách
        double sum = 0;
        for (double num : list) {
            sum += num;
        }

        System.out.println("\nTổng của danh sách: " + sum);
	}
}
