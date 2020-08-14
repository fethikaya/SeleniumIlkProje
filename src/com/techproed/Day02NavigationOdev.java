package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02NavigationOdev {

    public static void main(String[] args) {

        // 1- ilk önce google.com a gidiniz
        // 2 adım. youtube.com a gidiniz
        //3 adım. google.com coma bacak methodu ile geri dönünüz
        //4 youtube.coma forward methodu ile gidiniz
        // 5 youtube.com yenileyiniz
        // 6 adım driveri kapatın


        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://gogle.com");
        driver.get("http://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();


    }
}
