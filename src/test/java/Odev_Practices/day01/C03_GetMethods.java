package Odev_Practices.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_GetMethods {

    /*
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
    */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // Önemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Önem


        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa Başlığı : " + driver.getTitle());

        //Sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedUrl =  "Amazon";
        if(actualTitle.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        }else System.out.println(" Test FAILDE");

        // Sayfa adresini yazdıralım
        System.out.println("Amazon actual Url " + driver.getCurrentUrl()); // actual(gerçek) URL


       // Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


       // Sayfa handle degerini yazdirin
        System.out.println("Amazon window handle değeri :" +driver.getWindowHandle()); // Amazon window handle değeri :38342D72D1271790B493EB1BD13F6A6E
                                                                                        // Her seferinde farklı çıkıyor

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
         String actualHtmlCode = driver.getPageSource();
         String expectedHtmlCode = "GateWay";
         if(actualHtmlCode.contains(expectedHtmlCode)) {
             System.out.println("Test PASSED");
         }else System.out.println("Test FAILED");

        //Sayfayı kapatalım

        driver.close(); // Browser'ı kapatır
        // driver.quit(); -->  Birden fazla browser varsa hepsini kapatır.


         }

    }


