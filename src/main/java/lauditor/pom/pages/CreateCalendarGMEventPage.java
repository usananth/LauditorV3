package lauditor.pom.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import lauditor.abstractclass.AbstractClass;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;

public class CreateCalendarGMEventPage extends AbstractClass {
	private WebElement webElement;

	WebDriver driver;

	public CreateCalendarGMEventPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	// Calendar Icon Leftside
	@FindBy(xpath = "//*[text()='Meetings']")
	WebElement meetingsMenu;

	public void MeetingsSideMenu() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(meetingsMenu);
		meetingsMenu.click();
	}

	// Create Button
	@FindBy(xpath = "//*[text()='Create']")
	WebElement createMeetingsBtn;

	public void CreateMeetingsBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(createMeetingsBtn);
		createMeetingsBtn.click();

	}

	// Event Type Legal Matter
	@FindBy(xpath = "//input[@id='legalMatter']")
	WebElement legalMatterRadioBtn;

	public void LegalMatterRadioBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(legalMatterRadioBtn);
		legalMatterRadioBtn.click();
	}

	// Event type General Matter
	@FindBy(xpath = "//input[@id='generalMatter']")
	WebElement generalMatterRadioBtn;

	public void GeneralMatterRadioBtn() {
		visibilityOfAllElements(generalMatterRadioBtn);
		generalMatterRadioBtn.click();
	}

	// Event type OverHead
	@FindBy(xpath = "//input[@id='overHead']")
	WebElement overHeadRadioBtn;

	public void OverHead() {
		visibilityOfAllElements(overHeadRadioBtn);
		overHeadRadioBtn.click();
	}

	// Event type Others
	@FindBy(xpath = "//input[@id='Others']")
	WebElement othersRadioBtn;

	public void OthersRadioBtn() throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(othersRadioBtn);
		othersRadioBtn.click();
	}

	// Event type Remainders
	@FindBy(xpath = "//input[@id='Remainders']")
	WebElement remaindersRadioBtn;

	public void RemaindersRaditoBtn() {
		visibilityOfAllElements(remaindersRadioBtn);
		remaindersRadioBtn.click();

	}

// General Matter Selection Dropdown
	@FindBy(xpath = "(//div //select)[1]")
	WebElement MatterNameSelection;

	// General Matter Subject OR Task Selection
	@FindBy(xpath = "(//div //select)[4]")
	WebElement SubjectorTaskSelection;

	// Select the Event Date
	@FindBy(id = "datepicker")
	WebElement EventDatePicker;

	// Select Event Year
	@FindBy(xpath = "(//div[@class='bs-datepicker-head']//button[@class='current'])[2]")
	WebElement EventYear;

	// Select Exact Month
	@FindBy(xpath = "(//div[@class='bs-datepicker-head']//button[@class='current'])[1]")
	WebElement EventMonths;

	// Select all Dates
	@FindBy(xpath = "//td[@role='gridcell']")
	List<WebElement> EventDates;

	// Select Event Start Time
	@FindBy(xpath = "(//div //select)[2]")
	WebElement EventStartTime;

	// Select Event End Time
	@FindBy(xpath = "(//div //select)[3]")
	WebElement EventEndTime;

	// Select Time Zone
	@FindBy(xpath = "(//div //select)[5]")
	WebElement EventTimezone;

	// Select Event Repetitions
	@FindBy(xpath = "(//div//select)[6]")
	WebElement EventRepetition;

	// Event Save Button
	@FindBy(xpath = "//button[@type='submit']")
	WebElement EventSaveBtn;

	// Event Save View Changes Alert

	@FindBy(xpath = "//button[text()='View Changes']")
	WebElement ESViewChanges;

	// Select All day Checkbox
	@FindBy(xpath = "//input[@id='allday']")
	WebElement AlldayCheckbox;

	public void AllDayCheckBox() throws InterruptedException {
		visibilityOfAllElements(AlldayCheckbox);
		AlldayCheckbox.click();
		Thread.sleep(2000);
	}

	// Meeting-Link
	@FindBy(id = "meeting-link")
	WebElement MeetingLink;

	// Dialup Number
	@FindBy(id = "number")
	WebElement DialNumber;

	// Location
	@FindBy(id = "location")
	WebElement Location;

	// Meeting - Agenda
	@FindBy(name = "meeting-agenda")
	WebElement MeetingAgenda;

	// Assert Meeting Agenda
	@FindBy(xpath = "//div[@class='col-sm-7'] //p[1]")
	WebElement AssertmeetingAgenda;

	// Add Entity
	@FindBy(xpath = "//select[@class='textbox form-control']")
	WebElement AddEntity;

	// searchboxEntity
	@FindBy(xpath = "//input[@placeholder='Search client']")
	WebElement SearchBoxEntityInput;

	// Add Entity button
	@FindBy(xpath = "(//input[@type='button'])[2]")
	WebElement AddEntityButton;

	// Add Team Member
	@FindBy(xpath = "//input[@placeholder='Search team member']")
	WebElement SearchTeamMembers;

	// Add Button for TeamMember
	@FindBy(xpath = "(//input[@type='button'])[1]")
	WebElement AddTMButton;

	// Attach Button Document
	@FindBy(xpath = "//input[@value='Attach']")
	WebElement AttachDocumentbutton;

	// Add Individuals
	@FindBy(xpath = "//input[@placeholder='Search Individual Clients']")
	WebElement SearchIndividualsInput;

	// Add button Individuals
	@FindBy(xpath = "//div//input[@placeholder='Search Individual Clients']/following::input")
	WebElement AddIndiButton;

	@FindBy(xpath = "//div //div [@class='cal-event']")
	List<WebElement> EventNames;

	@FindBy(xpath = "//span //label[@class='lbltime']")
	List<WebElement> EventNamesMonth;

	public void CalendarEventsCollection(String Eventname) throws InterruptedException {

		Thread.sleep(3000);
		for (int i = 0; i < EventNames.size(); i++) {
			String EventCollections = EventNames.get(i).getText();
			Thread.sleep(1000);
			System.out.println("All Group Name Text " + EventCollections);
			if (Eventname.equals(EventCollections)) {
				Thread.sleep(1000);

				WebElement EventClick = EventNames.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", EventClick);
			}

		}

	}

	public void CalendarEventsSelectionMonths(String Eventname) throws InterruptedException {

		Thread.sleep(3000);
		for (int i = 0; i < EventNamesMonth.size(); i++) {
			String EventCollections = EventNamesMonth.get(i).getText();
			Thread.sleep(1000);
			if (Eventname.contains(EventCollections)) {
				Thread.sleep(1000);
				WebElement EventClick1 = EventNamesMonth.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", EventClick1);

			}
		}
	}

	@FindBy(xpath = "//*[text()='View']")
	WebElement EventViewTab;

	public void EventViewTap() {
		visibilityOfAllElements(EventViewTab);
		EventViewTab.click();

	}

	@FindBy(xpath = "//*[text()='Week']")
	WebElement WeekView;

	public void WeekView() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(WeekView);
		WeekView.click();
		RightArrowClick.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//*[text()='Month']")
	WebElement MonthView;

	public void MonthView() throws InterruptedException {
		Thread.sleep(1000);
		visibilityOfAllElements(MonthView);
		MonthView.click();
		RightArrowClick.click();
		Thread.sleep(2000);
	}

	public void CalendarEventsCollection_Week(String Eventname, String Eventweek, String Edate)
			throws InterruptedException {

		WeekView();
		int EventDates = Integer.parseInt(Edate);
		String DateLabel = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
		String DLable1 = DateLabel.split(",")[1];
		String DLabel2 = DLable1.trim();
		String EventDate = DLabel2.split(" ")[1];
		int TodayDate = Integer.parseInt(EventDate);
		String WeekLabel = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
		String ts2 = WeekLabel.split(",")[0];
		boolean flag = true;
		while (!(ts2 == Eventweek)) {

			if (flag == false) {

				LeftArrowClick.click();
			} else {
				RightArrowClick.click();
			}
			break;
		}

		Thread.sleep(3000);

		for (int i = 0; i < EventNames.size(); i++) {
			String EventCollections = EventNames.get(i).getText();
			Thread.sleep(1000);
			// System.out.println("All Group Name Text "+allCalendarTextName);
			if (Eventname.equals(EventCollections)) {
				Thread.sleep(1000);
				WebElement EventClick = EventNames.get(i);
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", EventClick);

			}

		}

	}

	@FindBy(xpath = "//img[@class='lefticon']")
	WebElement LeftArrowClick;

	@FindBy(xpath = "//img[@class='righticon']")
	WebElement RightArrowClick;

	public void RightArrow_LeftArrow_Date(String EDate) throws InterruptedException {

		Thread.sleep(3000);
		int EventDates = Integer.parseInt(EDate);
		String DateLabel = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
		String DLable1 = DateLabel.split(",")[1];
		String DLabel2 = DLable1.trim();
		String EventDate = DLabel2.split(" ")[1];
		int TodayDate = Integer.parseInt(EventDate);
		int DateDiff = EventDates - TodayDate;
		boolean flag = true;
		if (DateDiff < 0) {
			flag = false;
			DateDiff = -1 * DateDiff;
		}

		for (int i = 0; i < DateDiff; i++) {
			if (flag == false) {
				// Thread.sleep(1000);
				LeftArrowClick.click();
			} else {
				// Thread.sleep(1000);
				RightArrowClick.click();
			}

		}

	}

	public void RightArrow_LeftArrow_Week(String Week) throws InterruptedException {

//		Thread.sleep(3000);
//		String EventDates = Week;
//		String DateLabel = driver.findElement(By.xpath("//label[@class='tdate']")).getText();
//		String DLable1 = DateLabel.split(",")[1];
//		String DLabel2 = DLable1.trim();
//		String EventDate = DLabel2.split(" ")[1];
//		int TodayDate = Integer.parseInt(EventDate);
//	//	int DateDiff = EventDates - TodayDate;
//		boolean flag = true;
//		if (DateDiff < 0) {
//			flag = false;
//			DateDiff = -1 * DateDiff;
//		}
//
//		for (int i = 0; i < DateDiff; i++) {
//			if (flag == false) {
//				// Thread.sleep(1000);
//				LeftArrowClick.click();
//			} else {
//				// Thread.sleep(1000);
//				RightArrowClick.click();
//			}
//
//		}

	}
	/*
	 * public void RightArrow_LeftArrow_Week(String MonthandDate) throws
	 * InterruptedException {
	 * 
	 * Thread.sleep(2000); String EventDates = MonthandDate; String DateLabel =
	 * driver.findElement(By.xpath("//label[@class='tdate']")).getText();
	 * 
	 * DLable1 = DateLabel.split(",")[1]; String DLabel2 = DLable1.trim(); String
	 * EventDate = DLabel2.split(" ")[1]; int TodayDate =
	 * Integer.parseInt(EventDate); int DateDiff = EventDates - TodayDate; boolean
	 * flag = true; if (DateDiff < 0) { flag = false; DateDiff = -1 * DateDiff; }
	 * 
	 * for (int i = 0; i < DateDiff; i++) { if (flag == false) { Thread.sleep(1000);
	 * LeftArrowClick.click(); } else { Thread.sleep(1000); RightArrowClick.click();
	 * } }
	 * 
	 * }
	 */

	// Month and Time verify
	@FindBy(xpath = "//div //p[@class='monthtitle']")
	WebElement monthTimeText;

	public void AssertMonthandTime(String name) throws InterruptedException {
		Thread.sleep(2000);
		String text = monthTimeText.getText();
		String[] name2 = text.split("Fri");
		System.out.println("name" + name2[1]);
		Thread.sleep(2000);
		assertEquals(name, name2[1]);
	}

	public void ESaveViewChanges() throws InterruptedException {

		visibilityOfAllElements(ESViewChanges);
		ESViewChanges.click();
	}

	public void EventStratTime(String EStartTime) throws InterruptedException {
		visibilityOfAllElements(EventStartTime);
		EventStartTime.click();
		Select select = new Select(EventStartTime);
		select.selectByVisibleText(EStartTime);
		Thread.sleep(1000);
	}

	public void EventEndTime(String EEndTime) throws InterruptedException {
		visibilityOfAllElements(EventEndTime);
		EventEndTime.click();
		Select select = new Select(EventEndTime);
		select.selectByVisibleText(EEndTime);
		Thread.sleep(1000);
	}

	public void MatterNameSelection(String MatterName) throws InterruptedException {
		visibilityOfAllElements(MatterNameSelection);
		MatterNameSelection.click();
		Select select = new Select(MatterNameSelection);
		Thread.sleep(2000);
		select.selectByVisibleText(MatterName);
		Thread.sleep(2000);
	}

	public void SubjectORTaskSelection(String SelectTask) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(SubjectorTaskSelection);
		SubjectorTaskSelection.click();
		Select select = new Select(SubjectorTaskSelection);
		Thread.sleep(2000);
		select.selectByVisibleText(SelectTask);

	}

	public void EventDatePickerSelection(String EDate, String EMonth, String EYear) throws InterruptedException {
		visibilityOfAllElements(EventDatePicker);
		EventDatePicker.click();
		ScrollDown();
		Thread.sleep(2000);
		while (!EventYear.getText().contains(EYear)) {
			driver.findElement(By.xpath("//div[@class='bs-datepicker-head']//button[@class='next']")).click();
		}
		while (!EventMonths.getText().contains(EMonth)) {
			driver.findElement(By.xpath("//div[@class='bs-datepicker-head']//button[@class='next']")).click();
		}

		Thread.sleep(3000);
		for (int i = 0; i < EventDates.size(); i++) {
			String Date = EventDates.get(i).getText();
			if (Date.equalsIgnoreCase(EDate)) {
				EventDates.get(i).click();
				break;

			}

		}
		System.out.println("" + EDate + "/" + EMonth + "/" + EYear);

	}

//	@FindBy(xpath = "//div [@class='mainmargin scroll-container']");
//	WebElement InnerScroll;
	public void InnerScrollAllDay() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement InnerScroll = driver.findElement(By.xpath("//div //div[contains(text(),'all-day')]"));
		js.executeScript("arguments[0].scrollIntoView();", InnerScroll);
	}

	public void RepetitionSelection(String SelectRepetition) throws InterruptedException {
		Thread.sleep(3000);
		visibilityOfAllElements(EventRepetition);
		EventRepetition.click();
		Select select = new Select(EventRepetition);
		Thread.sleep(2000);
		select.selectByVisibleText(SelectRepetition);
		Thread.sleep(3000);
	}

	public void EventSaveBtn() throws InterruptedException {
		Thread.sleep(2000);
		ScrollToBottom();
		visibilityOfAllElements(EventSaveBtn);
		Thread.sleep(2000);
		EventSaveBtn.click();
	}

	public void MeetingLinkField(String Mlink) {
		visibilityOfAllElements(MeetingLink);
		MeetingLink.sendKeys(Mlink);

	}

	// Assert Meeting Link
	@FindBy(xpath = "(//div //p[@class='meetingitem itemFlex'])[1]")
	WebElement AssertMeetingLink;

	// Meeting name assert
	@FindBy(xpath = "//div //p[@class='casestudy1']")
	WebElement MatterNameText;

	// Dial Number Assert
	@FindBy(xpath = "(//div //p[@class='meetingitem itemFlex'])[2]")
	WebElement DialupNumber;

	public void AssertMeetingName(String Actual) throws InterruptedException {
		Thread.sleep(2000);
		String ExpMatterName = MatterNameText.getText();
		assertEquals(Actual, ExpMatterName);
	}

	public void AssertMeetingLink(String AssertMeetinglink) {
		String ExpMeetinglink = AssertMeetingLink.getText();
		assertEquals(AssertMeetinglink, ExpMeetinglink);
	}

	public void DialUpNumber(String Dialnumber) {
		visibilityOfAllElements(DialNumber);
		DialNumber.sendKeys(Dialnumber);
	}

	public void AssertDialupNumber(String ActualNumber) {
		String ExpDialNumber = DialupNumber.getText();
		assertEquals(ActualNumber, ExpDialNumber);
	}

	public void EventLocation(String EventLoc) throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(Location);
		Location.sendKeys(EventLoc);

	}

	public void MeetingAgenda(String MeetAgenda) {
		visibilityOfAllElements(MeetingAgenda);
		MeetingAgenda.sendKeys(MeetAgenda);
	}

	public void AssertMeetingAgenda(String ActualtMeetingAgenda) {
		String ExpMeetingAgenda = AssertmeetingAgenda.getText();
		assertEquals(ActualtMeetingAgenda, ExpMeetingAgenda);
	}

	// Add Team Member
	public void AddTeamMember(String TMName) {
		visibilityOfAllElements(SearchTeamMembers);
		SearchTeamMembers.click();
		SearchTeamMembers.sendKeys(TMName);
		visibilityOfAllElements(AddTMButton);
		AddTMButton.click();
	}

	// AddDocument
	@FindBy(xpath = "//input[@placeholder='Search Document']")
	WebElement SearchAddDocumentInput;

	// Attach Button Document
	@FindBy(xpath = "//input[@value='Attach']")
	WebElement AttachDocumentButton;

	// Team Member Selection
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-6'])[1] //label[@class='usernamelist']")
	List<WebElement> TeamMemberNameSelect;

	// Add Entity Firm
	public void AddEntityFirmSelect(String EName) throws InterruptedException {
		visibilityOfAllElements(AddEntity);
		AddEntity.click();
		SelectingNames(AddEntity, EName);
		AddEntity.click();
	}

	public void AddEntityMemberSelect(String MemberSelect) {
		visibilityOfAllElements(SearchBoxEntityInput);
		SearchBoxEntityInput.click();
		SearchBoxEntityInput.sendKeys(MemberSelect);
		visibilityOfAllElements(AddEntityButton);
		AddEntityButton.click();
	}

	public void AddDocuments(String DName) {
		visibilityOfAllElements(SearchAddDocumentInput);
		SearchAddDocumentInput.click();
		SearchAddDocumentInput.sendKeys(DName);
		visibilityOfAllElements(AttachDocumentButton);
		AttachDocumentButton.click();

	}

	// Add Individual
	public void AddIndividuals(String text) {
		visibilityOfAllElements(SearchIndividualsInput);
		SearchIndividualsInput.click();
		SearchIndividualsInput.sendKeys(text);
		visibilityOfAllElements(AddIndiButton);
		AddIndiButton.click();
	}

	// Add NotifyMe
	@FindBy(xpath = "//button[@type='button'][1]")
	WebElement AddNotityMe;

	public void AddNotification() throws InterruptedException {
		Thread.sleep(2000);
		visibilityOfAllElements(AddNotityMe);
		AddNotityMe.click();
	}

	public void AssertTeamMember(String names) throws InterruptedException {
		Thread.sleep(2000);
		boolean nameTeamMatched = TeamMemberNameSelect.stream()
				.anyMatch(selectedAllName -> selectedAllName.getText().equalsIgnoreCase(names));
		assertTrue(nameTeamMatched);
	}

	// Entity and Individuals
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-6'])[2] //label[2]")
	List<WebElement> EntityandIndividualSelected;

	public void AssertEntityandIndividual(String names) throws InterruptedException {
		Thread.sleep(2000);
		boolean nameMatched = EntityandIndividualSelected.stream()
				.anyMatch(selectedAllName -> selectedAllName.getText().equalsIgnoreCase(names));
		assertTrue(nameMatched);
	}

	// Document Assert
	@FindBy(xpath = "//div[@class='documentbox']//p")
	List<WebElement> DocumentText;

	public void AssertDocuments(String DocName) throws InterruptedException {
		Thread.sleep(2000);
		boolean DocumentNameMatched = DocumentText.stream()
				.anyMatch(selectedAllName -> selectedAllName.getText().equalsIgnoreCase(DocName));
		assertTrue(DocumentNameMatched);
	}

	public void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}

	public void ScrollDownTM() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1250)");
	}

	public void ScrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1200)");
	}

	public void ScrollToUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)");
	}

}
