package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsHomePage {
    public CarsHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".header-signin")
    public WebElement signInLink;
}
