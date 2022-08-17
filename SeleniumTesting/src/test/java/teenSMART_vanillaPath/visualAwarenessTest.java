package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class visualAwarenessTest {
	@Test
	public void vanillaPath() throws InterruptedException {
		int wt = 3000;
		int wt2 = 1500;

		// setting path to the driver executable
		WebDriverManager.chromedriver().setup();
		// creates new object of ChromeDriver to launch browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
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
		
		// click Visual Awareness "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		// turn on subtitles
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		// click "Next" button to 2nd video
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);	
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(wt);
		
		//Level 1
		//visual awareness activity click review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='level-button button button-warning']"))).click();
		Thread.sleep(7000);
		// click "Play" button (1st sim)		49_hd_t_vs_01_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click right blind spot section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 2nd sim		35_ed_t_vs_05_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left side blind spot section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 3rd sim		33b_ed_t_vs_03_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		Thread.sleep(7000);
		//Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front view section
		Thread.sleep(7000);
		WebElement element = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 4th sim		39_ed_t_vs_09_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 5th sim			32_ed_t_vs_02_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='5']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front view section
		Thread.sleep(7000);
		WebElement element2 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 6th sim    50b_hd_t_vs_02b_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='6']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 7th sim		63_ed_t_vs_31_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='7']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front and right blind spot section
		Thread.sleep(7000);
		WebElement element3 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000); 
		
		//click Level 2     54_ed_t_vs_22_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button (1st sim)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front view section and blind spot right
		Thread.sleep(9000);
		WebElement element4 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
		Thread.sleep(7000);
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 2nd sim		65_ed_t_vs_33_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left side and front section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
		Thread.sleep(1000);
		WebElement element5 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 3rd sim		67_hd_t_vs_03_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='3'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front view and rear view section
		Thread.sleep(15000);
		WebElement element6 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element6);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 4th sim		83_ed_t_vs_47_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='4'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front section twice
		Thread.sleep(15000);
		WebElement element7 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element7);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 5th sim		70d_hd_t_vs_06d_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='5'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000); 
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left side and front section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
		Thread.sleep(1000);
		WebElement element8 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element8);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);	
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 6th sim		70f_hd_t_vs_06f_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='6'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000); 
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left side and rear section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
		Thread.sleep(1000);
		WebElement element9 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element9);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
		Thread.sleep(7000);	
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 7th sim		64_ed_t_vs_32_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='7'])[2]"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000); 
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left blind spot side and rear section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
		Thread.sleep(1000);
		WebElement element10 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
		Thread.sleep(7000);	
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);
		// 8th sim		84_ed_t_vs_48_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='8']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000); 
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click front section twice
		Thread.sleep(15000);
		WebElement element11 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element11);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);		
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);		
		// 9th sim		71_ed_t_vs_35_1280_v2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='9']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000); 
		// click play
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click left blind spot side and front section
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
		Thread.sleep(1000);
		WebElement element12 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element12);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
		Thread.sleep(7000);	
		// exit review
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button button-warning']"))).click();
		Thread.sleep(7000);		
		
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][text()='Next']"))).click();		
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		//click "QUIZ" button
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt);
		
		//quiz
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> B
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Failure to see other vehicles']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 2 --> D
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='D. Both A and B']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 3 --> A
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='True']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 4 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label[@class='radio-button-label'])[3]"))).click();
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