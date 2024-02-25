package Bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
	private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên:");
        this.hoTen = scanner.nextLine();
        
        // Kiểm tra và nhập email
        while (true) {
            System.out.println("Nhập email:");
            this.email = scanner.nextLine();
            if (kiemTraEmail(email)) {
                break;
            } else {
                System.out.println("Email không hợp lệ! Vui lòng nhập lại.");
            }
        }

        // Kiểm tra và nhập số điện thoại
        while (true) {
            System.out.println("Nhập số điện thoại(10 số):");
            this.soDienThoai = scanner.nextLine();
            if (kiemTraSoDienThoai(soDienThoai)) {
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ! Vui lòng nhập lại.");
            }
        }

        // Kiểm tra và nhập CMND
        while (true) {
            System.out.println("Nhập chứng minh nhân dân (9 số):");
            this.cmnd = scanner.nextLine();
            if (kiemTraCMND(cmnd)) {
                break;
            } else {
                System.out.println("Chứng minh nhân dân không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    private boolean kiemTraEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean kiemTraSoDienThoai(String soDienThoai) {
        // Kiểm tra xem số điện thoại có chứa chỉ chữ cái không
        return soDienThoai.matches("[0-9]+") && soDienThoai.length() == 10;
    }

    private boolean kiemTraCMND(String cmnd) {
        // Kiểm tra xem CMND có chứa chỉ chữ cái không
        return cmnd.matches("[0-9]+") && cmnd.length() == 9;
    }
}
