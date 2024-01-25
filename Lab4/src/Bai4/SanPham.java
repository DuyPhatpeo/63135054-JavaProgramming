package Bai4;
import java.util.Scanner;


public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    private double getThueNhapKhau() {
        return 0.1 * donGia;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + getTenSp());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Giảm giá: " + getGiamGia());
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        setTenSp(scanner.nextLine());

        System.out.print("Nhập đơn giá: ");
        setDonGia(scanner.nextDouble());

        System.out.print("Nhập giảm giá: ");
        setGiamGia(scanner.nextDouble());
    }
}
