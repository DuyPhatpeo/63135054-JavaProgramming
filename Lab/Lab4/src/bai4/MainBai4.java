package bai4;
import java.util.Scanner;

public class MainBai4 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Laptop", 1000.0, 100.0);
        SanPham sp2 = new SanPham("Điện thoại", 500.0, 0);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
    }
}
