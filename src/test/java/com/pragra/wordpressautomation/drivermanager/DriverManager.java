package com.pragra.wordpressautomation.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private String browserType="chrome";
    private static WebDriver driver;

    private DriverManager(){
    if (browserType.equals("chrome")){
        System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    }

    public static WebDriver getInstance(){
        if (driver==null){
            new DriverManager();
        }
        return driver;
    }
}
