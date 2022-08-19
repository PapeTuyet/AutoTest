package TuyenSinh2;

import lombok.Builder;
import org.example.ThiSinh;
@Builder

public class KhoiA extends ThiSinh {
    private ThiSinh thiSinh;
    private double Toan;
    private double Ly;
    private double Hoa;

    public KhoiA() {
        super();
    }

  /*  public KhoiA(int SBD, String hoTen, String diaChi, String mucUuTien, double toan, double ly, double hoa) {
        super(SBD, hoTen, diaChi, mucUuTien);
        Toan = toan;
        Ly = ly;
        Hoa = hoa;
    }*/

    public KhoiA(double toan, double ly, double hoa) {
        super();
        Toan = toan;
        Ly = ly;
        Hoa = hoa;
    }


    public KhoiA(ThiSinh thiSinh, double toan, double ly, double hoa) {
        super();
        this.thiSinh = thiSinh;
        Toan = toan;
        Ly = ly;
        Hoa = hoa;
    }

    public ThiSinh getThiSinh() {
        return thiSinh;
    }

    public void setThiSinh(ThiSinh thiSinh) {
        this.thiSinh = thiSinh;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double ly) {
        Ly = ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }

    public double DiemTB(){
        double tb = (Toan*2 + Ly + Hoa)/4;
        return tb;
    }
    public void DSTS(){
        System.out.println(" SBD: " + this.getSBD() + "\n Ho Ten: " + this.getHoTen() +
                "\n  Dia Chi: " + this.getDiaChi() + "\n Muc Uu Tien: " +this.getMucUuTien());
    }
}
