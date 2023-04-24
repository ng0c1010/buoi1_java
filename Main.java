package bai1b;

import java.time.LocalDate;
/*import java.time.format.DateTimeFormatter;
import java.util.Scanner;
*/
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");*/

        // Tạo đối tượng 1
        HangThucPham hang1 = new HangThucPham("001", "Gạo ", 100000, LocalDate.of(2018, 7, 10), LocalDate.of(2025, 7, 10));
        System.out.println(hang1.toString());

        // Tạo đối tượng 2
        HangThucPham hang2 = new HangThucPham("002", "Mì", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2025, 9, 1));
        System.out.println(hang2.toString());
        

        // Tạo đối tượng 3
        HangThucPham hang3 = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017, 3, 1), LocalDate.of(2019, 3, 1));
        System.out.println(hang3.toString());

        /*// Kiểm tra hàng đã hết hạn chưa
        if (hang1.hetHan()) {
            System.out.println(hang1.getTenHang() + " đã hết hạn.");
        } else {
            System.out.println(hang1.getTenHang() + " chưa hết hạn.");
        }
        
        if (hang2.hetHan()) {
            System.out.println(hang2.getTenHang() + " đã hết hạn.");
        } else {
            System.out.println(hang2.getTenHang() + " chưa hết hạn.");
        }
        
        if (hang3.hetHan()) {
            System.out.println(hang3.getTenHang() + " đã hết hạn.");
        } else {
            System.out.println(hang3.getTenHang() + " chưa hết hạn.");
        }*/
    }
}