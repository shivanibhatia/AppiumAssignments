import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends demoAppium {
	
	public static void main(String[] args) throws MalformedURLException {
	
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
	}

}
