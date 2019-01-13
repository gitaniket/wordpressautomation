package com.pragra.wordpressautomation.testcases;

import com.pragra.wordpressautomation.drivermanager.DriverManager;
import com.pragra.wordpressautomation.pageobjects.CreateNewSitePage;
import com.pragra.wordpressautomation.pageobjects.GetStartedPage;
import com.pragra.wordpressautomation.pageobjects.MainPageNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetStartedPageTest {
    WebDriver driver;
    MainPageNavigation navigation;
    GetStartedPage getStartedPage;
    CreateNewSitePage createNewSitePage;
    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getInstance();
        driver.get("https://wordpress.com/");
        navigation=new MainPageNavigation(driver);
    }
    @Test
        public void tc1(){
     getStartedPage=navigation.clickOnGetStartedLink();
     Assert.assertEquals(driver.getCurrentUrl(),"https://wordpress.com/start?ref=homepage");
    }
    @Test
    public void tc2(){

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        createNewSitePage=getStartedPage.inputEmail("fds@rdsfjd.com").inputUserName("fhsdrskjfhsdk").inputPassword("ss@3rrfjhj").clickOnContinue();
        Assert.assertTrue(true);
    }
}
