package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class criticalDecisionMakingTest {
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
		
		//"Critical Decision Making" module
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		
		
		// click "Level 1" button -- Oncoming Gap Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[1]"))).click();
		Thread.sleep(wt);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
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
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(17000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
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
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(24000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
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
		Thread.sleep(12000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();	
		// click "4" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 4
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(21000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();	
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='div'][text()='Next']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);		
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		
		// click "Level 1" button -- Escape Route Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[1]"))).click();
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='arrow is-bottom ']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='arrow is-bottom-right ']"))).click();
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='arrow is-bottom ']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "4" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 4
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='arrow is-bottom ']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='div'][@class='navigation-button button active-navigation-button ']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		//click "QUIZ" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt);
		
		//quiz
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='button button-secondary'])[2]"))).click();
		Thread.sleep(wt2);
		// question 1 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Toward the middle of your rearview mirror']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 2 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='All of the above']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 3 --> B
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='False']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		Thread.sleep(wt2);
		// question 4 --> A
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='True']"))).click();
		Thread.sleep(wt2);
		Thread.sleep(wt2);
		// click "Submit" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Submit']"))).click();
		Thread.sleep(wt2);
		// Click "continue" button to proceed to next module 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Continue']"))).click();
	
		Thread.sleep(5000);
		driver.close();
	}
}