package Bai1;
import java.util.Scanner;

public class MainBai1 {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Điện thoại",25000.00,20000);
        sp1.xuat();
        SanPham sp2 = new SanPham("laptop", 20000.00,19000.00);
        sp1.xuat();
        SanPham sp3 = new SanPham();
        sp3.nhap();
        sp3.xuat();
    }
}
