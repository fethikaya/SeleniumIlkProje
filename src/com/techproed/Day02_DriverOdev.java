package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    /* Driverimizi ekranı kaplaycak şekilde kullanalım.
        1 Önce google.com a gidelim.
        2- sayfının tatilini alıp yazdılam.
        3- sona youtube.com a gidelim
        4- sayfınan titele ve url'sini alalım.
        5- google gere dönelim ve sayfının url sini alalım
        6- sayfayı kapatalım.

     */


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://google.com");
        String titleGoole = driver.getTitle();
        System.out.println(titleGoole);
        driver.get("http://youtube.com");
        String titleYoutube = driver.getTitle();
        String urlYoutube = driver.getCurrentUrl();
        System.out.println(titleYoutube);
        System.out.println(urlYoutube);

        driver.navigate().back();
        String urlGoogle =  driver.getCurrentUrl();
        System.out.println(urlGoogle);

        driver.quit();


    }
}
