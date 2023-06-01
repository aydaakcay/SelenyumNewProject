package Odev_Practices.day02_Mayıs30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ilkBesElemanli_Odev {

    public static void main(String[] args) throws InterruptedException {

        /*
           //-ÖDEV-
    //Amazon sayfasına gidiniz
       //iphone aratınız
    //çıkan sonuç yazısını konsola yazdırınız
    //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız


         */

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //Amazon sayfasına gidiniz
        driver.navigate().to("https://amazon.com");



        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        /*  ENTER tuşu kullanmak istemiyorsak büyüteç(ara) imlecide kullanmak icin aşag. kod yazılır

         WebElement aramakutusu = driver.findElement(By.name("field-keywords"));
        aramakutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramakutusu.submit();  // Keys.ENTER yerine kullanılır.

          */



        //çıkan sonuç yazısını konsola yazdırınız
      //  List<WebElement> cikanSonuc = driver.findElements(By.className("sg-col-inner"));
      //  WebElement sonucYazisi = cikanSonuc.get(0);
      //  System.out.println(sonucYazisi.getText());


        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız




        //-ÖDEV-
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //iphone aratınız
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());

        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = "+sonucSayisi[2]);


        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız
        for (int i = 0; i < 5 ; i++) {
            List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
            Thread.sleep(2000);
            urunler.get(i).click();
            Thread.sleep(2000);
            System.out.println((i+1)+". Urun basligi : "+driver.getTitle());
            driver.navigate().back();
            Thread.sleep(2000);
        }
        driver.close();


    }
}
