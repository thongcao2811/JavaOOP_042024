package Collection_Demo;

import java.util.ArrayList;
import java.util.List;
 // Interface List -> ArrayList:
// + Có thể chứa các giá trị trùng lap
// + Có xét thứ tự các giá trị trong array

public class DemoArrayLists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Cao Tien Phuc");
        arrayList.add("Nguyen Thi Ha Phuong");
        arrayList.add("Cao Tien Thong");
        arrayList.add("Nguyen Thi Ha Phuong");
        ((ArrayList<?>) arrayList).remove(1);
        

        System.out.println("My Family Names ArrayList");
        System.out.println("\t" + arrayList + "\n");
        System.out.println("Kiem tra chua: "+ arrayList.contains("Cao Tien Thong"));
        System.out.println("Kiem tra size: " + arrayList.size());

        for (String obj : arrayList){
           System.out.println(obj);
        }

    }
}
