package techproed.day01_ilkTest_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        // getTitle() Sayfa başlıgını verir
        System.out.println("Amazon Sayfa Başlığı : " + driver.getTitle());
       //getCurrentUrl() Gidilen sayfanın Url'ini veiri
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());


        driver.get("https://techproeducation.com");
        // getTitle() Sayfa başlıgını verir
        System.out.println("Techproeducation Sayfa Başlığı :" + driver.getTitle()); //getTitle() methodu Sayfa başlığını verir
        //getCurrentUrl() Gidilen sayfanın Url'ini veiri
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());


        //getPageSource() Açılan sayfanın kaynak kodlrını verir
      //  System.out.println(driver.getPageSource()); Bilerek yoruma aldık. Her çalıstırdığımızda konsola bütün kaynak kodu vermesin


        // getWindowHandle() Gidilen sayfanın handle degerini(haskod) verir.
        // Bu handle  degerini sayfalar arası geçiş icin kullanırız
        System.out.println("Techproed Window Handle Değeri : " +driver.getWindowHandle());


    }

}
