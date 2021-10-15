package com.KaushikSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium02 {
    WebDriver driver;

    @Before
    public void setUp(){
        String driverPath = System.getProperty("user.dir")+ "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.navigate().to("http://spree.shiftedtech.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void login(){
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        login.click();
        String url = driver.getCurrentUrl();
        //System.out.println(url);
        Assert.assertEquals("http://spree.shiftedtech.com/login",url);

        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @After
    public void tearDown(){
        //driver.close();
       // driver.quit();
    }

}
