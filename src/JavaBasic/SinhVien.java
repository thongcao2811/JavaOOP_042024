package JavaBasic;

public class SinhVien {

    public void Local(){
        int n = 10;
        String name = "Cao Tien Phuc";
        System.out.println("Tuoi Cua Su " + n);
        System.out.println("Ten cua Su " + name);


    }

    public static void main(String[] args) {
        SinhVien bienLocal = new SinhVien();
        bienLocal.Local();

    }
}




