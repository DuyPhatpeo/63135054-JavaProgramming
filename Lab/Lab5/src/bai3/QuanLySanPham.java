package bai3;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLySanPham {
	static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
	
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
	
	public static void menu() {
        System.out.println("\n+--------------------------------------------------+");
        System.out.println("| 1. Nhập danh sách sản phẩm từ bàn phím           |");
        System.out.println("| 2. Sắp xếp giảm dần theo giá và xuất ra màn hình |");
        System.out.println("| 3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím |");
        System.out.println("| 4. Xuất giá trung bình của các sản phẩm          |");
        System.out.println("+--------------------------------------------------+");
        System.out.print("Chọn chức năng (1-4): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                nhap();
                break;
            case 2:
                sapxep();
                break;
            case 3:
                xoa();
                break;
            case 4:
                xuatGiaTrungBinh();
                break;
            default:
                System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
        }
    }
	
	public static void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nNhập số lượng sản phẩm: ");
		int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm: ");
            String ten = scanner.next();
            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();

            danhSachSanPham.add(new SanPham(ten, donGia));
        }
        System.out.println("Đã nhập danh sách sản phẩm.");
	}

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.donGia.compareTo(o1.donGia);
            }
        };

        Collections.sort(danhSachSanPham, comp);

        System.out.println("\nDanh sách sản phẩm sau khi sắp xếp:");
        xuat();
    }

    public static void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.next();

        Iterator<SanPham> iterator = danhSachSanPham.iterator();
        while (iterator.hasNext()) {
            SanPham sanPham = iterator.next();
            if (sanPham.ten.equals(tenCanXoa)) {
                iterator.remove();
                System.out.println("Đã xóa sản phẩm " + tenCanXoa);
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm có tên " + tenCanXoa);
    }

    public static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("\nDanh sách sản phẩm trống.");
            return;
        }

        double tongGia = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongGia += sanPham.donGia;
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("\nGiá trung bình của các sản phẩm là: " + giaTrungBinh);
    }

    public static void xuat() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        for (SanPham sanPham : danhSachSanPham) {
            System.out.println("Tên: " + sanPham.ten + ", Đơn giá: " + sanPham.donGia);
        }
    }
}
