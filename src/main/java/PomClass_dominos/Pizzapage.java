package PomClass_dominos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizzapage {

    public By vegPizzas = By.xpath("//span[text()='VEG PIZZA']");
    public By allowbtn = By.xpath("//button[.='Allow']");
    public By margherita = By.xpath("//span[text()='Margherita']/following::button[1]");
    public  By add = By.xpath("//span[text()='ADD']");
    public By margheritaIncrease = By.xpath("//span[text()='Margherita']/following::div[@data-label='increase'][3]");
    public  By peppyPaneer = By.xpath("//span[text()='Peppy Paneer']/following::button[1]");
    public  By peppypaneerIncrease = By.xpath("//span[text()='Peppy Paneer']/following::div[@data-label='increase'][3]");


}


























//    @FindBy(xpath = "//span[text()='VEG PIZZA']")
//    private WebElement vegPizzas;
//    @FindBy(xpath = "//button[.='Allow']")
//    private WebElement allowbtn;
//    @FindBy(xpath = "//span[text()='Margherita']/following::button[1]")
//    private WebElement margherita;
//    "//span[text()='VEG PIZZA']//following::div[@data-label='Margherita']//span[.='ADD TO CART'][1]"
//    @FindBy(xpath = "//span[text()='ADD']")
//    private WebElement add;
//    @FindBy(xpath = "//span[text()='Margherita']/following::div[@data-label='increase'][3]")
//    private WebElement margheritaIncrease;

//    @FindBy(xpath = "//span[text()='Peppy Paneer']/following::div[@data-label='increase'][3]")
//    private WebElement peppypaneerIncrease;







//    public WebElement getPeppyPaneer() {
//        return peppyPaneer;
//    }
//
//    public WebElement getPeppypaneerIncrease() {
//        return peppypaneerIncrease;
//    }
//
//    public WebElement getAdd() {
//        return add;
//    }
//
////    public WebElement getVegPizzas() {
////        return vegPizzas;
////    }
//
////    public WebElement getAllowbtn() {
////        return allowbtn;
////    }
//
//    public WebElement getMargherita() {
//        return margherita;
//    }
//    public WebElement getMargheritaIncrease() {
//        return margheritaIncrease;
//    }
