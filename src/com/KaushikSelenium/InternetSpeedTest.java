package com.KaushikSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeedTest {

        WebDriver driver;

        @Before
        public void setup(){
        //String driverPath = System.getProperty("user.dir")+ "/driver/chromedriver.exe";
        String driverPath =  "./driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.speedtest.net/");
        driver.manage().window().maximize();
        By login01 = By.xpath("//span[contains(text(),'Go')]");
        WebElement login = driver.findElement(login01);
        login.click();}


    @Test
        public void speedTest()  {
            try{
            Thread.sleep(40000);}
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        WebElement data1 = driver.findElement(By.xpath("//span[@class='result-data-large number result-data-value download-speed']"));
        String downloadSpeed = data1.getText();
        System.out.println("DOWNLOAD SPEED : "+ downloadSpeed + " MB/second");
        WebElement data2 = driver.findElement(By.xpath("//span[@class='result-data-large number result-data-value upload-speed']"));
        String uploadSpeed = data2.getText();
        System.out.println("UPLOAD SPEED : "+ uploadSpeed + " MB/second");

        String url = driver.getCurrentUrl();
        //System.out.println(url);
        driver.navigate().to(url);

        String input = url;     //input string
        String TestId = "";     //substring containing last 11 characters

        if (input.length() > 11)
        {
            TestId = input.substring(input.length() - 11);
        }
        else
        {
            TestId = input;
        }

        System.out.println("Result ID : "+ TestId);

        WebElement data = driver.findElement(By.xpath("//div[@title='Result ID "+TestId+"']"));
        String date = data.getText();
        System.out.println(date);}


@After
        public void teardown(){
        driver.close();
        driver.quit();}
    }





