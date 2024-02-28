package bai2;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
    private double donGia;
    private String hang;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        this.donGia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản phẩm:");
        this.hang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Giá sản phẩm: " + donGia);
        System.out.println("Hãng sản phẩm: " + hang);
    }

    public String getHang() {
        return hang;
    }
}

