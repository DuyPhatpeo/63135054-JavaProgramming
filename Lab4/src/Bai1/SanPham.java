package Bai1;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia, giamGia;

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau(){
        return 0.1*donGia;
    }

    public void xuat(){
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public  void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
    
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham("LapTop", 1000.00, 100.00);
        sanPham1.xuat();
    }
}
