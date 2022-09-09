package phuongthuc;

public class LearnMethod {
    public void showInfo(){
        System.out.println("Automation Test");
        System.out.println("Selenium Java");
    }

    private static String getName(){
        String name = "Doreen";
        return name;
    }

    protected void displayInfo (String name, int age){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod(); //tạo một đối tượng thay mặt7 cho class để gọi lại tất cả các hàm
        obj.showInfo(); //gọi vào hàm main thông qua class vì phương thức này ko có phạm vi truy cập static
        getName(); //gọi vào hàm main trực tiếp vì phương thức này có phạm vi truy cập static
        obj.displayInfo("Dinh",30);
    }
}
