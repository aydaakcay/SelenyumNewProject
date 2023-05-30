package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findelements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidelim
        driver.get("https://amazon.com");


        // Sayfada ki linklerin sayısını ve linkleri yazdıralım
        /*
        findelement ile bir webelementte ulaşabilirken birden fazla webelement icin
        findelements() methodunu kullanırız
        Bu webelementlerin sayısına ulaşmak için yada yazısını consola yazdırabilmek için
        List<Webelement> LinklerListesi = driver.findElements(By.locator("locator degeri")) olarak kullanırız
        Oluşturmuş olduğumuz List'i loop ile konsola yazdırabiliriz
        
        
         */

        List<WebElement>  linklerlistesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerlistesi.size() = " + linklerlistesi.size());

        for(WebElement w:linklerlistesi){
            if(!w.getText().isEmpty()){  // Boş olan yerleri yazdırma dedik
                System.out.println(w.getText()); //  webelementte üzeirnde ki yazıyı almak istiyorsak getText() methodu
            }

        }

        /*

        // LAmbda ile de yazdıralım
        linklerlistesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

         */

        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());


         driver.close();




    }
}
