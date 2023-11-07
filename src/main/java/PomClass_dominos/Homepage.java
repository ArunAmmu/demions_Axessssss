package PomClass_dominos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
     public By orderOnlineNow = By.xpath("//button[text()='ORDER ONLINE NOW']");
     public By searchbtn = By.xpath("//input[@placeholder='Enter your delivery address']");
     public By localityEbtn =By.xpath("//input[@placeholder='Enter Area / Locality']");
     @CacheLookup
     public By locationbtn = By.xpath("//span[text()='Locate Me']");
     @CacheLookup
     public By suggession_location = By.xpath("//li[@data-label='location_[object Object]']");

}













//    @FindBy(xpath = "//button[text()='ORDER ONLINE NOW']")
//    private WebElement orderOnlineNow;
//    @FindBy(xpath = "//input[@placeholder='Enter your delivery address']")
//    private WebElement searchbtn;
//    @FindBy(xpath = "//input[@placeholder='Enter Area / Locality']")
//    private WebElement localityEbtn;
//    @FindBy(xpath = "//span[text()='Locate Me']")
//    private  WebElement locationbtn;



//    public WebElement getOrderOnlineNow() {
//        return orderOnlineNow;
//    }
//    public WebElement getSearchbtn() {
//        return searchbtn;
//    }

//    public WebElement getLocalityEbtn() {
//        return localityEbtn;
//    }
//
//    public WebElement getLocationbtn() {
//        return locationbtn;
//    }
//
//   public Homepage(WebDriver driver1) {
//        this.driver = driver1;
//        PageFactory.initElements(driver, this);

//    }