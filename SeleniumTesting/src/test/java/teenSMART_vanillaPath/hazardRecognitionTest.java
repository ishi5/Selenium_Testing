package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hazardRecognitionTest {
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
		
		//"Hazard Recognition" module
		//click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		// turn on subtitles
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt);
		Thread.sleep(wt);
		// click "Next" button to 2nd video
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		Thread.sleep(wt);
		// Level 1
		// click "Review" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='level-button button button-warning' and text()='Review']"))).click();
		Thread.sleep(wt);
		Thread.sleep(wt);
		// sim 1		90_hd_t_vs_12_1280v2
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on minivan, pedestrian, crosswalk sign, cyclist on left
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Minivan with open side door']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian Crosswalk Sign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian in Crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Cyclist on the left']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 2		41_ed_t_vs_11_1280v2
		// click "2" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on pedestrian brown shirt, traffic light a, pedestrian on right, traffic light b, parallel parked car
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian with Brown Shirt']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian on right side']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Parallel Parked Car']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (b)']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 3		57_ed_t_vs_25_1280v2
		// click "3" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on pedestrian, traffic light a, traffic light b, vehicle, cross walk sign, pedestrian 2
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Vehicle']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian Crosswalk Sign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian 2']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 4		294_1280v2
		// click "4" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on man pushing garbage, dog running, white car, dark color car
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man pushing a garbage can']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dog running out into the street']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the backing out white car']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dark-colored car turning up ahead']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		
		//Level 2
		// click "Review" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[2]"))).click();
		Thread.sleep(wt);
		// sim 1		210e_pl_t_haz_06e_1280v2
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black SUV']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dark-colored sedan parking']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the sedan with its reverse lights on']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man exiting the store']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the light colored SUV parking']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the two guys on left curb']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black SUV parking']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the guy crossing from the left']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 2		199_pl_t_haz_02_1280v2
		// click "2" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Crosswalk Sign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the mother and child']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double-parked and oncoming car']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car with its hazard lights on']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-truck and car with brake lights']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Crosswalk Sign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the jaywalking pedestrians']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (c)']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 3		203_hd_t_haz_01_1280v2
		// click "3" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='3'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car parallel parking']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the parking SUV']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the woman on the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people in the crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-Road Blocked on Right']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 4		204_hd_t_haz_02_1280v2
		// click "4" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='4'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrians on the median']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cars in the turn lane']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians moving toward the street']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the traffic slowing down']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (b)']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 5		206_ed_t_haz_16_1280v2
		// click "5" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='5']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people at the first crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man and the girl at the crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the First Traffic Light']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist at the crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian walking along the road']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people at the second crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the Second Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the Second Traffic Light (b)']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 6		209_pl_t_haz_05_1280v2
		// click "6" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='6']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the red vest']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the second crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the bicyclist to the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double-parked black SUV']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Pedestrian to the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the third crosswalk']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Fourth Traffic Light (a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Fourth Traffic Light (b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrians and cross traffic']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 7		210o_pl_t_haz_06o_1280v2
		// click "7" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='7']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the running man']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the couple']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Stop Sign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black car turning left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the woman in red']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the woman wearing brown']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the second woman wearing brown']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-Pedestrian Wearing Shorts']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the car backing up']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian with a cart']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the turning black car ']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 8		210k_pl_t_haz_06k_1280v2a
		// click "8" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='8']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car coming from the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian far ahead']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the silver car coming from the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man with a baby']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// sim 9		208_pl_t_haz_04_1280v2
		// click "9" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='9']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at first intersection(a)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist on right']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at first intersection(b)']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at second intersection']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car merging in and braking']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-a cyclist heading towards the street']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1- pedestrians at the third corner']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-White car with brake lights on']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist on the left']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Third Traffic Light']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double parked UPS truck']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][text()='Next']"))).click();
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='div'][text()='Next']"))).click();
		// click "Next" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='div'][@class='navigation-button button active-navigation-button ']"))).click();
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		//click "quiz" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='button what-to-do-button' and text()='QUIZ']"))).click();
		Thread.sleep(wt);
		
		//quiz
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button button-secondary' and text()='Retry Quiz']"))).click();
		Thread.sleep(wt2);
		// question 1 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Those elements that are not going to be a problem']"))).click();
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
		// question 3 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='A double parked car a block ahead of you']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// question 4 --> C
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='radio-button-label' and text()='Keep your driving smooth and stay in control']"))).click();
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		// Click "Continue" button to proceed to next module 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Continue']"))).click();						
	
		Thread.sleep(5000);
		driver.close();
	}
}
