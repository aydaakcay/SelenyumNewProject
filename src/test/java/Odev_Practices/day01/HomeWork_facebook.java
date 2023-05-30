package Odev_Practices.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork_facebook {


    public static void main(String[] args) throws InterruptedException {

        /*

    Yeni bir class olusturalim (Homework)
    ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
    yazdirin.
    https://www.walmart.com/ sayfasina gidin.
    Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    Tekrar “facebook” sayfasina donun
    Sayfayi yenileyin
    Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Web elementlerinin yüklenmesi için
                                                                            // max. bekleme süresi

        // Yeni bir class olusturalim (Homework)
        //    ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        if(driver.getTitle().contains("facebook")) {
            System.out.println("verify"); // verify = dogrula
        } else System.out.println("Actual Title : " +driver.getTitle());


        // Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //    yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("facebook")) {
            System.out.println("Test PASSED");
        }else System.out.println("Actual Title : " +driver.getCurrentUrl());
        Thread.sleep(3000);

        //  https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");


        // Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if(driver.getTitle().contains("Walmart.com")) {
            System.out.println("verify"); // verify = dogrula
        }else System.out.println("Actual Title : " +driver.getTitle());


        //  Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();


        //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();


        //9.Browser’i kapatin
        driver.close();




        }

        }














