import java.sql.SQLOutput;

    import java.util.Scanner;
public class Testing14 {
    public static void main(String[] args) {
        //snippet code: gõ code nhanh
        // comment code: ctrl + / để cmt hàng loạt
        //1. Lệnh xuất dữ liệu/in dữ liệu
//            System.out.print("abc"); //dữ liệu in ra nằm trên cùng 1 dòng
//            System.out.println("Hello World"); //dữ liệu in ra nằm tách dòng
//            System.out.println("ABCD");
//        //sout: tạo nhanh lệnh System.out.println
//
//        //2. Biến: là một khu vực để lưu trữ dữ liệu trên bộ nhớ
//        //cú pháp: <kiểu dữ liệu><tên biến> = <giá trị>
//        //chuỗi: String
//        //số: int (số nguyên), float/double (số thập phân)
//        //float: lấy 7-8 số sau dấu phẩy, double: lấy 15-16 số sau dấu phẩy
//        //boolean: true/false
//
//        //Tạo ra biến tên là họ tên
//          String hoTen = "Super Junior <3";
//          String diaChi = "Hà Nội";
//          int tuoi = 18;
//          System.out.println(hoTen);
//          System.out.println(hoTen);
//          System.out.println(hoTen);
//          System.out.println(diaChi);
//          System.out.println(tuoi);
//
//          System.out.println("Họ và tên: " + hoTen);
//
//          Boolean isLogin = true;
//          Boolean isStudent = false;
//
//        //3. Scanner: nhận dữ liệu từ bàn phím người dùng
//          Scanner sc = new Scanner(System.in); //System.in: nhận dữ liệu từ bàn phím
//          System.out.println("Vui lòng nhập họ tên: ");
//          String fullName = sc.nextLine(); //tạo biến fullName để hứng giá trị user nhập vào
//          System.out.println("Họ và tên: " + fullName);
//
//        //ví dụ nhập và in thông tin học sinh bao gồm họ tên, tuổi, trường, lớp
//
//          System.out.println("Vui lòng nhập tên: ");
//          String studentName = sc.nextLine(); //nextLine dùng cho kiểu dữ liệu dạng chuỗi
//          System.out.println("Vui lòng nhập tuổi: ");
//          int studentAge = sc.nextInt(); //nextInt dùng cho kiểu dữ liệu dạng số
//          sc.nextLine();//tách giữa 2 dòng khi dòng trên là nextInt, dòng dưới là nextLine
//          System.out.println("Vui lòng nhập trường: ");
//          String studentSchool = sc.nextLine();
//          System.out.println("Vui lòng nhập lớp: ");
//          String studentClass = sc.nextLine();
//          System.out.println("Họ tên: " + studentName + ", tuổi: " + studentAge);

        //4. Toán tử
        //4.1 Toán tử số hợp: + - * / % (% là chia lấy dư)
//          int soA = 5;
//          int soB = 10;
//          int soC = 10;
//
//          int tinhTong = soA + soB;
//          int tinhHieu = soB - soA;
//          int tinhTich = soC * soB;
//          float tinhThuong = soC / soB;
//          float tinhDu = soA % soB;
//          System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu);
//          System.out.println("Tích: " + tinhTich + ", Thương: " + tinhThuong + ", Dư: " + tinhDu);

        //4.2 Toán tử so sánh
        //So sánh bằng == (với số)
//          boolean kq1 = soA == soB; //với phép toán so sánh thì kiểu dữ liệu trả về luôn là boolean (true/false)
//          System.out.println(kq1);
//          boolean kq2 = soB == soC;
//          System.out.println(kq2);


        //Với chuỗi, dùng == ko so sánh được mà phải dùng equal để so sánh GIÁ TRỊ NỘI DUNG, ví dụ:
//          String a = "Hello";
//          String b = "Hello";
//          String c = new String("Hello");
//
//          Boolean kqab = a == b;
//          System.out.println("kqab: " + kqab); //true
//          Boolean kqac = a == c;
//          System.out.println("kqac " + kqac); //false
//          Boolean kq7 = b.equals(c);// so sánh b và c bằng cách dùng equal
//          System.out.println("kq7: " + kq7);

        //cách tìm tới vị trí lưu trong string pool: dùng System.identityHashCode
//          System.out.println(System.identityHashCode(a));
//          System.out.println(System.identityHashCode(b));
//          System.out.println(System.identityHashCode(c));
//
////        //So sánh khác !=
//          Boolean kq3 = soA != soC;
//          System.out.println(kq3);
//
//        //So sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng, < > >= <=
//          boolean kq4 = soA > soB;
//          System.out.println("kq4: " + kq4);
//          boolean kq5 = soA <= soB;
//          System.out.println("kq5: " + kq5);
//
        //4.3 Toán tử gán: =, +=, -=, *=, /=
//            int soD = 10;
//            soD = soD + 5; //cách viết này đài dòng, thay vào đó sẽ viết là:
//            soD += 5;
//            System.out.println("Số D: " + soD);
//         //Tương tự với -=, *=, /=
//           soD -= 3; // tương đương với soD = soD - 3
//           System.out.println("Số D: " + soD);
//           soD *= 2; //tương đương với soD = soD * 2
//           System.out.println("Số D: " + soD);
//           soD /= 4; //tương đương với soD = soD / 4
//           System.out.println("Số D: " + soD);


           //4.4 Toán tử logic: && || ! (toán tử logic sử dụng với những biến kiểu Boolean)
           //&& (VÀ): kết hợp tất cả các điều kiện của các logic
//           Boolean logicA = true;
//           Boolean logicB = true;
//           Boolean logicC = false;
//           Boolean ketQua1 = logicA && logicB && logicC;
//           System.out.println("kết quả 1: " + ketQua1);
//
//           // || (HOẶC): hoặc logicA hoặc logicB
//           Boolean logicD = false;
//           Boolean logicE = false;
//           Boolean logicF = true;
//           Boolean ketQua2 = logicD || logicE || logicF;
//           System.out.println("kết quả 2: " + ketQua2);
//
//           // ! : phủ định, đảo ngược giá trị của biến logic
//           Boolean logicG = true;
//           Boolean ketQua3 = !logicG; // phủ định logicG
//           System.out.println("kết quả 3: " + ketQua3);

           //tiền tố và hậu tố ++ --

           //Cấu trúc câu điều kiện
           //if statement: kiểm tra điều kiện ĐÚNG
           //if (điều kiện đúng){thực hiện logic}
//           int thu = 2;
//           if(thu == 2 || thu == 6){
//               System.out.println("Hôm nay phải đến trường");
//        }

           //if else statement: kiểm tra cả điều kiện ĐÚNG và SAI
           //if(điều kiện A đúng){thực hiện logicA} else if (điều kiện B đúng) {thực hiện logicB}
//           int soBuoiNghi = 3;
//           float dtb = 8;
//           Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
//           if(isQuaMon){
//               //thực hiện logicA
//               System.out.println("Sinh viên đã qua môn");
//           }
//           else {
//               //thực hiện logicB
//               System.out.println("Sinh viên chưa qua môn");
//           }

           //switch case statement:
           //switch (điều kiện cần kiểm tra)
           //case giá trị 1: thực hiện logic1; break; //BẮT BUỘC FAI CÓ BREAK, nếu không có BREAK thì sau khi thực hiện logic1
           //case giá trị 2: thực hiện logic2; break; //nó sẽ tiếp tục thực hiện logic2 mà không kiểm tra điều kiện logic2 có thỏa mãn không
           //case giá trị 3: thực hiện logic3; break;
           //default: thực hiện logic mặc định; break; //nếu các điều kiện trên không có điều kiện nào thỏa mãn thì sẽ thực hiện default

//           int soC = 2;
//           switch (soC){
//               case 1:
//                   System.out.println("Số C là 1");
//                   break;
//               case 2:
//                   System.out.println("Số C là 2");
//                   break;
//               case 3:
//                   System.out.println("Số C là 3");
//                   break;
//               default:
//                   System.out.println("Số C không phải là 1, 2 hay 3");
//                   break;

           //trường hợp không có BREAK là khi logic của hai case giống nhau. Ví dụ:
//           switch (soC){
//               case 1:
//                   System.out.println("Số C là 1");
//                   break;
//               case 2:
//               case 3:
//                   System.out.println("Số C là 2 hoặc 3"); //logic case 2 giống case 3 nên viết chung logic
//                   break;
//               default:
//                   System.out.println("Số C không phải là 1, 2 hay 3");
//                   break;
//           }

           //vòng lặp: vòng lặp while
           //cú pháp: while (điều kiện đúng) {thực hiện logic}
           //chừng nào diều kiện luôn đúng thì vòng lặp sẽ luôn thực hiện logic

//           int soD = 2;
//           while (soD <= 5){
//               System.out.println("Số D: " + soD);
//               soD += 1; //3, 4, 5, 6... Vòng lặp đến 6 thì dừng lại vì 6 > 5 (không còn thỏa mãn điều kiện <= 5 nữa)
//           }
//
//           int soE = 1;
//           while (soE <= 5){
//               System.out.println("Số E: " + soE);
//               soE++; //HẬU TỐ ++ tức là tăng thêm 1 đơn vị, tương đương với cách viết soE += 1
//           }

           //vòng lặp do...while: thực hiện logic trước rồi mới kiểm tra điều kiện
           //cú pháp: do {thực hiện logic} while (điều kiện đúng);
           //logic sẽ được thực hiện ít nhất một lần dù điều kiện có đúng hay không

//           int soF = 1;
//           do {
//               System.out.println("Số F: " + soF);
//               soF++;
//           } while (soF <= 3); //điều kiện bằng false => vòng lặp sẽ dừng

           //vòng lặp For (*) (thực tế dùng nhiều)
           //cú pháp: for (giá trị khởi tạo; điều kiện đúng; giá trị thay đổi) {thực hiện logic}
           //với while/do...while có thể không cần giá trị khởi tạo, nhưng for thì luôn phải có
           //Lưu ý: dùng for khi biết cụ thể số lần lặp lại

           for(int i = 1; i < 5; i++){
               System.out.println("i: " + i);
           }
    }
}
