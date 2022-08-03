
package bai1;

import java.util.Scanner;
public class HinhChuNhat {
    Scanner scanner = new Scanner(System.in);
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat( double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }

    public void nhap(){
        System.out.print("Nhap chieu dai: ");
        chieuDai = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong = scanner.nextInt();
    }
    public void xuat() {
        System.out.printf("%-10s%-10s%-10s%-10s", "ChieuDai","ChieuRong","Chu vi","Dien tich\n");
        System.out.printf("%-10s%-10s%-10s%-10s", chieuDai, chieuRong, chuVi(), dienTich());
    }

    public static void main(String[] args){
        HinhChuNhat A = new HinhChuNhat();
        HinhChuNhat B = new HinhChuNhat();
        
        System.out.println("Hinh chu nhat A:");
        A.nhap();
        System.out.println("Thong tin hinh chu nhat A:");
        A.xuat();
        
        System.out.println("\nThong tin hinh chu nhat B:");
        B.setChieuDai(12);
        B.setChieuRong(10);
        System.out.printf("%-10s%-10s%-10s%-10s", "ChieuDai","ChieuRong","Chu vi","Dien tich\n");
        System.out.printf("%-10s%-10s%-10s%-10s", B.getChieuDai(),B.getChieuRong(),B.chuVi(),B.dienTich());

        if(A.dienTich() == B.dienTich()){
            System.out.println("\nHai hinh chu nhat có dien tich bang nhau!");
        }
        else if(A.dienTich() > B.dienTich()){
            System.out.println("\nHinh chu nhat co dien tich lon hon: DT HCN A= " + A.dienTich());
        }
        else {
            System.out.println("\nHinh chu nhat co dien tich lon hon: DT HCN B= " + B.dienTich());
        }
      }
    }

