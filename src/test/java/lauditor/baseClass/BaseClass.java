package lauditor.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
//import lauditor.PageObjectsModule.DocumentUploadFirmPages;
import lauditor.pom.pages.CreateCalendarGMEventPage;

import lauditor.pom.pages.CreateInvoicePageandView;
import lauditor.pom.pages.CreateMeetingsPage;
import lauditor.pom.pages.DashBoard;
import lauditor.pom.pages.DocumentUploadFirmPages;
import lauditor.pom.pages.DocumentViewFirmPages;
import lauditor.pom.pages.LoginPage;
import lauditor.pom.pages.MergePDFPage;
import lauditor.pom.pages.SingleTestCaseCalendarPage;
import lauditor.pom.pages.ViewMeetingsPage;

public class BaseClass {
	public WebDriver driver;

	public Properties prop;
	public LoginPage loginPage;
	public DashBoard dashBoard;
	public DocumentUploadFirmPages documentUploadFirmpages;
	public DocumentViewFirmPages documentViewFirmPages;
	public CreateCalendarGMEventPage createCalendarGMEvents;
	public CreateMeetingsPage createMeeting;
	public SingleTestCaseCalendarPage SingleTest;
	public ViewMeetingsPage viewMeeting;
	public MergePDFPage mergePDFPage;
	public CreateInvoicePageandView createInvoice;


	public WebDriver initalize() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"F:\\ANANTH\\Eclipse-Workspace\\Law\\src\\main\\java\\lauditor\\resource\\Data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
		//	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
		} else if (browserName.equalsIgnoreCase("Firefox")) {
		//	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException

	{
		// read json to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// String to HashMap Jackson Datbind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data;
	}

	public List<HashMap<String, String>> getJsonDataToMap1(String filePath) throws IOException

	{
		// read json to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// String to HashMap Jackson Datbind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data1 = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data1;
	}

	public List<HashMap<String, String>> getJsonDataToMap2(String filePath) throws IOException

	{
		// read json to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

		// String to HashMap Jackson Datbind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data2 = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data2;
	}

	@BeforeClass
	public LoginPage launchApplication() throws IOException {
		driver = initalize();
		// driver.get("https://staging.lauditor.com/login");
		loginPage = new LoginPage(driver);
		loginPage.goTo();
		loginPage.loginApplication(prop.getProperty("name"), prop.getProperty("password"));
		dashBoard = new DashBoard(driver);
		documentUploadFirmpages = new DocumentUploadFirmPages(driver);
		documentViewFirmPages = new DocumentViewFirmPages(driver);
		createCalendarGMEvents = new CreateCalendarGMEventPage(driver);
		createMeeting = new CreateMeetingsPage(driver);
		viewMeeting = new ViewMeetingsPage(driver);
		SingleTest= new SingleTestCaseCalendarPage(driver);
		mergePDFPage=new MergePDFPage(driver);
		createInvoice= new CreateInvoicePageandView(driver);
//		calendarViewMeetingsPage= new CalendarViewMeetingsPage(driver);
//		CreateMeetigns=new CalendarViewMeetingsPage(driver);
		return loginPage;
	}

	@AfterClass
	public void down() {
		driver.close();
	}

}
