
package bai3;

import java.util.Scanner;
public class PtBac2 {
    Scanner scanner = new Scanner(System.in);
    public float a, b, c;
    public PtBac2() {
    }

    public void nhap(){
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        System.out.print("c = ");
        c = scanner.nextFloat();
    }

    public void xuat(){
        System.out.println(a+"x^2 + "+b+"x + "+c+" = 0");
    }

    public void nghiem(){
        if(a==0){
            System.out.println("x = "+ -c/b);
        }
        else{
            float delta;
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println(" PT Vo Nghiem!");
            }
            else if(delta == 0){
                System.out.println("x = "+ -b / (2 * a));
            }
            else{
                System.out.println("x1 = "+(-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("x2 = "+(-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }

    public static void main(String[] args) {
        PtBac2 A = new PtBac2();
        System.out.println("Nhap cac he so:");
        A.nhap();
        A.xuat();
        System.out.println("Ket qua:");
        
        A.nghiem();
    }

}