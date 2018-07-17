import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
    @Test
    public void Test(){
        System.setProperty("webdriver.chrome.driver", "D:\\Programs\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JiraLoginPage loginPage = new JiraLoginPage(driver);

        driver.get("http://jira.hillel.it:8080/login.jsp");
        loginPage.enterUserName("webinar5");
        loginPage.enterPassword("webinar5");
        loginPage.clickSendButton();

    }

}
