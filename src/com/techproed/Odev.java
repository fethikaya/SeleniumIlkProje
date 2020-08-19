package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://sopger.net");
        driver.manage().window().maximize();
        String baslikSopger = driver.getTitle();
        String urlSopger = driver.getCurrentUrl();
        System.out.println(baslikSopger);
        System.out.println(urlSopger);

        driver.navigate().to("http://google.com");
       String baslikGoogle = driver.getTitle();
        if (baslikGoogle == "Google") {
            System.out.println("Zaten yazılmış");
        }else{
            System.out.println(baslikGoogle);
        }
         String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);

        driver.navigate().refresh();
        driver.navigate().back();
        driver.close();



/*

        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        String baslik = driver.getTitle();
        System.out.println(baslik);

        if (baslik != "facebook") {
            System.out.println(baslik);
        } else {
            System.out.println("Yazilmis");
        }


        String url = driver.getCurrentUrl();
        System.out.println(url);

        if (url.contains("facebook")) {
            System.out.println("Zaten var");
        } else {
            System.out.println(url);
        }

        driver.navigate().to("http://walmart.com");
        String baslikWalmart = driver.getTitle();
        if (baslikWalmart.contains("walmart")) {
            System.out.println("Zaten yazilmis");
        } else {
            System.out.println(baslikWalmart);
        }

        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();

*/

    }
}
