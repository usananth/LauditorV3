package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class DocumentUploadExpiryDateTest2 extends BaseClass {
	@Test(dataProvider = "getData0", priority = 0) 
	public void DocumentUploadExpirayDateEdit(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);

			documentUploadFirmpages.scrollDown();
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData25") // Test One
	public void DocumentUploadExpirayDate(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.documentEdit();
			documentUploadFirmpages.editSave();
			documentUploadFirmpages.scrollDown();
			
			Thread.sleep(3000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}

	}
	
	
	@Test(dataProvider = "getData110")
	public void DocumentUploadExpirayDateEdit1(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			Integer[] intArray1 = new Integer[] { 0, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@DataProvider
	public Object[][] getData110() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data.get(0) } };

	}
	
	@Test(dataProvider = "getData111", priority = 1)
	public void DocumentUploadExpirayDateEdit2(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			Integer[] intArray1 = new Integer[] { 0, 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
			//documentUploadFirmpages.uploadSubmitButton();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@DataProvider
	public Object[][] getData111() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data.get(1) } };

	}
	@Test(dataProvider = "getData112", priority = 0)
	public void DocumentUploadExpirayDateEdit3(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDescriptionandExpirationDateFields(intArray1, desc);
			Thread.sleep(2000);
			//documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@DataProvider
	public Object[][] getData112() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data.get(0) } };

	}



	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Matter\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Matter\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data1 = getJsonDataToMap1(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadWithExpiryDate.json");

		return new Object[][] { { data1.get(0) } };

	}
	
	@Test(dataProvider = "getData", priority = 0)
	public void DocumentUploadWithoutEditData(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.uploadSubmitButton();

		
		} finally {
			// TODO: handle finally clause
		}

	}
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(0) } };

	}
}
