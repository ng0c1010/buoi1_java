package bai2;
/*
    Trong bài 2 em chỉ dùng GPT phần toString của class LopHocPhan
    CÒN LẠI EM TỰ CODE
                              Ký tên
                           Ngọc quỷ đỏ ♥
* */


public class Main {
    public static void main(String[] args) {
        SinhVien[] dsSV = new SinhVien[3];
        dsSV[0] = new SinhVien("123", "Nguyễn Văn A");
        dsSV[1] = new SinhVien("543", "Lê Thị B");
        dsSV[2] = new SinhVien("321", "Lương Văn C");

        LopHocPhan lopHocPhan = new LopHocPhan("123456", "LT Hướng đối tượng", "Nguyễn Văn A", "Thu 7, tiết 4-7, Phòng A1.1", dsSV);

        System.out.println("Mã LHP: " + lopHocPhan.getMaLHP());
        System.out.println("Tên LHP: " + lopHocPhan.getTenLHP());
        System.out.println("GV giảng dạy: " + lopHocPhan.getTenGV());
        System.out.println("Thông tin buổi hoc: " + lopHocPhan.getThongTinLopHoc());
        System.out.println("Danh sách sinh viên: ");
        for (SinhVien sv : lopHocPhan.getDsSV()) {
            System.out.println(sv.getMaSV() + "\t | " + sv.getHoTen());
        }
        System.out.println("Tổng số sinh viên: " + lopHocPhan.getSoLuongSV());
    }

}
