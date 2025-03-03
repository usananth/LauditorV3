package lauditor.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge;
import org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi.ecCVCDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import lauditor.abstractclass.AbstractClass;
import lauditor.abstractclass.AbstractClass.*;

public class DocumentUploadwithExpiryDatePage2 extends AbstractClass {
	WebDriver driver;

	public DocumentUploadwithExpiryDatePage2(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Left Side Document
	@FindBy(xpath = "//*[text()='Documents']")
	WebElement leftSideDocument;

	// Upload Tab
	@FindBy(xpath = "//a[text()='Upload']")
	WebElement uploadTab;

	public void uploadTab() {
		visibilityOfAllElements(uploadTab);
		uploadTab.click();
	}

	// Firm Tab
	@FindBy(xpath = "//a[text()='Firm']")
	WebElement firmTab;

	public void firmTab() {
		visibilityOfAllElements(firmTab);
		firmTab.click();
	}

	@FindBy(xpath = "//div[@class='input-group index court'] //div[@class='multicheck form-control textbox']")
	List<WebElement> listofGroups;

	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChanges;
	// BrowserBtn
	@FindBy(id = "btnadd")
	WebElement browseBtn;

	public void browseBtn() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(browseBtn);
		browseBtn.click();
	}

	public void leftsideDocument() throws InterruptedException {
		Thread.sleep(4000);
		leftSideDocument.click();
	}

	public void openFile(String path) throws InterruptedException {
		getFile(path);
	}

	public void fileUpload(String path) throws InterruptedException {
		Thread.sleep(5000);
		getFile(path);
	}

	AbstractClass reusable = new AbstractClass(driver);

	// CheckBox
	@FindBy(xpath = "//div[@class='input-group index court'] //input[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectElement;
	// Categories Text Fields
	@FindBy(xpath = "//input[@id='caseType']")
	WebElement categoriesText;
	// View Changes success pop up
	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChangesPopup;
	@FindBy(xpath = "//div[@class='iconclose']")
	WebElement popupXButton;

	// Enable Download
	@FindBy(xpath = "//*[text()='Enable Download']")
	WebElement enableDownload;

	// Disable Download
	@FindBy(xpath = "//*[text()='Disable Download']")
	WebElement disableDownload;

	// Add Tags
	@FindBy(xpath = "//*[text()='Add Tags']")
	WebElement addTags;

	public void addTag() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addTags);
		addTags.click();

	}

	@FindBy(xpath = "//i[@class='fa fa-plus form-check-inpu calimg calitem input-group-append checkboxitem']")
	WebElement addPlus;

	public void addPlus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addPlus);
		addPlus.click();

	}

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addMinus;

	public void addMinus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addMinus);
		addMinus.click();
	}

	// Cancel Button
	@FindBy(xpath = "//button[@class='btn btn-default btncancel']")
	WebElement uploadCancel;

	public void uploadCancel() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(uploadCancel);
		uploadCancel.click();

	}

	
	@FindBy(xpath = "//i[@class='fa fa-edit']")
	WebElement documentEdit;

	public void documentEdit() throws InterruptedException {
		Thread.sleep(3000);
		documentEdit.click();

	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	public void uploadSubmitButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(submitBtn);
		submitBtn.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//div[@class='input-group index court'] //div[@class='multicheck form-control textbox']")
	List<WebElement> listofNames;

	// Upload More
	@FindBy(xpath = "//button[text()='Upload More']")
	WebElement uploadMore;

	// View Changes
	@FindBy(xpath = "//*[text()='View Changes']")
	WebElement viewChangesBtn;
	@FindBy(xpath = "//i[@class='fa fa-edit']")
	List<WebElement> editbtn;

	// Name
	@FindBy(id = "documentName")
	WebElement documentField;

	public void editDocumentField(String document) {
		visibilityOfAllElements(documentField);
		descriptionField.clear();
		visibilityOfAllElements(documentField);
		descriptionField.sendKeys(document);
	}

	// Description
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement descriptionField;

	public void editDescriptionField(String description) {
		visibilityOfAllElements(descriptionField);
		descriptionField.clear();
		visibilityOfAllElements(descriptionField);
		descriptionField.sendKeys(description);
	}

	// Expiration Date

	@FindBy(xpath = "//span[@class='mat-mdc-button-touch-target']")
	WebElement expiryDate;

	public void expiryDate() throws InterruptedException {
		visibilityOfAllElements(expiryDate);
		expiryDate.click();

	}

	public void dateChoose(String date) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	//Edit MetaData
	@FindBy(xpath = "//i[contains(@class,'fa fa-edit')]")
	List<WebElement> editDocuments;

	// SubmitBtnEdit
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitEdit;

	public void submitEditButton() {
		visibilityOfAllElements(submitEdit);
		submitEdit.click();
	}

	public void editDocumentNameandDescription(String names, String names1) throws InterruptedException {
		editDocumentField(names);
		editDescriptionField(names1);
		submitEdit.click();
	}

	public void editDocumentNameandExpirateDate(String names, String date) throws InterruptedException {
		editDocumentField(names);
		expiryDate();
		Thread.sleep(2000);
		dateChoose(date);
		Thread.sleep(1000);
		submitEdit.click();
	}

	public void editDescriptionandExpirationDate(String names, String date) throws InterruptedException {
		editDescriptionField(names);
		expiryDate();
		Thread.sleep(3000);
		dateChoose(date);
		Thread.sleep(1000);
		submitEdit.click();
	}

	public void editAllFields(String names, String names1, String dates) throws InterruptedException {
		editDocumentField(names);
		editDescriptionField(names1);
		expiryDate();
		Thread.sleep(2000);
		dateChoose(dates);
		submitEdit.click();
	}

	public void editAllField(Integer[] intArray, String[][] des) throws InterruptedException {
		// int n= intArray.length;
		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editAllFields(des[eb][0], des[eb][1], des[eb][2]);
		}

	}

	// Edit Document Name

	public void editDocumentNameField(Integer[] intArray, String[] des) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			editDocumentField(des[eb]);
			submitEditButton();
		}
	}

	// Edit Description Field

	public void editDescriptionField(Integer[] intArray, String[] des) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			editDescriptionField(des[eb]);
			submitEditButton();
		}

	}

	@FindBy(xpath = "//div //i[@class='fa fa-edit']")
	List<WebElement> editButton;

	// Expiration Date Field

	public void editExpirateField(Integer[] intArray, String[] date) throws InterruptedException {

		for (int ii = 0; ii < intArray.length; ii++) {
			Thread.sleep(2000);
			int eb = intArray[ii];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(2000);
			expiryDate();
			Thread.sleep(1000);
			dateChoose(date[eb]);
			submitEditButton();
		}

	}

	// Edit DocumentName and Expirate Date Fields

	public void editDocumentNameandDateFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDocumentNameandExpirateDate(des[eb][0], des[eb][1]);
		}

	}

	// Edit DocumentName and Description Fields

	public void editDocumentNameandDescriptionFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDocumentNameandDescription(des[eb][0], des[eb][1]);
		}

	}

	// Edit editDescription and ExpirateDate Fields

	public void editDescriptionandExpirationDateFields(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			editButton.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			editDescriptionandExpirationDate(des[eb][0], des[eb][1]);
		}

	}

	public void listofGroups(String listofGroups) {

	}

	public void DocumentUploadEditExpirationDate(String[] selectGroups) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> selectedGroupNames = Arrays.asList(selectGroups);

		for (int i = 0; i < listofGroups.size(); i++) {
			String allGroupNameText = listofGroups.get(i).getText();
			if (selectedGroupNames.contains(allGroupNameText)) {
				WebElement selectGroup = checkboxSelectElement.get(i);
				Thread.sleep(3000);
				js.executeScript("arguments[0].click();", selectGroup);

			}

		}

	}

	public void scrollCancel() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
