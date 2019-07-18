package Pages;

import cucumber.api.java.cs.A;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Hook;

import java.util.concurrent.ExecutionException;

import static com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump;

public class Map {
    private String mapTitle;
    private String button;
    private AppiumDriver driver;

    public Map() {
        this.driver = Hook.getDriver();
        this.button = "Navigate up";
        this.mapTitle = "//android.view.View[@resource-id='com.machinestalk.fmsapplication:id/view_main_toolbar']/android.widget.TextView";
   //this.mapTitle="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.TextView";
   // this.mapTitle= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.TextView";
    }


    public boolean navigateUpIsDisplayed(){
       try{
           driver.findElementByAccessibilityId(this.button).click();
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }
    public String GetText(){

        String  txt = driver.findElementByXPath(this.mapTitle).getText();
        return txt;
           /* if(driver.findElement(By.xpath(this.mapTitle)).getText().equals("Map") )
            {
               return true;
            }else{
                return false;
            }*/
    }
}
