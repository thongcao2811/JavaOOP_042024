package BT_JAVA_OOP3.Common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + Constant.browser);
        System.out.println("Report: " + Constant.report);
        System.out.println("Headless: " + Constant.headless);



    }

    public void closeDriver(){
        System.out.println("Close browser: " + Constant.browser);

    }

    public void closeDriver(String browser){
        System.out.println("Closed browser: " + browser);
    }

}
