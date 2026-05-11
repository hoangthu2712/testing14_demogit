package bai_tap.quan_ly_nhan_vien;

import java.util.Scanner;
    //đóng gói nhân viên
public class NhanVien {
//    thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double salaryPerHours;
    private double totalWorkingHours;

    //constructor
    public NhanVien(String id, String name, int age, String address, double salaryPerHours, double totalWorkingHours){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerHours = salaryPerHours;
        this.totalWorkingHours = totalWorkingHours;
    }

    //phương thức display để hiển thị thông tin nhân viên
    public double calculateSalary(){
        return salaryPerHours * totalWorkingHours;
    }
    public void displayInfo() { //vì đang dùng tính ĐÓNG GÓI nên không thể gọi trực tiếp nhanVien.id mà phải tạo phương thức displayInfo.
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Lương một giờ: " + salaryPerHours +
                " | Tổng số giờ làm được: " + totalWorkingHours +
                " | Tổng lương: " + calculateSalary());
    }

    //phương thức getID để lấy id nhân viên (lấy ra để delete, search...)
    public String getId(){
        return id;
    }

    //phương thức get totalWorkingHours
    public double getTotalWorkingHours(){
        return totalWorkingHours;
    }

    public String getName(){
        return name;
    }
}
