package BT_JAVA_OOP2.Person;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String phone;
    public String address;

    public Person(java.lang.String name, int age, java.lang.String gender, java.lang.String phone, java.lang.String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public java.lang.String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public java.lang.String getGender() {
        return gender;
    }

    public java.lang.String getPhone() {
        return phone;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void showInfo(){
        System.out.println("Ho Ten: "+ name);
        System.out.println("Tuoi: "+ age);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("SDT: " + phone);
        System.out.println("Dia chi: "+ address);

    }
}
