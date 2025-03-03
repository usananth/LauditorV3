package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.core.DockerContextMetaFile;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType;

import lauditor.baseClass.BaseClass;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class DocumentUploadFirmTest extends BaseClass {

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
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);
			

		} finally {
			
			documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData1", priority = 1)
	public void DocumentUploadWithoutEditDataCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			driver.navigate().refresh();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			Thread.sleep(5000);
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			Thread.sleep(2000);
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);

		} finally {
			// TODO: handle finally clause
			documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData2", priority = 2)
	public void DocumentUploadWithoutEditEnableDownload(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			driver.navigate().refresh();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			Thread.sleep(10000);
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);

		} finally {
			// TODO: handle finally 
			//documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData3", priority = 3)
	public void DocumentUploadWithoutEditEnableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.uploadCancel();
			// documentUploadFirmpages.uploadSubmitButton();
			// documentUploadFirmpages.viewChanges();

		} finally {
			// TODO: handle finally clause
		}

	}

	@Test(dataProvider = "getData4", priority = 4)
	public void DocumentUploadWithoutEditEnableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups1 = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups1);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload1(input.get("filePath1"));
			Thread.sleep(4000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(4000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData5", priority = 5)
	public void DocumentUploadWithoutEditEnableDownloadXbutton(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.xiconClose();

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData6", priority = 6)
	public void DocumentUploadWithoutDisableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();

		} finally {
			// TODO: handle finally clause
		}

	}

	@Test(dataProvider = "getData7", priority = 7)
	public void DocumentUploadWithoutDisableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadCancel();

		} finally {
			// TODO: handle finally clause
		}

	}

	@Test(dataProvider = "getData8", priority = 8)
	public void DocumentUploadWithoutEditDisableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData9", priority = 9)
	public void DocumentUploadWithoutEditDisableDownloadXbutton(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.xiconClose();

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData10", priority = 10)
	public void DocumentUploadWithoutEditCategories(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.CategoriesField(input.get("categories"));
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData11", priority = 11)
	public void DocumentUploadWithoutEditCategoriesUploadMore(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.CategoriesField(input.get("categories"));
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData12", priority = 12)
	public void DocumentUploadWithoutEditCategoriesCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.CategoriesField(input.get("categories"));
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmpages.leftsideDocument();

		}

	}

	@Test(dataProvider = "getData13", priority = 13)
	public void DocumentUploadEditDocumentName(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void DocumentUploadEditDocumentNameCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void DocumentUploadEditDocumentNameUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();
		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void DocumentUploadEditDescription(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void DocumentUploadEditDescriptionCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void DocumentUploadEditDescriptionUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();
		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void DocumentUploadEditDocumentNameandDescription(HashMap<String, String> input)
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
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData20", priority = 20)
	public void DocumentUploadEditDocumentNameandDescriptionCancel(HashMap<String, String> input)
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadCancel();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData21", priority = 21)
	public void DocumentUploadEditDocumentNameandDescriptionUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData22", priority = 22)
	public void DocumentUploadEditDocumentNameandDescriptionEnableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData23", priority = 23)
	public void DocumentUploadEditDocumentNameandDescriptionEnableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData24", priority = 24)
	public void DocumentUploadEditDocumentNameandDescriptionEnableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void DocumentUploadEditDocumentNameandDescriptionDisableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData26", priority = 26)
	public void DocumentUploadEditDocumentNameandDescriptionDisableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData27", priority = 27)
	public void DocumentUploadEditDocumentNameandDescriptionDisableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData28", priority = 28)
	public void DocumentUploadEditDocumentNameandExpiryDate(HashMap<String, String> input)
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
			Integer[] intArray1 = new Integer[] { 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.leftsideDocument();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData29", priority = 29)
	public void DocumentUploadEditDocumentNameandExpiryDateCancel(HashMap<String, String> input)
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
			Integer[] intArray1 = new Integer[] { 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDown();
//			documentUploadFirmpages.leftsideDocument();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData30", priority = 30)
	public void DocumentUploadEditDocumentNameandExpiryDateUploadMore(HashMap<String, String> input)
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
			Integer[] intArray1 = new Integer[] { 2, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData31", priority = 31)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDown();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData32", priority = 32)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDown();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData33", priority = 33)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData34", priority = 34)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData35", priority = 35)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.uploadMore();
//			documentUploadFirmpages.scrollUP();
//			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData36", priority = 36)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData37", priority = 37)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadXButton(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.xiconClose();
			documentUploadFirmpages.leftsideDocument();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData38", priority = 38)
	public void DocumentUploadEditDescriptionandExpiryDate(HashMap<String, String> input)
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData39", priority = 39)
	public void DocumentUploadEditDescriptionandExpiryDateCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData40", priority = 40)
	public void DocumentUploadEditDescriptionandExpiryDateUploadMore(HashMap<String, String> input)
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData41", priority = 41)
	public void DocumentUploadEditDescriptionandExpiryDateEnableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData42", priority = 42)
	public void DocumentUploadEditDescriptionandExpiryDateEnableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.uploadMore();
//			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData43", priority = 43)
	public void DocumentUploadEditDescriptionandExpiryDateEnableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData44", priority = 44)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData45", priority = 45)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.uploadMore();
//			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData46", priority = 46)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData47", priority = 47)
	public void DocumentUploadEditAllFields(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData48", priority = 48)
	public void DocumentUploadEditAllFieldsCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData49", priority = 49)
	public void DocumentUploadEditAllFieldsUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData50", priority = 50)
	public void DocumentUploadEditAllFieldsEnableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData51", priority = 51)
	public void DocumentUploadEditAllFieldsEnableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData52", priority = 52)
	public void DocumentUploadEditAllFieldsEnableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData53", priority = 53)
	public void DocumentUploadEditAllFieldsDisableDownload(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData54", priority = 54)
	public void DocumentUploadEditAllFieldsDisableDownloadCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData55", priority = 55)
	public void DocumentUploadEditAllFieldsDisableDownloadUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 3 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(3000);

		} finally { // documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData56", priority = 56)
	public void DocumentUploadEditDocumentNameSelectAllAddTag(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData57", priority = 57)
	public void DocumentUploadEditDocumentNameSelectAllAddTagCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData58", priority = 58)
	public void DocumentUploadEditDocumentNameSelectAllAddTagXButtonClose(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.removeTags();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData59", priority = 59)
	public void DocumentUploadWithoutEditDataAddTagSelectAll(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData60", priority = 60)
	public void DocumentUploadWithoutEditDataAddTagSelectAllCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData61", priority = 61)
	public void DocumentUploadWithoutEditDataEnableDownloadAddTagSelectAll(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData62", priority = 62)
	public void DocumentUploadWithoutEditDataEnableDownloadAddTagSelectAllCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData63", priority = 63)
	public void DocumentUploadWithoutEditDataEnableDownloadAddTagSelectAllUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData64", priority = 64)
	public void DocumentUploadWithoutEditDataCatetoriesEnableDownloadAddTagSelectAll(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.CategoriesField(input.get("categories"));
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData65", priority = 65)
	public void DocumentUploadWithoutEditDataCatetoriesEnableDownloadAddTagSelectAllCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			documentUploadFirmpages.leftsideDocument();
			documentUploadFirmpages.firmTab();
			documentUploadFirmpages.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentUploadFirmpages.DocumentUploadSelectGroups(selectGroups);
			documentUploadFirmpages.addMinus();
			documentUploadFirmpages.CategoriesField(input.get("categories"));
			documentUploadFirmpages.browseBtn();
			documentUploadFirmpages.fileUpload(input.get("filePath"));
			Thread.sleep(5000);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.uploadMore();
//			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData66", priority = 66)
	public void DocumentUploadWithoutEditDataDisableDownloadAddTagSelectAll(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);
		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData67", priority = 67)
	public void DocumentUploadWithoutEditDataDisableDownloadAddTagSelectAllCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData68", priority = 68)
	public void DocumentUploadWithoutEditDataDisableDownloadAddTagSelectAllUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			Thread.sleep(3000);
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmpages.leftsideDocument();
		}

	}

	@Test(dataProvider = "getData69", priority = 69)
	public void DocumentUploadEditDocumentNameSelectAddTagSelectAll(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData70", priority = 70)
	public void DocumentUploadEditDocumentNameSelectAddTagSelectAllCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData71", priority = 71)
	public void DocumentUploadEditDocumentNameEnableDownloadSelectAddTagSelectAll(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData72", priority = 72)
	public void DocumentUploadEditDocumentNameEnableDownloadSelectAddTagSelectAllCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData73", priority = 73)
	public void DocumentUploadEditDocumentNameEnableDownloadSelectAddTagSelectAllUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData74", priority = 74)
	public void DocumentUploadEditDocumentNameDisableDownloadSelectAddTagSelectAll(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData75", priority = 75)
	public void DocumentUploadEditDocumentNameDisableDownloadSelectAddTagSelectAllCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData76", priority = 76)
	public void DocumentUploadEditDocumentNameDisableDownloadSelectAddTagSelectAllUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Thread.sleep(3000);

			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "documName";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDocumentNameField(intArray1, desc);
			Thread.sleep(3000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData77", priority = 77)
	public void DocumentUploadEditDescriptionSelectAllTag(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData78", priority = 78)
	public void DocumentUploadEditDescriptionSelectAllTagCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData79", priority = 79)
	public void DocumentUploadEditDescriptionSelectAllTagUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData80", priority = 80)
	public void DocumentUploadEditDescriptionEnableDownloadSelectAllTag(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData81", priority = 81)
	public void DocumentUploadEditDescriptionEnableDownloadSelectAllTagCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData82", priority = 82)
	public void DocumentUploadEditDescriptionEnableDownloadSelectAllTagUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData83", priority = 83)
	public void DocumentUploadEditDescriptionDisableDownloadSelectAllTag(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData83", priority = 83)
	public void DocumentUploadEditDescriptionDisableDownloadSelectAllTagCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData84", priority = 84)
	public void DocumentUploadEditDescriptionDisableDownloadSelectAllTagUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1 };
			int count = Integer.parseInt(input.get("count"));
			String[] desc = new String[count];
			String dn = "description";
			for (int ii = 0; ii < count; ii++) {
				desc[ii] = input.get(dn + ii);
			}

			documentUploadFirmpages.editDescriptionField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(3000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData85", priority = 85)
	public void DocumentUploadEditDocumentNameDescriptionSelectAllTags(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData86", priority = 86)
	public void DocumentUploadEditDocumentNameDescriptionSelectAllTagsCancel(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(3000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {
			// documentUploadFirmPage.leftsideDocument();
		}
	}

	@Test(dataProvider = "getData87", priority = 87)
	public void DocumentUploadEditDocumentNameDescriptionSelectAllTagsUploadMore(HashMap<String, String> input)
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
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(2000);

		} finally {
			documentUploadFirmpages.firmTab();
		}
	}

	@Test(dataProvider = "getData88", priority = 88)
	public void DocumentUploadEditDocumentNameDescriptionEnableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(2000);
			documentUploadFirmpages.firmTab();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData89", priority = 89)
	public void DocumentUploadEditDocumentNameDescriptionEnableDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//		documentUploadFirmpages.uploadSubmitButton();
//		Thread.sleep(3000);
//		documentUploadFirmpages.uploadMore();
//		documentUploadFirmpages.scrollUP();
//		Thread.sleep(2000);
//		documentUploadFirmpages.firmTab();
//		Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData90", priority = 90)
	public void DocumentUploadEditDocumentNameDescriptionEnableDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(2000);
			documentUploadFirmpages.firmTab();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData91", priority = 91)
	public void DocumentUploadEditDocumentNameDescriptionDisableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);
//			documentUploadFirmpages.firmTab();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData92", priority = 92)
	public void DocumentUploadEditDocumentNameDescriptionDisableDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.disableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(3000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);
//			documentUploadFirmpages.firmTab();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData93", priority = 93)
	public void DocumentUploadEditDocumentNameDescriptionDisableDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.disableDownload();
			Thread.sleep(3000);
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "descp" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDescriptionFields(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
			Thread.sleep(2000);
			documentUploadFirmpages.firmTab();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData94", priority = 94)
	public void DocumentUploadEditDocumentNameandExpiryDateSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData95", priority = 95)
	public void DocumentUploadEditDocumentNameandExpiryDateSelectAllTagsCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(3000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData96", priority = 96)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData97", priority = 97)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(3000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData98", priority = 98)
	public void DocumentUploadEditDocumentNameandExpiryDateEnableDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData99", priority = 99)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData100", priority = 100)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadCancel();

		} finally {

		}
	}

	@Test(dataProvider = "getData101", priority = 101)
	public void DocumentUploadEditDocumentNameandExpiryDateDisableDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.disableDownload();
			documentUploadFirmpages.documentEdit();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "documName", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editDocumentNameandDateFields(intArray1, desc);
			documentUploadFirmpages.scrollDown();
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(3000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData102", priority = 102)
	public void DocumentUploadEditDescriptionandExpiryDateSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(2000);
			documentUploadFirmpages.uploadSubmitButton();
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(3000);

		} finally {

		}
	}

	@Test(dataProvider = "getData103", priority = 103)
	public void DocumentUploadEditDescriptionandExpiryDateSelectAllTagsCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadCancel();

		} finally {

		}
	}

	@Test(dataProvider = "getData104", priority = 104)
	public void DocumentUploadEditDescriptionandExpiryDateSelectAllTagsUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			documentUploadFirmpages.scrollUP();
		} finally {

		}
	}

	@Test(dataProvider = "getData105", priority = 105)
	public void DocumentUploadEditDescriptionandExpiryDateEnalbeDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);
		} finally {

		}
	}

	@Test(dataProvider = "getData106", priority = 106)
	public void DocumentUploadEditDescriptionandExpiryDateEnalbeDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadCancel();

		} finally {

		}
	}

	@Test(dataProvider = "getData107", priority = 107)
	public void DocumentUploadEditDescriptionandExpiryDateEnalbeDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData108", priority = 108)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);
		} finally {

		}
	}

	@Test(dataProvider = "getData109", priority = 109)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownloadSelectAllTagsCancel(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.enableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadCancel();

		} finally {

		}
	}

	@Test(dataProvider = "getData110", priority = 110)
	public void DocumentUploadEditDescriptionandExpiryDateDisableDownloadSelectAllTagsUploadMore(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

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
			documentUploadFirmpages.disableDownload();
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
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData111", priority = 111)
	public void DocumentUploadEditAllFieldsSelectAllTags(HashMap<String, String> input)
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
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData112", priority = 112)
	public void DocumentUploadEditAllFieldsSelectAllTagsCancel(HashMap<String, String> input)
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
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData113", priority = 113)
	public void DocumentUploadEditAllFieldsSelectAllTagsUploadMore(HashMap<String, String> input)
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
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData114", priority = 114)
	public void DocumentUploadEditAllFieldsEnableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData115", priority = 115)
	public void DocumentUploadEditAllFieldsEnableDownloadSelectAllTagsCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
//			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData116", priority = 116)
	public void DocumentUploadEditAllFieldsEnableDownloadSelectAllTagsUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.enableDownload();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData117", priority = 117)
	public void DocumentUploadEditAllFieldDisableDownloadSelectAllTags(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.viewChanges();
			documentUploadFirmpages.scrollDownViewChanges();
			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData118", priority = 118)
	public void DocumentUploadEditAllFieldsDisableDownloadSelectAllTagsCancel(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 0, 1, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
//			documentUploadFirmpages.uploadCancel();
//			documentUploadFirmpages.uploadSubmitButton();
//			Thread.sleep(2000);
//			documentUploadFirmpages.viewChanges();
//			documentUploadFirmpages.scrollDownViewChanges();
//			Thread.sleep(2000);

		} finally {

		}
	}

	@Test(dataProvider = "getData119", priority = 119)
	public void DocumentUploadEditAllFieldsDisableDownloadSelectAllTagsUploadMore(HashMap<String, String> input)
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
			documentUploadFirmpages.disableDownload();
			Integer[] intArray1 = new Integer[] { 0, 2 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][3];
			String[] dn = { "documName", "descp", "date" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 3; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.editAllField(intArray1, desc);
			Thread.sleep(2000);
			documentUploadFirmpages.addTagsButton();
			documentUploadFirmpages.selectAllCheckbox();
			documentUploadFirmpages.tagFields(input.get("addtags0"), input.get("tags0"));
			Thread.sleep(1000);
			// documentUploadFirmpages.uploadCancel();
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	}
	
	
	@Test(dataProvider = "getData120", priority = 120)
	public void DocumentUploadEditAllFieldsMultipleAddTagsandRemoveAndSave(HashMap<String, String> input)
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
			documentUploadFirmpages.addTagsButton();
			Integer[] intArray1 = new Integer[] { 0,1 };
			int count = Integer.parseInt(input.get("count"));
			String[][] desc = new String[count][2];
			String[] dn = { "addtags", "tags" };
			for (int ii = 0; ii < count; ii++) {
				for (int jj = 0; jj < 2; jj++)
					desc[ii][jj] = input.get(dn[jj] + ii);
			}
			documentUploadFirmpages.tagsAddAndRemove(intArray1, desc);
			documentUploadFirmpages.uploadSubmitButton();
			Thread.sleep(2000);
			documentUploadFirmpages.uploadMore();
			Thread.sleep(2000);

		} finally {

		}
	} 
//******************************* # Data Provider Classes # ***********************************//

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(5) } };

	}

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(6) } };

	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(7) } };

	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(8) } };

	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(9) } };

	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(10) } };

	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(13) } };

	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(15) } };

	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(17) } };

	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(19) } };

	}

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(20) } };

	}

	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(21) } };

	}

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(22) } };

	}

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(23) } };

	}

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(24) } };

	}

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(25) } };

	}

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(26) } };

	}

	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(27) } };

	}

	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(28) } };

	}

	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(29) } };

	}

	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(30) } };

	}

	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(31) } };

	}

	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(32) } };

	}

	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(33) } };

	}

	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(34) } };

	}

	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(35) } };

	}

	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(36) } };

	}

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(37) } };

	}

	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(38) } };

	}

	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(39) } };

	}

	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(40) } };

	}

	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(41) } };

	}

	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(42) } };

	}

	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(43) } };

	}

	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(44) } };

	}

	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(45) } };

	}

	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(46) } };

	}

	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(47) } };

	}

	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(48) } };

	}

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(49) } };

	}

	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(50) } };

	}

	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(51) } };

	}

	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(52) } };

	}

	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(53) } };

	}

	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(54) } };

	}

	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(55) } };

	}

	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(56) } };

	}

	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(57) } };

	}

	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(58) } };

	}

	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(59) } };

	}

	@DataProvider
	public Object[][] getData60() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(60) } };

	}

	@DataProvider
	public Object[][] getData61() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(61) } };

	}

	@DataProvider
	public Object[][] getData62() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(62) } };

	}

	@DataProvider
	public Object[][] getData63() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(63) } };

	}

	@DataProvider
	public Object[][] getData64() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(64) } };

	}

	@DataProvider
	public Object[][] getData65() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(65) } };

	}

	@DataProvider
	public Object[][] getData66() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(66) } };

	}

	@DataProvider
	public Object[][] getData67() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(67) } };

	}

	@DataProvider
	public Object[][] getData68() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(68) } };

	}

	@DataProvider
	public Object[][] getData69() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(69) } };

	}

	@DataProvider
	public Object[][] getData70() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(70) } };

	}

	@DataProvider
	public Object[][] getData71() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(71) } };

	}

	@DataProvider
	public Object[][] getData72() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(72) } };

	}

	@DataProvider
	public Object[][] getData73() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(73) } };

	}

	@DataProvider
	public Object[][] getData74() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(74) } };

	}

	@DataProvider
	public Object[][] getData75() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(75) } };

	}

	@DataProvider
	public Object[][] getData76() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(76) } };

	}

	@DataProvider
	public Object[][] getData77() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(77) } };

	}

	@DataProvider
	public Object[][] getData78() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(78) } };

	}

	@DataProvider
	public Object[][] getData79() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(79) } };

	}

	@DataProvider
	public Object[][] getData80() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(80) } };

	}

	@DataProvider
	public Object[][] getData81() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(81) } };

	}

	@DataProvider
	public Object[][] getData82() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(82) } };

	}

	@DataProvider
	public Object[][] getData83() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(83) } };

	}

	@DataProvider
	public Object[][] getData84() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(84) } };

	}

	@DataProvider
	public Object[][] getData85() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(85) } };

	}

	@DataProvider
	public Object[][] getData86() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(86) } };

	}

	@DataProvider
	public Object[][] getData87() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(87) } };

	}

	@DataProvider
	public Object[][] getData88() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(88) } };

	}

	@DataProvider
	public Object[][] getData89() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(89) } };

	}

	@DataProvider
	public Object[][] getData90() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(90) } };

	}

	@DataProvider
	public Object[][] getData91() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(91) } };

	}

	@DataProvider
	public Object[][] getData92() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(92) } };

	}

	@DataProvider
	public Object[][] getData93() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(93) } };

	}

	@DataProvider
	public Object[][] getData94() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(94) } };

	}

	@DataProvider
	public Object[][] getData95() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(95) } };

	}

	@DataProvider
	public Object[][] getData96() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(96) } };

	}

	@DataProvider
	public Object[][] getData97() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(97) } };

	}

	@DataProvider
	public Object[][] getData98() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(98) } };

	}

	@DataProvider
	public Object[][] getData99() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(99) } };

	}

	@DataProvider
	public Object[][] getData100() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(100) } };

	}

	@DataProvider
	public Object[][] getData101() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(101) } };

	}

	@DataProvider
	public Object[][] getData102() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(102) } };

	}

	@DataProvider
	public Object[][] getData103() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(103) } };

	}

	@DataProvider
	public Object[][] getData104() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(104) } };

	}

	@DataProvider
	public Object[][] getData105() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(105) } };

	}

	@DataProvider
	public Object[][] getData106() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(106) } };

	}

	@DataProvider
	public Object[][] getData107() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(107) } };

	}

	@DataProvider
	public Object[][] getData108() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(108) } };

	}

	@DataProvider
	public Object[][] getData109() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(109) } };

	}

	@DataProvider
	public Object[][] getData110() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(110) } };

	}

	@DataProvider
	public Object[][] getData111() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(111) } };

	}

	@DataProvider
	public Object[][] getData112() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(112) } };

	}

	@DataProvider
	public Object[][] getData113() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(113) } };

	}

	@DataProvider
	public Object[][] getData114() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(114) } };

	}

	@DataProvider
	public Object[][] getData115() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(115) } };

	}

	@DataProvider
	public Object[][] getData116() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(116) } };

	}

	@DataProvider
	public Object[][] getData117() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(117) } };

	}

	@DataProvider
	public Object[][] getData118() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(118) } };

	}

	@DataProvider
	public Object[][] getData119() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(119) } };

	}
	
	@DataProvider
	public Object[][] getData120() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\DocumentUpload\\DocumentUploadFirm.json");

		return new Object[][] { { data.get(120) } };

	}

}
