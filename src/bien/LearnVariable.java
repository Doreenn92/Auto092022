package bien;

public class LearnVariable {
    public LearnVariable(){
        //contructor hàm xây dựng
    }

    static {
        //block
    }

    //biến
    public String nameGlobal = "Doreen";
    public String homeTown = "Sai Gon";

    public void sayHello(){
        String name = "Binh";
        System.out.println(nameGlobal + " said hello everybody");
    }
    public static void main(String[] args) {
        String name = "Dinh";
        int age = 30;
        String address = "HCM";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        LearnVariable bien = new LearnVariable();
        bien.sayHello();
    }
}
