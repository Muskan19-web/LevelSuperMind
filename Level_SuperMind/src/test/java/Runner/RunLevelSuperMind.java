package Runner;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Capabilities.Capabiltiy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//
public class RunLevelSuperMind  extends Capabiltiy{
	AndroidDriver<AndroidElement>driver;
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		//service=startServer();
		driver = level_superMind();
//		Thread.sleep(35000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@Test (priority = 1)
	public void run() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Level SuperMind is opened"); // Open the App
		
	}
	//Positive Testing
	@Test (priority = 2)
	public void start() throws InterruptedException { // Click on SignIn
	Thread.sleep(2000);
	AndroidElement clicked =driver.findElement(MobileBy.xpath("//android.widget.Button"));
	clicked.click(); 
	}
	@Test(priority = 3)
	public void phoneNumber() throws InterruptedException { // Enter the number
		Thread.sleep(2000);
		AndroidElement numberEnter = driver.findElement(MobileBy.xpath("//android.widget.EditText"));
		numberEnter.sendKeys("6267021603");
	}
	
	@Test(priority = 4)
	public void rightClick() throws InterruptedException { // click on arrow button
		Thread.sleep(5000);
		AndroidElement rightClick = driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc=\"Arrow Right\"])[1]"));
		rightClick.click();
		
	}
	
	@Test(priority = 5)
	public void name() throws InterruptedException { //Enter the name
		Thread.sleep(8000);
		driver.findElement(MobileBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[1]")).sendKeys("Khushi");
	}
	@Test(priority = 6)
	public void email() throws InterruptedException { //Enter email
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[2]")).sendKeys("khushipatel59@gmail.com");
		
	}
	@Test(priority = 7)
	public void gender() throws InterruptedException { //Click on female
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]")).click();
	}
	@Test(priority = 8)
	public void rclicked() throws InterruptedException { // Click on arrow key
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")).click();
	}
	@Test(priority = 9)
	public void anxiety() throws InterruptedException { // click on anxiety
		Thread.sleep(4000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Stress and anxiety\"]")).click();
		
	}
	@Test(priority = 10)
	public void FocusandProductivity() throws InterruptedException { // Click on focusandproductivity
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Focus and Productivity\"]")).click();
	}
	@Test(priority = 11)
	public void Relaxation() throws InterruptedException { //Click on Relaxation
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Relaxation\"]")).click();
	}
	@Test(priority = 12)
	public void arrowClick() throws InterruptedException { // Click on arrowbutton
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Arrow Right")).click();
	}
	@Test(priority = 13)
	public void selectOne() throws InterruptedException { // Select any one option
		Thread.sleep(4000);
		driver.findElement(MobileBy.xpath("//android.widget.ScrollView/android.view.View[3]")).click();
		
	}
	@Test(priority = 14)
	public void arrows() throws InterruptedException { // Click on Arrow Button
		Thread.sleep(2000);
		driver.findElement(MobileBy.AccessibilityId("Arrow Right")).click();
	}
	
	@Test(priority = 15)
	public void home() throws InterruptedException { // Click on back button
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")).click();
	}
//	 // After once login done i do logout and again log in on same number
	@Test(priority = 16)
	public void rightClick1() throws InterruptedException {
		Thread.sleep(5000);
		AndroidElement rightClick = driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc=\"Arrow Right\"])[1]"));
		rightClick.click();
		
	}
	@Test(priority = 17)
	public void options() throws InterruptedException {
		Thread.sleep(10000);
		AndroidElement option = driver.findElement(MobileBy.xpath("//android.view.View[@resource-id=\"TodayScreenLazyColumn\"]/android.view.View[1]/android.view.View"));
		option.click();
	}
//
	@Test(priority = 18)
	public void logoutbtn() throws InterruptedException { //click on logoutbutton 
		Thread.sleep(10000);		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"))").click();
		

		
	}
	@Test(priority = 19)
	public void logoutConfirmationBtn() throws InterruptedException { // Click on logoutConfirmation btn 
		Thread.sleep(6000);
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();
	}
////	// Negative test cases
	@Test (priority = 20)
	public void runForNegative() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Level SuperMind is opened"); // Open the App
	}
		@Test (priority = 21)
		public void started() throws InterruptedException { // Click on SignIn
		Thread.sleep(2000);
		AndroidElement clicked =driver.findElement(MobileBy.xpath("//android.widget.Button"));
		clicked.click(); 
		}
		@Test(priority = 22)
		public void NegativePhoneNumber() throws InterruptedException { // Enter the number
			Thread.sleep(2000);
			AndroidElement numberEnter = driver.findElement(MobileBy.xpath("//android.widget.EditText"));
			numberEnter.sendKeys("8888888888"); // its take this number
		}

}
	


