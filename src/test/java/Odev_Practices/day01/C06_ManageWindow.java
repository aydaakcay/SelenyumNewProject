package Odev_Practices.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ManageWindow {

    public static void main(String[] args) throws InterruptedException {

     /*
     1.Yeni bir Class olusturalim.C06_ManageWindow
    2.Amazon soyfasina gidelim. https://www.amazon.com/
    3.Sayfanin konumunu ve boyutlarini yazdirin
    4.Sayfayi simge durumuna getirin
    5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
    6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
    7.Sayfayi fullscreen yapin
    8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
    9.Sayfayi kapatin

      */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");  // Önemli
        WebDriver driver = new ChromeDriver();  // Önemli


        // Web elementlerinin yüklenmesi için  max. bekleme süresi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Önem


        //.Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        // Browser'in konumunu ve boyutunu  yazdıralım
        System.out.println("Sayfanın konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu : " +driver.manage().window().getSize());

        //  4.Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanın konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu : " +driver.manage().window().getSize());

        // Sayfayı full Screen yapalım
        driver.manage().window().fullscreen();

       // 8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanın konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu : " +driver.manage().window().getSize());


        // 9.Sayfayi kapatin
        driver.close();



    }
}
