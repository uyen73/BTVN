/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class May {
    private String maMay, kieuMay, tinhTrang;
    public static Scanner scanner = new Scanner(System.in);
    public void nhap() {
        
        System.out.print("Nhap Ma may: ");
        maMay = scanner.nextLine();
        System.out.print("Nhap kieu may: ");
        kieuMay = scanner.nextLine();
        System.out.print("Nhap tinh trang may: ");
        tinhTrang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma May: " + maMay);
        System.out.println("Kieu May: " + kieuMay);
        System.out.println("Tinh Trang: " + tinhTrang);
    }
}
