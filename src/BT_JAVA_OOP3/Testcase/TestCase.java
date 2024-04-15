package BT_JAVA_OOP3.Testcase;

import BT_JAVA_OOP3.Common.BaseTest;

public class TestCase extends BaseTest {

    public void loginCRM(){
        System.out.println("Open browser and input URL");
        System.out.println("Input valid email and password");
        System.out.println("Click Login");
        System.out.println("Navigate to admin page");
    }
    public void Login (){
        createDriver();
        loginCRM();
        closeDriver();

    }

    public void AddCategory (){
        createDriver();
        loginCRM();
        System.out.println("Navigate to List Category");
        System.out.println("Click Add New Category");
        System.out.println("Input all required fields");
        System.out.println("Click Save");
        System.out.println("Verify new category is added");
        closeDriver("Firefox");

    }

    public static void main(String[] args) {
        TestCase testcase = new TestCase();
        testcase.Login();

        System.out.println("==================");
        testcase.AddCategory();
    }
}
