package TinhDongGoi;



public class Company extends Student {

    public Company(String name, int age, String phone, String address) {
        super(name, age, phone, address);
    }

    public void showInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getPhone());
        System.out.println(getAddress());

    }
    public static void main(String[] args) {
        Student student = new Student("Thong", 34, "0949081489", "Long An");
        student.setName("Phuc");
        student.setAge(34);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getPhone());
        System.out.println(student.getAddress());

    }

}
