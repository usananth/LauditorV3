package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class MergePDFTest extends BaseClass {

	@Test(dataProvider = "getData", priority = 0)
	public void DocuemntMergePDFFirms(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			Thread.sleep(5000);
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeBtn1();

		} finally {

			// mergePDFPage.documentMenu();
		}
	}

	@Test(dataProvider = "getData1", priority = 0)
	public void DocuemntMergePDFSelectDocumntsCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeCanButton();

		} finally {

			mergePDFPage.documentMenu();
		}
	}

	@Test(dataProvider = "getData2", priority = 0)
	public void DocuemntMergePDFFirmsAddMoreDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			mergePDFPage.addMorePdffiles();
			mergePDFPage.addPlus();
			String[] selectGroups1 = { input.get("selectGroup1"), input.get("selectGroup2"),
					input.get("selectGroup3") };
			mergePDFPage.selectedGroups(selectGroups1);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs1(input.get("searchDoc3"));
			mergePDFPage.mergeButton();
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeBtn1();

		} finally {

			// mergePDFPage.documentMenu();
		}

	}

	@Test(dataProvider = "getData3", priority = 0)
	public void DocuemntMergePDFFirmsAddMoreDocumentsCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			mergePDFPage.addMorePdffiles();
			mergePDFPage.addPlus();
			String[] selectGroups1 = { input.get("selectGroup1"), input.get("selectGroup2"),
					input.get("selectGroup3") };
			mergePDFPage.selectedGroups(selectGroups1);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs1(input.get("searchDoc3"));
			mergePDFPage.mergeButton();
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeCanButton();

		} finally {

			// mergePDFPage.documentMenu();
		}
	}

	
	@Test(dataProvider = "getData4", priority = 0)
	public void DocuemntMergePDFFirmsPreambles(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			Thread.sleep(3000);
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.preambleText(input.get("preambleText"));
			mergePDFPage.preambleTextArea(input.get("preamTextarea"));
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeBtn1();

		} finally {

			// mergePDFPage.documentMenu();
		}
	}

	@Test(dataProvider = "getData5", priority = 0)
	public void DocuemntMergePDFFirmsPreamblesCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			Thread.sleep(3000);
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.preambleText(input.get("preambleText"));
			mergePDFPage.preambleTextArea(input.get("preamTextarea"));
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeBtn1();


		} finally {

			// mergePDFPage.documentMenu();
		}
	}
	
	
	@Test(dataProvider = "getData5", priority = 0)
	public void DocuemntMergePDFFirmsPreamblesAddMoreDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
		
				mergePDFPage.documentMenu();
				mergePDFPage.mergePdfTab();
				mergePDFPage.firmTab();
				mergePDFPage.addPlus();
				String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
				mergePDFPage.selectedGroups(selectGroups);
								mergePDFPage.addMinus();
				Thread.sleep(3000);
				mergePDFPage.searchDocs(input.get("searchDoc1"));
				mergePDFPage.searchDocs1(input.get("searchDoc2"));
				Thread.sleep(3000);
				mergePDFPage.mergeButton();
				mergePDFPage.addMorePdffiles();
				mergePDFPage.addPlus();
				String[] selectGroups1 = { input.get("selectGroup1"), input.get("selectGroup2"),
						input.get("selectGroup3") };
				mergePDFPage.selectedGroups(selectGroups1);
				mergePDFPage.addMinus();
				Thread.sleep(3000);
				mergePDFPage.searchDocs1(input.get("searchDoc3"));
				mergePDFPage.mergeButton();
				mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
				mergePDFPage.preambleText(input.get("preambleText"));
				mergePDFPage.preambleTextArea(input.get("preamTextarea"));
				mergePDFPage.scrollHeight();
				mergePDFPage.mergeBtn1();
			} finally {

				// mergePDFPage.documentMenu();
			}

	}

	
	@Test(dataProvider = "getData6", priority = 0)
	public void DocuemntMergePDFFirmsPreamblesAddMoreDocumentsCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
		
				mergePDFPage.documentMenu();
				mergePDFPage.mergePdfTab();
				mergePDFPage.firmTab();
				mergePDFPage.addPlus();
				String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
				mergePDFPage.selectedGroups(selectGroups);
								mergePDFPage.addMinus();
				Thread.sleep(3000);
				mergePDFPage.searchDocs(input.get("searchDoc1"));
				mergePDFPage.searchDocs1(input.get("searchDoc2"));
				Thread.sleep(3000);
				mergePDFPage.mergeButton();
				mergePDFPage.addMorePdffiles();
				mergePDFPage.addPlus();
				String[] selectGroups1 = { input.get("selectGroup1"), input.get("selectGroup2"),
						input.get("selectGroup3") };
				mergePDFPage.selectedGroups(selectGroups1);
				mergePDFPage.addMinus();
				Thread.sleep(3000);
				mergePDFPage.searchDocs1(input.get("searchDoc3"));
				mergePDFPage.mergeButton();
				mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
				mergePDFPage.preambleText(input.get("preambleText"));
				mergePDFPage.preambleTextArea(input.get("preamTextarea"));
				mergePDFPage.scrollHeight();
				mergePDFPage.mergeCanButton();
			} finally {

				// mergePDFPage.documentMenu();
			}

	}
	
	
	@Test(dataProvider = "getData7", priority = 0)
	public void DocuemntMergePDFFirmsShowBookmarks(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			Thread.sleep(3000);
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.addTitleDoc1();
			mergePDFPage.bookmarkTitle(input.get("BookTitle"));
			mergePDFPage.nameofDocument(input.get("BookName"));
			mergePDFPage.textAreaBookmark(input.get("BookTextarea"));
			mergePDFPage.addTitleSave();
			mergePDFPage.addTitleDoc2();
			mergePDFPage.bookmarkTitle(input.get("BookTitle1"));
			mergePDFPage.nameofDocument(input.get("BookName1"));
			mergePDFPage.textAreaBookmark(input.get("BookTextarea1"));
			mergePDFPage.addTitleSave();
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeBtn1();

		} finally {

			// mergePDFPage.documentMenu();
		}
	}
	
	@Test(dataProvider = "getData8", priority = 0)
	public void DocuemntMergePDFFirmsShowBookmarksCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			mergePDFPage.documentMenu();
			mergePDFPage.mergePdfTab();
			mergePDFPage.firmTab();
			mergePDFPage.addPlus();
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			mergePDFPage.selectedGroups(selectGroups);
			mergePDFPage.addMinus();
			Thread.sleep(3000);
			mergePDFPage.searchDocs(input.get("searchDoc1"));
			mergePDFPage.searchDocs1(input.get("searchDoc2"));
			Thread.sleep(3000);
			mergePDFPage.mergeButton();
			Thread.sleep(3000);
			mergePDFPage.nameoftheMergeDocument(input.get("newPdfName"));
			mergePDFPage.addTitleDoc1();
			mergePDFPage.bookmarkTitle(input.get("BookTitle"));
			mergePDFPage.nameofDocument(input.get("BookName"));
			mergePDFPage.textAreaBookmark(input.get("BookTextarea"));
			mergePDFPage.addTitleSave();
			mergePDFPage.addTitleDoc2();
			mergePDFPage.bookmarkTitle(input.get("BookTitle1"));
			mergePDFPage.nameofDocument(input.get("BookName1"));
			mergePDFPage.textAreaBookmark(input.get("BookTextarea1"));
			mergePDFPage.addTitleSave();
			mergePDFPage.scrollHeight();
			mergePDFPage.mergeCanButton();

		} finally {

			// mergePDFPage.documentMenu();
		}
	}
	
//	----------------------------------------------------------------------------------------------------
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(3) } };

	}
	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(5) } };

	}
	
	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(6) } };

	}
	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(7) } };

	}
	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\MergePDF\\MergePDF.json");

		return new Object[][] { { data.get(8) } };

	}
}
