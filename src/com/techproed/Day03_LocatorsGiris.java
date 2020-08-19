package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        // Sayfa açıldıktan sonra 3 saniye bekle

        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // İlk web elementimizi bullalım

        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();

        // WebElementimizi buluh ve tıkladık.

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        // Email adresini girdi...

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!"); // Şifre girdik

        // Sonra sign in butunona tıklıyoruz. Sing in ID yok, bu yüzden name alırız.
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik = driver.getTitle();

        if (baslik.equals("Address Book")){
            System.out.println("Griş Başarılı");
        }else{
            System.out.println("Giriş Başarısız");
        }

    }


}
