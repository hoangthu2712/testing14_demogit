import java.util.Scanner;

public class Testing14_continue_IV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //4 tính chất của lập trình hướng đối tượng: tính đóng gói, tính kế thừa, tính đa hình, tính trừu tượng
        //Tính đóng gói:
        student sv1 = new student("Nguyễn Thị Xuân", 20, "3NB07");
        sv1.getName();
        sv1.getAge();
        sv1.getLop();

        //Tính kế thừa:
        giamDoc gd1 = new giamDoc("Nguyễn Văn A", 40, "Nhân sự", "Giám đốc");
        gd1.thongTinNhanVien();
      //gd1.thongTinGiamDoc();
    }
}

        //TÍNH ĐÓNG GÓI: chỉ cho phép truy cập các thuộc tính của đối tượng thông qua các phương thức (Line 31-43), không gọi ra trực tiếp được.
        class student {
            //thuộc tính
            private String name;
            private int age;
            private String lop;

            //constructor
            public student(String name, int age, String lop) {
                this.name = name;
                this.age = age;
                this.lop = lop;
            }

            //tạo ra phương thức để truy cập vào thuộc tính
            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
            public String getLop() {
                return lop;
            }
        }

        //có 3 cách để gắn giá trị cho thuộc tính
        //1. Gắn trực tiếp vào trong class (nhưng thực tế không sử dụng)
        //2. Gắn trực tiếp khi tạo đối tượng (sử dụng constructor như ở line 24-29) (phổ biến nhất)
        //3. Gắn thông qua phương thức setter (sử dụng phương thức có giá trị trả về) (với cách này thì có bao nhiêu thuộc tính thì có bấy nhiêu setter nên không khuyến khích dùng do dài dòng.
        //Ví dụ:
//            public void setName(String name) {
//                this.name = name;
//            }
//            public void setAge(int age){
//                this.age = age;
//            }

        //TÍNH KẾ THỪA: cho phép tạo ra class mới (class con) từ class đã tồn tại (class cha) và kế thừa toàn bộ thuộc tính và phương thức của lớp cha,
        //có thể thêm các thuộc tính và phương thức mới của riêng class đó
        //tạo ra class nhanVien (class cha) và class giamDoc (class con)
        class nhanVien {
            //thuộc tính
            public String name;
            private int age;
            private String phongBan;

            //constructor
            public nhanVien(String name, int age, String phongBan) {
                this.name = name;
                this.age = age;
                this.phongBan = phongBan;
            }

            //phương thức
            public void thongTinNhanVien() {
                System.out.println("Đây là nhân viên");
            }

            public int getAge(){
                return age;
            }

        }

        class giamDoc extends nhanVien{ //class giamDoc có 3 thuộc tính giống với class nhanVien nên ta dùng extends để kế thừa thuộc tính, nên line 73-75 không cần khai báo nữa.
            //thuộc tính
//            public String name;
//            private int age;
//            private String phongBan;
              private String chucVu;

            //constructor
            public giamDoc(String name, int age, String phongBan, String chucVu){
                //super: dùng để gọi lại constructor của lớp cha là nhanVien, phải được đặt ở dòng đầu tiên của constructor của lớp con.
                super(name, age, phongBan);
                this.chucVu = chucVu;

            }

            //phương thức
//            public void thongTinGiamDoc(){
//                System.out.println("Đây là giám đốc");
//            }

            //sử dụng lại phương thức của lớp cha và ghi đè phương thức
            @Override //dùng để ghi đè
            public void thongTinNhanVien(){
                System.out.println("Đây là giám đốc");
            }
        }

        //TÍNH ĐA HÌNH: cho phép sử dụng một phương thức có cùng tên cùng tham số nhưng lại hoạt động với chức năng khác.
        //một hành động/ phương thức có nhiều cách thực hiện khác nhau
        //Ví dụ: line 102-107

        //TÍNH TRỪU TƯỢNG: chỉ cần khai báo các phương thức mà không cần triển khai chi tiết, việc triển khai sẽ để lớp con thực hiện.
        //Ví dụ: tính diện tích của một hình trong hình học
        abstract class hinhHoc{
            //thuộc tính
            public String tenHinh;
            public int canhA;
            public int canhB;

            //constructor
            public hinhHoc(String tenHinh, int canhA, int canhB){
                this.tenHinh = tenHinh;
                this.canhA = canhA;
                this.canhB = canhB;
            }

            //phương thức
            abstract public int tinhDienTich(); //phương thức trừu tượng

            class hinhChuNhat extends hinhHoc{
            //constructor
            public hinhChuNhat(String tenHinh, int canhA, int canhB){
                super(tenHinh, canhA, canhB);
            }

            //triển khai phương thức trừu tượng
            public int tinhDienTich(){
                return canhA * canhB;
            }
            }

            class hinhVuong extends hinhHoc{
            //constructor
            public hinhVuong(String tenHinh, int canhA, int canhB){
                super(tenHinh, canhA, canhB);
            }

            //triển khai phương thức trừu tượng
                public int tinhDienTich(){
                return canhA * canhB;
            }
            }
        }


