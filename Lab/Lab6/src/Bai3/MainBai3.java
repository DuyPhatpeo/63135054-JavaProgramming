package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBai3 {
	public static void main(String[] args) {
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho 5 sinh viên
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSinhVien.add(sv);
        }

        // Xuất thông tin các sinh viên
        System.out.println("Thông tin các sinh viên:");
        for (SinhVien sv : danhSachSinhVien) {
            sv.xuat();
            System.out.println();
        }
    }
}
