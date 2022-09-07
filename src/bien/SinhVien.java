package bien;

public class SinhVien {
    // biến static 'ten'
    public static String ten = "Nguyen Dinh";

    // biến static 'tuoi'
    public int tuoi = 30;

    //biến non-static

    public static void main(String args[]) {
        // Sử dụng biến static bằng cách gọi trực tiếp
        System.out.println("Ten : " + ten);

        // Sử dụng biến static bằng cách gọi thông qua tên class
       // System.out.println("Ten : " + SinhVien.tuoi);

        //Nếu biến toàn cục gọi ko phải static thì hàm static phải gọi gián tiếp thông qua class.biến
        SinhVien sv = new SinhVien();
        System.out.println(sv.tuoi);
    }
}
