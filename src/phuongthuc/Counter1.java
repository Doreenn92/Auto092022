package phuongthuc;

public class Counter1 {

    static{
        System.out.println("Hello. Dù ko gọi khối static thì nó vẫn đc thực thi trước hàm main");
    }
    int count = 0; //sẽ lấy bộ nhớ khi khởi tạo
    static int countStatic = 0; //chỉ dừng khi chương trình bị dừng
    Counter1 (){
        count++;
        System.out.println(count);
    }

    Counter1 (int n){
        countStatic++;
        System.out.println(countStatic);
    }

    public static void main(String[] args) {
        //khởi tạo class 3 class
        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        Counter1 c3 = new Counter1();

        //khởi tạo class 3 class
        Counter1 count1 = new Counter1(0);
        Counter1 count2 = new Counter1(0);
        Counter1 count3 = new Counter1(0);
    }
}
