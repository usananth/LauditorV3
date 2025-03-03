package ananth.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://staging.lauditor.com/login");

        driver.findElement(By.id("id_email")).sendKeys("ananth.kumar@digicoffer.com");
        driver.findElement(By.id("id_password")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//img[@src='assets/img/relationship.svg']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Search..']")).sendKeys("whee Jung\t");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/button[1]")).click();
        driver.findElement(By.cssSelector("ul[class='dropdown-menu show'] li:nth-child(1) a:nth-child(1)")).click();

        driver.findElement(By.xpath("//a[@class='optionone compone relation-sub-tabs']")).click();
        driver.findElement(By.cssSelector(".optiontwo.relation-sub-tabs.compotwoo.comptwo")).click();

        WebElement docList = driver.findElement(By.xpath("//input[@placeholder='Search ']"));
        docList.sendKeys("driver_license");
        String documents = docList.getText();
        System.out.println(documents);

    }

}
