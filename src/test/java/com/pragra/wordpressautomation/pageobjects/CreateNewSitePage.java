package com.pragra.wordpressautomation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewSitePage {
    WebDriver driver;




    public CreateNewSitePage(WebDriver driver){
    this.driver= driver;
        PageFactory.initElements(driver, this);

    }


}
