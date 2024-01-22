import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng phần tử trong mảng: ");
		int n = scanner.nextInt();
		int[] mang = new int[n];

		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1) + ": ");
			mang[i] = scanner.nextInt();
		}

		Arrays.sort(mang);
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(mang));

		int min = mang[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(min, mang[i]);
		}
		System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

		int tong = 0;
		int dem = 0;

		for (int i = 0; i < n; i++) {
			if (mang[i] % 3 == 0) {
				tong += mang[i];
				dem++;
			}
		}

		double trungBinhCong;

		if (dem > 0) {
		    trungBinhCong = (double) tong / dem;
		} else {
		    trungBinhCong = 0;
		}


		System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + trungBinhCong);

		scanner.close();
	}
}
