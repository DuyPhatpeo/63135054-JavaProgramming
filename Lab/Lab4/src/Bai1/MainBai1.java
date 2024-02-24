package Bai1;
import java.util.Scanner;

public class MainBai1 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Điện thoại",25000.00,20000);
        System.out.println("Sản phẩm thứ 1:");
        sp1.xuat();
        SanPham sp2 = new SanPham("laptop", 20000.00,19000.00);
        System.out.println("Sản phẩm thứ 2:");
        sp2.xuat();
        System.out.println("Sản phẩm thứ 3");
        SanPham sp3 = new SanPham();
        sp3.nhap();
        sp3.xuat();
        System.out.println("Sản phẩm thứ 4");
        SanPham sp4 = new SanPham();
        sp4.nhap();
        sp4.xuat();
        SanPham sp5 = new SanPham("Điện thoại", 500.0);
        System.out.println("\nThông tin sản phẩm 5:");
        sp5.xuat();
    }
}
