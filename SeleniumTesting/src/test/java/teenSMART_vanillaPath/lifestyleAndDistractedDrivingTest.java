package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lifestyleAndDistractedDrivingTest {
	@Test
	public void vanillaPath() throws InterruptedException {
		int wt = 3000;
		int wt2 = 1500;

		// setting path to the driver executable
		WebDriverManager.chromedriver().setup();
		// creates new object of ChromeDriver to launch browser
		ChromeDriver driver = new ChromeDriver();
		// launches url
		driver.get("https://app-pre.teensmartdriving.com/");
		driver.manage().window().maximize();
		Thread.sleep(wt2);
		// entering username
		driver.findElement(By.id("email")).sendKeys("T4XXIT01BBBB");
		Thread.sleep(wt2);
		// entering password
		driver.findElement(By.id("password")).sendKeys("Test1234");
		Thread.sleep(wt2);
		// click login button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div/form/button")).click();
		Thread.sleep(6000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		//"Lifestyle & Distracted Driving" module
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// turn on subtitles
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt);
		Thread.sleep(wt);
		// click "Next" button to 2nd video
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		
		// click "Level 1" button -- Lifestyle & Distracted Driving Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='level-button button button-warning']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrians exiting car']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car that changes lanes']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the bus changing lanes']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the oncoming car turning left']"))).click();
		// click "Exit review" button
		Thread.sleep(40000);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the truck with hazard lights on']"))).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the white jeep']"))).click();
		Thread.sleep(9500);
		Thread.sleep(6000);
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();	
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='dark car turning']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();		
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='div'][@class='button button-warning ']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click "QUIZ" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt);	
		// quiz
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='60%']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 2 --> A
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Checking the controls on your dash']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 3 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='All of the above']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 4 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='176%']"))).click();
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