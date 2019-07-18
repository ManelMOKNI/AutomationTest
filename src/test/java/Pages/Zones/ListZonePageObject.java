package Pages.Zones;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import utility.Hook;

import java.util.List;

public class ListZonePageObject {
    private String buttonNavigationUp ;
    private String zoneTitle ;
    private String viewName;
    private String listZone;
    private String listdepartement;
    private String detailsButton;
    private String searchButton;
    private String searchTexeField;
    // selector driver
    private AppiumDriver driver;

    public ListZonePageObject(){
        this.driver= Hook.getDriver();
            this.buttonNavigationUp="Navigate up";
            this.viewName ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.TextView";
            //this.zoneTitle = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView\n";
            this.listZone = "com.machinestalk.fmsapplication:id/view_geofence_item_name_text_view";
            this.listdepartement = "com.machinestalk.fmsapplication:id/view_geofence_item_department_name_text_view";
            this.detailsButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView";
            this.searchButton = "Search";
            this.searchTexeField="com.machinestalk.fmsapplication:id/search_src_text";
    }


    public void clickOnNavigationButton(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId(this.buttonNavigationUp);
        el1.click();
    }
    public String getViewName() {

            return driver.findElement(By.xpath(this.viewName)).getText();
    }
    public String getSearchTexeField() {

            return driver.findElement(By.id(this.searchTexeField)).getText();
    }
    public  boolean verifyListAfterGetIt()
    {
        List<MobileElement> listZone = driver.findElementsById(this.listZone);
        List<MobileElement> listDepartement = driver.findElementsById(this.listdepartement);
        if (listZone.get(4).getText().equals("Al Warood") &(listDepartement.get(4).getText().equals("Riyadh"))){
        return true;
        }
       // System.out.println("Le zone name "+listZone.get(4).getText().equals("Al Warood"));
        return false;
    }
    public  void buttonzoneDetails()
    {
        MobileElement el2 = (MobileElement) driver.findElementByXPath(this.detailsButton);
        el2.click();
    }
    public  void buttonzoneSearch()
    {
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId(this.searchButton);
        el2.click();
    }
    public  void searchVerif()
    {
        MobileElement el2 = (MobileElement) driver.findElementById("com.machinestalk.fmsapplication:id/search_src_text");
        el2.sendKeys("Mun");
       System.out.println("Search name verif"+ driver.findElement(By.id("com.machinestalk.fmsapplication:id/view_geofence_item_name_text_view")).getText());
    }
    public  void searchVerifVide()
    {
        MobileElement el2 = (MobileElement) driver.findElementById("com.machinestalk.fmsapplication:id/search_src_text");
        el2.sendKeys("aa");
        System.out.println("Search name verif vide "+ driver.findElement(By.id("com.machinestalk.fmsapplication:id/view_geofence_item_name_text_view")).getText());
        System.out.println("NAME ZONE DOES NOT EXSIT ");
    }
    public void setZoneSearch(String txt){
        driver.findElement(By.id(this.searchTexeField)).clear();
        driver.findElement(By.id(this.searchTexeField)).sendKeys(txt);

        // driver.navigate().back();
    }
    public String getZonsSearchInput(){
        return driver.findElement(By.id(this.searchTexeField)).getText();
    }

    public  void closeSearch()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Clear query");
        el1.click();
    }
    public  void return_to_assets_view_after_search()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Collapse");
        el1.click();
    }

    public String getSearchFieldInput(){
        return driver.findElement(By.id(this.searchTexeField)).getText();
    }
    public String getAlertTxt() {

        //System.out.println(driver.findElementById("android:id/message").getText());
        WebElement toastView = driver.findElement(By.xpath("//android.widget.Toast[1]"));
        String text = toastView.getAttribute("name");
        return text ;

    }
public void returnSerch() {

    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Collapse");
    el1.click();
    }


}
