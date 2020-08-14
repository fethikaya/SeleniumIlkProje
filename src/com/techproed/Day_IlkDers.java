package com.techproed;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_IlkDers {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

       webDriver.get("https://www.google.com");   // Sayfaya git

        //webDriver.close();  // Çalıştğın sayfayı kapat
        //webDriver.quit();  // Tüm sayfaları kapat











    }
}
