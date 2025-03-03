package lauditor.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class LoginPage extends AbstractClass {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_email")
    WebElement email;

    @FindBy(id = "id_password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;

    public void loginApplication(String emailId, String pass) {
        email.sendKeys(emailId);
        password.sendKeys(pass);
        login.click();
    }

    public void goTo() {
        driver.get("https://staging.lauditor.com/login");
    }

}
