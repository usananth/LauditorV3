package lauditor.abstractclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractClass {

	WebDriver driver;
	WebDriverWait wait;
	Actions action;

	public AbstractClass(WebDriver driver) {
		this.driver = driver;
	}

	public void scrollHeight() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
		
	public void pageDown() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	public void pageDown1() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}
	public void pageDown2() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)");
	}
	public void scrollDown() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}

	public void ScrollUp() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)");
	}
	public void ScrollUpInv() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250)");
	}
	public void ScrollUpInv1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
	}
	
	public void visibilityOfElementWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void webDriverWaitelementToBeSelected(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	public void visibilityOfAllElements(WebElement actionBtn) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(actionBtn));
	}

	public void elementtoBeClickableWait() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div //img[@class='mattersicon'])[1]")));

	}

	public void selectDocumentorRemoveDocument(String[] NameList, List<WebElement> listofGroups,
			List<WebElement> removeOrSelectBtn) throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(NameList);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement selectGroup;
		for (int i = 0; i < listofGroups.size(); i++) {
			textGroup = listofGroups.get(i).getText();
			// System.out.println("All Group Name Text "+textGroup);
			if (groupNames.contains(textGroup)) {
				// Thread.sleep(2000);
				selectGroup = removeOrSelectBtn.get(i);
				visibilityOfAllElements(selectGroup);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", selectGroup);
				i--;
			}
		}

	}

	public static void getFile(String path) throws InterruptedException {
		File directory = new File(path);
		String allimages = "";
		File[] flist = directory.listFiles();

		for (File file : flist) {
			if (file.isFile()) {
				allimages = allimages + "\"" + file.getName() + "\"" + " ";
			}
		}

		try {
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\ExeFiles\\getthefolder.exe" + " " + directory + File.separator);
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\ExeFiles\\selectalltoopen.exe" + " " + allimages);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void getFile1(String path) throws InterruptedException {
		File directory = new File(path);
		String allimages = "";
		File[] flist = directory.listFiles();

		for (File file : flist) {
			if (file.isFile()) {
				allimages = allimages + "\"" + file.getName() + "\"" + " ";
			}
		}

		try {
			Thread.sleep(5000);
			Runtime.getRuntime().exec("F:\\ExeFiles\\getthefolder.exe" + " " + directory + File.separator);
			Thread.sleep(5000);
			Runtime.getRuntime().exec("F:\\ExeFiles\\selectalltoopen.exe" + " " + allimages);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	// Select Class
	public void SelectingNames(WebElement nameTasks, String name) throws InterruptedException {
		Thread.sleep(3000);
		Select selectList = new Select(nameTasks);
		selectList.selectByVisibleText(name);
	}

	

	// Groups select and Remove
	public void selectGroups(String[] SelectGroups, List<WebElement> listofGroups, List<WebElement> selectBtn)
			throws InterruptedException {
		Thread.sleep(2000);
		List<String> groupNames = Arrays.asList(SelectGroups);
		String textGroup = new String();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		for (int i = 0; i < listofGroups.size(); i++) {
			textGroup = listofGroups.get(i).getText();
			// System.out.println("All Group Name Text "+textGroup);
			if (groupNames.contains(textGroup)) {
				// Thread.sleep(2000);
				WebElement selectGroup = selectBtn.get(i);
				visibilityOfAllElements(selectGroup);
				Thread.sleep(2000);
				executor.executeScript("arguments[0].click();", selectGroup);
			}
		}

	}
	public void searchDocuments(String DocsName,List<WebElement> allDocumElements,List<WebElement> checkboxBtn) throws InterruptedException {
		

		scrollDown();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// List<String> selectedDocsNames = Arrays.asList(selectDocs);

		for (int i = 0; i < allDocumElements.size(); i++) {
			String allDocumentNames = allDocumElements.get(i).getText();
			Thread.sleep(3000);
			if (DocsName.contains(allDocumentNames)) {
				Thread.sleep(3000);
				WebElement selectDocuments = checkboxBtn.get(i);
				js.executeScript("arguments[0].click();", selectDocuments);
				System.out.println(selectDocuments);

			}

		}

	}

}
