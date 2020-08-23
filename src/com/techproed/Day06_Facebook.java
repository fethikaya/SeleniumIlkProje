package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Fethi/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        // Email kutusun techproed@gmail.com
        //

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@ name ='pass']"));
        sifre.sendKeys("Test1234");

        WebElement logIn = driver.findElement(By.cssSelector("#u_0_d"));
        logIn.click();

        // https://www.facebook.com/login/ eğer hala buradaysak demekki giriş yapamamışız

          //   Bu komut çok önemli 3 saniye bekle

            Thread.sleep(3000);


        String url = driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");
        }else{
            System.out.println("Giriş Başarılı !");
        }

        Thread.sleep(5000);

    driver.quit();

    }
}
