package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi2a {
    public static void main(String[] args) {
        //bài tập 1: kiểm tra sinh viên có qua môn học hay không với điều kiện là điểm >= 5.0 và không được nghỉ quá 3 buổi

        //input: điểm trung bình, số buổi nghỉ
          Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập điểm trung bình:");
//        double dtb = sc.nextDouble();
//        System.out.println("Số buổi nghỉ:");
//        int soBuoiNghi = sc.nextInt();
//
//        //process: kiểm tra điều kiện
//        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
//
//        //output: in ra kết quả sinh viên có qua môn hay không
//        System.out.println("Kết quả sinh viên có qua môn không? " + isQuaMon);


        //bài tập 2: kiểm tra xem khách hàng có được giảm giá hay không
        //điều kiện là sinh viên hoặc có tổng đơn hàng >= 500.000

        //input
//        System.out.println("Bạn có phải là sinh viên không? ");
//        Boolean isSinhVien = sc.nextBoolean(); //để nhập true/false
//        System.out.println("Nhập tổng hóa đơn:");
//        int tongHoaDon = sc.nextInt();
//
//        //process
//        Boolean isGiamGia = isSinhVien || tongHoaDon >= 500000;
//
//        //output
//        System.out.println("Khách hàng có được giảm giá không? " + isGiamGia);

        //bài tập 3: xếp loại học sinh dựa trên điểm trung bình
        //đtb < 5.0: học sinh yếu
        //5.0 <= đtb <= 7.0: học sinh trung bình
        //7.0 <= đtb <= 8.5: học sinh khá
        //8.5 <= đtb <= 10: học sinh giỏi
        //cho nhập điểm 3 môn: toán, văn, anh và họ tên

        //input: nhập thông tin họ tên và điểm 3 môn Toán, Văn, Anh
//        System.out.println("Nhập họ và tên học sinh:");
//        String hoTen = sc.nextLine();
//        System.out.println("Nhập điểm toán:");
//        double diemToan = sc.nextDouble();
//        System.out.println("Nhập điểm văn:");
//        double diemVan = sc.nextDouble();
//        System.out.println("Nhập điểm Anh:");
//        double diemAnh = sc.nextDouble();
//
//        //process:
//        double dtb = (diemToan + diemVan + diemAnh) / 3;
//        String xepLoai = "";
//
//        if(dtb < 5.0){
//            xepLoai = "Yếu";
//        }
//        else if(dtb >= 5.0 && dtb <= 7.0 ){
//            xepLoai = "Trung Bình";
//        } else if(dtb >= 7.0 && dtb <= 8.5){
//            xepLoai = "Khá";
//        } else if (dtb >= 8.5 && dtb <= 10){
//            xepLoai = "Giỏi";
//        } else {
//            xepLoai = "Điểm không hợp lệ - Vui lòng nhập lại";
//        }
//        //output:
//        System.out.println("Học sinh có tên " + hoTen + " có xếp loại là " + xepLoai);


        //bài tập 4: tính tiền điện
        //điều kiện: nếu số điện tiêu thụ <= 50 thì giá điện là 1000đ/kw
        //nếu số điện tiêu thụ <= 100 thì giá điện là 1200đ/kw
        //nếu số điện tiêu thụ > 100 thì giá điện là 1500đ/kw

        //input số điện tiêu thụ
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Nhập số điện tiêu thụ: ");
//          int soDienTieuThu = sc.nextInt();
//
//        //process
//          int tongTien = 0;
//
//          if(soDienTieuThu <= 50){
//            tongTien = soDienTieuThu * 1000;
//          }
//          else if (soDienTieuThu <= 100) {
//              tongTien = soDienTieuThu * 1200;
//          }
//            else if(soDienTieuThu > 100) {
//              tongTien = soDienTieuThu * 1500;
//          }
//            else {
//                System.out.println("Số điện tiêu thụ không hợp lệ - Hãy nhập lại");
//          }

            //output
   //     System.out.println("Tổng số tiền phải trả: " + tongTien + "đ");

        //bài tập 5: tính tiền taxi
        //điều kiện: km đầu tiên là 20.000
        //km tiếp theo từ 2-5km là 15.000/km
        //km tiếp theo từ 5-10km là 12.000/km
        //km tiếp theo > 16km là 10.000/km

        //input
        System.out.println("Nhập số km đã đi: ");
        float soKm = sc.nextFloat();

        //process
        float tongTienTaxi = 0;

        if(soKm <= 1){
            tongTienTaxi = 20000;
        } else if (soKm > 1 && soKm <= 5) {
            tongTienTaxi = 20000 + (soKm - 1) * 15000;
        } else if (soKm > 5 && soKm <= 10) {
            tongTienTaxi = 20000 + 4 * 15000 + (soKm - 5) * 12000;
        } else if (soKm > 10) {
            tongTienTaxi = 20000 + 4 * 15000 + 5 * 12000 + (soKm - 10) * 10000;
        } else {
            System.out.println("Số Km không hợp lệ - Vui lòng nhập lại");
        }

        //output
        System.out.println("Số tiền taxi phải trả: " + tongTienTaxi + "đ");
        }
    }

