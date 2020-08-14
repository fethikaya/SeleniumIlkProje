package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_ifElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String sayfaBaslik = driver.getCurrentUrl(); // Car içeriyor mu? içermiyor mu?

        if(sayfaBaslik.contains("Car")){  // contains methodu bir kelimenin yazı içinde geçip geçmediğni kontrol eder...
            System.out.println("Car kelimesi geçiyor.");
        }else{
            System.out.println("Car kelimesi geçmiyor.");
        }

        driver.quit();
    }
}
