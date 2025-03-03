package lauditor.pom.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class DocumentViewFirmPages extends AbstractClass {
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public DocumentViewFirmPages(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	// Left Side Document
	@FindBy(xpath = "//*[text()='Documents']")
	WebElement leftSideDocument;

	public void leftsideDocument() throws InterruptedException {
		Thread.sleep(3000);
		leftSideDocument.click();
	}

	// Docuemnt View Tab
	@FindBy(xpath = "//*[text()='View']")
	WebElement viewTabElement;

	public void viewTabClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		visibilityOfAllElements(viewTabElement);
		js.executeScript("arguments[0].click();", viewTabElement);

	}

	// Document Firm Tab
	@FindBy(xpath = "//*[text()='Firm']")
	WebElement firmTabElement;

	public void firmTabClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		visibilityOfAllElements(firmTabElement);
		js.executeScript("arguments[0].click();", firmTabElement);

	}

	// List of Groups
	@FindBy(xpath = "//div [@class='input-group index court']//div[@class='multicheck form-control textbox']")
	List<WebElement> listofGroups;

	// CheckBox
	@FindBy(xpath = "//div[@class='input-group index court'] //input[@id='flexCheckDefault']")
	List<WebElement> checkboxSelectElement;

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addPlus;

	public void addPlus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addPlus);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Call the JavascriptExecutor methods
		js.executeScript("arguments[0].click();", addPlus);
		// addPlus.click();

	}

	@FindBy(xpath = "//i[@aria-hidden='true']")
	WebElement addMinus;

	public void addMinus() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(addMinus);
		addMinus.click();
	}

	public void openFile(String path) throws InterruptedException {
		getFile(path);
	}

	public void fileUpload(String path) throws InterruptedException {
		Thread.sleep(5000);
		getFile(path);
	}

	// BrowserBtn
	@FindBy(id = "btnadd")
	WebElement browseBtn;

	public void browseBtn() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(browseBtn);
		browseBtn.click();
	}

	// Search All Documents
	@FindBy(xpath = "//tr//td[1]")
	List<WebElement> searchDocuments;

	// Action Button Section
	@FindBy(xpath = "//tr//td[7]")
	List<WebElement> actionBtnClicked;
	// button[@class='btn btn-primary dropdown-toggle actionbtn show'
	// Action Button
	@FindBy(xpath = "//button[@class='btn btn-primary dropdown-toggle actionbtn']")
	WebElement actionBtn;

	// Document view Search
	@FindBy(xpath = "//input[@placeholder='Search ']")
	WebElement searchDocumentInput;

	// Select Filter Dropdown
	@FindBy(xpath = "//div[@class='dropdown-select filter']//select")
	WebElement filterDropdown;
	// Select Filter View Merged
	@FindBy(xpath = "//select[position()=1]")
	WebElement filterViewMerged;

	public void filterDropdown() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(filterViewMerged);
		filterViewMerged.sendKeys("View-Merged", Keys.ARROW_DOWN);

	}

	// Action Button View Merged
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Action'])[1]")
	WebElement VMActionBtn;

	public void ViewMergedActionButton() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(VMActionBtn);
		VMActionBtn.click();
		Thread.sleep(2000);
	}

	// ul[@class='dropdown-menu custom-dropdown
	// show']//a[@class='dropdown-item'][normalize-space()='View']
	// Action View Merged View Button
	@FindBy(xpath = "//ul[@class='dropdown-menu custom-dropdown show']//a[@class='dropdown-item'][normalize-space()='View']")
	WebElement actionMergeView;

	public void actionMergeView() throws InterruptedException {
		visibilityOfAllElements(actionMergeView);
		actionMergeView.click();
		Thread.sleep(10000);
		actionMergeXClose.click();
	}

	// Action View Merged View Button X Close
	@FindBy(xpath = "//jw-modal[@id='custom-modal-iframe']//div[@class='close-x float-right'][normalize-space()='X']")
	WebElement actionMergeXClose;

	public void actionMergeXClose() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionMergeXClose);
		actionMergeXClose.click();
	}

	// Action View X Close
	@FindBy(xpath = "(//div[@class='iconclose'])[1]")
	WebElement actionViewXClose;

	public void actionViewXClose() {
		visibilityOfAllElements(actionViewXClose);
		actionViewXClose.click();
	}

	// View Merged Download
	@FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
	WebElement mergeViewDownload;

	// View Merged Action Download OK
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	WebElement mergeViewDownloadOK;

	public void mergeViewDownload() throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(mergeViewDownload);
		mergeViewDownload.click();
		Thread.sleep(2000);
		mergeViewDownloadOK.click();

	}

	// View Merged Action DeletePDF
	@FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
	WebElement mergeViewDeletePDF;

	// View Merged Action DeletePDF Pop_up Yes
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnyes'])[1]")
	WebElement mergeViewDeleteYes;

	// View Merged Action DeletePDF Pop_up No
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnno'][1])[1]")
	WebElement mergeViewDeleteNo;

	// View Merged Action DeletePDF
	@FindBy(xpath = "(//div[@class='iconclose'][normalize-space()='X'])[2]")
	WebElement mergeViewDeletePDF_XClose;

	public void mergeViewDeletePDF_Popup_Yes() throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(mergeViewDeletePDF);
		mergeViewDeletePDF.click();
		Thread.sleep(2000);
		mergeViewDeleteYes.click();
	}

	public void mergeViewDeletePDF_Popup_No() throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(mergeViewDeletePDF);
		mergeViewDeletePDF.click();
		Thread.sleep(2000);
		mergeViewDeleteNo.click();
	}

	public void mergeViewDeletePDF_Popup_XButtonClose() throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(mergeViewDeletePDF);
		mergeViewDeletePDF.click();
		Thread.sleep(2000);
		mergeViewDeletePDF_XClose.click();
	}

	// Editinfo Document Field
	@FindBy(xpath = "//input[@id='caseTitle']")
	WebElement editDocumentField;

	public void editDocumentField(String document) {
		visibilityOfAllElements(editDocumentField);
		editDocumentField.clear();
		visibilityOfAllElements(editDocumentField);
		editDocumentField.sendKeys(document);
	}

	// Edit Document Description
	@FindBy(xpath = "(//textarea[@name='description'])[1]")
	WebElement editDescriptionField;

	public void editDescriptionField(String description) {
		visibilityOfAllElements(editDescriptionField);
		editDescriptionField.clear();
		visibilityOfAllElements(editDescriptionField);
		editDescriptionField.sendKeys(description);
	}

	// Edit info Expiration Date

	@FindBy(xpath = "//i[@class='fa fa-calendar']")
	WebElement expirationDate;

	public void expirationDate() throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(expirationDate);
		expirationDate.click();

	}

	@FindBy(xpath = "//button[3]")
	WebElement expYearElement;
	@FindBy(xpath = "//div //td[@role='gridcell']")
	WebElement expYearSelectElement;

	@FindBy(xpath = "//button[@class='current'][2]")
	WebElement expMonElement;

	public void expDateYear(String year, String Month, String Date) throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(expYearElement);
		expYearElement.click();

	}

	// ExpDate Input Box

	// Editinfo Edit Save Button
	@FindBy(xpath = "//button[@class='btn btn-default btnsave']")
	WebElement editInfoSubmit;

	public void editSaveButton() throws InterruptedException {
		Thread.sleep(5000);
		visibilityOfAllElements(editInfoSubmit);
		editInfoSubmit.click();
	}

	// Editinfo Cancel Button
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement editInfoCancel;

	public void editCancelButton() {
		visibilityOfAllElements(editInfoCancel);
		editInfoCancel.click();

	}

	// Editinfo Alert Pop up OK
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	WebElement editInfoAlertOk;

	public void editInfoAlertOK() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(editInfoAlertOk);
		editInfoAlertOk.click();
	}

	// Editinfo XClose Button
	@FindBy(xpath = "//button[@class='btn-close']")
	WebElement editInfoXButton;

	public void editInfoXButton() {
		visibilityOfAllElements(editInfoXButton);
		editInfoXButton.click();

	}

	public void editInfoexpDate() throws InterruptedException {
		visibilityOfAllElements(expirationDate);
		expirationDate.click();
		Thread.sleep(5000);

	}

	public void dateChoose(String date) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	// Action Menu View
	@FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='View'])[1]")
	WebElement actionView;

	public void actionView() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionView);
		Actions action = new Actions(driver);
		action.moveToElement(actionView).click().perform();
	}

// Action Menu Edit info
	@FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='Edit info'])[1]")
	WebElement actionEditinfo;

	public void actionEditinfo() {
		visibilityOfAllElements(actionEditinfo);
		Actions action = new Actions(driver);
		action.moveToElement(actionEditinfo).click().perform();
	}

//Action Menu Download
	@FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='Download'])[1]")
	WebElement actionDownload;

	// Action Menu Download Popup OK
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	WebElement downloadOk;

	public void actionMenuDownload() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionDownload);
		actionDownload.click();
		Thread.sleep(2000);
		downloadOk.click();
	}

	// Action Menu Delete
	@FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='Delete'])[1]")
	WebElement actionDelete;

	// Action Menu Delete Alert popup Yes
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnyes'])[2]")
	WebElement deleteAlertYes;

	// Action Menu Delete Alert popup No
	@FindBy(xpath = "(//button[@class='btn btn-default alertbtn alertbtnno'])[2]")
	WebElement deleteAlertNo;

	// Action Menu Delete Alert X Close

	@FindBy(xpath = "(//div[@class='iconclose'][normalize-space()='X'])[3]")
	WebElement deleteAlertXClose;

	public void SearchDocumentInSearchBar(String documentName) throws InterruptedException {
		visibilityOfAllElements(searchDocumentInput);
		searchDocumentInput.clear();
		searchDocumentInput.sendKeys(documentName);
		pageDown();
		Actions action = new Actions(driver);
		for (int i = 0; i < searchDocuments.size(); i++) {
			String docNames = searchDocuments.get(i).getText();
			if (documentName.contains(docNames)) {
				visibilityOfAllElements(actionBtn);
				WebElement actionClicked = actionBtnClicked.get(i);
				visibilityOfAllElements(actionBtn);
				action.moveToElement(actionClicked).click().perform();

			}

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

	public void editInfoDocumentNameOnly(String names) throws InterruptedException {
		editDocumentField(names);
		editSaveButton();
	}

	public void editInfoDescriptionOnly(String names) throws InterruptedException {
		editDescriptionField(names);
		editSaveButton();
	}

	public void editInfoDocumentNameandDescription(String docName, String desName) throws InterruptedException {
		editDocumentField(docName);
		editDescriptionField(desName);
		editSaveButton();
	}

	public void editDocumentNameandDateFields(String docName) throws InterruptedException {
		editDocumentField(docName);
		expirationDate.click();
		Thread.sleep(5000);
		WebElement Year = driver.findElement(By.xpath("//button[3]"));
		Year.click();
		Thread.sleep(5000);
		WebElement yearSelectElement = driver.findElement(By.xpath("//span[.='2025']"));
		yearSelectElement.click();
		Thread.sleep(5000);
		WebElement monthSelectElement = driver.findElement(By.xpath("//span[contains(.,'January')]"));
		monthSelectElement.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(normalize-space(),'19')]")).click();
		Thread.sleep(5000);

	}

	public void actionDelete() throws InterruptedException {
		actionBtn.click();
		Thread.sleep(3000);
		visibilityOfAllElements(actionDelete);
		actionDelete.click();

	}

	public void actionDeleteYes() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(deleteAlertYes);
		deleteAlertYes.click();
	}

	// Action Delete Confirm Yes Ok
	@FindBy(xpath = "(//button[@class='btn btn-primary'][normalize-space()='OK'])[1]")
	WebElement actionDeleteYesOK;

	public void actionDeleteYesOK() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionDeleteYesOK);
		actionDeleteYesOK.click();

	}

	public void actionDeleteNo() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(deleteAlertNo);
		deleteAlertNo.click();
	}

	public void actionDeleteXClose() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(deleteAlertXClose);
		deleteAlertXClose.click();
	}

	// String names ="List of Firm Documents";

	@FindBy(xpath = "//div[@class='custusername tab-margin fontweight']")
	WebElement texts;

	public void documentIsDisplay(String documents) throws InterruptedException {
		ScrollUp();
		visibilityOfAllElements(texts);
		String docs = texts.getText();
		if (documents.contains(docs)) {
			System.out.println("Name is displayed");
		} else {
			System.out.println("Nmae not displayed");
		}
	}

	public void scrolldownDocuments() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,450)");
	}
}
