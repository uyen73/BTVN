
package bai2;

import java.util.Scanner;

public class Bai2 {

    public static String xoaKhoangTrang(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }
    public static String xoaSo(String s) {

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                s = s.replace(String.valueOf(s.charAt(i)), " ");
            }
        }
        return s;
    }
    public static String chuyen(String s) {
        s = s.toLowerCase();
        String s1[] = s.split(" ");
        s = "";
        for (int i = 0; i < s1.length; i++) {
            s += String.valueOf(s1[i].charAt(0)).toUpperCase() + s1[i].substring(1)+" ";
        }
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ky tu: ");
        String s = scanner.nextLine();
        System.out.println("Chuoi vua nhap la: " + s);

        System.out.println("Xoa cac so co trong chuoi: ");
        s = xoaSo(s);
        System.out.println(s);

        System.out.println("Xoa dau cach thua: ");
        String s1 = xoaKhoangTrang(s);
        System.out.println(s1);

        System.out.println("Viet hoa chu cai dau, cac chu cai sau viet thuong: ");
        System.out.println(chuyen(s1));
    }
    
}

