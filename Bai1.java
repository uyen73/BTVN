
package bai1;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;


public class Bai1 {
    public static float TBC(int a[]){
        int d = 0;
        int t = 0;
        for(int i = 0; i < a.length; i++){
            if((a[i] % 2 != 0) && ((i + 1) % 2 == 0)){
                t += a[i];
                d++;
            }
        }
        
        return (float)t/d ;
    }
    public static int[] Min(int a[]){
        int min = a[0];
        int d = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[min]){
                min = i;
                d = 1;
            }
            else if(a[i]== a[min]) d++;
        }
        int b[] = new int [d+1];
        int j = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] == a[min]) {
                b[j] = i;
                if (j == d) break;
                j++;
                
            }
            
        }
        return b;
    }
    public static boolean SCP(int  n){
        int i = (int) sqrt(n);
        return i*i ==n;
    }
    public static void kiemTraSCP(int a[]){
        int d = 0;
        for(int i :a){
            if(SCP(i)) {
                System.out.print(i + " ");
                d++;
            }
        }
        if(d == 0){
            System.out.println(" Khong co so chinh phuong ");
        }
    }
    public static boolean SNT (int n){
        if (n < 2) return false;
        for(int i = 2; i <sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void kiemTraSNT(int a[]){
        int d = 0;
        for(int i : a) {
            if(SNT(i)){
                System.out.print(i + " ");
                d++;
            }
        }
        if ( d == 0 ) System.out.println("Khong co so nguyen to");
    }

    public static void sxTang(int a[]){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int a[] = new int[n];    
        for(int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        
        System.out.println("Trung binh cong so le o vi tri chan: " + TBC(a) );

        System.out.println("Vi tri cac so nho nhat trong mang: " + Arrays.toString(Min(a)));

        System.out.println("Cac so chinh phuong trong mang: ");
        kiemTraSCP(a);
        System.out.println("");
        
        System.out.println("Cac so nguyen to trong mang: ");
        kiemTraSNT(a);
        System.out.println("");
        
        System.out.println("Mang sau khi sap xep tang dan: ");
        sxTang(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
    
}
