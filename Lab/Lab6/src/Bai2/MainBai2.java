package Bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class MainBai2 {
	public static void main(String[] args) {
		ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        // Xuất thông tin các sản phẩm có hãng là "Nokia"
        System.out.println("Các sản phẩm có hãng là Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
                System.out.println();
            }
        }
	}
}
