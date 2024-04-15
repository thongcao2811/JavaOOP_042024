package JavaBasic;

public class Calculator {

    public int sum2Numbers ( int a, int b){
        return a + b;
    }

    public double multiply3Numbers ( int a, int b, double c){
        return a * b *c;
    }


    public static void main(String[] args) {
        Calculator object1 = new Calculator();
        System.out.println("Tinh tong 2 so " + object1.sum2Numbers(2,5));
        System.out.println("Phep nhan 3 so " + object1.multiply3Numbers(1, 2, 2.5));
        System.out.println("Username " + ThongTin.userName);
        System.out.println("Password "+ ThongTin.passWord) ;

        for (int i = 1; i<=10; i++){
            System.out.println("Value of i increase: " + i);
        }

        String ArrayData[] = {"Phuc", "Su", "Thong", "Phuong"};
        for (String i : ArrayData){
            System.out.println("My Family: " + i);
        }

        String newArray [] = new String[5];
        newArray[0] = "TienPhuc";
        newArray[1] = "KuSu";
        newArray[2] = "HaPhuong";
        newArray[3] = "TienThong";

        for (int i = 0; i < newArray.length ; i++){
            System.out.println("My Family Version 2 " + newArray[i]);
        }

        for (String i : newArray){
            System.out.println(i);
        }


    }
}
