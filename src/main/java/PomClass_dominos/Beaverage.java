package PomClass_dominos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beaverage {
public  By beverage = By.xpath("//span[text()='BEVERAGES']");
public  By pepsiadd = By.xpath("//span[.='Pepsi 475ml']//following::button[1]");
public By pepsiincrease = By.xpath("(//span[.='Pepsi 475ml']//following::div[@data-label='increase'])[1]");
public By pepsiDecrease = By.xpath("//span[.='Pepsi 475ml']//following::div[@data-label='decrease'][4]");
public By marghertaDecrease = By.xpath("(//span[text()='Margherita']/following::div[@data-label='decrease'])[1]");
public  By checkOut = By.xpath("//button[@data-label='miniCartCheckout']");
public By subtotal = By.xpath("(//span[@class='rupee'])[4]");
public By taxtotal = By.xpath("(//span[@class='rupee'])[5]");
    public By grandtotal  = By.xpath("(//span[@class='rupee'])[6]");



}










//    @FindBy(xpath = "//span[text()='BEVERAGES']")
//    private WebElement beverage;
//    @FindBy(xpath = "//span[.='Pepsi 475ml']//following::button[1]")
//    private WebElement pepsiadd;
//    @FindBy(xpath = "//span[.='Pepsi 475ml']//following::div[@data-label='increase'][4]")
//    private WebElement pepsiincrease;
//    @FindBy(xpath = "//span[.='Pepsi 475ml']//following::div[@data-label='decrease'][4]")
//    private WebElement pepsiDecrease;
//    @FindBy(xpath = "(//span[text()='Margherita']/following::div[@data-label='decrease'])[6]")
//    private WebElement marghertaDecrease;
//    @FindBy(xpath = "//button[@data-label='miniCartCheckout']")
//    private WebElement checkOut;




//    public WebElement getCheckOut() {
//        return checkOut;
//    }
//
//    public WebElement getBeverage() {
//        return beverage;
//    }
//
//    public WebElement getPepsiadd() {
//        return pepsiadd;
//    }
//
//    public WebElement getPepsiincrease() {
//        return pepsiincrease;
//        }
//    public WebElement getPepsiDecrease() {
//        return pepsiDecrease;
//    }
//
//    public WebElement getMarghertaDecrease() {
//        return marghertaDecrease;
//    }
//    public Beaverage (WebDriver driver4) {
//this.driver=driver4;
//        PageFactory.initElements(driver , this);
//
//    }
//    public By pizza1 = By.xpath("(//span[@class='rupee'])[1]");
//     public By pizza2 = By.xpath("(//span[@class='rupee'])[2]");
//     public By pepsi1 = By.xpath("(//span[@class='rupee'])[3]");