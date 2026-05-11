package bai_tap.buoi5.quan_ly_nhan_vien;

import bai_tap.quan_ly_nhan_vien.QuanLyNhanVien;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //bài tập quản lý nhân viên với menu
        //1. Thêm nhân viên
        //2. Hiển thị danh sách nhân viên
        //3. Xóa nhân viên dựa trên ID
        //4. Tìm kiếm nhân viên dựa trên ID
        //5. Tìm nhân viên có tổng lương cao nhất
        //6. Tìm nhân viên có số giờ làm thấp nhất
        //7. Sắp xếp nhân viên theo tên
        //8. Sắp xếp nhân viên theo số giờ làm
        //9. Cập nhật thông tin nhân viên dựa trên ID
        //10. Cập nhất số giờ làm của nhân viên dựa vào ID
        //11. Hiển thị ra danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ
        //12. Hiển thị ra danh sách nhân viên có tổng số giờ làm nhỏ hơn 80 giờ
        //13. Thoát khỏi chương trình
        //nhân viên có các giá trị: {id, name, age, address, salaryPerHours, totalWorkingHours}

        //tạo ra menu
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        int choice;
        do {
            System.out.println("===== MENU QUẢN LÝ NHÂN VIÊN =====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Xóa nhân viên theo ID");
            System.out.println("4. Tìm nhân viên theo ID");
            System.out.println("5. Tìm nhân viên có tổng lương cao nhất");
            System.out.println("6. Tìm nhân viên có số giờ làm thấp nhất");
            System.out.println("7. Sắp xếp nhân viên theo tên");
            System.out.println("8. Sắp xếp nhân viên theo số giờ làm");
            System.out.println("9. Cập nhật thông tin nhân viên");
            System.out.println("10. Cập nhật số giờ làm của nhân viên thông qua ID");
            System.out.println("11. Hiển thị ra danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ");
            System.out.println("12. Hiển thị ra danh sách nhân viên có tổng số giờ làm nhỏ hơn 80 giờ");
            System.out.println("13. Thoát chương trình");
            System.out.println("=============================");
            System.out.println("Vui lòng chọn chức năng: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    qlnv.themNhanVien(sc);
                    break;
                case 2:
                    qlnv.hienThiDanhSachNhanVien();
                    break;
                case 3:
                    qlnv.xoaNhanVienTheoID(sc);
                    break;
                case 4:
                    qlnv.timKiemNhanVienTuID(sc);
                    break;
                case 5:
                    qlnv.timNhanVienCoTongLuongCaoNhat();
                    break;
                case 6:
                    qlnv.timNhanVienCoSoGioLamThapNhat();
                    break;
                case 7:
                    qlnv.sapXepNhanVienTheoTen();
                    break;
                case 8:
                    qlnv.sapXepNhanVienTheoSoGioLam();
                    break;
                case 9:
                    qlnv.capNhatThongTinNhanVien(sc);
                    break;
//                case 10:  giống case 9
                case 11:
                    qlnv.hienThiListNhanVienCoTongSoGioLamLonHon120();
                    break;
                case 12:
                    qlnv.hienThiListNhanVienCoTongSoGioLamNhoHon80();
                    break;
                case 13:
                    System.out.println("Thoát chương trình thành công!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (choice != 13);
    }
}
