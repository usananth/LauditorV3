package lauditor.pom.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class DocumentUploadFirmPages extends AbstractClass {
	WebDriver driver;

	public DocumentUploadFirmPages(WebDriver driver) {
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

	public void firmTab() throws InterruptedException {
		visibilityOfAllElements(firmTab);
		firmTab.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//div [@class='input-group index court']//div[@class='multicheck form-control textbox']")
	List<WebElement> listofGroups;

	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChanges;

	public void viewChanges() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(viewChanges);
		viewChanges.click();
	}

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

	public void fileUpload1(String path1) throws InterruptedException {
		Thread.sleep(5000);
		getFile(path1);
	}

	AbstractClass reusable = new AbstractClass(driver);

	// CheckBox
	@FindBy(xpath = "//div[@class='input-group index court'] //input[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectElement;
	
	
	// Categories Text Fields
	@FindBy(xpath = "//input[@id='caseType']")
	WebElement categoriesText;

	public void CategoriesField(String catString) {
		visibilityOfAllElements(categoriesText);
		categoriesText.sendKeys(catString);

	}

	// View Changes success pop up
	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement viewChangesPopup;
	// Success popup X Button
	@FindBy(xpath = "//div[@class='iconclose']")
	WebElement xiconClose;

	public void xiconClose() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(xiconClose);
		xiconClose.click();
	}

	// Enable Download
	@FindBy(xpath = "//*[text()='Enable Download']")
	WebElement enableDownload;

	public void enableDownload() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(enableDownload);
		enableDownload.click();
	}

	// Disable Download
	@FindBy(xpath = "//*[text()='Disable Download']")
	WebElement disableDownload;

	public void disableDownload() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(disableDownload);
		disableDownload.click();
	}

	// Add Tags
	@FindBy(xpath = "//label[@for='btnradio4']")
	WebElement addTagsTab;
	// Select All Check Box
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement selectAllCheckbox;

	// Tag Type
	@FindBy(xpath = "(//input[@id='caseType'])[2]")
	WebElement tagTypeInput;

	// Tags
	@FindBy(xpath = "(//input[@id='caseType'])[3]")
	WebElement tagInput;

	// Add Button
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement addButtonForAddTags;

	public void addTagsButton() {
		visibilityOfAllElements(addTagsTab);
		addTagsTab.click();
	}

	public void selectAllCheckbox() throws InterruptedException {
		visibilityOfAllElements(selectAllCheckbox);
		selectAllCheckbox.click();
		pageDown();
		Thread.sleep(4000);

	}

	public void addButtonAddTags() {
		visibilityOfAllElements(addButtonForAddTags);
		addButtonForAddTags.click();
	}

	public void tagFields(String tag1, String tag2) throws InterruptedException {
		visibilityOfAllElements(tagTypeInput);
		tagTypeInput.sendKeys(tag1);
		visibilityOfAllElements(tagInput);
		tagInput.sendKeys(tag2);
		visibilityOfAllElements(editSave);
		editSaveButton();

	}

	@FindBy(xpath = "//div[@class='icon-list'] //div //input[@type='checkbox']")
	List<WebElement> tagsSelect;

	public void tagsAdd(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			tagsSelect.get(eb).click();
			pageDown();
			Thread.sleep(1000);
			addButtonAddTags();
			pageDown();
			Thread.sleep(1000);
			tagFields(des[eb][0], des[eb][1]);
		}

	}

	// Before adding the tags, remove the empty tags
	public void tagsAddAndRemove(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			tagsSelect.get(eb).click();
			addButtonAddTags();
			pageDown();
			removeTags();
			addButtonAddTags();
			pageDown();
			tagFields(des[eb][0], des[eb][1]);
		}

	}

	public void tagsFields1(String names1, String names2) throws InterruptedException {
		visibilityOfAllElements(tagTypeInput);
		tagTypeInput.sendKeys(names1);
		visibilityOfAllElements(tagInput);
		tagInput.sendKeys(names2);
		visibilityOfAllElements(editSave);
		removeTags();
		editSaveButton();
	}

	public void tagsAddandRemoveaddedText(Integer[] intArray, String[][] des) throws InterruptedException {

		int jj = 0;
		for (jj = 0; jj < intArray.length; jj++) {
			Thread.sleep(2000);
			int eb = intArray[jj];
			tagsSelect.get(eb).click();
			pageDown();
			addButtonAddTags();
			pageDown();
			tagsFields1(des[eb][0], des[eb][1]);

		}

	}

	@FindBy(xpath = "//div[@class='col-2']  //i[@class='fa fa-times-circle']")
	List<WebElement> removeTags;

	public void removeTags() {
		for (int i = 0; i < removeTags.size(); i++) {
			removeTags.get(i).click();
		}
	}

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addPlus;

	public void addPlus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addPlus);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	       
        // Call the JavascriptExecutor methods
        js.executeScript("arguments[0].click();", addPlus);
		//addPlus.click();

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

//MetaData Edit	
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

	public void uploadMore() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(uploadMore);
		uploadMore.click();
	}

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
		documentField.clear();
		visibilityOfAllElements(documentField);
		documentField.sendKeys(document);
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

	// Edit MetaData
	@FindBy(xpath = "//i[contains(@class,'fa fa-edit')]")
	List<WebElement> editDocuments;

	// SubmitBtnEdit
	// @FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement editSave;

	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	List<WebElement> removeDocument;

	public void editSave() {
		visibilityOfAllElements(editSave);
		editSave.click();
	}

	public void editSaveButton() throws InterruptedException {
		pageDown();
		Thread.sleep(3000);
		visibilityOfAllElements(editSave);
		editSave.click();

	}

	public void editDocumentNameOnly(String names) throws InterruptedException {
		editDocumentField(names);
		editSave.click();
	}

	public void editDocumentNameandDescription(String names, String names1) throws InterruptedException {
		editDocumentField(names);
		editDescriptionField(names1);
		editSave.click();
	}

	public void editDocumentNameandExpirateDate(String names, String date) throws InterruptedException {
		editDocumentField(names);
		expiryDate();
		Thread.sleep(2000);
		dateChoose(date);
		Thread.sleep(1000);
		editSave.click();
	}

	public void editDescriptionandExpirationDate(String names, String date) throws InterruptedException {
		editDescriptionField(names);
		expiryDate();
		Thread.sleep(3000);
		dateChoose(date);
		Thread.sleep(1000);
		editSave.click();
	}

	public void editAllFields(String names, String names1, String dates) throws InterruptedException {
		editDocumentField(names);
		editDescriptionField(names1);
		expiryDate();
		Thread.sleep(2000);
		dateChoose(dates);
		editSave.click();
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
			editSave();
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
			editSave();
		}

	}

	@FindBy(xpath = "//div //i[@class='fa fa-edit']")
	List<WebElement> editButton;

	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	List<WebElement> xRemoveCircle;

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
			editSave();
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

		for (int jj = 0; jj < intArray.length; jj++) {
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

	public void DocumentUploadSelectGroups(String[] selectGroups) throws InterruptedException {

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

	public void scrollDown() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollDownViewChanges() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollUP() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-600)");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void scrollTagSave() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

//********************** Document Upload Without Edit Meta Data *************************//

}