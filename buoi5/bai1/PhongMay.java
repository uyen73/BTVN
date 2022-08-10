/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import static bai1.May.scanner;

/**
 *
 * @author asus
 */
public class PhongMay {
    private String maPhong, tenPhong;
    private double dienTich;
    QuanLy x = new QuanLy();
    May y = new May();

    public void nhap() {
        
        System.out.print("Nhap Ma Phong: ");
        maPhong = scanner.nextLine();
        System.out.print("Nhap Ten Phong: ");
        tenPhong = scanner.nextLine();
        System.out.print("Nhap Dien Tich Phong: ");
        dienTich = scanner.nextDouble();
        scanner.nextLine();
        x.nhap();
        y.nhap();
    }

    public void xuat() {
        System.out.println("Ma Phong: " + maPhong);
        System.out.println("Ten Phong: " + tenPhong);
        System.out.println("Dien Tich Phong: " + dienTich);
        x.xuat();
        y.xuat();
    }
}
