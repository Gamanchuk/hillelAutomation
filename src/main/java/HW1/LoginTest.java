package HW1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public  void JiraLoginTest(){
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver\\chromedriver.exe");
        WebDriver driver1;
        driver1 = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver1);

        driver1.get("http://jira.hillel.it:8080/login.jsp");
        loginPage.enterUserName("webinar5");
        loginPage.enterPassword("webinar5");
        loginPage.clickSendButton();


    }
}
