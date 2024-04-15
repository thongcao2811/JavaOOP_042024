package Collection_Demo;
import java.util.HashMap;
import java.util.Map;

// Inteface Map -> HashMap
// Key - Value
// Không chưa giá trị trùng lặp, neu trùng sẽ lay giá trị đầu tiên

public class DemoMap {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Thong", "1990");
        hashMap.put("Phuc", "2018");
        hashMap.put("Phuong", "1991");

        hashMap.containsKey("Thong");
        System.out.println(hashMap.get("Thong "));


        System.out.println("My Family: ");
        System.out.println("\t" + hashMap);

       for (Map.Entry<String,String> entry : hashMap.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }




    }
}
