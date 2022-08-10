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
public class QuanLy {
    private String maQL, hoTen;

    public void nhap() {
        
        System.out.print("Nhap Ma Quan Ly: ");
        maQL = scanner.nextLine();
        System.out.print("Nhap Ho Ten QL: ");
        hoTen = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma Quan Ly: " + maQL);
        System.out.println("Ho Ten Quan Ly: " + hoTen);
    }
}
