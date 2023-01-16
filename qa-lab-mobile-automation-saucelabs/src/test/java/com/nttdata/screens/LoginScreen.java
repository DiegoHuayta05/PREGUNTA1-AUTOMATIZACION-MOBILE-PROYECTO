package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUser;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnlogin;

    public void ingresarApp(){
        getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    public void inputUser(String user){
        txtUser.sendKeys(user);
    }
    public void inputPassword(String password){
        txtPassword.sendKeys(password);
    }
    public void clickLogin(){
        btnlogin.click();
    }

}
