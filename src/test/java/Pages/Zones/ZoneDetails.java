package Pages.Zones;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utility.Hook;

import java.util.List;

public class ZoneDetails {
    private String navigationButton ;
    private String zoneTitle ;
    private String listAssets ;
    private String selectedZone ;


    // selector driver
    private AppiumDriver driver;

    public ZoneDetails(){
        this.driver= Hook.getDriver();
        this.zoneTitle="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.View/android.widget.TextView";
        this.navigationButton = "Navigate up";
        this.listAssets="com.machinestalk.fmsapplication:id/action_show_assets";
        this.selectedZone="//android.view.View[@content-desc=\"Google Map\"]/android.view.View[42]";
    }

    public String getzoneviewName() {
            return driver.findElement(By.xpath(this.zoneTitle)).getText();
    }
    public void clickOnNavigationButton(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(this.navigationButton);
        el1.click();
    }
    public  void ButtonAssetsMap(){
        MobileElement el1 = (MobileElement) driver.findElementById(this.listAssets);
        el1.click();
        System.out.println("sellected button");
    }
    public  void verifyListAsetsAfterGetIt()
    {

       // List<MobileElement> listAsets = driver.findElementsById(this.listAssets);

       /* MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[42]");
        el2.click();*/
        /*if (listAsets.get(42).getText()){
            return true;
        }*/
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[42]");
        el2.click();

       // return true;
    }



}
