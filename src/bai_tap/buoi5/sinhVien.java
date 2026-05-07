package bai_tap.buoi5;

import java.util.Scanner;

public class sinhVien {
    Scanner sc = new Scanner(System.in);
    //thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double score;

    //constructor mặc định không truyền tham số
    public sinhVien(){}

    //constructor
    public sinhVien(String id, String name, int age, String address, double score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    //phương thức
    //phương thức input để có thể nhập vào thông tin sinh viên
    public void input(Scanner sc){
        System.out.println("Nhập id: ");
        this.id = sc.nextLine();
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = sc.nextInt();
        sc.nextLine(); //để ngắt xuống dòng
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập điểm: ");
        this.score = sc.nextDouble();
        sc.nextLine();
    }

    //phương thức display để hiển thị thông tin sinh viên
    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Score: " + score);
    }

    //phương thức getID để lấy id sinh viên (lấy ra để delete hoặc search)
    public String getId(){
        return id;
    }
}
