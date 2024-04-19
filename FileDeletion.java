package iostream;

import java.io.File;
import java.util.Scanner;

public class FileDeletion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap duong dan file: ");
		// Nhập đường dẫn tới tệp tin
		String filePath = sc.nextLine();

		// Tạo một đối tượng File với đường dẫn đã cho
		File file = new File(filePath);

		// Kiểm tra xem tệp tin có tồn tại không
		if (file.exists()) {

			if (file.isDirectory()) {
				boolean deleted = file.delete();
				if (deleted) {
					System.out.println("Thu muc da xoa thanh cong");
				} else {
					System.out.println("Khong the xoa thu muc!!!");
				}
			} else {
				boolean deleted = file.delete();
				if (deleted) {
					System.out.println("File da xoa thanh cong");
				} else {
					System.out.println("Khong the xoa file!!!");
				}
			}
		} else {
			System.out.println("Không tìm thấy tệp tin.");
		}
	}
}