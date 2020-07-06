import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonSkipSignIn {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "in.amazon.mShop.android.shopping");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.amazon.micron.StartupActivity");
		caps.setCapability("unicodeKeyboard", "true");                                     
		//caps.setCapability("resetKeyboard", "true");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Skip sign in\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search in All Categories\")")).sendKeys("iPhone7");
	Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search in All Categories\")")).sendKeys("iPhone7");
		//driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ENTER).perform();
		

	
	}
}
