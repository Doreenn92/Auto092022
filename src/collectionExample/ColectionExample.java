package collectionExample;

import java.util.*;

public class ColectionExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(); //khai báo và khởi tạo
        arrayList.add("PHP"); //na giá trị vào
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.remove(3);
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        System.out.println("--------------");
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        arrayInt.add(56);
        arrayInt.add(0,5);
        arrayInt.add(1,76);
        System.out.println("Kich thuoc của arrayInt: "+ arrayInt.size());
        System.out.println("\t" + arrayInt);

    //linked list thươn dùng lưu link
        System.out.println("--------------");
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        for (String i : linkedList) //dùng foreach để in ra
        {
            System.out.println(i);
        }


        // new TreeSet() sẽ sắp xếp các phần tử
        System.out.println("--------------");
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java"); //Java đã có phần tử trùng trước đó nên bị bỏ qua
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");


        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        System.out.println("--------------");
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");//Windows trùng nên bị đè lên, do đã đc map nhưng phía dưới lại có thêm 1 lần Windows
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");
        System.out.println("In key Language1 ra: "+hashMap.get("Language1")); //Map lấy theo key


        ArrayList<String> listMenu = new ArrayList<String>();
        // Add objects to arraylist
        listMenu.add("Home");
        listMenu.add("Group");
        listMenu.add("Member");
        listMenu.add("Map");
        // Show list through Iterator
        System.out.println("--------------"+"\n"+"Array List dùng iterator");
        Iterator <String> interatorList = listMenu.iterator();
        while ((interatorList.hasNext())){
            System.out.println(interatorList.next());
        }
    }
}
