package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.get("http://sopger.net");

        String sayfaTitle = driver.getTitle();   // Sayfanın balığı title
        String sayfaUrl = driver.getCurrentUrl();  // Url adresi

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

        driver.quit();


    }
}
