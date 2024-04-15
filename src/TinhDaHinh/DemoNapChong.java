package TinhDaHinh;

public class DemoNapChong {

    public int tinhTong (int number1, int number2){
        return number1 + number2;
    }
    public int tinhTong (int number1, int number2, int number3){
        return number1+number2+number3;


    }

    public static void main(String[] args) {
        DemoNapChong demoNapChong = new DemoNapChong();
        System.out.println(demoNapChong.tinhTong(20,40));
        System.out.println(demoNapChong.tinhTong(10,20,30));
    }

}
