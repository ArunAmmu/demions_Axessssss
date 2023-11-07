package BaseClass_dominos;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Dominos_base {

    public static WebDriver driver;

    public static void url(WebDriver driver, String ur) {
        driver.get(ur);
    }

    public static void max(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void implicityWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void javaScriptClick(WebDriver driver, WebElement ref) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", ref);
    }
    public static void screenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot tk = (TakesScreenshot) driver;
        File source = tk.getScreenshotAs(OutputType.FILE);
        File destin = new File("C:\\Users\\91984\\IdeaProjects\\demions_Axess\\ScreenShot" + fileName + ".png");
        FileUtils.copyFile(source, destin);
    }





}






















//public static void btClick (WebElement ref){
//    ref.click();
//}
//public static void sendkey (WebElement sent, String ref){
//   sent.sendKeys(ref);
//}