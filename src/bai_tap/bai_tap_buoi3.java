package bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai_tap_buoi3 {
    public static void main(String[] args) {
//        //bài tập 1: quản lý chi tiết cá nhân trong 7 ngày. Cho phép người dùng nhập vào
//        //chi tiêu cá nhân trong 7 ngày, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
//        //chi tiêu cao nhất và thấp nhất trong 7 ngày.
          //Hint: tìm min max trong mảng bằng cách lấy từng phần tử ra rồi so sánh với những phần tử còn lại cho đến khi nào thỏa mãn đó là số min/max

//        Scanner sc = new Scanner(System.in);
//        double[] chiTieu = new double[7];
//
//        for (int i = 0; i < chiTieu.length; i++) {
//            System.out.println("Nhập vào chi tiêu ngày " + (i + 1) + ": ");
//            chiTieu[i] = sc.nextDouble();
//        }
//
//        double tongChiTieu = 0;
//        double chiTieuTrungBinh = 0;
//        double chiTieuCaoNhat = chiTieu[0]; //dùng để tìm max
//        double chiTieuThapNhat = chiTieu[0]; //dùng để tìm min
//
//        for(double chi : chiTieu){
//            tongChiTieu += chi; //tongChiTieu = tongChiTieu + chi;
//            if(chi > chiTieuCaoNhat){
//                chiTieuCaoNhat = chi;
//            }
//            if(chi < chiTieuThapNhat){
//                chiTieuThapNhat = chi;
//            }
//        }
//        chiTieuTrungBinh = tongChiTieu / chiTieu.length;
//        System.out.println("Tổng chi tiêu của 7 ngày: " + tongChiTieu);
//        System.out.println("Trung bình chi tiêu mỗi ngày: " + chiTieuTrungBinh);
//        System.out.println("Chi tiêu cao nhất trong 7 ngày: " + chiTieuCaoNhat);
//        System.out.println("Chi tiêu thấp nhất trong 7 ngày: " + chiTieuThapNhat);

        //Cách khác để tìm min max
//       for(int i = 0; i < chiTieu.length; i++){
//           if(chiTieu[i] > chiTieuCaoNhat){
//               chiTieuCaoNhat = chiTieu[i];
//           }
//           if(chiTieu[i] < chiTieuThapNhat){
//                chiTieuThapNhat = chiTieu[i];

        //bài tập 2:  quản lý điền số của học sinh trong 5 môn học. Cho phép người dùng nhập vào
        //điểm số của học sinh trong 5 môn học, sau đó in ra điểm trung bình, điểm cao nhất và thấp nhất
        //và số môn học có điểm số >= 5.0

        Scanner sc = new Scanner(System.in);
//        double[] mangDiem = new double[5];
//        for(int i = 0; i < mangDiem.length; i++){
//            System.out.println("Nhập vào điểm môn " + (i + 1) + ": ");
//            mangDiem[i] = sc.nextDouble();
//        }
//
//        double tongDiem = 0;
//        double diemTrungBinh = 0;
//        double diemCaoNhat = mangDiem[0];
//        double diemThapNhat = mangDiem[0];
//        int soMonLonHonBang5 = 0;
//
//        for(double diem : mangDiem){
//            tongDiem += diem;
//            if(diem > diemCaoNhat){
//               diemCaoNhat = diem;
//           }
//            if(diem < diemThapNhat){
//                diemThapNhat = diem;
//            }
//            if(diem >= 5){
//                soMonLonHonBang5++;
//            }
//        }
//        diemTrungBinh = tongDiem / mangDiem.length;
//        System.out.println("Điểm trung bình 5 môn: " + diemTrungBinh);
//        System.out.println("Điểm cao nhất: " + diemCaoNhat);
//        System.out.println("Điểm thấp nhất: " + diemThapNhat);
//        System.out.println("Số môn có điểm lớn hơn hoặc bằng 5: " + soMonLonHonBang5);

        //Cách 2:
//        for(int i = 0; i < mangDiem.length; i++){
//            if(mangDiem[i] > diemCaoNhat){
//                diemCaoNhat = mangDiem[i];
//            }
//            if(mangDiem[i] < diemThapNhat){
//                diemThapNhat = mangDiem[i];
//            }
//        }


        //bài tập 3: quản lý thông tin của nhân viên, cho phép người dùng nhập thông tin nhân viên
        //số giờ làm mỗi ngày trong 1 tuần, sau đó in ra tổng số giờ làm trong tuần, trung bình số giờ làm trong tuần,
        //số ngày làm việc có số giờ làm >= 8 giờ

        double[] mangGio = new double[7];
        for(int i = 0; i < mangGio.length; i++){
            System.out.println("Nhập vào số giờ làm của ngày " + (i + 1) + ": ");
            mangGio[i] = sc.nextDouble();
            }

        int tongGio = 0;
        double gioTrungBinh = 0;
        int soGioLamLonHonBang8 = 0;

        for(double gio : mangGio){
            tongGio += gio;
            if(gio >= 8){
                soGioLamLonHonBang8++;
            }
        }

        gioTrungBinh = (double) tongGio / mangGio.length; // (double) -> kiểu dữ liệu của tongGio đang là int, cần ép kiểu để int thành double
        //Tại line 186 đang gán tạm biến = 0, nhưng ta có thể viết gộp với line 116 như sau:
        // double gioTrungBinh = (double) tongGio / mangGio.length;

        System.out.println("Tổng số giờ làm trong tuần: " + tongGio);
        System.out.println("Số giờ trung bình làm trong một tuần: " + gioTrungBinh);
        System.out.println("Số ngày làm hơn hoặc bằng 8 tiếng: " + soGioLamLonHonBang8);
        }
    }









//    }
