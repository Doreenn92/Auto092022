package array;

public class mang {
    public static void main(String[] args) {
        int mang[] = new int[10]; //khoi tao mang
        //khai bao phan tu mang
        mang[0] = 5;
        mang[1] = 46;
        mang[2] = 648;
        System.out.println(mang[1]);

        //duyet phan tu trong mang
        //dung vong lap for on gian hoac for cai tien
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }

        /*for (int i : mang) {
            System.out.println(i);
        }*/

        String menu[] = new String[3];
        for (int i = 0; i < menu.length; i++) {
            menu[i] = "mon1";
        }
        for (String i : menu) {
            System.out.println(i);
        }

        String menu1[] = {"mon 1", "mon 2", "mon 3"};
        for (String i : menu1) {
            System.out.println(i);
        }
    }
}
