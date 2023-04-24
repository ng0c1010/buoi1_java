package bai1a;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Xe xe1 = null;
        Xe xe2 = null;
        Xe xe3 = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng thống kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin cho xe1:");
                    System.out.println("Nhap ten chu xe: ");
                    String ten1 = new Scanner(System.in).nextLine();
                    System.out.println("Nhap loai xe: ");
                    String loaiXe1 = new Scanner(System.in).nextLine();
                    System.out.print("Dung tích: ");
                    int dungTich1 = scanner.nextInt();
                    System.out.print("Giá trị: ");
                    double giaTri1 = scanner.nextDouble();
                    xe1 = new Xe(ten1,loaiXe1 , dungTich1, giaTri1);
                    System.out.println("Nhập thông tin cho xe2:");
                    String ten2 = new Scanner(System.in).nextLine();
                    System.out.println("Nhap loai xe: ");
                    String loaiXe2 = new Scanner(System.in).nextLine();
                    System.out.print("Dung tích: ");
                    int dungTich2 = scanner.nextInt();
                    System.out.print("Giá trị: ");
                    double giaTri2 = scanner.nextDouble();
                    xe2 = new Xe(ten2,loaiXe2 ,dungTich2, giaTri2);

                    System.out.println("Nhập thông tin cho xe3:");
                    System.out.println("Nhap ten chu xe: ");
                    String ten3 = new Scanner(System.in).nextLine();
                    System.out.println("Nhap loai xe: ");
                    String loaiXe3 = new Scanner(System.in).nextLine();
                    System.out.print("Dung tích: ");
                    int dungTich3 = scanner.nextInt();
                    System.out.print("Giá trị: ");
                    double giaTri3 = scanner.nextDouble();
                    xe3 = new Xe(ten3,loaiXe3 ,dungTich3, giaTri3);
                    break;

                case 2:
                    if (xe1 == null || xe2 == null || xe3 == null) {
                        System.out.println("Bạn chưa nhập thông tin xe!");
                    } else {
                    	System.out.println(String.format("%-20s%-15s%-10s%-15s%-10s", "Tên xe", "Loại xe", "Dung tích", "Giá trị", "Thuế"));
                    	System.out.println(String.format("%-20s%-15s%-10d%-15.1f%-10f", xe1.getTen(), xe1.getloaiXe(), xe1.getDungTich(), xe1.getGiaTri(), xe1.tinhThue()));
                    	System.out.println(String.format("%-20s%-15s%-10d%-15.1f%-10f", xe2.getTen(), xe2.getloaiXe(), xe2.getDungTich(), xe2.getGiaTri(), xe2.tinhThue()));
                    	System.out.println(String.format("%-20s%-15s%-10d%-15.1f%-10f", xe3.getTen(), xe3.getloaiXe(), xe3.getDungTich(), xe3.getGiaTri(), xe3.tinhThue()));
                    }
                    break;

                case 3:
                    System.out.println("Cảm ơn đã sử dụng chương trình!");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }
}
