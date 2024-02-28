package bai1;
import java.util.Scanner;

public class MainBai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = scanner.nextLine().trim();

        // Kiểm tra xem chuỗi có chứa ít nhất một ký tự trắng không
        if (fullName.contains(" ")) {
            // Tìm vị trí của ký tự trắng đầu tiên và cuối cùng
            int firstSpaceIndex = fullName.indexOf(' ');
            int lastSpaceIndex = fullName.lastIndexOf(' ');

            // Lấy họ, tên và tên đệm từ chuỗi đầu vào
            String lastName = fullName.substring(0, firstSpaceIndex).toUpperCase();
            String firstName = fullName.substring(lastSpaceIndex + 1).toUpperCase();
            String middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

            // In ra màn hình
            System.out.println("Họ: " + lastName);
            System.out.println("Tên: " + firstName);
            System.out.println("Tên đệm: " + middleName);
        } else {
            System.out.println("Chuỗi không chứa ký tự trắng!");
        }
	}

}
