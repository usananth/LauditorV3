package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class DocumentViewFirmTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void DocumentViewFirmAction_View(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		// documentViewFirmPages.DocumentViewsFirmPage();
		documentViewFirmPages.leftsideDocument();
		documentViewFirmPages.viewTabClick();
		documentViewFirmPages.firmTabClick();
		documentViewFirmPages.addPlus();
		Thread.sleep(10000);
		String[] selectGroups = { input.get("selectGroup1") };
		documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
		documentViewFirmPages.addMinus();
		documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
		// documentViewFirmPages.filterDropdown();
		documentViewFirmPages.scrolldownDocuments();
		documentViewFirmPages.actionView();
		Thread.sleep(3000);
		documentViewFirmPages.actionViewXClose();
		Thread.sleep(2000);
		documentViewFirmPages.ScrollUp();
		Thread.sleep(3000);

	}

	@Test(dataProvider = "getData1", priority = 1)
	public void DocumentViewFirmAction_Editinfo_DocuemntNameOnly(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDocumentField(input.get("documentRename"));
			documentViewFirmPages.editSaveButton();
			Thread.sleep(3000);
			documentViewFirmPages.editInfoAlertOK();
			documentViewFirmPages.ScrollUp();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}

	}

	@Test(dataProvider = "getData2", priority = 2)
	public void DocumentViewFirmAction_Editinfo_DocuemntNameOnlyCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDocumentField(input.get("documentEdit"));
			documentViewFirmPages.editCancelButton();
			Thread.sleep(3000);
			documentViewFirmPages.ScrollUp();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData3", priority = 3)
	public void DocumentViewFirmAction_Editinfo_DescriptionOnly(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			// documentViewFirmPages.filterDropdown();
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDescriptionField(input.get("descriptionEdit"));
			documentViewFirmPages.editSaveButton();
			Thread.sleep(3000);
			documentViewFirmPages.editInfoAlertOK();
			documentViewFirmPages.ScrollUp();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData4", priority = 4)
	public void DocumentViewFirmAction_Editinfo_DescriptionOnlyCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDescriptionField(input.get("descriptionEdit"));
			Thread.sleep(3000);
			documentViewFirmPages.editCancelButton();
			Thread.sleep(3000);
			documentViewFirmPages.ScrollUp();
		} finally {
			// TODO: handle finally clause
		}

	}

	@Test(dataProvider = "getData5", priority = 5)
	public void DocumentViewFirmAction_Editinfo_DocumentName_and_Description(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			// documentViewFirmPages.DocumentViewsFirmPage();
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editInfoDocumentNameandDescription(input.get("documentEdit"),
					input.get("descriptionEdit"));
			Thread.sleep(3000);
			documentViewFirmPages.editInfoAlertOK();
			Thread.sleep(2000);
			documentViewFirmPages.ScrollUp();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData6", priority = 6)
	public void DocumentViewFirmAction_Editinfo_DocumentName_and_DescriptionCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			// documentViewFirmPages.DocumentViewsFirmPage();
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editInfoDocumentNameandDescription(input.get("documentEdit"),
					input.get("descriptionEdit"));
			Thread.sleep(3000);
			documentViewFirmPages.editCancelButton();
			Thread.sleep(3000);
			documentViewFirmPages.editInfoAlertOK();
			documentViewFirmPages.ScrollUp();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData7", priority = 7)
	public void DocumentViewFirmAction_Editinfo_DocuemntName_and_ExpirationDate(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDocumentNameandDateFields(input.get("documentEdit"));
			Thread.sleep(3000);
			documentViewFirmPages.editSaveButton();
			documentViewFirmPages.editInfoAlertOK();
			Thread.sleep(2000);
			documentViewFirmPages.ScrollUp();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData8", priority = 8)
	public void DocumentViewFirmAction_Editinfo_DocuemntName_and_ExpirationDateCancel(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionEditinfo();
			documentViewFirmPages.editDocumentNameandDateFields(input.get("documentEdit"));
			Thread.sleep(3000);
			documentViewFirmPages.editCancelButton();
			documentViewFirmPages.ScrollUp();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData9", priority = 9)
	public void DocumentViewFirmAction_Delete_AlertYes(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			Thread.sleep(3000);
			documentViewFirmPages.actionDelete();
			Thread.sleep(3000);
			documentViewFirmPages.actionDeleteYes();
			Thread.sleep(3000);
			documentViewFirmPages.actionDeleteYesOK();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData10", priority = 10)
	public void DocumentViewFirmAction_Delete_AlertNo(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionDelete();
			documentViewFirmPages.actionDeleteNo();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData11", priority = 11)
	public void DocumentViewFirmAction_Delete_AlertXButton(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionDelete();
			documentViewFirmPages.actionDeleteXClose();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData12", priority = 12)
	public void DocumentViewFirmAction_Download_OK(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.actionMenuDownload();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData13", priority = 13)
	public void DocumentViewFirmAction_ViewMerged(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData14", priority = 14)
	public void DocumentViewFirmAction_View_MergedAction_View(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.actionMergeView();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData15", priority = 15)
	public void DocumentViewFirmAction_View_MergedAction_ViewXButton(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.actionMergeView();
			documentViewFirmPages.actionMergeXClose();
			Thread.sleep(3000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData16", priority = 16)
	public void DocumentViewFirmAction_View_MergedAction_Download(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.mergeViewDownload();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData17", priority = 17)
	public void DocumentViewFirmAction_View_MergedAction_DeletePDF_PopupYes(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.mergeViewDeletePDF_Popup_Yes();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData18", priority = 18)
	public void DocumentViewFirmAction_View_MergedAction_DeletePDF_PopupNo(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.mergeViewDeletePDF_Popup_No();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	@Test(dataProvider = "getData19", priority = 19)
	public void DocumentViewFirmAction_View_MergedAction_DeletePDF_PopupXClose(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			documentViewFirmPages.leftsideDocument();
			documentViewFirmPages.viewTabClick();
			documentViewFirmPages.firmTabClick();
			documentViewFirmPages.addPlus();
			Thread.sleep(10000);
			String[] selectGroups = { input.get("selectGroup1"), input.get("selectGroup2") };
			documentViewFirmPages.DocumentUploadSelectGroups(selectGroups);
			documentViewFirmPages.addMinus();
			documentViewFirmPages.filterDropdown();
			documentViewFirmPages.SearchDocumentInSearchBar(input.get("documentName"));
			documentViewFirmPages.scrolldownDocuments();
			documentViewFirmPages.ViewMergedActionButton();
			documentViewFirmPages.mergeViewDeletePDF_Popup_XButtonClose();
			Thread.sleep(2000);
		} finally {
			// TODO: handle finally clause
		}
	}

	// **************************** Data Provider Classes
	// *******************************//

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(5) } };

	}

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(6) } };

	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(7) } };

	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(8) } };

	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(9) } };

	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(10) } };

	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(13) } };

	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(15) } };

	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(17) } };

	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data.DocumentView\\DocumentViewFirm.json");

		return new Object[][] { { data.get(19) } };

	}

}
