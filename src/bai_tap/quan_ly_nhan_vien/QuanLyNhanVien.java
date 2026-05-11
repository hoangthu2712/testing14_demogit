package bai_tap.quan_ly_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;

//dùng ArrayList để tạo list nhân viên
public class QuanLyNhanVien {
    Scanner sc = new Scanner(System.in);
    //thuộc tính
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
    //--> {nhanVien, nhanVien, nhanVien...}

    //1. Phương thức thêm nhân viên
    public void themNhanVien(Scanner sc) {
        System.out.println("Nhập ID nhân viên: ");
        String id = sc.nextLine();

        //kiểm tra ID đã tồn tại hay chưa
        //nếu khác null tức là đã tồn tại thì không cho add thêm
        if(timNhanVienTheoID(id) != null){
            System.out.println("ID đã tồn tại. Vui lòng nhập lại!");
            return; //dừng phương thức khi ID đã tồn tại
        }

        //nếu chưa tồn tại thì thêm mới
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương một giờ làm được: ");
        double salaryPerHours = sc.nextDouble();
        System.out.println("Nhập tổng số giờ làm được: ");
        double totalWorkingHours = sc.nextDouble();

        NhanVien nv = new NhanVien(id, name, age, address, salaryPerHours, totalWorkingHours);
        danhSachNhanVien.add(nv);

        System.out.println("Thêm nhân viên thành công!");
    }

    //2. Hiển thị danh sách nhân viên

    public void hienThiDanhSachNhanVien() {
        //Có 2 trường hợp sẽ xảy ra
        //1/ Nếu danh sách sinh viên rỗng thì hiển thị thông báo rỗng
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng");
            return; //dùng để dừng phương thức
        }
        for (NhanVien nv : danhSachNhanVien) {
            nv.displayInfo();
        }
    }

    //3. Xóa nhân viên theo ID
    public void xoaNhanVienTheoID(Scanner sc) {
        System.out.println("Nhập id của nhân viên cần xóa: ");
        String id = sc.nextLine();
        //đặt cờ hiệu là chưa tìm thấy = false
        boolean found = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                danhSachNhanVien.remove(nv);
                System.out.println("Xóa nhân viên thành công!");
                found = true; //đã tìm thấy nhân viên cần xóa
                break; //thoát khỏi vòng lặp sau khi đã xóa nhân viên
            }
        }
    }

    //4. Tìm kiếm nhân viên dựa vào ID
    public void timKiemNhanVienTuID(Scanner sc) {
        System.out.println("Nhập vào ID muốn tìm: ");
        String id = sc.nextLine();
        //đặt cờ hiệu là chưa tìm thấy
        boolean found = false;
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getId().equals(id)) {
                nv.displayInfo();
                found = true; //đã tìm thấy nhân viên cần tìm
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với id " + id);
        }
    }

    //tìm nhân viên theo id
    public NhanVien timNhanVienTheoID(String id){
        for (NhanVien nv : danhSachNhanVien){
            if(nv.getId().equals(id)){
                return nv;// trả về nhân viên nếu tìm thấy
            }
        }
        return null;//trả về null nếu không tìm thấy
    }

    //phương thức tìm nhân viên dựa vào id

    public void timNhanVien(Scanner sc){
        System.out.println("Nhập ID của nhân viên cần tìm: ");
        String id = sc.nextLine();
    }

    //5. Tìm nhân viên có tổng lương cao nhất
    public void timNhanVienCoTongLuongCaoNhat(){
        //kiểm tra rỗng
        if(danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }

        NhanVien nvMaxSalary = danhSachNhanVien.get(0); //tạo ra biến maxSalary để so sánh với từng thằng nv

        //nếu danh sách không rỗng ==> thực hiện tìm kiếm
        for(NhanVien nv : danhSachNhanVien){
            if(nv.calculateSalary() > nvMaxSalary.calculateSalary()){
                nvMaxSalary = nv;
            }
        }
        System.out.println("Nhân viên có tổng lương cao nhất:");
        nvMaxSalary.displayInfo();
    }

    //6. Tìm nhân viên có số giờ làm thấp nhất
    public void timNhanVienCoSoGioLamThapNhat(){
        //kiểm tra rỗng
        if(danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }

        NhanVien nvMinWorkingHours = danhSachNhanVien.get(0); //tạo ra biến maxSalary để so sánh với từng thằng nv

        //nếu danh sách không rỗng ==> thực hiện tìm kiếm
        for(NhanVien nv : danhSachNhanVien){
            if(nv.getTotalWorkingHours() < nvMinWorkingHours.getTotalWorkingHours()){
                nvMinWorkingHours = nv;
            }
        }
        System.out.println("Nhân viên có số giờ làm thấp nhất:");
        nvMinWorkingHours.displayInfo();
    }

    //7. Sắp xếp nhân viên theo tên
    public void sapXepNhanVienTheoTen(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }
        //sắp xếp theo tên
        //cú pháp SORT trên ArrayList: ArrayList.sort(phần tử 1, phần tử 2) -> {thực hiện logic so sánh giữa phần tử 1 và 2}
        //sort sẽ trả về -1 nếu phần tử 1 < phần tử 2
        //trả về 0 nếu phần tử 1 = phần tử 2
        //trả về 1 nếu phần tử 1 > phần tử 2
        danhSachNhanVien.sort((nv1, nv2) -> nv1.getName().compareTo(nv2.getName()));
        System.out.println("Danh sách nhân viên sắp xếp theo tên:");
        hienThiDanhSachNhanVien();
    }

    //8. Sắp xếp nhân viên theo số giờ làm
    public void sapXepNhanVienTheoSoGioLam(){
        //kiểm tra rỗng
        if (danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }
        //sắp xếp theo số giờ làm
        danhSachNhanVien.sort((nv1, nv2) -> Double.compare(nv1.getTotalWorkingHours(), nv2.getTotalWorkingHours()));
        System.out.println("Danh sách nhân viên sắp xếp theo số giờ làm:");
        hienThiDanhSachNhanVien();
    }

    //9. Cập nhật thông tin nhân viên
    public void capNhatThongTinNhanVien(Scanner sc){
        //kiểm tra rỗng
        if(danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }

        //tìm nhân viên cần cập nhật thông qua ID hoặc tên
        System.out.println("Nhập ID nhân viên cần cập nhật: ");
        String id = sc.nextLine();
        NhanVien nv = timNhanVienTheoID(id);
        //kiểm tra có tìm thấy nhân viên hay không
        if(nv == null){
            System.out.println("Không tìm thấy nhân viên có id " + id);
            return;
        }
        //nếu tìm thấy thì cập nhật thông tin
        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi mới: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập đia chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương theo giờ mới: ");
        Double salaryPerHours = sc.nextDouble();
        System.out.println("Nhập tổng số giờ làm mới: ");
        double totalWorkingHours = sc.nextDouble();

        //cập nhật thông tin bằng cách tạo ra một đối tượng nhân viên mới với thông tin mới cập nhật
        nv = new NhanVien(id, name, age, address, salaryPerHours, totalWorkingHours);

        //cập nhật lại thông tin nhân viên trong danh sách
        for(int i = 0; i < danhSachNhanVien.size(); i++){
            if (danhSachNhanVien.get(i).getId().equals(id)){
                danhSachNhanVien.set(i,nv);
                break;
            }
        }
        System.out.println("Cập nhật thông tin nhân viên thành công!");
    }

    //11. Hiển thị ra danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ
    public void hienThiListNhanVienCoTongSoGioLamLonHon120(){
        //kiểm tra rỗng
        if(danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ: ");

        //lưu ý: cần tạo ra một danh sách mới để lưu trữ riêng những nhân viên có số giờ làm > 120 giờ,
        //nếu dùng chung list danhSachNhanVien cũ thì list cũ sẽ bị ảnh hưởng và khả năng kết quả không chính xác

        ArrayList<NhanVien> listNhanVienCoSoGioLamLonHon120 = new ArrayList<>();
        for(NhanVien nv : danhSachNhanVien){
            if(nv.getTotalWorkingHours() > 120){
                listNhanVienCoSoGioLamLonHon120.add(nv);
            }
        }

        //duyệt mảng mới để hiển thị ra nhân viên đạt yêu cầu đề bài (số giờ làm > 120)
        if(listNhanVienCoSoGioLamLonHon120.isEmpty()){
            System.out.println("Không có nhân viên nào có tổng số giờ làm lớn hơn 120 giờ");
        } else {
            for (NhanVien nv : listNhanVienCoSoGioLamLonHon120){
                nv.displayInfo();
            }
        }
    }

    //12. Hiển thị ra danh sách nhân viên có tổng số giờ làm nhỏ hơn 80 giờ
    public void hienThiListNhanVienCoTongSoGioLamNhoHon80(){
        //kiểm tra rỗng
        if(danhSachNhanVien.isEmpty()){
            System.out.println("Danh sách nhân viên rỗng!");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm nhỏ hơn 80 giờ: ");

        //lưu ý: cần tạo ra một danh sách mới để lưu trữ riêng những nhân viên có số giờ làm < 80 giờ,
        //nếu dùng chung list danhSachNhanVien cũ thì list cũ sẽ bị ảnh hưởng và khả năng kết quả không chính xác

        ArrayList<NhanVien> listNhanVienCoSoGioLamNhoHon80 = new ArrayList<>();
        for(NhanVien nv : danhSachNhanVien){
            if(nv.getTotalWorkingHours() < 80){
                listNhanVienCoSoGioLamNhoHon80.add(nv);
            }
        }

        //duyệt mảng mới để hiển thị ra nhân viên đạt yêu cầu đề bài (số giờ làm < 80>)
        if(listNhanVienCoSoGioLamNhoHon80.isEmpty()){
            System.out.println("Không có nhân viên nào có tổng số giờ làm nhỏ hơn 80 giờ");
        } else {
            for (NhanVien nv : listNhanVienCoSoGioLamNhoHon80){
                nv.displayInfo();
            }
        }
    }
}
