package lauditor.pom.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class MergePDFPage extends AbstractClass {
	WebDriver driver;

	public MergePDFPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	// Left Side Document
	@FindBy(xpath = "//*[text()='Documents']")
	WebElement documentMenu;

	// Merge PDF Tab
	@FindBy(xpath = "//*[text()='Merge PDF']")
	WebElement mergePdfTab;

	@FindBy(xpath = "//a[text()='Firm']")
	WebElement firmTab;

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addPlus;

	@FindBy(xpath = "//div [@class='input-group index court']//div[@class='multicheck form-control textbox']")
	List<WebElement> listofGroups;

	// CheckBox
	@FindBy(xpath = "//div[@class='input-group index court'] //input[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectElement;

	@FindBy(xpath = "//div [@class='input-group index court']//div[@class='multicheck form-control textbox']")
	List<WebElement> groupsList;

	// CheckBox
	@FindBy(xpath = "//div[@class='input-group index court'] //input[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectGroups;

	// Document Checkbox
	@FindBy(xpath = "//tbody //tr //td //input[2]")
	List<WebElement> checkboxDocuments;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	WebElement searchInputFields;

	// All Documents Name
	@FindBy(xpath = "//tr//td[1]")
	List<WebElement> allDocumElements;

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addMinus;

	// Merge Button
	@FindBy(xpath = "//button[text()='Merge']")
	WebElement mergeButton;

	// Merge PDF Cancel Button
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement mergeCanButton;

	// Name of Merged Document Field

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement nameofMergeDocument;

	// Preamble Text field
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement prembleTextfield;

	// Preamble Textarea Content
	@FindBy(xpath = "(//textarea[@name='content'])[1]")
	WebElement preamTextarea;

	// Merge Button Second Page..
	@FindBy(xpath = "//button[text()='Merge']")
	WebElement mergeButton1;

	// Add Extra Documents

	@FindBy(xpath = "//input[@value='Add']")
	WebElement addMorePdfs;

	// Add Title and Text Document 1
	@FindBy(xpath = "(//input[@type='button'])[2]")
	WebElement addTitleDoc1;

	// Add Title and Text Document 2
	@FindBy(xpath = "(//input[@type='button'])[3]")
	WebElement addTitleDoc2;

	// Bookmark Title
	@FindBy(xpath = "(//input[@id='docDetails'])[1]")
	WebElement bookmarkTitle;

	// Name of the Docuemnt
	@FindBy(xpath = "(//input[@id='header'])[1]")
	WebElement nameofDocument;

	// Text Area
	@FindBy(xpath = "(//textarea[@name='body'])[1]")
	WebElement textArea;

	// Add Title save Button
	@FindBy(xpath = "//button[text()='Save']")
	WebElement addTitleSave;

	// Add Title save Button
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement addTitleCancel;

	// Show Bookmark Checkbox

	@FindBy(xpath = "(//input[@class='form-check-input titleChecks'])[1]")
	WebElement showBookmark;

	// Custom Page Number
	@FindBy(xpath = "(//input[@class='form-check-input titleChecks'])[2]")
	WebElement cusPageNumber;

	// Custom Page Number
	@FindBy(xpath = "(//input[@class='form-check-input titleChecks'])[3]")
	WebElement addPageNumber;

	public void addTitleDoc1() {
		visibilityOfAllElements(addTitleDoc1);
		addTitleDoc1.click();
	}

	public void bookmarkTitle(String bmTitle) throws InterruptedException {
		Thread.sleep(2000);
		bookmarkTitle.clear();
		visibilityOfAllElements(bookmarkTitle);
		bookmarkTitle.sendKeys(bmTitle);
	}

	public void nameofDocument(String docName) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(nameofDocument);
		nameofDocument.sendKeys(docName);
	}

	public void textAreaBookmark(String areaText) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(textArea);
		textArea.sendKeys(areaText);
	}

	public void addTitleDoc2() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addTitleDoc2);
		addTitleDoc2.click();
	}

	public void addTitleSave() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addTitleSave);
		addTitleSave.click();
	}

	public void showBookmarks() {
		visibilityOfAllElements(showBookmark);
		showBookmark.click();
	}

	public void preambleText(String preamText) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(prembleTextfield);
		prembleTextfield.sendKeys(preamText);
	}

	public void preambleTextArea(String preamContent) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(preamTextarea);
		preamTextarea.sendKeys(preamContent);
	}

	public void showBookmark() {
		visibilityOfAllElements(showBookmark);
	}

	public void addMorePdffiles() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addMorePdfs);
		addMorePdfs.click();
	}

	public void mergeCanButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(mergeCanButton);
		mergeCanButton.click();
	}

	public void mergeBtn1() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(mergeButton1);
		mergeButton1.click();
		Thread.sleep(3000);
	}

	public void nameoftheMergeDocument(String docName) throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(nameofMergeDocument);
		nameofMergeDocument.sendKeys(docName);
	}

	public void mergeButton() throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(mergeButton);
		mergeButton.click();
	}

	public void mergePdfTab() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(mergePdfTab);
		mergePdfTab.click();
	}

	public void addMinus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addMinus);
		addMinus.click();
	}

	public void documentMenu() throws InterruptedException {
		Thread.sleep(000);
		documentMenu.click();
	}

	public void firmTab() throws InterruptedException {
		visibilityOfAllElements(firmTab);
		firmTab.click();
		Thread.sleep(3000);
	}

	public void addPlus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addPlus);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addPlus);
		// addPlus.click();

	}

	public void selectedGroups(String[] names) throws InterruptedException {
		Thread.sleep(4000);
		selectGroups(names, groupsList, checkboxSelectGroups);
	}

	public void searchDocs(String docString) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfElementWait(searchInputFields);
		searchInputFields.clear();
		searchInputFields.sendKeys(docString);
		searchDocuments(docString, allDocumElements, checkboxDocuments);
	}

	public void searchDocs1(String docString) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfElementWait(searchInputFields);
		searchInputFields.clear();
		searchInputFields.sendKeys(docString);
		searchDocuments(docString, allDocumElements, checkboxDocuments);
	}

}
