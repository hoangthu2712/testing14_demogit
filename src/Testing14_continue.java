import java.util.Arrays;

public class Testing14_continue {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        //array(Mảng): là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng một kiểu dữ liệu và cùng mục đích sử dụng
        //khai báo biến: kiểu dữ liệu tenBien = giá trị;
        //khai báo mảng: kiểu dữ liệu[] tenMang = new kiểu dữ liệu[kích thước]; kích thước là số lượng phần tử nằm trong mảng
        int[] mangSo = new int[5];
        //gán giá trị cho phần tử của mảng: tenMang[index] = giá trị;
        mangSo[0] = 1; //vị trí của giá trị trong 1 mảng được gọi là index, bắt đầu từ 0
        mangSo[1] = 4;
        mangSo[2] = 3;
        mangSo[3] = 2;
        mangSo[4] = 5;
        //thực tế sẽ không dùng cách trên để khai báo mảng vì nó dài, chỉ dùng để update lại phần tử (line25)
        System.out.println("Giá trị của phần tử có index 0: " + mangSo[0]); //in ra phần tử
        System.out.println("Giá trị của mảng: " + Arrays.toString(mangSo)); //in ra cả mảng

        //khai báo mảng(thực tế sẽ dùng): kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2, giá trị 3...};
        String[] mangTen = {"Nguyễn Văn A", "Hoàng Văn B", "Lê Thị C"};
        System.out.println("Giá trị của mảng: " + Arrays.toString(mangTen));
        mangTen[0] = "Nguyễn Bảo Giang"; //update phần tử
        System.out.println("Giá trị của phần tử có index 0: " + mangTen[0]);
        System.out.println("Số lượng phần tử trong mảng: " + mangTen.length); //.length: trả về số lượng phần tử bên trong mảng

        //kết hợp Mảng với Vòng lặp để lấy ra từng phần tử gọi là Duyệt mảng
        //Duyệt mảng: sử dụng vòng lặp for để duyệt qua tất cả phần tử của mảng
        for(int i = 0; i < mangTen.length; i++){
            System.out.println("Phần tử có index " + i + ": " + mangTen[i]);
        }


        //vòng lặp for...each: dùng để duyệt mảng, không dùng cho những biến thông thường
        //cú pháp: for (kiểu dữ liệu tenBien : tenMang){logic sử dụng tên biến}
        for(String ten : mangTen){
            System.out.println("Tên học sinh: " + ten);
        }


        //if...else statement:
        //ví dụ:
        int diem = 70;
//        if(diem >= 80){
//            System.out.println("Học sinh đạt điều kiện");
//        } else{
//            System.out.println("Học sinh không đạt điều kiện");
//        }
        //=> Có một cách viết ngắn gọn hơn cách trên, gọi là TOÁN TỬ BA NGÔI
        //Cú pháp: điều kiện đúng ? thực hiện logic A : thực hiện logic B
        //Lưu ý: logic A/B phải trả về một giá trị, chứ không đơn thuần chỉ thực hiện chức năng
        //viết lại đoạn trên sẽ thành:
        String ketQua = (diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện");
        System.out.println(ketQua);

        //TOÁN TỬ BA NGÔI dùng khi nào? Khi logic A/B là logic đơn giản, ngắn gọn (ví dụ in ra kết quả)


        //ÉP KIỂU DỮ LIỆU: chuyển đổi một giá trị từ kiểu dữ liệu này sang kiểu dữ liệu khác
        //ép kiểu ngầm định: tự động chuyển đổi kiểu dữ liệu NHỎ HƠN sang kiểu dữ liệu LỚN HƠN (của cùng 1 loại dữ liệu)
        //kiểu dữ liệu là số: byte > short > int > long > float > double
        byte so1 = 10;
        int so2 = so1; //ép kiểu ngầm định từ byte sang int

        //ép kiểu tường minh: tự động chuyển đổi kiểu dữ liệu LỚN HƠN sang kiểu dữ liệu NHỎ HƠN (của cùng 1 loại dữ liệu)
        //cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4 = (int) so3; //ép kiểu tường minh từ double sang int

        //ép kiểu từ số sang chuỗi hoặc ngược lại

        int so5 = 100;
        String str5 = Integer.toString(so5); //ép kiểu từ số sang chuỗi (*) Cách này phổ biến hơn
        //cú pháp: Kiểu dữ liệu tenBien = kiểu dữ liệu cần chuyển.toString(giá trị cần chuyển)
        //Cách khác:
        String str5_1 = String.valueOf(so5);

        String so6 = "200";
        int so7 = Integer.parseInt(so6); //ép kiểu từ chuỗi sang số
        //cú pháp: Kiểu dữ liệu tenBien = kiểu dữ liệu cần chuyển.parseKiểu dữ liệu(giá trị cần chuyển)





    }

}
