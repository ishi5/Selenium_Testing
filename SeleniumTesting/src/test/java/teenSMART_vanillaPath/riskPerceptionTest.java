package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class riskPerceptionTest {
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
		
		//"Risk Perception" module
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// turn on subtitles
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt);
		Thread.sleep(wt);
		// click "Next" button to 2nd video
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		
		// click "Review" button -- What's the Clue Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// sim 1	190b_wc_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 2		201_wc_1280
		// click "2" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue (b)']"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue (b)']"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 3		197_wc_1280
		// click "3" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 4		188_wc_1280
		// click "4" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 5		205_wc_1280
		// click "5" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='5']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Third Clue']"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Fourth Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 6		207_wc_1280
		// click "6" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='6']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Third Clue']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Fourth Clue']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);	
		
		// click "Review" button   -- Risk-O-Meter Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// sim 1		22_ra_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 2		192_ra_1280
		// click "2" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 3		18_ra_1280
		// click "3" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 4		186_ra_1280
		// click "4" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 5		202_ra_1280
		// click "5" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='5']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 6		210c_ra_1280
		// click "6" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='6']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on less, same, more risk
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[2]"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
						
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navigation-button button active-navigation-button ']"))).click();
		Thread.sleep(7000);
		
		//click "QUIZ" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt);
		
		//retry quiz
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> B
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='radio-button-label'])[2]"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 2 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='All of the above']"))).click();
		Thread.sleep(wt2);
		// click "Submit" buttons
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 3 --> D
		Thread.sleep(wt2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='All of the above']"))).click();
		Thread.sleep(wt2);
		// click "Submit" buttons
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 4 --> D
		Thread.sleep(wt2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='All of the above']"))).click();
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