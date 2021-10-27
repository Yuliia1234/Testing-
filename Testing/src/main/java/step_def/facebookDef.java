package step_def;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Login;

public class facebookDef {

    @Test
    public void ValidateLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        Login login = new Login(driver);
        login.LoginFunctionality("Hello@gmail.com","Password123");

        Thread.sleep(1000);
       String Validation = "Is this your account?";
        Assert.assertEquals(Validation,"Is this your account?");
    }

}
