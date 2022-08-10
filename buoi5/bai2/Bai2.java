
package bai2;

import static bai2.Address.scanner;


public class Bai2 {

    static int n;
    static Student[] a = new Student[n];

    public static void xuat(Student[] a, int n) {
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }

    public static void timKiem(Student[] a, int n) {
        System.out.print("Nhap ID Sinh Vien  muon tim: ");
        int b = scanner.nextInt();
        System.out.println("=================DANH SACH SINH VIEN BAN MUON TIM KIEM==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (Student a1 : a) {
            if (a1.getId() == b) {
                a1.xuat();
            }
        }
    }

    public static void thayDoi(Student a[], int n) {
        System.out.println("=================DANH SACH SINH VIEN SAU KHI THAY DOI ==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < n; i++) {
            a[i].x.setProvince(a[i].x.getProvince().replaceAll("ThanhHoa", "HaiPhong"));
            a[i].xuat();
        }
    }

    public static Student[] xoa(Student a[], int k) {
        Student []newSV = new Student[a.length-1];
        for(int i = 0; i < a.length-1; i++){
            newSV[i] = new Student();
        }

        for(int i = 0; i < k-1; i++){
            newSV[i] = a[i];
        }

        for(int i = k; i < a.length; i++){
            newSV[i-1] = a[i];
        }
        return newSV;
        
            
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhap n sinh vien:");
        int e = scanner.nextInt();
        Student a[] = new Student[e];
        for (int i = 0; i < e; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            scanner.nextLine();
            a[i] = new Student();
            a[i].nhap();
        }
                    
        int c;
        do {
            System.out.println("\n**********************************************************");
            
            System.out.println("1 Hien thi thong tin sinh vien");
            System.out.println("2 Tim kiem thong tin sinh vien");
            System.out.println("3 Thay doi Thong tin sinh vien muon chon");
            System.out.println("4 Xoa khoi chuong trinh ");
            System.out.println("5 Thoat!");
            System.out.println("**********************************************************");
            System.out.print("\nLuachon: ");
            c = scanner.nextInt();
            scanner.nextLine();

            switch (c) {
                 
                case 1:
                    xuat(a, e);
                    break;
                case 2:
                    timKiem(a, e);
                    break;
                case 3:
                    thayDoi(a, e);
                    break;
                case 4:
                    
                    System.out.print("Nhap id sv can xoa: ");
                    int id = scanner.nextInt();
                    
                    System.out.println("=================DANH SACH SINH VIEN SAU KHI XOA==================");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
                    for(int i = 0; i < e; i++){
                        
                        if(a[i].getId() == id){
                            
                            a = xoa(a,i);
                        }
                    }
                    
                    for (Student a1 :a){
                    a1.xuat();
                    }
                    break;
                    
            }

        } while (c != 5);
    }
    
}
