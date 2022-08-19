package org.example;

public class KhoiC {
    private ThiSinh thiSinh;
    private double Van;
    private double Su;
    private double Dia;

    public KhoiC() {
        super();}

    public KhoiC(double van, double su, double dia) {
        Van = van;
        Su = su;
        Dia = dia;
    }

    public KhoiC(ThiSinh thiSinh, double van, double su, double dia) {
        this.thiSinh = thiSinh;
        Van = van;
        Su = su;
        Dia = dia;
    }

    public ThiSinh getThiSinh() {
        return thiSinh;
    }

    public void setThiSinh(ThiSinh thiSinh) {
        this.thiSinh = thiSinh;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double van) {
        Van = van;
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double su) {
        Su = su;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double dia) {
        Dia = dia;
    }

    public double DiemTB(){
        double tb = (Van*2 + Su + Dia)/4;
        return tb;
    }
}
