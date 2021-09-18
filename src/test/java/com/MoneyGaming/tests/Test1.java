package com.MoneyGaming.tests;

import com.MoneyGaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod

    public void setUP(){

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    }


    @Test

    public void test1(){

    }

    @AfterMethod

    public void tearDown(){

    }
}
