import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class tests {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void Test() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clock");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Alarm\"]/android.widget.FrameLayout/android.widget.ImageView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\"8:30 AM Alarm\"]/android.view.ViewGroup/android.widget.Switch");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Clock\"]/android.widget.FrameLayout/android.widget.ImageView");
        el4.click();
    }

    @Test
    public void Test2() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clock");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Stopwatch\"]/android.widget.FrameLayout/android.widget.ImageView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Start");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Lap");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Pause");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Reset");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Clock\"]/android.widget.FrameLayout/android.widget.ImageView");
        el7.click();
    }

    @Test
    public void Test3() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clock");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Timer\"]/android.widget.FrameLayout/android.widget.ImageView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.deskclock:id/timer_setup_digit_6");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.deskclock:id/timer_setup_digit_0");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Start");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Delete");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Clock\"]/android.widget.FrameLayout/android.widget.ImageView");
        el7.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
