package bai_tap.buoi5;

import java.util.ArrayList;
import java.util.Scanner;

//sinh viên = {id, name, age, address, score} --> dùng ArrayList vì không có giới hạn về số lướng sinh viên
public class quanLySinhVien {
    Scanner sc = new Scanner(System.in);
    //thuộc tính
    private ArrayList<sinhVien> danhSachSinhVien = new ArrayList<>();

    //phương thức thêm sinh viên
    public void themSinhVien(Scanner sc){
        //tạo ra đối tượng sinh viên từ class Sinh viên
        sinhVien sv = new sinhVien();
        //gọi phương thức input để nhận thông tin sinh viên
        sv.input(sc);
        //thêm sinh viên vào danh sách
        danhSachSinhVien.add(sv);
        System.out.println("Thêm sinh viên thành công!");
    }

    //phương thức hiển thị danh sách sinh viên
    public void hienThiDanhSachSinhVien(){
        //Có 2 trường hợp sẽ xảy ra
        //1. Nếu danh sách sinh viên rỗng thì hiển thị thông báo rỗng
        if (danhSachSinhVien.isEmpty()){
            System.out.println("Danh sách sinh viên rỗng!");
        } else {
        //2. Nếu danh sách sinh viên không rỗng thì DUYỆT MẢNG để hiển thị danh sách sinh viên
            for(sinhVien sv : danhSachSinhVien){
                sv.display();
            }
        }
    }

    //phương thức xóa sinh viên dựa vào id
    public void xoaSinhVien(Scanner sc){
        System.out.println("Nhập id của sinh viên cần xóa: ");
        String id = sc.nextLine();
        //giải quyết bài toán theo phương pháp đặt cờ hiệu
        boolean found = false; //chưa tìm thấy sinh viên cần xóa
        for(sinhVien sv : danhSachSinhVien){
            if(sv.getId().equals(id)){
                danhSachSinhVien.remove(sv);
                System.out.println("Xóa sinh viên thành công!");
                found = true; //đã tìm thấy sinh viên cần xóa
                break; //thoát khỏi vòng lặp sau khi đã xóa sinh viên
            }
        }

        if(!found){ //dấu ! nghĩa là PHỦ ĐỊNH
            System.out.println("Không tìm thấy sinh viên với id " + id);
        }
    }

    //phương thức tìm sinh viên dựa vào id
    public void timSinhVien(Scanner sc){
        System.out.println("Nhập ID của sinh viên cần tìm: ");
        String id = sc.nextLine();

        boolean found = false;
        for(sinhVien sv : danhSachSinhVien){
            if(sv.getId().equals(id)){
                System.out.println("Thông tin sinh viên cần tìm: ");
                sv.display();
                found = true; //đã tìm thấy sinh viên cần tìm
                break; //thoát khỏi vòng lặp sau khi đã tìm thấy sinh viên
            }
        }
    }
}


