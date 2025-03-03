package lauditor.test.pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.*;

public class CreateMeetingTestDailyRep1 extends BaseClass {

	// Daily Repetition

	@Test(dataProvider = "getData0", priority = 0)
	public void mandatoryFieldsAllAndLocationWithMeetingAgenda(HashMap<String, String> input)
			throws InterruptedException {

		try {
			createMeeting.createTab();
			createMeeting.GeneralMatter();
			createMeeting.scrollDown1();

			Thread.sleep(2000);
			createMeeting.matterName(input.get("matterName"));
			createMeeting.taskName(input.get("taskName"));
			createMeeting.dateChoosen(input.get("date"));
			createMeeting.repetition(input.get("repetition"));
			createMeeting.allDays();
			createMeeting.scrollDown2();
			Thread.sleep(2000);
			createMeeting.location(input.get("location"));
			createMeeting.meetingAgenda(input.get("meetingagenda"));
			createMeeting.scrollDown3();
			Thread.sleep(2000);
			createMeeting.saveButton();
			Thread.sleep(2000);
			createMeeting.viewChangesButton();
			createMeeting.scrollUp();
			Thread.sleep(2000);
			viewMeeting.monthTab();
			Thread.sleep(2000);
			viewMeeting.reptitionTextVerify2(input.get("date"), input.get("currentYear"), input.get("currentMonth"),
					input.get("repetationCount"), input.get("meetingName"), input.get("meetingName1"),
					input.get("monthAndTime"), input.get("meetingagenda"), input.get("meetingLink"),
					input.get("dialNumber"), input.get("document1"), input.get("teamMember1"),
					input.get("entityFirmAssert"), input.get("entityMember1"), input.get("individualsAssert"));

		} finally {
			createMeeting.leftMeetingTab();
		}
	}

	// 0.mandatoryFieldsAllAndLocationWithMeetingAgenda
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(0) } };

	}

	// 1.mandatoryFieldsAllAndLocationWithAddTeamMember

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(1) } };

	}
	// 2.mandatoryFieldsAllAndLocationWithAddEntity

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(2) } };

	}
	// 3.mandatoryFieldsAllAndLocationWithAddDocument

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(3) } };

	}
	// 4.mandatoryFieldsAllAndLocationWithAddIndividuals

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(4) } };

	}
	// 5.mandatoryFieldsAllAndMeetingAgendaWithAddTeamMember

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(5) } };

	}
	// 6.mandatoryFieldsAllAndMeetingAgendaWithAddEntity

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(6) } };

	}
	// 7.mandatoryFieldsAllAndMeetingAgendaWithAddDocument

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(7) } };

	}
	// 8.mandatoryFieldsAllAndMeetingAgendaWithAddIndividuals

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(8) } };

	}
	// 9.mandatoryFieldsAndAddTeamMemberWithAddEntity

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(9) } };

	}
	// 10.mandatoryFieldsAllAndAddTeamMemberWithAddDocument

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(10) } };

	}
	// 11.mandatoryFieldsAllAndAddTeamMemberWithAddIndividuals

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(11) } };

	}
	// 12.mandatoryFieldsAllAndAddEntityWithAddDocument

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(12) } };

	}
	// 13.mandatoryFieldsAllAndAddEntityWithAddIndividuals

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(13) } };

	}
	// 14.mandatoryFieldsAllAndAddDocumentWithAddIndividuals

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(14) } };

	}
	// 15.mandatoryFieldsAllAndMDLMWithAddTM

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(15) } };

	}

	// 16.mandatoryFieldsAllAndMDLMWithAddEntity

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(16) } };

	}
	// 17.mandatoryFieldsAllAndMDLMWithAddDocum

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(17) } };

	}
	// 18.mandatoryFieldsAllAndMDLMWithAddIndividual

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(18) } };

	}
	// 19.mandatoryFieldsAllAndMDLMAddTMWithAddEntity

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(19) } };

	}
	// 20.mandatoryFieldsAllAndMDLMAddTMWithAddDocum

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(20) } };

	}

	// 21.mandatoryFieldsAllAndMDLMAddTMWithAddIndividual
	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(21) } };

	}
	// 22.mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddIndividuals

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(22) } };

	}
	// 23.mandatoryFieldsAllAndMDLMAddTMAddEntityWithAddDocum

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(23) } };

	}
	// 24.mandatoryFieldsAllAndMDLMAddTMAddEntityAddIndividualWithAddDocum

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(24) } };

	}
	//

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(25) } };

	}

	//

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(26) } };

	}//

	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(27) } };

	}//

	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(28) } };

	}//

	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(29) } };

	}//

	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(30) } };

	}//

	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(31) } };

	}//

	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(32) } };

	}//

	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(33) } };

	}//

	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(34) } };

	}//

	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(35) } };

	}//

	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(36) } };

	}//

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(37) } };

	}//

	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(38) } };

	}//

	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(39) } };

	}//

	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(40) } };

	}//

	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(41) } };

	}//

	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(42) } };

	}//

	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(43) } };

	}//

	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(44) } };

	}//

	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(45) } };

	}//

	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(46) } };

	}//

	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(47) } };

	}//

	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(48) } };

	}//

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"C:\\Users\\Vengadesh\\git\\LauditorV3Codes\\Lauditor\\src\\test\\java\\file\\data\\meeting\\createMeetingdataDaily1.json");

		return new Object[][] { { data.get(49) } };

	}//

}
