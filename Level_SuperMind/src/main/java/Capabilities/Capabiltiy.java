package Capabilities;

import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.context.annotation.AdviceModeImportSelector;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Capabiltiy {
//	public AppiumDriverLocalService service;
//	 //for starting the server
//	 public AppiumDriverLocalService startServer()
//	 {
//	 boolean flag = checkifserverisRunning(4723);
//	 if(!flag)
//	 {
//	 service = AppiumDriverLocalService.buildDefaultService();
//	 service.start();
//	 }
//	 return service;
//	 }
//	 public static boolean checkifserverisRunning(int port)
//	 {
//	 boolean isServerRunning=false;
//	 ServerSocket serversocket;
//	 try{
//	 serversocket = new ServerSocket(port);
//	 serversocket.close();
//	 }
//	 catch(IOException e)
//	 {
//	 isServerRunning = true;
//	 }
//	 finally {
//	 serversocket=null;
//	 }
//	 return isServerRunning;
//	 }  
	
//	public static void StartEmulator() throws IOException, InterruptedException {
//		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//src//test//resources//emulator.bat");
//		Thread.sleep(10000);
//	}
	
	
public static AndroidDriver<AndroidElement> level_superMind() throws IOException, InterruptedException{
	
	FileReader globalFilePath = new FileReader(System.getProperty("user.dir")+"//src//main//java//Capabilities//global.properties");
	
	Properties loadProperty = new Properties();
	loadProperty.load(globalFilePath);
	
	String device =	loadProperty.getProperty("deviceName");
	String platform = loadProperty.getProperty("platformName");
	String pkg = loadProperty.getProperty("appPakage");
	String activity = loadProperty.getProperty("appActivity");
	String uiautomator = loadProperty.getProperty("automationName");
	String reset = 	loadProperty.getProperty("noReset");
//	if(device.equals("Muskan")) {
//		StartEmulator();
//	}
//	
	
	
	
	
	DesiredCapabilities desired = new DesiredCapabilities();
	desired.setCapability(MobileCapabilityType.DEVICE_NAME,device );
	desired.setCapability(MobileCapabilityType.PLATFORM_NAME,platform );
	desired.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, pkg);
	desired.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,activity );
	desired.setCapability(MobileCapabilityType.AUTOMATION_NAME,uiautomator);
	desired.setCapability(MobileCapabilityType.NO_RESET,reset );
	AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/"),desired);
	
	
	return driver;
	
}
}
