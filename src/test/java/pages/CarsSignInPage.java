package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsSignInPage {
    public CarsSignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id ='ae-main-content']/section/header/h1")
    public WebElement signInPageHeader1;

    @FindBy(xpath = "//*[@id ='ae-main-content']/section/div/div/div/p")
    public WebElement signInPageHeader2;

    @FindBy(className = "sds-label")
    public WebElement emailLabel;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(xpath = "//*[@class ='sds-field'][2]/div[1]/label")
    public WebElement passwordLabel;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//*[@class ='sds-helper-text']")
    public WebElement passwordWarning;

    @FindBy(xpath = "//*[@class ='password-help']/p[2]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[@class ='sds-disclaimer ']")
    public WebElement privacyStatement;

    @FindBy(xpath = "//*[@class = 'sds-button']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@class = 'column-2 sidebar-social-login']/h3")
    public WebElement connectSocial;

    @FindBy(xpath = "//*[@class = 'column-2 sidebar-social-login']/ul/li[1]")
    public WebElement signInFacebook;

    @FindBy(xpath = "//*[@class = 'column-2 sidebar-social-login']/ul/li[2]")
    public WebElement signInGoogle;

    @FindBy(xpath = "//*[@class = 'column-2 sidebar-social-login']/ul/li[3]")
    public WebElement signInApple;

    @FindBy(xpath = "//*[@class = 'sds-notification__content']/div")
    public WebElement unrecognizedEmailTitle;

    @FindBy(xpath = "//*[@class = 'sds-notification__content']/p")
    public WebElement unrecognizedEmailDescription;

}
