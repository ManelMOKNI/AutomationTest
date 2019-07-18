package utility;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Hook {
    private static AppiumDriver driver;
    private static boolean dunit = false; // create only one session for test .
    private static String platforme ="";
    @Before
    public void setUp() throws MalformedURLException,Exception{
        if(!dunit) {
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                desiredCapabilities.setCapability("deviceName", "Manelphone");
                desiredCapabilities.setCapability("platformVersion", "5");
                desiredCapabilities.setCapability("platformName", "Android");
              //  desiredCapabilities.setCapability("app", "/home/mortadha/MotornaMobile/bitbucket/motorna_automation_framework/ReportConfig/MT_Dev0207.apk");
                desiredCapabilities.setCapability("udid", "22e5a070");
//              desiredCapabilities.setCapability("deviceId", "10.0.0.121:5555");
                desiredCapabilities.setCapability("appActivity", ".ui.activities.SplashActivity");
                desiredCapabilities.setCapability("appPackage", "com.machinestalk.fmsapplication");
                desiredCapabilities.setCapability("autoGrantPermissions", true);
                desiredCapabilities.setCapability("noReset", false);
                desiredCapabilities.setCapability("automationName", "uiautomator2");
//              URL remoteUrl = new URL("http://10.0.0.247:4723/wd/hub");// appium server adress
                URL remoteUrl = new URL("http://localhost:4725/wd/hub");// appium server adres
                driver = new AndroidDriver(remoteUrl, desiredCapabilities); // create new appium session with this capabilites
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                dunit = true;
        }
    }
    public static AppiumDriver getDriver(){return driver ;}
    public static void ScrollWright(){
        int pressX = driver.manage().window().getSize().width/2;
        // 4/5 of the screen as the bottom finger-press point
        int bottomY = driver.manage().window().getSize().height * 4/5;
        // just non zero point, as it didn't scroll to zero normally
       // int topY = (int)( driver.manage().window().getSize().height /8);
        int topX = (int)( driver.manage().window().getSize().width /2);
        //scroll with TouchAction by itself
       // Scroll(pressX,bottomY,pressX,topY);
        Scroll(pressX,bottomY,topX,bottomY);
    }
    public static void Scroll(int fromX, int fromY, int toX, int toY) {
        TouchAction touchAction = new TouchAction(driver);
        //        touchAction.press(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).perform();

        new TouchAction(driver).press(PointOption.point(fromX,fromY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(329))).moveTo(PointOption.point(toX, toY)).release().perform();
    }
}
