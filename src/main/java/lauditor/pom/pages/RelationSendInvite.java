package lauditor.pom.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class RelationSendInvite extends AbstractClass {

    WebDriver driver;
    public String eMail;

    public RelationSendInvite(WebDriver driver) {
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
    // button[@id='btnadd']

    @FindBy(xpath = "//button[@id='btnadd']")
    WebElement searchBtn;

    @FindBy(className = "text-primary")
    WebElement searchFound;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement indFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement indLastName;

    @FindBy(xpath = "//input[@name='confirmEmail']")
    WebElement indConfirmEmail;

    @FindBy(xpath = "//select[@name='country']")
    WebElement indCountry;

    @FindBy(xpath = "//input[@placeholder='Search Group']")
    WebElement indAssignSearch;

    @FindBy(xpath = "//div /input[@type='checkbox']")
    List<WebElement> groupSelectCheckbox;

    @FindBy(xpath = "//div[@class='callselect']")
    List<WebElement> groupNames;

    @FindBy(xpath = "//button[@type='reset']")
    WebElement requestCancel;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement sendRequest;

    @FindBy(xpath = "//button[normalize-space()='Yes']")
    WebElement alertBtnYes;
    @FindBy(xpath = "//button[normalize-space()='No']")
    WebElement alertBtnNo;
    @FindBy(xpath = "//button[normalize-space()='View Changes']")
    WebElement viewChanges;

    @FindBy(xpath = "//button[normalize-space()='Add Relationship']")
    WebElement AddRelationship;

    public void RelationIndFound() throws InterruptedException {

        menuRelationship.click();
        addRelationship.click();
        individualTab.click();
        searchBar.clear();
        searchBar.sendKeys(eMail);
        searchBtn.click();
        Thread.sleep(3000);
        if (driver.getPageSource().contains("Found!")) {
            menuRelationship.click();
            addRelationship.click();
            individualTab.click();
            searchBar.clear();

        }
    }

    public void RelationsendInvite(String eMail, String fName, String lName, String cEmail, String Country,
            String[] addGroups)
            throws InterruptedException {
        this.eMail = eMail;
        menuRelationship.click();
        addRelationship.click();
        individualTab.click();
        searchBar.sendKeys(eMail);
        searchBtn.click();
        Thread.sleep(3000);

        if (driver.getPageSource().contains("to send the relationship invite.")) {

            indFirstName.sendKeys(fName);
            indLastName.sendKeys(lName);
            indConfirmEmail.sendKeys(cEmail);
            indCountry.sendKeys(Country);
            // JavascriptExecutor js = (JavascriptExecutor) driver;
            nearbySearchpageDown();
            Thread.sleep(2000, 0);
            List<String> groupSelect = Arrays.asList(addGroups);

            JavascriptExecutor executor = (JavascriptExecutor) driver;

            for (int i = 0, j = 0; i < groupNames.size(); i++) {

                String gname = groupNames.get(i).getText();

                if (groupSelect.contains(gname)) {
                    j++;
                    Thread.sleep(1000);
                    WebElement selectGroups = groupSelectCheckbox.get(i);

                    executor.executeScript("arguments[0].click()", selectGroups);
                    Thread.sleep(1000);
                    i--;
                    if (j == groupSelect.size()) {
                        break;

                    }
                }

            }

        }
        if (driver.getPageSource().contains("Found!")) {
            searchBar.clear();
            pageUP();
        }
    }

    public void setSendRequest() throws InterruptedException {

        pageDown();
        Thread.sleep(3000, 0);
        sendRequest.click();

    }

    public void alertBtn() throws InterruptedException {

        Thread.sleep(3000);

        alertBtnYes.click();

    }

    public void successViewChanges() throws InterruptedException {

        Thread.sleep(3000);

        viewChanges.click();

    }

    public void pageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        // js.executeScript("window.scrollBy(0,1000)");
    }

    public void nearbySearchpageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
        // js.executeScript("window.scrollBy(0,1000)");
    }

    public void pageUP() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-800)");

    }

}
