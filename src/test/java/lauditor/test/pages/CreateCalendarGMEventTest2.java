package lauditor.test.pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;

import lauditor.baseClass.BaseClass;

public class CreateCalendarGMEventTest2 extends BaseClass {

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

	@Test(dataProvider = "getData84", priority = 84)
	public void Calendar_GMManFields_AllDay__MeetingAgenda_AddTeamMember(HashMap<String, String> input)
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

	@Test(dataProvider = "getData85", priority = 85)
	public void Calendar_GMManFields_AllDay__MeetingAgenda_AddEntityclient(HashMap<String, String> input)
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

	@Test(dataProvider = "getData86", priority = 86)
	public void Calendar_GMManFields_AllDay__MeetingAgenda_AddDocuments(HashMap<String, String> input)
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
			Thread.sleep(2000);
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
			createCalendarGMEvents.InnerScrollAllDay();
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

	@Test(dataProvider = "getData504", priority = 104)
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
			createCalendarGMEvents.AddDocuments(input.get("AssertDocs"));

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
}