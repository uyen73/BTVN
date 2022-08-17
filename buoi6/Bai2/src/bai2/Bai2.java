
package bai2;

import java.util.Scanner;


public class Bai2 {

    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerVehicle managerVehicle = new ManagerVehicle();
        while (true) {
            
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Nhập thông tin và tạo danh sách các xe ");
            System.out.println("Enter 2: Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("Enter 3: Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
            System.out.println("Enter 4: Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần");
            System.out.println("Enter 5: Dừng chương trình");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Nhap so luong Xe may:");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin xe thu " + (i + 1));
                        System.out.print("Nhập tên chủ xe: ");
                        String chuXe = scanner.nextLine();
                        System.out.print("Nhập loại xe: ");
                        int maXe = scanner.nextInt();
                        System.out.print("Nhập dung tích xe: ");
                        int dungTich = scanner.nextInt();
                        System.out.print("Nhập trị giá xe: ");
                        int triGia = scanner.nextInt();
                        scanner.nextLine();
                        Vehicle vehicle = new Vehicle(chuXe, maXe, dungTich, triGia);
                        managerVehicle.addVehicle(vehicle);
                    }
                }
                break;

                case "2": {
                    System.out.println("=====DANH SACH CAC LOAI XE=====:");
                    System.out.printf("%5s %10s %10s %10s %10s\n", "Tên CX", "Loại xe", "Dung tích", "Trị giá", "Thuế");
                    managerVehicle.showListInforVehicle();
                    break;
                }
                case "3": {
                    System.out.println("=====DANH SACH CAC LOAI XE SAP XEP GIAM DAN=====:");
                    System.out.printf("%5s %10s %10s %10s %10s\n", "Tên CX", "Loại xe", "Dung tích", "Trị giá", "Thuế");
                    managerVehicle.sortGiam();
                    break;
                }
                case "4": {
                    System.out.println("=====DANH SACH CAC LOAI XE SAP XEP TANG DAN=====:");
                    System.out.printf("%5s %10s %10s %10s %10s\n", "Tên CX", "Loại xe", "Dung tích", "Trị giá", "Thuế");
                    managerVehicle.sortTang();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
