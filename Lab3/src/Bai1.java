import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập N: ");
		int N = scanner.nextInt();
		boolean ok = true;

		for (int i = 2; i < N - 1; i++) {
			if (N % i == 0) {
				ok = false;
				break;
			}
		}
		if (ok) {
			System.out.println(N + " là số nguyên tố.");
		} else {
			System.out.println(N + " không phải là số nguyên tố.");
		}
	}

}
