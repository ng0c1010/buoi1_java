package bai1a;

public class Xe {
    private int dungTich;
    private double giaTri;
    private String ten;
    private String loaiXe;

    public Xe(String ten, String loaiXe, int dungTich, double giaTri) {
        this.dungTich = dungTich;
        this.giaTri = giaTri;
        this.ten = ten;
        this.loaiXe = loaiXe;
    }

    public double tinhThue() {
        if (dungTich < 100) {
            return giaTri * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            return giaTri * 0.03;
        } else {
            return giaTri * 0.05;
        }
    }
    public String getTen() {
    	return ten;
    }
    
    public String getloaiXe() {
    	return loaiXe;
    }
    public int getDungTich() {
    	return dungTich;
    }
    public Double getGiaTri() {
    	return giaTri;
    }

    
}
