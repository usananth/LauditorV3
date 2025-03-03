package lauditor.pom.pages;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Optional;

import javax.management.openmbean.InvalidOpenTypeException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lauditor.abstractclass.AbstractClass;

public class CreateInvoicePageandView extends AbstractClass {
	WebDriver driver;

	public CreateInvoicePageandView(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Invoice Menu
	@FindBy(xpath = "//*[text()='Invoices']")
	WebElement invoiceMenu;

	// Create Invoid Tab
	@FindBy(xpath = "//a[text()='Create']")
	WebElement createInvoice;

	// View Invoice Tab
	@FindBy(xpath = "//a[text()='View']")
	WebElement viewInvoice;

	// Logo X Symbol
	@FindBy(xpath = "//i[contains(@aria-hidden,'true')]")
	WebElement uploadXbutton;

	// Add Logo
	@FindBy(xpath = "//div[@id='imagePreview']")
	WebElement addLogoArea;

	public void openFile(String path) throws InterruptedException {
		getFile(path);
	}

	public void fileUpload(String path) throws InterruptedException {
		Thread.sleep(4000);
		getFile(path);
	}

	public void invoiceMenu() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(invoiceMenu);
		invoiceMenu.click();

	}

	public void logoAreaXbutton() {
		visibilityOfAllElements(uploadXbutton);
		uploadXbutton.click();
	}

	public void createInvoice() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(createInvoice);
		createInvoice.click();
	}

	public void viewInvoice() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(viewInvoice);
		viewInvoice.click();
	}

	// Invoice search bar
	@FindBy(xpath = "(//input[@placeholder='Search Invoice'])[1]")
	WebElement searchInvoiceField;

	public void searchInvoice(String invNumber) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfElementWait(searchInvoiceField);
		searchInvoiceField.clear();
		searchInvoiceField.sendKeys(invNumber);

	}

	public void uploadLogo() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(addLogoArea);
		addLogoArea.click();
	}

	// Invoice Date Picker
	@FindBy(xpath = "(//img[@id='datepicker'])[1]")
	WebElement invoiceDate;

	// Due Date Picker
	@FindBy(xpath = "(//img[@id='datepicker'])[2]")
	WebElement dueDate;

	// Select Event Year
	@FindBy(xpath = "(//div[@class='bs-datepicker-head'] //button[@class='current'][2]")
	WebElement EventYear;

	// Select Exact Month
	@FindBy(xpath = "(//div[@class='bs-datepicker-head'] //button[@class='current'])[1]")
	WebElement EventMonths;

	// Select all Dates
	@FindBy(xpath = "//td[@role='gridcell']")
	List<WebElement> EventDates;

	// Client Input
	@FindBy(xpath = "//input[@placeholder='Type to select']")
	WebElement clientInput;

	// Client Address

	@FindBy(xpath = "//input[@formcontrolname='billto']")
	WebElement clientAddress;

	// Invoice Description
	@FindBy(xpath = "//input[@placeholder='Description']")
	WebElement invoiceDescription;

	// Invoice Rate
	@FindBy(xpath = "//input[@placeholder='Rate']")
	WebElement invoiceRate;

	// Invoice Rate
	@FindBy(xpath = "//input[@placeholder='Quantity']")
	WebElement invoiceQuantity;

	// Invoice Disconut Type
	@FindBy(xpath = "//input[@placeholder='Discount Type']")
	WebElement invDiscountType;

	// Invoice Tax Percentage
	@FindBy(xpath = "//input[@placeholder='Tax Type']")
	WebElement invoiceTax;

	// Discount Type Percentage
	@FindBy(xpath = "(//input[@placeholder='(%)'])[1]")
	WebElement disTypePercentage;

	// Tax Type Percentage
	@FindBy(xpath = "(//input[@placeholder='(%)'])[2]")
	WebElement taxTypePercentage;

	// Add More Description Button + Add
	@FindBy(xpath = "//button[text()=' + Add ']")
	WebElement addPlus;

	// Note for Invoice
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement invoiceNotes;

	// Invoice Save Button
	@FindBy(xpath = "//button[text()='Save']")
	WebElement invoiceSaveBtn;

	// Invoice Cancel Button
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement invoiceCancelBtn;

	// View Action Button
	@FindBy(xpath = "(//button[text()=' Action '])[1]")
	WebElement actionButton;

	// Action View Details
	@FindBy(xpath = "(//a[text()='View Details'])[1]")
	WebElement viewDetails;

	// Action Share
	@FindBy(xpath = "(//a[text()='Share'])[1]")
	WebElement actionShare;

	// Action Share
	@FindBy(xpath = "(//a[text()='Delete'])[1]")
	WebElement actionDelete;

	// Invoice Download Button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement invDownload;

	// Invoice View Cancel
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement InvCancel;

	// Invoice View Menu

	public void invoiceCancel() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(InvCancel);
		InvCancel.click();
	}

	public void invoiceDownload() throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(invDownload);
		invDownload.click();
	}

	public void actionButton() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionButton);
		actionButton.click();
	}

	public void shareAction() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(actionShare);
		Actions action = new Actions(driver);
		action.moveToElement(actionShare).click().perform();
	}

	public void viewDetails() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(viewDetails);
		Actions action = new Actions(driver);
		action.moveToElement(viewDetails).click().perform();
	}

	// Assert Validations

	public void assertInvDate(String Actual) throws InterruptedException {
		Thread.sleep(2000);
		String expInvDate = invDateAssert.getText();
		assertEquals(Actual, expInvDate);
	}

	public void assertClientName(String Actual) throws InterruptedException {
		Thread.sleep(2000);
		String expClientName = invNameAssert.getText();
		assertEquals(Actual, expClientName);
	}

	public void assertDueDate(String Actual) throws InterruptedException {
		Thread.sleep(2000);
		String expDueDate = invDueAssert.getText();
		assertEquals(Actual, expDueDate);
	}
	
	//Assert Invoice Name
	@FindBy(xpath = "(//div[@class='alertpara alertparatxt sharewith'])[1]")
	WebElement assertClientName;
	
	public void assertInvioceName(String Actual) throws InterruptedException {
		Thread.sleep(2000);
		String expInvoiceName= assertClientName.getText();
		assertEquals(Actual, expInvoiceName);
	}

// Action share 
	@FindBy(xpath = "//a[text()='Share']")
	WebElement shareMenu;

	public void shareMenu() {
		visibilityOfAllElements(shareMenu);
		shareMenu.click();
	}

	// Assert Date of Invoice
	@FindBy(xpath = "//div[@class='input-group court form-control textbox invoiceCls']")
	WebElement invDateAssert;

	// Name Assert
	@FindBy(xpath = "(//div [@class='input-group form-control textbox invoiceCls'])[1]")
	WebElement invNameAssert;

	// Client Address
	@FindBy(xpath = "(//div [@class='input-group form-control textbox invoiceCls'])[2]")
	WebElement clientInvAddress;

	// Invoice Due Date
	@FindBy(xpath = "(//div [@class='input-group form-control textbox invoiceCls'])[3]")
	WebElement invDueAssert;

	// Invioce Client Address
	public void clientAddress(String clientaddress) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(clientAddress);
		clientAddress.sendKeys(clientaddress);
	}

	// Invoice Download OK Button
	@FindBy(xpath = "//button[text()='OK']")
	WebElement downloadOK;

	public void downloadOkay() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(downloadOK);
		downloadOK.click();
	}

	// Select Client
	public void selectClient(String selectClient) throws InterruptedException {

		// driver.findElement(By.cssSelector("input[placeholder='Type to select']"));
		// WebElement scElement=driver.findElement(By.xpath("//input[@placeholder='Type
		// to select']"));
		Thread.sleep(2000);
		clientInput.sendKeys(selectClient);
		Thread.sleep(1000);
		clientInput.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		clientInput.sendKeys(Keys.ENTER);
	}

	public void invoiceDatepicker(String EDate) throws InterruptedException {
		Thread.sleep(3000);
		invoiceDate.click();
		driver.findElement(By.xpath("//*[text()='" + EDate + "']")).click();
	}

	public void dueDatepicker(String EDate1) throws InterruptedException {
		Thread.sleep(3000);
		dueDate.click();
		driver.findElement(By.xpath("//*[text()='" + EDate1 + "']")).click();
	}

	public void invoiceDescription(String invDesc) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(invoiceDescription);
		invoiceDescription.sendKeys(invDesc);
	}

	public void invoiceRate(String invRate) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(invoiceRate);
		invoiceRate.sendKeys("" + invRate);
	}

	public void invoiceQuantity(String invQty) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(invoiceQuantity);
		invoiceQuantity.sendKeys("" + invQty);
	}

	public void invDiscountType(String disType) throws InterruptedException {
		Thread.sleep(1000);
		invDiscountType.clear();
		visibilityOfAllElements(invDiscountType);
		invDiscountType.sendKeys(disType);
	}

	public void disTypePercentage(String disTypePer) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(disTypePercentage);
		disTypePercentage.sendKeys(disTypePer);
	}

	public void invTaxType(String taxType) throws InterruptedException {
		Thread.sleep(1000);
		invoiceTax.clear();
		visibilityOfAllElements(invoiceTax);
		invoiceTax.sendKeys(taxType);
	}

	public void taxTypePercentage(String taxTypePer) throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(taxTypePercentage);
		taxTypePercentage.sendKeys(taxTypePer);
	}

	public void addPlusButton() {
		visibilityOfAllElements(addPlus);
		addPlus.click();
	}

	public void invoiceNotes(String invNotes) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(invoiceNotes);
		invoiceNotes.sendKeys(invNotes);
	}

	public void invoiceSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(invoiceSaveBtn);
		invoiceSaveBtn.click();
	}

	public void invoiceCancelButton() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(invoiceCancelBtn);
		invoiceCancelBtn.click();
	}

}
