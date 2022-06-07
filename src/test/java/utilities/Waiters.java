package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {

    public static void pause(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element, int seconds){
        new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilTitleIs(WebDriver driver,int seconds, String title){
        new WebDriverWait(driver, seconds).until(ExpectedConditions.titleIs(title));
    }

    public static void waitUntilTextToBePresentInElement(WebDriver driver, int seconds, WebElement element, String text){
        new WebDriverWait(driver, seconds).until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
