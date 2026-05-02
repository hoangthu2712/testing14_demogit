import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Testing14_continue_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arraylist: là một cấu trúc dữ liệu động, có thể thay đổi kích thước trong quá trình thực thi chương trình
        //cú pháp: Arraylist<kiểu dữ liệu> tenArrayList = new ArrayList<>();

        //ví dụ: mảng điện thoại: iphone, samsung, xiaomi, oppo, realme
        ArrayList <String> mangDienThoai = new ArrayList<>();

        //CRUD cho arraylist (CRUD = Create, Read, Update, Delete)
        //thêm phần tử vào ArrayList: sử dụng phương thức add()
        //cú pháp: tenArrayList.add(giá trị);
        mangDienThoai.add("iphone"); //mangDienThoai = ["iphone"]
        mangDienThoai.add("samsung"); //mangDienThoai = ["iphone", "samsung"]
        mangDienThoai.add("xiaomi"); //mangDienThoai = ["iphone", "samsung", "xiaomi"]
        mangDienThoai.add("oppo"); //mangDienThoai = ["iphone", "samsung", "xiaomi", "oppo"]
        mangDienThoai.add("realme"); //mangDienThoai = ["iphone", "samsung", "xiaomi", "oppo", "realme"]
        //=> Cách trên là không chỉ định vị trí cho phần tử nên phần tử được add vào luôn nằm ở vị trí cuối cùng trong mảng
        //Có thể chỉ định vị trí cụ thể cho phần tử bằng phương thức add(index, giá trị)
        mangDienThoai.add(1, "nokia"); //mangDienThoai = ["iphone", "nokia", "samsung", "xiaomi", "oppo", "realme"]

        System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);

        //update giá trị trong mảng bằng phương thức set(index, giá trị)
        mangDienThoai.set(3, "hwahei"); ////mangDienThoai = ["iphone", "nokia", "samsung", "hwahei", "oppo", "realme"]

        System.out.println("Giá trị của mảng điện thoại: " + mangDienThoai);

        //duyệt mảng:
        for(String dienThoai : mangDienThoai){
            System.out.println("Tên điện thoại: " + dienThoai);
        }

        //đếm số lượng phần tử có trong mảng bằng phương thức size()
        System.out.println("Số lượng phần tử trong mảng: " + mangDienThoai.size());
        //hoặc:
        int soLuong = mangDienThoai.size();
        System.out.println("Số lượng phần tử trong mảng: " + soLuong);

        //sắp xếp phần tử trong mảng bằng phương thức sort() (SẮP XẾP TĂNG DẦN)
        ArrayList<Integer> mangSo = new ArrayList<>();
        mangSo.add(5);
        mangSo.add(2);
        mangSo.add(8);
        mangSo.add(1);

        Collections.sort(mangSo);
        System.out.println("Thứ tự tăng dần của phần tử trong mảng: " + mangSo);

        Collections.sort(mangDienThoai);
        System.out.println("Thứ tự tăng dần của phần tử trong mảng: " + mangDienThoai);

        //đảo ngược phần tử trong mảng bằng phương thức reverse()
        Collections.reverse(mangSo);
        System.out.println("Thứ tự đảo ngược của phần tử trong mảng: " + mangSo);

        Collections.reverse(mangDienThoai);
        System.out.println("Thứ tự đảo ngược của phần tử trong mảng: " + mangDienThoai);

        //Để sắp xếp GIẢM DẦN thì dùng kết hợp phương thức sort và reverse:
        Collections.sort(mangSo);
        Collections.reverse(mangSo);
        System.out.println("Thứ tự giảm dần của phần tử trong mảng: " + mangSo);

        //tìm kiếm phần tử trong mảng bằng phương thức contains()
        boolean isIphone = mangDienThoai.contains("iphone"); //kết quả true hoặc false
        System.out.println("Có iphone trong list điện thoại không? " + isIphone);

        boolean is3 = mangSo.contains(3);
        System.out.println("Có số 3 trong list số không? " + is3);
    }
}

        //OBJECT và CLASS
        //CLASS: là khuôn mẫu để tạo ra các đối tượng, class định nghĩa các thuộc tính và phương thức dùng chung của đối tượng.
        //OBJECT: là một thực thể được tạo ra từ CLASS, nó có các thuộc tính và phương thức được định nghĩa bên trong CLASS.
        //từ một CLASS duy nhất có thể tạo ra nhiều OBJECT
        //CLASS là bản thiết kế ngôi nhà, OBJECT là ngôi nhà được xây dựng từ bản thiết kế đó.

        //Ví dụ: tạo ra class SINH VIÊN có tên, tuổi, điểm Toán, điểm Lý, điểm Hóa, điểm trung bình, xếp loại
        class sinhVien {
            //thuộc tính
            public String ten;
            private int tuoi;
            private double diemToan;
            private double diemLy;
            private double diemHoa;

        //PHẠM VI TRUY CẬP (PUBLIC, PRIVATE, READONLY)
        //PUBLIC*: cho phép truy cập từ bất kỳ đâu trong chương trình,
        //đồng nghĩa với việc có thể read, update, delete giá trị bên trong thuộc tính
        //PRIVATE*: chỉ cho phép truy cập từ bên trong class (tức là truy cập thông qua các phương thức)
        //READONLY*: chỉ cho phép truy cập từ bên trong class (truy cập thông qua các phương thức), và không cho phép update/delete giá trị bên trong thuộc tính

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