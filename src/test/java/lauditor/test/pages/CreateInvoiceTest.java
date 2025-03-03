package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.devtools.v113.css.model.CSSStyleSheetHeader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class CreateInvoiceTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void CreateInvoiceWithoutDiscountTypeTaxType(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(4000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(3000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData1", priority = 0)
	public void CreateInvoiceWithoutDiscountTypeTaxTypeCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(3000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);
//			createInvoice.actionButton();
//			createInvoice.viewDetails();
//			Thread.sleep(3000);
//			createInvoice.assertInvDate(input.get("invDate"));
//			createInvoice.assertClientName(input.get("invClientName"));
//			createInvoice.assertDueDate(input.get("invDueDate"));
//			createInvoice.scrollDown();
//			Thread.sleep(2000);
//			createInvoice.invoiceCancel();
			
			
		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	
	@Test(dataProvider = "getData2", priority = 0)
	public void CreateInvoiceWithoutEditDiscountField(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			// createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(4000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(3000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData3", priority = 0)
	public void CreateInvoiceWithoutEditDiscountFieldCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			//createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);
		} finally {

			createInvoice.invoiceMenu();
		}

	}

	@Test(dataProvider = "getData4", priority = 0)
	public void CreateInvoiceWithoutEditDiscountPercentage(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			//createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(4000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(2000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData5", priority = 0)
	public void CreateInvoiceWithoutDiscoutPercentageCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			//createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);
		} finally {

			createInvoice.invoiceMenu();
		}

	}
	

	@Test(dataProvider = "getData6", priority = 0)
	public void CreateInvoiceWithoutEditTaxTypeField(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			
			
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
		//	createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			 createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			//createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(4000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(2000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData7", priority = 0)
	public void CreateInvoiceWithoutDiscTypeFieldCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			//createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);
		} finally {

			createInvoice.invoiceMenu();
		}

	}


	@Test(dataProvider = "getData8", priority = 0)
	public void CreateInvoiceWithoutEditTaxTypePercentage(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			//createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(4000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(3000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	

	@Test(dataProvider = "getData9", priority = 0)
	public void CreateInvoiceWithoutEditTaxTypePercentageCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			//createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	
	@Test(dataProvider = "getData10", priority = 0)
	public void CreateInvoiceWithoutNotes(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			//createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(3000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(2000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData11", priority = 0)
	
	public void CreateInvoiceWithoutNotesCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			//createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);
		} finally {

			createInvoice.invoiceMenu();
		}

	}
	
	@Test(dataProvider = "getData12", priority = 0)
	public void CreateInvoiceEditAllFields(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			//createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceSaveButton();
			Thread.sleep(3000);
			createInvoice.ScrollUpInv();
			createInvoice.actionButton();
			createInvoice.viewDetails();
			Thread.sleep(2000);
			createInvoice.assertInvDate(input.get("invDate"));
			createInvoice.assertClientName(input.get("invClientName"));
			createInvoice.assertDueDate(input.get("invDueDate"));
			createInvoice.scrollDown();
			Thread.sleep(2000);
			createInvoice.invoiceDownload();
			Thread.sleep(2000);
			createInvoice.downloadOkay();

		} finally {

			createInvoice.invoiceMenu();
		}
	}
	
	@Test(dataProvider = "getData13", priority = 0)
	public void CreateInvoiceEditAllFieldsCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createInvoice.pageDown1();
			createInvoice.invoiceMenu();
			//createInvoice.ScrollUpInv1();
			createInvoice.invoiceMenu();
			createInvoice.createInvoice();
			createInvoice.logoAreaXbutton();
			createInvoice.uploadLogo();
			createInvoice.fileUpload(input.get("filePath"));
			Thread.sleep(3000);
			createInvoice.invoiceDatepicker(input.get("Eventdate"));
			Thread.sleep(2000);
			createInvoice.selectClient(input.get("clientName"));
			createInvoice.clientAddress(input.get("clientAddress"));
			createInvoice.pageDown2();
			Thread.sleep(2000);
			createInvoice.dueDatepicker(input.get("Eventdate1"));
			Thread.sleep(2000);
			createInvoice.invoiceDescription(input.get("invDescription"));
			createInvoice.invoiceRate(input.get("invRate"));
			createInvoice.invoiceQuantity(input.get("invQty"));
			createInvoice.invDiscountType(input.get("DiscType"));
			createInvoice.disTypePercentage(input.get("DiscTypeP"));
			//createInvoice.invTaxType(input.get("TaxType"));
			createInvoice.taxTypePercentage(input.get("TaxTypeP"));
			createInvoice.invoiceNotes(input.get("invNotes"));
			createInvoice.invoiceCancel();
			Thread.sleep(3000);

		} finally {

			createInvoice.invoiceMenu();
		}
	}
	// *************************** DATA PROVIDER CLASEES ********************************//
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(4) } };

	}
	
	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(5) } };

	}
	
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(6) } };

	}
	
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(7) } };

	}
	
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(8) } };

	}
	
	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(9) } };

	}
	
	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(10) } };

	}
	
	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(11) } };

	}@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(12) } };

	}
	
	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(13) } };

	}
	
	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(14) } };

	}
	
	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(15) } };

	}
	
	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(16) } };

	}
	
	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(17) } };

	}
	
	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\CreateInvoice\\CreateInvoice.json");

		return new Object[][] { { data.get(18) } };

	}

}
