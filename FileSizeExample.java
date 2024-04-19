package iostream;
import java.io.File;
import java.util.Scanner;

public class FileSizeExample {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	// Nhập đường dẫn tới tệp tin
        String filePath = sc.nextLine();

        // Tạo một đối tượng File với đường dẫn đã cho
        File file = new File(filePath);

        // Kiểm tra xem tệp tin có tồn tại không
        if (file.exists()) {
            // Lấy kích thước của tệp tin (đơn vị: bytes)
            long fileSize = file.length();

            // In ra kích thước của tệp tin
            System.out.println("Kích thước của tệp tin là: " + fileSize + " bytes");
        } else {
            System.out.println("Không tìm thấy tệp tin.");
        }
    }
}