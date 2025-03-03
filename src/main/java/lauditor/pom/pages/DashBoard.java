package lauditor.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class DashBoard extends AbstractClass {

    WebDriver driver;

    public DashBoard(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='Groups']")
    WebElement texts;

    public void groupsMenuClick() throws InterruptedException {
        // Scroll Down
        Thread.sleep(10000);
        WebElement scol = driver.findElement(By.cssSelector("html"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", scol);

        // Group Select on Left Side
        Thread.sleep(10000);
        texts.click();

        Actions a = new Actions(driver);
        a.sendKeys(Keys.PAGE_UP).build().perform();
        a.sendKeys(Keys.PAGE_UP).build().perform();

    }

}
