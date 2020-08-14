package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize(); // Ekranı kaplar

        webDriver.get("http://google.com");
        webDriver.navigate().to("http://amazon.com"); // get ile aynı görevi yapar

        // navigate ().back () komutu bir önceki sayfaya geri dönmeye yarıyor. <-
          webDriver.navigate().back();

          // navigate ().forward (); sayfayı geri gider.
          webDriver.navigate().forward(); // İleriki sayfaya gider. Daha önce geri aldığınız sayfaya tekrar ileri gidir. ->

        // webDriver.navigate().refresh(); methodu sayfayı çalıştırmaya yarıyor
        webDriver.navigate().refresh();












    }
}
