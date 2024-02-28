package bai4;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            
            System.out.print("Họ tên: ");
            names[i] = scanner.next();
            
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();
            
            if (scores[i] < 5) {
                grades[i] = "Yếu";
            } else if (scores[i] < 6.5) {
                grades[i] = "Trung bình";
            } else if (scores[i] < 7.5) {
                grades[i] = "Khá";
            } else if (scores[i] < 9) {
                grades[i] = "Giỏi";
            } else {
                grades[i] = "Xuất sắc";
            }
        }

        System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    String tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;
                }
            }
        }

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grades[i]);
            System.out.println();
        }
    }
}
