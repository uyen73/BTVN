
package bai2;

import java.util.Scanner;

public class Vehicle {
    Scanner scanner = new Scanner(System.in);
    private String chuXe;
    private int maXe, dungTich;
    private double triGia;

    public Vehicle() {
    }

    public Vehicle(String chuXe, int maXe, int dungTich, double triGia) {
        this.chuXe = chuXe;
        this.maXe = maXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double tinhThue() {
        double thue;
        if (dungTich < 100) thue = triGia * 0.02;
        else if (dungTich >= 100 && dungTich <= 200) thue = triGia * 0.06;
        else thue = triGia * 0.1;
        return thue;
    }

    @Override
    public String toString() {
        return chuXe + "         " + maXe + "         " + dungTich + "           " + triGia + "           " + tinhThue();
    }
}
