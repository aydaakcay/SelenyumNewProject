package techproed.day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_MAnageMethods_ImplicityWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");  // Önemli
        WebDriver driver = new ChromeDriver();  // Önemli
        driver.manage().window().maximize();  // Önemli
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Önemli

        /*
           implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri görünür olana kadar(sayfada oluşana kadar)
         maximum 20 saniye bekler. Eğer webelementler 2 saniyede oluşursa 2 saniye bekler ve alt satıra geçer. Fakat
         belirttiğimiz max. süre boyunca internetten yada sayfadan kaynaklı olarak webelementler oluşmazsa testtimiz
         fail verir.
           Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */

        // techproed sayfasına gidelim
            String amazonUrl = "https://amazon.com";
            String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);


        // amazona gidelim
        driver.get(amazonUrl);

        // techpro sayfasına geri dönelim
        driver.navigate().back();

        // sayfa başlığının techpro içerdiğini test edelim
        String actualTitle = driver.getTitle();  // Başlıktan getir
        String arananKelime = "techpro";
        if(actualTitle.contains((arananKelime))) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED-->" + actualTitle);


        // tekrar amazon sayfasına gidelim
        driver.navigate().forward();

        // sayfa başlığının amazon içerdiğini test edelim
        if(driver.getTitle().contains("Amazon")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


    // SAyfayı KApatınız
        driver.close();


    }

    }



