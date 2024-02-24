package Bai1;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên dương: ");
        int N = scanner.nextInt();

        boolean ok = true;

        if (N <= 1) {
            ok = false; // Không phải số nguyên tố nếu là số âm hoặc bằng 1
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không phải là số nguyên tố.");
        }
    }
}

