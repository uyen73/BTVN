package bai3;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class KtraSNT {

    public static boolean isPrime(int n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(float n){
        if(n - (int)n != 0) return false;
        else {
            if(n < 2) return false;
            else{
                for(int i = 2; i <= sqrt(n); i++){
                    if(n % i == 0) return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(double n){
        if(n - (int)n != 0) return false;
        else {
            if(n < 2) return false;
            else{
                for(int i = 2; i <= sqrt(n); i++){
                    if(n % i == 0) return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int a;
        long b;
        float c;
        double d;
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Nhap int a: ");
        a = sn.nextInt();
        System.out.print("Nhap long b: ");
        b = sn.nextLong();
        System.out.print("Nhap float c: ");
        c = sn.nextFloat();
        System.out.print("Nhap double d: ");
        d = sn.nextDouble();
        System.out.println("So a la so nguyen to: " + isPrime(a));
        System.out.println("So b la so nguyen to: " + isPrime(b));
        System.out.println("So c la so nguyen to: " + isPrime(c));
        System.out.println("So d la so nguyen to: " + isPrime(d));
    }
}