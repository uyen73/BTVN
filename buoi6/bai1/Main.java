package bai1;
import java.util.Scanner;

public class Main {
    public static int n;
    public static String id;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 cán bộ vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các cán bộ");
            System.out.println("Enter 3: Xóa 1 cán bộ theo id");
            System.out.println("Enter 4: Tìm kiếm 1 cán bộ theo id");
            System.out.println("Enter 5: Dừng chương trình");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Nhap thong tin Enginner");
                    System.out.println("Enter b: Nhap thong tin Worker");
                    System.out.println("Enter c: Nhap thong tin Staff");
                    System.out.print("Nhap lua chon cua ban:");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap so luong Enginner:");
                            n = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nhap thong tin Enginner thu " + (i + 1));
                                do {
                                    System.out.print("Enter ID: ");
                                    id = scanner.nextLine();
                                    if (managerOfficer.checkiD(id) == false) {
                                        System.out.println("Nhap dung!");
                                    } else {
                                        System.out.println("Id da ton tai, nhap lai di!");
                                    }
                                }
                                while (managerOfficer.checkiD(id) == true);
                                System.out.print("Enter ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Enter tuoi:");
                                int tuoi = scanner.nextInt();
                                System.out.print("Enter gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Enter dia chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Enter nghanh dao tao: ");
                                String nghanhDT = scanner.nextLine();
                                Officer engineer = new Engineer(id, ten, tuoi, gioiTinh, diaChi, nghanhDT);
                                managerOfficer.addOfficer(engineer);
                                System.out.println(engineer.toString());
                            }
                            break;

                        }
                        case "b": {
                            System.out.print("Nhap so luong Worker:");
                            n = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nhap thong tin Worker thu " + (i + 1));
                                do {
                                    System.out.print("Enter ID: ");
                                    id = scanner.nextLine();
                                    if (managerOfficer.checkiD(id) == false) {
                                        System.out.println("Nhap dung!");
                                    } else {
                                        System.out.println("Id da ton tai, nhap lai di!");
                                    }
                                }
                                while (managerOfficer.checkiD(id) == true);
                                System.out.print("Enter ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Enter tuoi:");
                                int tuoi = scanner.nextInt();
                                System.out.print("Enter gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Enter dia chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Enter bac: ");
                                int level = scanner.nextInt();
                                scanner.nextLine();
                                Officer worker = new Worker(id, ten, tuoi, gioiTinh, diaChi, level);
                                managerOfficer.addOfficer(worker);
                                System.out.println(worker.toString());
                            }
                            break;

                        }
                        case "c": {
                            System.out.print("Nhap so luong Staff:");
                            n = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < n; i++) {
                                System.out.println("Nhap thong tin Staff thu " + (i + 1));
                                do {
                                    System.out.print("Enter ID: ");
                                    id = scanner.nextLine();
                                    if (managerOfficer.checkiD(id) == false) {
                                        System.out.println("Khong trung!");
                                    } else {
                                        System.out.println("Id da ton tai, nhap lai!");
                                    }
                                }
                                while (managerOfficer.checkiD(id) == true);
                                System.out.print("Enter ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Enter tuoi:");
                                int tuoi = scanner.nextInt();
                                System.out.print("Enter gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Enter dia chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Enter cong viec: ");
                                String task = scanner.nextLine();
                                Officer staff = new Staff(id, ten, tuoi, gioiTinh, diaChi, task);
                                managerOfficer.addOfficer(staff);
                                System.out.println(staff.toString());
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }

                case "2": {
                    System.out.println("DANH SACH CAC CAN BO:");
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "3": {
                    System.out.print("Id can xoa: ");
                    String id = scanner.nextLine();
                    System.out.println(managerOfficer.deleteOfficer(id) ? " Xoa Thanh Cong!" : "That bai, khong co id ban muon xoa!");
                    System.out.println("DANH SACH SAU KHI THUC HIEN:");
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    System.out.print("Enter id can tim: ");
                    String id = scanner.nextLine();
                    if (managerOfficer.checkTimKiem(id) == true) {
                        managerOfficer.searchOfficerByID(id).forEach(officer -> {
                            System.out.println(officer.toString());
                        });
                    } else {
                        System.out.println("Khong co id ban can tim!");
                    }
                    break;
                }
                
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}