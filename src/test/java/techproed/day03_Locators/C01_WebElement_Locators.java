package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElement_Locators {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver.","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");


        //Arama kutusunu locate edelim
        //Arama kutusuna iphone yazdıralım ve aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

        /*
        Bir webelementin locate'ini birden fazla kullanacaksanız
        bir web element'te değişken olarak atayabilirsiniz.
        Webelement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        şeklinde kullanabiliriz.
        1 - Locate işlemi bittikten sonra eğer webelementte bir metin göndereceksek
        sendKeys() methodu kullanabiliriz.
        2 - webelementte tıklayacaksak click() methodu kullanırız
        3 - webelementte üzeirnde ki yazıyı almak istiyorsak getText() methodu kullanırız
        4 - sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
         */



        //Sayfayı kapatalım
        driver.close();




    }
}
