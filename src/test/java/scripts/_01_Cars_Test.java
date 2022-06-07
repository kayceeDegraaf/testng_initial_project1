package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiters;

public class _01_Cars_Test extends Base {

    @Test(priority = 1, description = "TC:001 Validate Cars.com Sign In Page Form")
    public void validateSignInForm(){
        driver.get("https://www.cars.com/");
        carsHomePage.signInLink.click();
        Waiters.pause(3);

        //heading1
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.cars.com/signin/?redirect_path=%2F");
        Assert.assertEquals(carsSignInPage.signInPageHeading1.getText(), "Sign in");
        //heading2
        Assert.assertEquals(carsSignInPage.signInPageHeading2.getText(), "New to Cars.com? Sign up. Are you a dealer?");
        //email validation
        Assert.assertEquals(carsSignInPage.emailLabel.getText(), "Email");
        Assert.assertTrue(carsSignInPage.emailInputBox.isEnabled());
        //password validation
        Assert.assertEquals(carsSignInPage.passwordLabel.getText(),"Password");
        Assert.assertTrue(carsSignInPage.passwordInputBox.isEnabled());
        //password characters validation
        Assert.assertEquals(carsSignInPage.passwordWarningMinCharacters.getText(), "Minimum of eight characters");
        //forgot password
        Assert.assertTrue(carsSignInPage.forgotPassword.isDisplayed());
        //privacy
        Assert.assertEquals(carsSignInPage.privacyStatement.getText(), "By signing in to your profile, you agree to our  Privacy Statement  and  Terms of Service.");
        //sign in
        Assert.assertEquals(carsSignInPage.signInButton.getText(), "Sign in");
        Assert.assertTrue(carsSignInPage.signInButton.isDisplayed() && carsSignInPage.signInButton.isEnabled());
    }

    @Test(priority = 2, description = "TC:002 Validate Cars.com Sign In Page Social Media Section")
    public void validateSocialMediaSection(){
        driver.get("https://www.cars.com/");
        carsHomePage.signInLink.click();
        //Social header
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.cars.com/signin/?redirect_path=%2F");
        Assert.assertEquals(carsSignInPage.connectSocial.getText(), "Connect with social");
        //Facebook
        Assert.assertEquals(carsSignInPage.signInFacebook.getText(), "Sign in with Facebook");
        Assert.assertTrue(carsSignInPage.signInFacebook.isDisplayed() && carsSignInPage.signInFacebook.isEnabled());
        //Google
        Assert.assertEquals(carsSignInPage.signInGoogle.getText(), "Sign in with Google");
        Assert.assertTrue(carsSignInPage.signInGoogle.isDisplayed() && carsSignInPage.signInGoogle.isEnabled());
        //Apple ID
        Assert.assertEquals(carsSignInPage.signInApple.getText(), "Sign in with Apple");
        Assert.assertTrue(carsSignInPage.signInApple.isDisplayed() && carsSignInPage.signInApple.isEnabled());
    }

    @Test(priority = 3, description = "TC:003 Validate User Cannot Sign In to Cars.com With Invalid Credentials")
    public void validateInvalidCredentials(){
        driver.get("https://www.cars.com/");
        //sign in
        carsHomePage.signInLink.click();
        //email input
        carsSignInPage.emailInputBox.sendKeys("johndoe@gmail.com");
        //password input
        carsSignInPage.passwordInputBox.sendKeys("abcd1234");
        //sign in
        carsSignInPage.signInButton.click();
        //validate unable to sign in
        Assert.assertEquals(carsSignInPage.wrongEmailMessageHeader.getText(), "We were unable to sign you in.");
        //validate wrong email and password
        Assert.assertEquals(carsSignInPage.wrongEmailMessageBody.getText(), "Your email or password was not recognized. Try again soon.");

    }
}









