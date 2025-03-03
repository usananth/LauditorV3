package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;

import lauditor.baseClass.BaseClass;

public class CreateCalendarGMEventTest extends BaseClass {

	@Test(dataProvider = "getData0", priority = 0)
	public void Calendar_GMManFieldsOnly(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData1", priority = 1)
	public void Calendar_GMManFields_Allday(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData2", priority = 2)
	public void Calendar_GMManFields_MeetingLink(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetLink"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));

		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData3", priority = 3)
	public void Calendar_GMManFields_DialupNumber(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDNumber"));

		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData4", priority = 4)
	public void Calendar_GMManFields_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));

		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData5", priority = 5)
	public void Calendar_GMManFields_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("EAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertAgenda"));
		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData6", priority = 6)
	public void Calendar_GMManFields_TeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember1"));
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember2"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(3000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember1"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData7", priority = 7)
	public void Calendar_GMManFields_AddEntity(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(4000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirmName"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("EntityMemberName"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(3000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember1"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData8", priority = 8)
	public void Calendar_GMManFields_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("DocumentName1"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(3000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertDocuments(input.get("DocumentName1"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData9", priority = 9)
	public void Calendar_GMManFields_AddIndividual(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient1"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(3000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertEName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndEntity"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData10", priority = 10)
	public void Calendar_GMManFields_Allday_Notification(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData11", priority = 11)
	public void Calendar_GMManFields_AllDay_Meetinglink(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("Meetinglink"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData12", priority = 12)
	public void Calendar_GMManFields_AllDay_DialUpNumber(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData13", priority = 13)
	public void Calendar_GMManFields_AllDay_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData14", priority = 14)
	public void Calendar_GMManFields_AllDay_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("EMAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData15", priority = 15)
	public void Calendar_GMManFields_AllDay_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData16", priority = 16)
	public void Calendar_GMManFields_AllDay_AddEntityFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData17", priority = 17)
	public void Calendar_GMManFields_AllDay_AddDocument(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocument"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData18", priority = 18)
	public void Calendar_GMManFields_AllDay_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData19", priority = 19)
	public void Calendar_GMManFields_MeetingLink_DialupNumber(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData20", priority = 20)
	public void Calendar_GMManFields_MeetingLink_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData21", priority = 21)
	public void Calendar_GMManFields_MeetingLink_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData22", priority = 22)
	public void Calendar_GMManFields_MeetingLink_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData23", priority = 23)
	public void Calendar_GMManFields_MeetingLink_AddEntityFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("EntityFirmName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData24", priority = 24)
	public void Calendar_GMManFields_MeetingLink_AddDocument(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("EDocuments"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDocuments(input.get("EntityDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}
	}

	@Test(dataProvider = "getData25", priority = 25)
	public void Calendar_GMManFields_MeetingLink_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("IndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData26", priority = 26)
	public void Calendar_GMManFields_DialupNumber_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData27", priority = 27)
	public void Calendar_GMManFields_DialupNumber_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("MAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData28", priority = 28)
	public void Calendar_GMManFields_DialupNumber_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));

			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData29", priority = 29)
	public void Calendar_GMManFields_DialupNumber_AddEntityFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("EntityFirmName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData30", priority = 30)
	public void Calendar_GMManFields_DialupNumber_AddDocumentFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("DocsName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData31", priority = 31)
	public void Calendar_GMManFields_DialupNumber_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData32", priority = 32)
	public void Calendar_GMManFields_Location_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("EMAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData33", priority = 33)
	public void Calendar_GMManFields_Location_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData34", priority = 34)
	public void Calendar_GMManFields_Location_AddEntityClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirmName"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("EntityMemberName"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntityClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData35", priority = 35)
	public void Calendar_GMManFields_Location_AddEntityDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("EntityFirmDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertEntityDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData36", priority = 36)
	public void Calendar_GMManFields_Location_AddIndividualclient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData37", priority = 37)
	public void Calendar_GMManFields__MeetingAgenda_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData38", priority = 38)
	public void Calendar_GMManFields__MeetingAgenda_AddEntityclient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EFirmSelect"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("EFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData39", priority = 39)
	public void Calendar_GMManFields__MeetingAgenda_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData40", priority = 40)
	public void Calendar_GMManFields__MeetingAgenda_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData41", priority = 41)
	public void Calendar_GMManFields_AddTeamMember_AddEntity(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			Thread.sleep(2000);
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertFirmMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData42", priority = 42)
	public void Calendar_GMManFields_AddTeamMember_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddEventDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData43", priority = 43)
	public void Calendar_GMManFields_AddTeamMember_AddIndividual(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData44", priority = 44)
	public void Calendar_GMManFields_AddEntity_AddDocument(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntity"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData45", priority = 45)
	public void Calendar_GMManFields_AddEntity_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntity"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData46", priority = 46)
	public void Calendar_GMManFields_AddDocument_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData47", priority = 47)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData48", priority = 48)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData49", priority = 49)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData50", priority = 50)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_AddEntityClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntityFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData51", priority = 51)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs1"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData52", priority = 52)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_AddIndividualClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData53", priority = 53)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData54", priority = 54)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData55", priority = 55)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_AddEntityClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData56", priority = 56)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData57", priority = 57)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_AddIndividual(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddInd"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertInd"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData58", priority = 58)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData59", priority = 59)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddEntityClient(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData60", priority = 60)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddDocuments(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData61", priority = 61)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddIndividual(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData62", priority = 62)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddEntityClient(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData63", priority = 63)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddDocuments(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AddDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData64", priority = 64)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddIndividual(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData65", priority = 65)
	public void Calendar_GMManFields_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddIndividual_AddEntityClient_AddDocument(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData66", priority = 66)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData67", priority = 67)
	public void Calendar_GMManFields_AllDay_MeetingLink_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData68", priority = 68)
	public void Calendar_GMManFields_AllDay_MeetingLink_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData69", priority = 69)
	public void Calendar_GMManFields_AllDay_MeetingLink_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData70", priority = 70)
	public void Calendar_GMManFields_AllDay_MeetingLink_AddEntityFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("EntityFirmName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData71", priority = 71)
	public void Calendar_GMManFields_AllDay_MeetingLink_AddDocument(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("EDocuments"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDocuments(input.get("EntityDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}
	}

	@Test(dataProvider = "getData72", priority = 72)
	public void Calendar_GMManFields_AllDay_MeetingLink_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("IndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData73", priority = 73)

	public void Calendar_GMManFields_AllDay_DialupNumber_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData74", priority = 74)
	public void Calendar_GMManFields_AllDay_DialupNumber_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("MAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData75", priority = 75)
	public void Calendar_GMManFields_AllDay_DialupNumber_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData76", priority = 76)
	public void Calendar_GMManFields_AllDay_DialupNumber_AddEntityFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("EntityFirmName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData77", priority = 77)
	public void Calendar_GMManFields_AllDay_DialupNumber_AddDocumentFirm(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("DocsName"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData78", priority = 78)
	public void Calendar_GMManFields_AllDay_DialupNumber_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData79", priority = 79)
	public void Calendar_GMManFields_AllDay_Location_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("EMAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData80", priority = 80)
	public void Calendar_GMManFields_AllDay_Location_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("TeamMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData81", priority = 81)
	public void Calendar_GMManFields_AllDay_Location_AddEntityClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EntityFirmName"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("EntityMemberName"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntityClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData82", priority = 82)
	public void Calendar_GMManFields_AllDay_Location_AddEntityDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("EntityFirmDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertEntityDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData83", priority = 83)
	public void Calendar_GMManFields_AllDay_Location_AddIndividualclient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.EventLocation(input.get("ELocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("IndividualClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiClient"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData84", priority = 84)
	public void Calendar_GMManFields_AllDay_MeetingAgenda_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("ETMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData85", priority = 85)
	public void Calendar_GMManFields_AllDay_MeetingAgenda_AddEntityclient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("EFirmSelect"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("EFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData86", priority = 86)
	public void Calendar_GMManFields_AllDay_MeetingAgenda_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData87", priority = 87)
	public void Calendar_GMManFields_AllDay__MeetingAgenda_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenta"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiClient"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData88", priority = 88)
	public void Calendar_GMManFields_AllDay_AddTeamMember_AddEntity(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			Thread.sleep(2000);
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertFirmMember"));

		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData89", priority = 89)
	public void Calendar_GMManFields_AllDay_AddTeamMember_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddEventDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData90", priority = 90)
	public void Calendar_GMManFields_AllDay_AddTeamMember_AddIndividual(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));

		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData91", priority = 91)
	public void Calendar_GMManFields_AllDay_AddEntity_AddDocument(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntity"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData92", priority = 92)
	public void Calendar_GMManFields_AllDay_AddEntity_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntity"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData93", priority = 93)
	public void Calendar_GMManFields_AllDay_AddDocument_AddIndividuals(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData94", priority = 94)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData95", priority = 95)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_MeetingAgenda(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			Thread.sleep(3000);
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData96", priority = 96)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_AddTeamMember(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData97", priority = 97)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_AddEntityClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEntityFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData98", priority = 98)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_AddDocuments(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs1"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData99", priority = 99)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_AddIndividualClient(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndividual"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndividual"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData100", priority = 100)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData101", priority = 101)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_AddTeamMember(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData102", priority = 102)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_AddEntityClient(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData103", priority = 103)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_AddDocuments(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData104", priority = 104)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_AddIndividual(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddInd"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertInd"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData105", priority = 105)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData106", priority = 106)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddEntityClient(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData107", priority = 107)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddDocuments(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData108", priority = 108)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddIndividual(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData109", priority = 109)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddEntityClient(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFirmMember"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData110", priority = 110)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddDocuments(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData111", priority = 111)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddIndividual(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData112", priority = 112)
	public void Calendar_GMManFields_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddIndividual_AddEntityClient_AddDocument(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData113", priority = 113)
	public void Calendar_GMManFields_AddtoTimesheet_AllDay_MeetingLink_DialupNumber_Location_MeetingAgenda_AddTeamMember_AddIndividual_AddEntityClient_AddDocument(
			HashMap<String, String> input) throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.AllDayCheckBox();
			createCalendarGMEvents.MeetingLinkField(input.get("MeetingLink"));
			createCalendarGMEvents.DialUpNumber(input.get("DialupNumber"));
			createCalendarGMEvents.EventLocation(input.get("Elocation"));
			createCalendarGMEvents.MeetingAgenda(input.get("MAgenda"));
			createCalendarGMEvents.ScrollDownTM();
			Thread.sleep(3000);
			createCalendarGMEvents.AddTeamMember(input.get("TeamMember"));
			createCalendarGMEvents.AddEntityFirmSelect(input.get("AEFirm"));
			createCalendarGMEvents.AddEntityMemberSelect(input.get("AEFMember"));
			createCalendarGMEvents.AddIndividuals(input.get("AddIndiv"));
			createCalendarGMEvents.AddDocuments(input.get("AddDocs"));
			createCalendarGMEvents.EventSaveBtn();
			Thread.sleep(2000);
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.InnerScrollAllDay();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			Thread.sleep(2000);
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertMName"));
			createCalendarGMEvents.AssertMeetingLink(input.get("AssertMLink"));
			createCalendarGMEvents.AssertDialupNumber(input.get("AssertDialup"));
			createCalendarGMEvents.AssertMeetingAgenda(input.get("AssertMAgenda"));
			createCalendarGMEvents.AssertTeamMember(input.get("AssertTMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFirm"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertAEFMember"));
			createCalendarGMEvents.AssertEntityandIndividual(input.get("AssertIndiv"));
			createCalendarGMEvents.AssertDocuments(input.get("AssertDocs"));

			Thread.sleep(2000);
		} finally {
			// createCalendarGMEvents.MeetingsSideMenu();

		}

	}

	@Test(dataProvider = "getData114", priority = 114)
	public void CGMEventCreation_Task_Consultation_Repet_Daily(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.EventViewTap();
			createCalendarGMEvents.WeekView();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.EventViewTap();
			createCalendarGMEvents.MonthView();
			createCalendarGMEvents.CalendarEventsSelectionMonths(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}
	@Test(dataProvider = "getData115", priority = 115)
	public void CGMEventCreation_Task_Consultation_Daily(HashMap<String, String> input)
			throws InterruptedException, AWTException, IOException {

		try {
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.CreateMeetingsBtn();
			createCalendarGMEvents.GeneralMatterRadioBtn();
			createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
			createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName"));
			createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"), input.get("Eventmonth"),
					input.get("Eventyear"));
			createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
			createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
			createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
			createCalendarGMEvents.EventSaveBtn();
			createCalendarGMEvents.ESaveViewChanges();
			createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.EventViewTap();
			createCalendarGMEvents.WeekView();
			createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
			createCalendarGMEvents.MeetingsSideMenu();
			createCalendarGMEvents.EventViewTap();
			createCalendarGMEvents.MonthView();
			createCalendarGMEvents.CalendarEventsSelectionMonths(input.get("EventName"));
			createCalendarGMEvents.ScrollToUp();
			Thread.sleep(2000);
			createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck"));
		} finally {
			createCalendarGMEvents.MeetingsSideMenu();

		}

	}
	@DataProvider
	public Object[][] getData0() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(0) } };

	}

	@DataProvider
	public Object[][] getData1() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(1) } };

	}

	@DataProvider
	public Object[][] getData2() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(2) } };

	}

	@DataProvider
	public Object[][] getData3() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(3) } };

	}

	@DataProvider
	public Object[][] getData4() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(4) } };

	}

	@DataProvider
	public Object[][] getData5() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(5) } };

	}

	@DataProvider
	public Object[][] getData6() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(6) } };

	}

	@DataProvider
	public Object[][] getData7() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(7) } };

	}

	@DataProvider
	public Object[][] getData8() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(8) } };

	}

	@DataProvider
	public Object[][] getData9() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(9) } };

	}

	@DataProvider
	public Object[][] getData10() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(10) } };

	}

	@DataProvider
	public Object[][] getData11() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(11) } };

	}

	@DataProvider
	public Object[][] getData12() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(12) } };

	}

	@DataProvider
	public Object[][] getData13() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(13) } };

	}

	@DataProvider
	public Object[][] getData14() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(14) } };

	}

	@DataProvider
	public Object[][] getData15() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(15) } };

	}

	@DataProvider
	public Object[][] getData16() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(16) } };

	}

	@DataProvider
	public Object[][] getData17() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(17) } };

	}

	@DataProvider
	public Object[][] getData18() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(18) } };

	}

	@DataProvider
	public Object[][] getData19() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(19) } };

	}

	@DataProvider
	public Object[][] getData20() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(20) } };

	}

	@DataProvider
	public Object[][] getData21() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(21) } };

	}

	@DataProvider
	public Object[][] getData22() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(22) } };

	}

	@DataProvider
	public Object[][] getData23() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(23) } };

	}

	@DataProvider
	public Object[][] getData24() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(24) } };

	}

	@DataProvider
	public Object[][] getData25() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(25) } };

	}

	@DataProvider
	public Object[][] getData26() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(26) } };

	}

	@DataProvider
	public Object[][] getData27() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(27) } };

	}

	@DataProvider
	public Object[][] getData28() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(28) } };

	}

	@DataProvider
	public Object[][] getData29() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(29) } };

	}

	@DataProvider
	public Object[][] getData30() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(30) } };

	}

	@DataProvider
	public Object[][] getData31() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(31) } };

	}

	@DataProvider
	public Object[][] getData32() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(32) } };

	}

	@DataProvider
	public Object[][] getData33() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(33) } };

	}

	@DataProvider
	public Object[][] getData34() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(34) } };

	}

	@DataProvider
	public Object[][] getData35() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(35) } };

	}

	@DataProvider
	public Object[][] getData36() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(36) } };

	}

	@DataProvider
	public Object[][] getData37() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(37) } };

	}

	@DataProvider
	public Object[][] getData38() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(38) } };

	}

	@DataProvider
	public Object[][] getData39() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(39) } };

	}

	@DataProvider
	public Object[][] getData40() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(40) } };

	}

	@DataProvider
	public Object[][] getData41() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(41) } };

	}

	@DataProvider
	public Object[][] getData42() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(42) } };

	}

	@DataProvider
	public Object[][] getData43() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(43) } };

	}

	@DataProvider
	public Object[][] getData44() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(44) } };

	}

	@DataProvider
	public Object[][] getData45() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(45) } };

	}

	@DataProvider
	public Object[][] getData46() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(46) } };

	}

	@DataProvider
	public Object[][] getData47() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(47) } };

	}

	@DataProvider
	public Object[][] getData48() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(48) } };

	}

	@DataProvider
	public Object[][] getData49() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(49) } };

	}

	@DataProvider
	public Object[][] getData50() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(50) } };

	}

	@DataProvider
	public Object[][] getData51() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(51) } };

	}

	@DataProvider
	public Object[][] getData52() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(52) } };

	}

	@DataProvider
	public Object[][] getData53() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(53) } };

	}

	@DataProvider
	public Object[][] getData54() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(54) } };

	}

	@DataProvider
	public Object[][] getData55() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(55) } };

	}

	@DataProvider
	public Object[][] getData56() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(56) } };

	}

	@DataProvider
	public Object[][] getData57() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(57) } };

	}

	@DataProvider
	public Object[][] getData58() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(58) } };

	}

	@DataProvider
	public Object[][] getData59() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(59) } };

	}

	@DataProvider
	public Object[][] getData60() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(60) } };

	}

	@DataProvider
	public Object[][] getData61() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(61) } };

	}

	@DataProvider
	public Object[][] getData62() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(62) } };

	}

	@DataProvider
	public Object[][] getData63() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(63) } };

	}

	@DataProvider
	public Object[][] getData64() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(64) } };

	}

	@DataProvider
	public Object[][] getData65() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(65) } };

	}

	@DataProvider
	public Object[][] getData66() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(66) } };

	}

	@DataProvider
	public Object[][] getData67() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(67) } };

	}

	@DataProvider
	public Object[][] getData68() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(68) } };

	}

	@DataProvider
	public Object[][] getData69() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(69) } };

	}

	@DataProvider
	public Object[][] getData70() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(70) } };

	}

	@DataProvider
	public Object[][] getData71() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(71) } };

	}

	@DataProvider
	public Object[][] getData72() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(72) } };

	}

	@DataProvider
	public Object[][] getData73() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(73) } };

	}

	@DataProvider
	public Object[][] getData74() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(74) } };

	}

	@DataProvider
	public Object[][] getData75() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(75) } };

	}

	@DataProvider
	public Object[][] getData76() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(76) } };

	}

	@DataProvider
	public Object[][] getData77() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(77) } };

	}

	@DataProvider
	public Object[][] getData78() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(78) } };

	}

	@DataProvider
	public Object[][] getData79() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(79) } };

	}

	@DataProvider
	public Object[][] getData80() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(80) } };

	}

	@DataProvider
	public Object[][] getData81() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(81) } };

	}

	@DataProvider
	public Object[][] getData82() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(82) } };

	}

	@DataProvider
	public Object[][] getData83() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(83) } };

	}

	@DataProvider
	public Object[][] getData84() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(84) } };

	}

	@DataProvider
	public Object[][] getData85() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(85) } };

	}

	@DataProvider
	public Object[][] getData86() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(86) } };

	}

	@DataProvider
	public Object[][] getData87() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(87) } };

	}

	@DataProvider
	public Object[][] getData88() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(88) } };

	}

	@DataProvider
	public Object[][] getData89() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(89) } };

	}

	@DataProvider
	public Object[][] getData90() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(90) } };

	}

	@DataProvider
	public Object[][] getData91() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(91) } };

	}

	@DataProvider
	public Object[][] getData92() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(92) } };

	}

	@DataProvider
	public Object[][] getData93() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(93) } };

	}

	@DataProvider
	public Object[][] getData94() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(94) } };

	}

	@DataProvider
	public Object[][] getData95() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(95) } };

	}

	@DataProvider
	public Object[][] getData96() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(96) } };

	}

	@DataProvider
	public Object[][] getData97() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(97) } };

	}

	@DataProvider
	public Object[][] getData98() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(98) } };

	}

	@DataProvider
	public Object[][] getData99() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(99) } };

	}

	@DataProvider
	public Object[][] getData100() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(100) } };

	}

	@DataProvider
	public Object[][] getData101() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(101) } };

	}

	@DataProvider
	public Object[][] getData102() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(102) } };

	}

	@DataProvider
	public Object[][] getData103() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(103) } };

	}

	@DataProvider
	public Object[][] getData104() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(104) } };

	}

	@DataProvider
	public Object[][] getData105() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(105) } };

	}

	@DataProvider
	public Object[][] getData106() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(106) } };

	}

	@DataProvider
	public Object[][] getData107() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(107) } };

	}

	@DataProvider
	public Object[][] getData108() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(108) } };

	}

	@DataProvider
	public Object[][] getData109() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(109) } };

	}

	@DataProvider
	public Object[][] getData110() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(110) } };

	}

	@DataProvider
	public Object[][] getData111() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(111) } };

	}

	@DataProvider
	public Object[][] getData112() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(112) } };

	}

	@DataProvider
	public Object[][] getData113() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(113) } };

	}

	@DataProvider
	public Object[][] getData114() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(114) } };

	}

	@DataProvider
	public Object[][] getData115() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(115) } };

	}

	@DataProvider
	public Object[][] getData116() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(116) } };

	}

	@DataProvider
	public Object[][] getData117() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(117) } };

	}

	@DataProvider
	public Object[][] getData118() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(118) } };

	}

	@DataProvider
	public Object[][] getData119() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(119) } };

	}

	@DataProvider
	public Object[][] getData120() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(120) } };

	}

	@DataProvider
	public Object[][] getData121() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\CalendarGeneralMatterEvents.json");

		return new Object[][] { { data.get(121) } };

	}
	/*
	 * @Test(dataProvider = "getData0", priority = 0) public void
	 * CGMEventCreation_Task_Consultation_Repet_Daily(HashMap<String, String> input)
	 * throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges();
	 * createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
	 * createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
	 * createCalendarGMEvents.ScrollToUp(); Thread.sleep(2000);
	 * createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck")); } finally
	 * { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * / * @Test(dataProvider = "getData1", priority = 1) public void
	 * CGMEventCreation_Task_Consultation_Repet_Weekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges();
	 * createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
	 * createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
	 * createCalendarGMEvents.ScrollToUp(); Thread.sleep(3000);
	 * createCalendarGMEvents.AssertMeetingName(input.get("AssertCheck")); } finally
	 * { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData2", priority = 2) public void
	 * CGMEventCreation_Task_Consultation_Repet_BiWeekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData3", priority = 3) public void
	 * CGMEventCreation_Task_Consultation_Repet_Monthly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData4", priority = 4) public void
	 * CGMEventCreation_Task_Consultation_Repet_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData5", priority = 5) public void
	 * CGMEventCreation_Task_DraftAgreements_Repet_Daily(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData6", priority = 6) public void
	 * CGMEventCreation_Task_DraftAgreements_Repet_Weekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData7", priority = 7) public void
	 * CGMEventCreation_Task_DraftAgreements_Repet_BiWeekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData8", priority = 8) public void
	 * CGMEventCreation_Task_DraftAgreements_Repet_Monthly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData9", priority = 9) public void
	 * CGMEventCreation_Task_DraftAgreements_Repet_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData10", priority = 10) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_Repet_Daily(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData11", priority = 11) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_Repet_Weekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData12", priority = 12) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_Repet_BiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData13", priority = 13) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_Repet_Monthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData14", priority = 14) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_Repet_Yearly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData15", priority = 15) public void
	 * CGMEventCreation_Task_MeetingsWithClient_Repet_Daily(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData16", priority = 16) public void
	 * CGMEventCreation_Task_MeetingsWithClient_Repet_Weekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData17", priority = 17) public void
	 * CGMEventCreation_Task_MeetingsWithClient_Repet_BiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData18", priority = 18) public void
	 * CGMEventCreation_Task_MeetingsWithClient_Repet_Monthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData19", priority = 19) public void
	 * CGMEventCreation_Task_MeetingsWithClient_Repet_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData20", priority = 20) public void
	 * CGMEventCreation_Task_PrepareAnnualFillings_Repet_Daily(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData21", priority = 21) public void
	 * CGMEventCreation_Task_PrepareAnnualFillings_Repet_Weekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData22", priority = 22) public void
	 * CGMEventCreation_Task_PrepareAnnualFillings_Repet_BiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData23", priority = 23) public void
	 * CGMEventCreation_Task_PrepareAnnualFillings_Repet_Monthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData24", priority = 24) public void
	 * CGMEventCreation_Task_PrepareAnnualFillings_Repet_Yearly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try {
	 * 
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime"));
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData25", priority = 25) public void
	 * CGMEventCreation_Task_Consultation_AllDay_RepetitionDaily(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData26", priority = 26) public void
	 * CGMEventCreation_Task_Consultation_AllDay_RepetitionWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData27", priority = 27) public void
	 * CGMEventCreation_Task_Consultation_AllDay_RepetitionBiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData28", priority = 28) public void
	 * CGMEventCreation_Task_Consultation_AllDay_RepetitionMonthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData29", priority = 29) public void
	 * CGMEventCreation_Task_Consultation_AllDay_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData30", priority = 30) public void
	 * CGMEventCreation_Task_DraftAgreements_AllDay_RepetitionDaily(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData31", priority = 31) public void
	 * CGMEventCreation_Task_DraftAgreements_AllDay_RepetitionWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData32", priority = 32) public void
	 * CGMEventCreation_Task_DraftAgreements_AllDay_RepetitionBiWeekly(HashMap<
	 * String, String> input) throws InterruptedException, AWTException, IOException
	 * {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData33", priority = 33) public void
	 * CGMEventCreation_Task_DraftAgreements_AllDay_RepetitionMonthly(HashMap<
	 * String, String> input) throws InterruptedException, AWTException, IOException
	 * {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData34", priority = 34) public void
	 * CGMEventCreation_Task_DraftAgreements_AllDay_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData35", priority = 35) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_AllDay_RepetitionDaily(HashMap<
	 * String, String> input) throws InterruptedException, AWTException, IOException
	 * {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData36", priority = 36) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_AllDay_RepetitionWeekly(HashMap<
	 * String, String> input) throws InterruptedException, AWTException, IOException
	 * {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData37", priority = 37) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_AllDay_RepetitionBiWeekly(
	 * HashMap<String, String> input) throws InterruptedException, AWTException,
	 * IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData38", priority = 38) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_AllDay_RepetitionMonthly(HashMap
	 * <String, String> input) throws InterruptedException, AWTException,
	 * IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData39", priority = 39) public void
	 * CGMEventCreation_Task_FillingWithAuthorities_AllDay_Yearly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData40", priority = 40) public void
	 * CGMEventCreation_Task_MeetingwithClient_AllDay_Daily(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData41", priority = 41) public void
	 * CGMEventCreation_Task_MeetingwithClient_AllDay_Weekly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData42", priority = 42) public void
	 * CGMEventCreation_Task_MeetingwithClient_AllDay_BiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData43", priority = 43) public void
	 * CGMEventCreation_Task_MeetingwithClient_AllDay_Monthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData44", priority = 44) public void
	 * CGMEventCreation_Task_MeetingwithClient_AllDay_Yearly(HashMap<String, String>
	 * input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData45", priority = 45) public void
	 * CGMEventCreation_Task_PrepareAnnulaFillings_AllDay_Daily(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData46", priority = 46) public void
	 * CGMEventCreation_Task_PrepareAnnulaFillings_AllDay_Weekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData47", priority = 47) public void
	 * CGMEventCreation_Task_PrepareAnnulaFillings_AllDay_BiWeekly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData48", priority = 48) public void
	 * CGMEventCreation_Task_PrepareAnnulaFillings_AllDay_Monthly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000); } finally {
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData49", priority = 49) public void
	 * CGMEventCreation_Task_PrepareAnnulaFillings_AllDay_Yearly(HashMap<String,
	 * String> input) throws InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.AllDayCheckBox();
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); Thread.sleep(3000);
	 * 
	 * } finally { createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData100", priority = 100) public void
	 * CGMEventCreation_View(HashMap<String, String> input) throws
	 * InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges();
	 * createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate"));
	 * createCalendarGMEvents.CalendarEventsCollection(input.get("EventName")); //
	 * createCalendarGMEvents.CalendarEventsCollection_Week(input.get("EventName")
	 * ); createCalendarGMEvents.ScrollToUp(); Thread.sleep(3000); } finally { //
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData51", priority = 51) public void
	 * CGMEventCreation_View_Week(HashMap<String, String> input) throws
	 * InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear"));
	 * createCalendarGMEvents.EventStratTime(input.get("EStartTime")); //
	 * createCalendarGMEvents.EventEndTime(input.get("EEndTime"));
	 * createCalendarGMEvents.RepetitionSelection(input.get("Repetition"));
	 * createCalendarGMEvents.EventSaveBtn();
	 * createCalendarGMEvents.ESaveViewChanges(); //
	 * createCalendarGMEvents.RightArrow_LeftArrow_Date(input.get("Eventdate")); //
	 * createCalendarGMEvents.CalendarEventsCollection(input.get("EventName"));
	 * createCalendarGMEvents.CalendarEventsCollection_Week(input.get("Eventweek") ,
	 * input.get("Eventdate"), input.get("EventName"));
	 * createCalendarGMEvents.ScrollToUp(); Thread.sleep(3000); } finally { //
	 * createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test(dataProvider = "getData52", priority = 52) public void
	 * CGMEventCreation_View_Week_Calendar(HashMap<String, String> input) throws
	 * InterruptedException, AWTException, IOException {
	 * 
	 * try { createCalendarGMEvents.MeetingsSideMenu();
	 * createCalendarGMEvents.CreateMeetingsBtn();
	 * createCalendarGMEvents.GeneralMatterRadioBtn();
	 * createCalendarGMEvents.MatterNameSelection(input.get("MatterName"));
	 * createCalendarGMEvents.SubjectORTaskSelection(input.get("SubjectTaskName")) ;
	 * createCalendarGMEvents.EventDatePickerSelection(input.get("Eventdate"),
	 * input.get("Eventmonth"), input.get("Eventyear")); Thread.sleep(3000); }
	 * finally { // createCalendarGMEvents.MeetingsSideMenu();
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData0() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(0) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData1() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(1) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData2() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(2) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData3() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(3) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData4() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(4) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData5() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(5) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData6() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(6) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData7() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(7) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData8() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(8) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData9() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(9) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData10() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(10) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData11() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(11) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData12() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(12) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData13() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(13) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData14() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(14) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData15() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(15) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData16() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(16) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData17() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(17) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData18() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(18) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData19() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(19) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData20() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(20) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData21() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(21) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData22() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(22) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData23() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(23) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData24() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(24) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData25() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(25) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData26() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(26) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData27() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(27) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData28() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(28) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData29() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(29) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData30() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(30) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData31() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(31) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData32() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(32) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData33() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(33) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData34() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(34) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData35() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(35) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData36() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(36) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData37() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(37) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData38() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(38) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData39() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(39) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData40() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(40) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData41() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(41) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData42() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(42) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData43() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(43) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData44() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(44) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData45() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(45) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData46() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(46) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData47() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(47) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData48() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(48) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData49() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(49) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData100() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(100) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData51() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(51) } };
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getData52() throws IOException {
	 * 
	 * List<HashMap<String, String>> data = getJsonDataToMap(
	 * "F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\test\\java\\Data\\Calendar\\GeneralMatterEventCreations.json"
	 * );
	 * 
	 * return new Object[][] { { data.get(52) } };
	 * 
	 * }
	 */
}
