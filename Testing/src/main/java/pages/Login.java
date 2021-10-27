package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    public WebElement userEmail;

    @FindBy(id = "pass")
    public WebElement userPassword;

    @FindBy(xpath = "//*[@name=\"login\"]")
    public WebElement loginButton;

    public void LoginFunctionality (String email,String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        loginButton.click();
    }






}
