package com.pragra.wordpressautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageNavigation {

    WebDriver driver;
    @FindBy(css = "li> a > svg")
    WebElement wordPressDotComLink;
    @FindBy(css=" nav > ul > li:nth-child(2) > button")
    WebElement productsLink;
    @FindBy(css = "div.x-dropdown > div:nth-child(4) > ul > li:nth-child(1)> a")
    WebElement blogsLink;
    @FindBy(css = "nav>ul:nth-child(3)>li:nth-child(2)>a")
    WebElement getStartedLink;

    public MainPageNavigation(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public GetStartedPage clickOnGetStartedLink(){
        this.getStartedLink.click();
        return new GetStartedPage(driver);



    }
}
