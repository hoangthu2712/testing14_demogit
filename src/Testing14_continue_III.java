import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Testing14_continue_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //OBJECT và CLASS
        //CLASS: là khuôn mẫu để tạo ra các đối tượng, class định nghĩa các thuộc tính và phương thức dùng chung của đối tượng.
        //OBJECT: là một thực thể được tạo ra từ CLASS, nó có các thuộc tính và phương thức được định nghĩa bên trong CLASS.
        //từ một CLASS duy nhất có thể tạo ra nhiều OBJECT
        //CLASS là bản thiết kế ngôi nhà, OBJECT là ngôi nhà được xây dựng từ bản thiết kế đó.

        //Ví dụ: tạo ra class SINH VIÊN có tên, tuổi, điểm Toán, điểm Lý, điểm Hóa, điểm trung bình, xếp loại
        //tạo đối tượng SINH VIÊN từ class sinhVien
        //cú pháp: tenClass tenDoiTuong = new tenClass(giá trị thuộc tính);
        sinhVien sv1 = new sinhVien("Nguyễn Văn A", 20, 8.5, 7, 6);
        sinhVien sv2 = new sinhVien("Trần Thị B", 21, 8, 7.5, 7);

        //truy cập vào các thuộc tính và phương thức của đối tượng
        double diemTrungBinh1 = sv1.tinhDiemTrungBinh();
        sv1.xepLoai();
        System.out.println("Điểm trung bình của " + sv1.ten + " là: " + diemTrungBinh1);
        //System.out.println("Tuổi của " + "sv2.ten" + " : " + sv2.tuoi); //Vì thuộc tính tuổi đang private nên không cho phép truy cập trực tiếp từ bên ngoài class
    }
}

        //PHẠM VI TRUY CẬP (PUBLIC, PRIVATE, READONLY)
        //PUBLIC: cho phép truy cập từ bất kỳ đâu trong chương trình,
        //đồng nghĩa với việc có thể read, update, delete giá trị bên trong thuộc tính
        //PRIVATE: chỉ cho phép truy cập từ bên trong class (tức là truy cập thông qua các phương thức)
        //READONLY: chỉ cho phép truy cập từ bên trong class (truy cập thông qua các phương thức), và không cho phép update/delete giá trị bên trong thuộc tính

        class sinhVien {
            //thuộc tính
            public String ten;
            private int tuoi;
            private double diemToan;
            private double diemLy;
            private double diemHoa;

            //constructor: là một phương thức do Java định nghĩa dùng để khởi tạo các lớp đối tượng, nó có cùng tên với class
            //nhiệm vụ của constructor là khi user nhập giá trị vào thì constructor sẽ gắn các giá trị đó vào thuộc tính. Ví dụ:
            public sinhVien(String ten, int tuoi, double diemToan, double diemLy, double diemHoa){
                this.ten = ten;
                this.tuoi = tuoi;
                this.diemToan = diemToan;
                this.diemLy = diemLy;
                this.diemHoa = diemHoa;
            }
            //phương thức
            //TẠO HÀM (hay tạo phương thức) CÓ giá trị trả về hoặc KHÔNG CÓ giá trị trả về (void)
            //CÓ giá trị trả về:
            //cú pháp: public kiểu dữ liệu trả về tenPhuongThuc(){logic sử dụng các thuộc tính của đối tượng; return giá trị;}
            //KHÔNG CÓ giá trị trả về:
            //cú pháp: public void tenPhuongThuc(){logic sử dụng các thuộc tính của đối tượng;}

            //tính điểm trung bình: sử dụng phương thức có giá trị trả về
            public double tinhDiemTrungBinh(){ //tạo phương thức tinhDiemTrungBinh
                double diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
                return diemTrungBinh;
            }

            //xếp loại: sử dụng phương thức tạo hàm không có giá trị trả về
            public void xepLoai(){
                double diemTrungBinh = tinhDiemTrungBinh();
                if(diemTrungBinh >= 8){
                    System.out.println("Học sinh đạt loại giỏi");
                } else if (diemTrungBinh >= 6.5) {
                    System.out.println("Học sinh đạt loại khá");
                } else if (diemTrungBinh >= 5) {
                    System.out.println("Học sinh đạt loại trung bình");
                } else {
                    System.out.println("Học sinh đạt loại yếu");
                }
            }
        }
