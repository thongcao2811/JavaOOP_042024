package Collection_Demo;

import java.util.Set;
import java.util.HashSet;

// Interface Set - > HashSet
// Không chứa các giá trị trùng lặp, nếu trùng lặp sẽ lấy giá trị đầu tiên
// Không có thứ tự, sap xếp các giá trị ngẫu nhiên
//

public class DemoSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Cao Tien Phuc");
        hashSet.add("Cao Tien Thong");
        hashSet.add("Nguyen Thi Ha Phuong");
        hashSet.add("Cao Tien Phuc");
        hashSet.remove(2);

     //  hashSet.contains();

        System.out.println("My Family Names: ");
        System.out.println("\t" + hashSet + "\n");



        System.out.println("Size: "+ ((HashSet<?>) hashSet).size());

        for (String obj : hashSet){
            System.out.println(obj);
        }


    }
}
