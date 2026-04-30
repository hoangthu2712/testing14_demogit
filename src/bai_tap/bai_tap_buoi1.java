package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi1 {
    public static void main(String[] args) {
        //bài 1: tính điểm trung bình của học sinh, cho phép nhập vào họ tên, điểm toán lý hóa, sau đó in ra thông tin của học sinhh đó.
        //sử dụng scanner, tính toán , system.out.println để in thông tin.

        //Hướng giải quyết 1 bài toán là sử dụng mô hình IPO (Input: dữ liệu đầu vào, Process: xử lý logic để đạt được Output, Output: kết quả mong muốn)

        //input: họ tên, điểm toán lý hóa
          Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập họ tên học sinh: ");
//        String hoTen = sc.nextLine();
//        System.out.println("Nhập điểm Toán: ");
//        double diemToan = sc.nextDouble();
//        System.out.println("Nhập điểm Lý: ");
//        double diemLy = sc.nextDouble();
//        System.out.println("Nhập điểm Hóa: ");
//        double diemHoa = sc.nextDouble();
//
//        //process: tính điểm trung bình
//        double diemTB = (diemToan + diemLy + diemHoa) / 3;
//
//        //output:
//        System.out.println("Học sinh " + hoTen + " có điểm trung bình 3 môn Toán, Lý. Hóa là " + diemTB);

        //bài 2: tính lương nhân viên, cho phép nhập vào họ tên, lương cơ bản, số ngày làm việc. Sau đó in ra thông tin của nhân viên đó.
        //input
        System.out.println("Nhập họ tên nhân viên:");
        String tenNhanVien = sc.nextLine();
        System.out.println("Nhập lương cơ bản 1 ngày: ");
        double luongCoBan = sc.nextDouble();
        System.out.println("Nhập số ngày làm việc:");
        double soNgayLamViec = sc.nextDouble();

        //Process
        double tongLuong = luongCoBan * soNgayLamViec;

        //output:
        System.out.println("Nhân viên " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
        System.out.println("Lương một tháng: " + tongLuong);
    }
}
