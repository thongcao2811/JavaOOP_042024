package BT_JAVA_OOP1;

public class NhanVien {
    public String name;
    public int age;
    public String gender;
    public String phone;
    public String address;

    public NhanVien(java.lang.String name, int age, java.lang.String gender, java.lang.String phone, java.lang.String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public void showInfo(){
        System.out.println("Ho Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("SDT: " + phone);
        System.out.println("Dia chi: "+ address);

    }
}
