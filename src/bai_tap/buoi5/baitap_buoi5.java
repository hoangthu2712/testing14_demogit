package bai_tap.buoi5;

import java.util.Scanner;

public class baitap_buoi5 {
    public static void main(String[] args) {
        //bài tập quản lý sinh viên thông qua menu có 4 chức năng chính.
        //1. Thêm sinh viên
        //2. Xóa sinh viên dựa vào id
        //3. Hiển thị danh sách sinh viên
        //4. Tìm sinh viên theo ID
        //5. Thoát chương trình
        //mỗi sinh viên sẽ có các thuộc tính: id, name, age, address

        //1. Tạo class Sinh Viên với các thuộc tính: id, name, age, address

        //2. Tạo class Quản lý sinh viên để thực hiện các chức năng

        //3. Tạo menu để người dùng lựa chọn chức năng

        //tạo ra menu
        Scanner sc = new Scanner(System.in);
        quanLySinhVien qlsv = new quanLySinhVien();
        int choice; //choice: Nếu người dùng nhập vào số 1 thì hiểu là muốn Add, nếu nhập vào số 2 thì hiểu là muốn Xóa, tương tự với 3 4 5.
        do{
        System.out.println("===== QUẢN LÝ SINH VIÊN =====");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo ID");
        System.out.println("4. Xóa sinh viên theo ID");
        System.out.println("5. Thoát chương trình");
        System.out.println("=============================");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                qlsv.themSinhVien(sc);
                break;
            case 2:
                qlsv.hienThiDanhSachSinhVien();
                break;
            case 3:
                qlsv.timSinhVien(sc);
                break;
            case 4:
                qlsv.xoaSinhVien(sc);
                break;
            case 5:
                System.out.println("Thoát chương trình thành công!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
        }
        } while (choice != 5);
    }
}
