package bai1b;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private String maHang;
    private String tenHang = "xxx";
    private double donGia = 0;
    private LocalDate ngaySanXuat = LocalDate.now();
    private LocalDate ngayHetHan = LocalDate.now();

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống!");
        }
        this.maHang = maHang;
        if (!tenHang.isEmpty()) {
            this.tenHang = tenHang;
        }
        if (donGia >= 0) {
            this.donGia = donGia;
        }
        if (ngaySanXuat.isBefore(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        }
        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }

    public HangThucPham(String maHang) {
        if (maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống!");
        }
        this.maHang = maHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (!tenHang.isEmpty()) {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        }
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat.isBefore(LocalDate.now())) {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        if (ngayHetHan.isAfter(ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        }
    }
    
    // kiểm tra ngày hết hạn
    public boolean isExpired() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(ngayHetHan) || currentDate.isEqual(ngayHetHan);
    }
    
    public boolean hetHan() {
    	return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
    }
    @Override
    public String toString() {
        String expiredStatus = hetHan() ? "Hàng đã hết hạn" : "Hàng chưa hết hạn";
        DecimalFormat df = new DecimalFormat("#,###");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String result = String.format("%s - %s: %s đ - Ngày sản xuất: %s - Ngày hết hạn: %s - %s",
                maHang, tenHang, df.format(donGia), ngaySanXuat.format(dtf), ngayHetHan.format(dtf), expiredStatus);
        return result;
    }
}
