package TuyenSinh2;
// Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức ưu tiên.
public class ThiSinh {
    private int SBD;
    private String HoTen;
    private String DiaChi;
    private String MucUuTien;

    public ThiSinh() {
    }

    public ThiSinh(int SBD, String hoTen, String diaChi, String mucUuTien) {
        this.SBD = SBD;
        this.HoTen = hoTen;
        this.DiaChi = diaChi;
        this.MucUuTien = mucUuTien;
    }

    public int getSBD() {
        return SBD;
    }

    public void setSBD(int SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getMucUuTien() {
        return MucUuTien;
    }

    public void setMucUuTien(String mucUuTien) {
        MucUuTien = mucUuTien;
    }
}
