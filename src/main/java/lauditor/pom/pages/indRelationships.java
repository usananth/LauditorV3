package lauditor.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import lauditor.abstractclass.AbstractClass;

public class indRelationships extends AbstractClass {
    WebDriver driver;

    String indRelation;

    public indRelationships(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@src='assets/img/relationship.svg']")
    WebElement menuRelationship;

    @FindBy(xpath = "//a[@class='optionone compone relation-tabs add']")
    WebElement addRelationship;

    @FindBy(xpath = "//a[@routerlink='/relationship/add/individual']")
    WebElement individualTab;

    @FindBy(xpath = "//input[@placeholder='Search by email']")
    WebElement searchBar;
    @FindBy(xpath = "//button[@id='btnadd']")
    WebElement searchBtn;
    @FindBy(className = "text-primary")
    WebElement searchFound;

    @Test

    public void indFound(String inputEmail) throws InterruptedException {
        // String indFound = "Individual Sun Networks Found!";
        menuRelationship.click();
        addRelationship.click();
        individualTab.click();
        searchBar.sendKeys(inputEmail);

        // String userFound = searchFound.getText();
        searchBtn.click();
        Thread.sleep(5000);

        // indRelation =driver.
        if (driver.getPageSource().contains("to send the relationship invite.")) {

            System.out.println("User  is not found..");
        } else {
            System.out.println("User is found add groups");

        }

    }

    public void relIndividualRequest() throws InterruptedException {

    }

}
