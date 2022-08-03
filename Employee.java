/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;
public class Employee {
    Scanner scanner = new Scanner(System.in);
    private String mnv;
    private String ten;
    private int tuoi;
    private int soNgayCong;
    private double salary;
    public static int price = 50;

    public Employee() {
    }

    public Employee(String mnv, String ten, int tuoi, int soNgayCong, double salary) {
        this.mnv = mnv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.soNgayCong = soNgayCong;
        this.salary = salary;
    }

    public String getMnv() {
        return mnv;
    }

    public void setMnv(String mnv) {
        this.mnv = mnv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

   public double getSalary(){
        return soNgayCong*price;
   }
   public void nhap(){
        System.out.print("Nhap ma nhan vien:");
        mnv = scanner.nextLine();
        System.out.print("Nhap ten:");
        ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        System.out.print("Nhap so ngay cong:");
        soNgayCong = scanner.nextInt();
   }
    public void xuat() {
        System.out.printf("%-10s%-10s%-10s%-15s%-10s\n",mnv, ten, tuoi, soNgayCong, getSalary());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien:");
        int n = scanner.nextInt();
        Employee []A = new Employee[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap Sinh Vien Thu " + (i+1) + ":\n" );
            A[i]=new Employee();
            A[i].nhap();
        }
        System.out.println("\tTHONG TIN CAC NHAN VIEN ");
        System.out.printf("%-10s%-10s%-10s%-15s%-10s\n","MaNV", "Ten", "Tuoi", "SoNgayCong", "Luong");
        for(int i = 0; i < n; i++){
            A[i].xuat();
        }
    }
}