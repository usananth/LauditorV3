package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lauditor.baseClass.BaseClass;

public class SingleTestCaseCalendarTest extends BaseClass {
	@Test(dataProvider = "getData0", priority = 0)
	public void CGMEventCreation_Task_Consultation_Repet_Daily(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			SingleTest.MeetingsSideMenu();
			SingleTest.CreateMeetingsBtn();
			SingleTest.GeneralMatterRadioBtn();
			SingleTest.MatterNameSelection(input.get("MatterName"));
			SingleTest.SubjectORTaskSelection(input.get("SubjectTaskName"));
			SingleTest.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			SingleTest.EventStratTime(input.get("EStartTime"));
//			SingleTest.EventEndTime(input.get("EEndTime"));
			SingleTest.RepetitionSelection(input.get("Repetition"));
			SingleTest.EventSaveBtn();
			SingleTest.ESaveViewChanges();
			SingleTest.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			SingleTest.CalendarEventsCollection(input.get("EventName"));
			SingleTest.ScrollToUp();
			Thread.sleep(2000);
			driver.navigate().back();
			// SingleTest.CalendarEventsCollection_Week(input.get("EventName"),input.get("Eventdate"));
			SingleTest.DailyRepeatition(input.get("EventName"), input.get("AssertName"), input.get("Eventdate"));
			// SingleTest.AssertMeetingName(input.get("AssertCheck"));
//			driver.navigate().back();
		} finally {
			SingleTest.MeetingsSideMenu();

		}

	}

	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\SingleTestCaseCalendar.json");

		return new Object[][] { { data.get(0) } };

	}
}
