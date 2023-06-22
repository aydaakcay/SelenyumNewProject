package techproed.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Odev {

    public static void main(String[] args) {


        /*
        ÖDEV3
         // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
         // Add Element butonuna 100 defa basınız
         // 100 defa basıldığını test ediniz
         // 90 defa delete butonuna basınız
         // 90 defa basıldığını doğrulayınız
         // Sayfayı kapatınız
         */

        /**
         * ÖDEV
         * // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
         * // Add Element butonuna 100 defa basınız
         * // 100 defa basıldığını test ediniz
         * // 90 defa delete butonuna basınız
         * // 90 defa basıldığını doğrulayınız
         * // Sayfayı kapatınız
         */



            System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
            for (int i = 0; i < 100; i++) {
                WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
                addButton.click();
            }

        // 100 defa basıldığını test ediniz
            int addedElementsCount = driver.findElements(By.xpath("//button[contains(text(), 'Delete')]")).size();
            if (addedElementsCount == 100) {
                System.out.println("Add Element butonuna 100 defa basıldı.");
            } else {
                System.out.println("Add Element butonuna 100 defa basılmadi.");
            }

        // 90 defa delete butonuna basınız
            for (int i = 0; i < 90 ; i++) {
                WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
                deleteButton.click();
            }

        // 90 defa basıldığını doğrulayınız
            int deletedElementsCount = driver.findElements(By.xpath("//button[contains(text(), 'Delete')]")).size();
            if (deletedElementsCount == 10) {
                System.out.println("Delete butonuna 90 defa basildi.");
            } else {
                System.out.println("Delete butonuna 90 defa basilmadi.");
            }

            driver.close();






        /*
        ÖDEV
        2- https://www.amazon.com/ adresine gidin  3- Browseri tam sayfa yapin
        - Sayfayi “refresh” yapin
        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        Gift Cards sekmesine basin
        Birthday butonuna basin
        Best Seller bolumunden ilk urunu tiklayin
         9- Gift card details’den 25 $’i secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin

         */



        //https://id.heroku.com/login sayfasina gidin
        //Bir mail adersi giriniz
        //Bir password giriniz
        //Login butonuna tiklayiniz
        //"There was a problem with your login." texti gorunur ise
        //"kayit yapilamadi" yazdiriniz
        //eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        //sayfayı kapatiniz
        //****


/*
        for (int i = 0; i < 100; i++) {

            WebElement addButonu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
            addButonu.click();

 */

        }

    }
