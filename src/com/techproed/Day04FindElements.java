package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //  Tüm a tagnameye saihp tüm WebElementlerini bulalım.

       List<WebElement> listem = driver.findElements(By.tagName("a"));

       for (WebElement w : listem){
           System.out.println(w.getText());
       }

    }
}
