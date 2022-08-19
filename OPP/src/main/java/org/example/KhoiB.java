package org.example;

public class KhoiB extends ThiSinh{
    private ThiSinh thiSinh;
    private double Toan;
    private double Hoa;
    private double Sinh;

    public KhoiB() {
        super();
    }

    public KhoiB(double toan, double hoa, double sinh) {
        Toan = toan;
        Hoa = hoa;
        Sinh = sinh;
    }
/*   public KhoiB(ThiSinh thiSinh, double toan, double hoa, double sinh) {
        this.thiSinh = thiSinh;
        Toan = toan;
        Hoa = hoa;
        Sinh = sinh;
    }*/

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

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }

    public double getSinh() {
        return Sinh;
    }

    public void setSinh(double sinh) {
        Sinh = sinh;
    }

    public double DiemTB(){
        double tb = (Hoa*2 + Toan + Sinh)/4;
        return tb;
    }

    public void DSTS_KhoiB(){

    }
}

