import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Testing14_continue_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arraylist: là một cấu trúc dữ liệu động (dynamic), có thể thay đổi kích thước trong quá trình thực thi chương trình, không bị ràng buộc về số lượng như Array.
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