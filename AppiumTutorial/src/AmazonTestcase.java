import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonTestcase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.micron.StartupActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"New to Amazon.in? Create an account\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_customer_name\")")).sendKeys("shivani");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_phone_number\")")).sendKeys("9871045858");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_email\")")).sendKeys("");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"ap_password\")")).sendKeys("nilurana");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Verify mobile number\")")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]")).getText());
		//Assert.assertEquals(driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Mobile number already in use\")")), "Mobile number already in use");
	  //driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_email\")")).sendKeys("nilu.rana@gmail.com");
	}

}
