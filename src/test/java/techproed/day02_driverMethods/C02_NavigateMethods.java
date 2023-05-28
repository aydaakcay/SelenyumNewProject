package techproed.day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Thecproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantıkta çalışır
        Thread.sleep(3000); // JAva kodlarını bekletmek için Thread.sleep  kullanılır

        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon Sayfa başlığı : "+driver.getTitle());
        Thread.sleep(3000);

        //Tecproeducation sayfasıa geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa başlığını yazdıralım
        System.out.println("Techproeducation Sayfa Başlığı : "+driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasıan tekrar gidip URL'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon Sayfası Url'i :" +driver.getCurrentUrl());
        Thread.sleep(3000);

        // Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);


        // sayfayı kapatalım
        driver.close();

    }

 }




