package com.testing.Appium;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Solodroid {

	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {

	//	 File app=new File("C:\\Users\\jandh\\Downloads\\Solodroid_E-CommerceApp Demo_3.2.0.apk");
		DesiredCapabilities desiredCapability = new DesiredCapabilities();
		desiredCapability.setCapability("deviceName", "emulator-5554");
		desiredCapability.setCapability("platformName", "Android");
		desiredCapability.setCapability("platformVersion", "12");
		
		
//		desiredCapability.setCapability("app",app.getAbsolutePath());
		desiredCapability.setCapability("appPackage", "com.solodroid.solomerce");
		desiredCapability.setCapability("appActivity", "com.solodroid.solomerce.activities.MainActivity");
		desiredCapability.setCapability("noReset", true);
		
	

	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapability);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		TouchAction action = new AndroidTouchAction(driver);
		
		/// swipe right
		
//		Dimension dimension = driver.manage().window().getSize();

//		int swipeStart = (int) (dimension.width * 0.2);
//		int swipeEnd = (int) (dimension.width * 0.8);
//		int y = (int) (dimension.height * 0.5);
		
		
//		action.press(PointOption.point(1000, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//		.moveTo(PointOption.point(60, 1000)).release().perform();
//		System.out.println("Swiped right");
//		Thread.sleep(3000);
//		
//		///swipe left
//		
//		action.press(PointOption.point(60, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//		.moveTo(PointOption.point(1000, 1000)).release().perform();
//		System.out.println("Swiped left");
//		Thread.sleep(3000);
//			
//		
//		
//		
		// click
		MobileElement samsungS10 = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView"));
		samsungS10.click();
		System.out.println("samsungS10 is clicked...");
		Thread.sleep(4000);
		// touch
		MobileElement samsungS10Pic = driver.findElement(By.id("com.solodroid.solomerce:id/product_image"));
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(samsungS10Pic))).perform();
		System.out.println("samsungS10 picture is touched...");
//		
//		// change orientation
//		System.out.println(driver.getOrientation());
//		
//		if(driver.getOrientation().equals(ScreenOrientation.PORTRAIT)) {
//			driver.rotate(ScreenOrientation.LANDSCAPE);
//			
//			System.out.println("Changed the orientation to " +driver.getOrientation());
//		}
//		
//		if(driver.getOrientation().equals(ScreenOrientation.LANDSCAPE)) {
//			driver.rotate(ScreenOrientation.PORTRAIT);
//			System.out.println("Changed the orientation to " +driver.getOrientation());
//		}
//		
//		// switch apps
//		
//		Set<String> allActivitiesBefore =driver.getContextHandles();
//		System.out.println(allActivitiesBefore);
//		///adb shell dumpsys window | find "mCurrentFocus"
//		//com.google.android.apps.messaging/com.google.android.apps.messaging.ui.ConversationListActivity
//		Activity messageApp = new Activity("com.google.android.apps.messaging", "com.google.android.apps.messaging.ui.ConversationListActivity");
//		
//		driver.startActivity(messageApp);
//		System.out.println("came to messages");
//		Thread.sleep(5000);
//		
//		Set<String> allActivitiesAfter =driver.getContextHandles();
//		System.out.println(allActivitiesAfter);
//		
//		driver.navigate().back();
//		System.out.println("cameBack");
//		
//		// zoom
//
//		
		Thread.sleep(6000);
		Dimension dimension = driver.manage().window().getSize();
		int x = (int) (dimension.width * 0.5);
		int y = (int) (dimension.height * 0.5);
		action.press(PointOption.point(x, y)).release().perform()
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(20))).press(PointOption.point(x, y)).release()
				.perform();

		System.out.println("image zoomed...");

		Thread.sleep(3000);

		action.press(PointOption.point(x, y)).release().perform()
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(20))).press(PointOption.point(x, y)).release()
				.perform();

		System.out.println("image zoom out...");

		// click close using findElementByAccessibilityId

		MobileElement close = driver.findElementByAccessibilityId("Close");

		close.click();
		System.out.println("close is clicked...");

		// scroll

		Double screenHeightStart = dimension.getHeight() * 0.5;

		int scrollStart = screenHeightStart.intValue();

		Double screenHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();

		int X = (int) (dimension.width * 0.5);

		System.out.println(scrollStart + "   " + scrollEnd + "   " + X);
		Thread.sleep(3000);

		action.press(PointOption.point(X, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(X, scrollEnd)).release().perform();

		System.out.println("scrolling down");
		
		
	
		
		

		/// click add to cart using point options

		action.tap(PointOption.point(700, 2800)).perform();
		System.out.println("clicked on add to cart");

		/// send keys
		MobileElement qty = driver.findElement(By.id("com.solodroid.solomerce:id/userInputDialog"));

		qty.sendKeys("2");

		System.out.println("add the quantity");

		MobileElement add = driver.findElement(By.id("android:id/button1"));
		add.click();

		/// go to the cart
		MobileElement cart = driver.findElement(By.id("com.solodroid.solomerce:id/cart"));
		cart.click();

		System.out.println("went to cart");

		/// cick check out
		MobileElement checkOut = driver.findElement(By.id("com.solodroid.solomerce:id/btn_checkout"));
		checkOut.click();

		System.out.println("clicked on checkout");

		Thread.sleep(3000);
		/// process payment
		action.tap(PointOption.point(500, 2055)).perform();
		System.out.println("clicked on process checkout");

		/// confirm to proceed
		MobileElement confirm = driver.findElement(By.id("android:id/button1"));
		confirm.click();

		System.out.println("confirm on checkout");

		Thread.sleep(5000);

		/// check confirmation message
		MobileElement message = driver.findElement(By.id("android:id/alertTitle"));

		String actualMsg = message.getText();
		String expectedMsg = "Congratulation";
		if (actualMsg.equalsIgnoreCase(expectedMsg)) {
			System.out.println("Sucessful");
		}

		MobileElement ok = driver.findElement(By.id("android:id/button1"));
		ok.click();

		Thread.sleep(3000);

		/// go to home
		MobileElement title = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView"));

		String actualTitle = title.getText();
		String expectedTitle = "E-Commerce Android App";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Back to home page");
		}
		
	/// scroll using UISelector(developer.andriod.com)
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.solodroid.solomerce:id/viewpager\"))"
				+ ".scrollForward().scrollIntoView(new UiSelector().textContains(\"Money Counter kozure MC-101\").instance(0))");

	}

}
