package Odev_Practices.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarTesti {

    public static void main(String[] args) throws InterruptedException {


        /*
        Yeni bir class olusturun (TekrarTesti)
    Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
    Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    Youtube sayfasina geri donun
    Sayfayi yenileyin
    Amazon sayfasina donun
    Sayfayi tamsayfa yapin
    Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
    Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    URL'yi yazdırın
    Sayfayi kapatin


         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Web elementlerinin yüklenmesi için
                                                                            // max. bekleme süresi


        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        if(driver.getTitle().contains("youtube")) {
            System.out.println("verify"); // verify = dogrula
        } else System.out.println("Actual Title : " +driver.getTitle());


        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("youtube")) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED Actual Title : " +driver.getCurrentUrl());
        Thread.sleep(3000);


        //  Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);


        //Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);

        // Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        if(driver.getTitle().contains("Amazon")) {
            System.out.println("verify"); // verify = dogrula
        } else System.out.println("Actual Title : " +driver.getTitle());


        // Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        if(driver.getCurrentUrl().contains("https://www.amazon.com/")) {
            System.out.println("verify"); // verify = dogrula
        } else System.out.println("Actual Title : " +driver.getCurrentUrl());


        // Sayfayi kapatin
        driver.close();








    }


}
