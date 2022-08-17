package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class programOverviewTest {
	@Test
	public void vanillaPath() throws InterruptedException {
		int wt = 3000;
		int wt2 = 1500;
		int wt3 = 1000;

		// setting path to the driver executable
		WebDriverManager.chromedriver().setup();
		// creates new object of ChromeDriver to launch browser
		ChromeDriver driver = new ChromeDriver();
		// launches url
		driver.get("https://app-pre.teensmartdriving.com/");
		driver.manage().window().maximize();
		Thread.sleep(wt3);
		// entering username
		driver.findElement(By.id("email")).sendKeys("T4XXIT01BBBB");
		Thread.sleep(wt3);
		// entering password
		driver.findElement(By.id("password")).sendKeys("Test1234");
		Thread.sleep(wt3);
		// click login button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div/form/button")).click();
		Thread.sleep(6000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		// explicit wait - wait until an object/page is rendered, then click "Back to menu" button
		
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary-outline']"))).click();
		Thread.sleep(4000);

		// click Program Overview module
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modules-card-body']"))).click();
		Thread.sleep(wt);
		// click 1st section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='name' and text()='Program Overview']"))).click();
		Thread.sleep(wt);
		// explicit wait - wait until an object/page is rendered, then click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt2);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Next" button to quiz module
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='navigation-button button active-navigation-button ']"))).click();
		Thread.sleep(wt2);
		// click "Retry Quiz" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> B
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='radio-button-label'])[2]"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 2 --> True
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='True']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 3 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='radio-button-label'])[4]"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(5000);
		// question 4 --> B
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[@class='radio-button-label'])[2]"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// Click "continue" button to proceed to next module 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Continue']"))).click();	
	
		Thread.sleep(5000);
		driver.close();
	}
}
