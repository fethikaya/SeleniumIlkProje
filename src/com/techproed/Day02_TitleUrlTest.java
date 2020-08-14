package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    /*
        1- Youtube.com a gidelim
        2- title video içeriyor mu?
        3- drivere kapatalım
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String title = driver.getTitle();

        if(title.contains("Video")){
            System.out.println("Var :" + title);
        }else{
            System.out.println("Yok :" + title);

        }

        driver.quit();
    }
}
