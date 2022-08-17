package teenSMART_vanillaPath;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class beforeYouStartYourEngineTest {
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
		
		//"Before you start your engine" module
		//click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt2);
		// turn on subtitles
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt2);
		// click "Next" button to 2nd video
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		Thread.sleep(wt2);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		Thread.sleep(wt);

		//drag and drop vehicle fit activity
		Thread.sleep(7000);
		Thread.sleep(7000);
		WebElement drag = driver.findElement(By.xpath("//div[@class='ball-start-box' and text()='1']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='ball-target-box '][1]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		WebElement drag2 = driver.findElement(By.xpath("//div[@class='ball-start-box' and text()= '2']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[@class='ball-target-box ']"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(drag2, drop2).build().perform();
		WebElement drag3 = driver.findElement(By.xpath("//div[@class='ball-start-box' and text()='3']"));
		WebElement drop3 = driver.findElement(By.xpath("//div[@class='ball-target-box ']"));
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(drag3, drop3).build().perform();
		WebElement drag4 = driver.findElement(By.xpath("//div[@class='ball-start-box' and text()='4']"));
		WebElement drop4 = driver.findElement(By.xpath("//div[@class='ball-target-box ']"));
		Actions act4 = new Actions(driver);
		act4.dragAndDrop(drag4, drop4).build().perform();
		Thread.sleep(5000);
		//click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt3);
		// turn on subtitles
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt2);
		// click "Next" button to 2nd video
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		Thread.sleep(wt2);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		Thread.sleep(wt2);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		// turn on subtitles
		Thread.sleep(wt2);
		// click "Next" button
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(7000);
		// click "Next" button to quiz module
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='navigation-button button active-navigation-button ']"))).click();
		Thread.sleep(7000);
		Thread.sleep(wt);
		//click "Quiz" button
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt2);
		//quiz
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> A
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Centered on the back of your head']"))).click();
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Close to the left window']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 4 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='To the right, over the center console']"))).click();
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