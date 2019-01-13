package com.pragra.wordpressautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(css = "form>div>button")
    WebElement continueButton;

    public GetStartedPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public GetStartedPage inputEmail(String email){
        this.email.sendKeys(email);
        return this;

    }
    public GetStartedPage inputUserName(String username){
        this.username.sendKeys(username);
        return this;
    }
    public GetStartedPage inputPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public CreateNewSitePage clickOnContinue(){
        this.continueButton.click();
        return new CreateNewSitePage(driver);
    }



}
