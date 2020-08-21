package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

       //  WebElement welcome = driver.findElement(By.tagName("h1")); tagName ile buluruz, çünkü bir tane h1 var

        WebElement welcome1 = driver.findElement(By.xpath("//h1"));
        System.out.println(welcome1.getText());


    }
}
