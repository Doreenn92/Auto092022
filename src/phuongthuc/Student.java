package phuongthuc;

public class Student {
    int rollno;
    String name;
    static String college = "Hoa Sen university";

    Student (int r, String n){
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }


    public static void main(String args[]) {
        Student s1 = new Student(111, "Anh Thư");
        Student s2 = new Student(222, "Nhật Minh");

        s1.display();
        s2.display();
    }
}
