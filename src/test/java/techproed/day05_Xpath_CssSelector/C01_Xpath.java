package techproed.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

                // arama kutusuna "city bike"  yazıp aratın
        /*
        --ARAMA KUTUSU HTML KODLARI--
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
        tabindex="0" aria-label="Search Amazon" spellcheck="false">
        driver.findElement(By.id("twotabsearchtextbox"));
         */
        // WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        //WebElement aramaKutusu = driver.findElement(By.xpath("//*[@name='field-keywords']"));
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@type='text']"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);



        // Hybrid Bikes bölümüne tıklayın
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click(); //--> //*[.='Hybrid Bikes']


        // sonuc sayısını yazdırın
        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@class ='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi :" +sonucSayisi[0]);


        // ilk ürününe tıklayın
        //  driver.findElement(By.xpath("(//h2)[1]")).click();  Bu şekilde daha kısa olur. Hoca yazdı
        WebElement ilkUrun = driver.findElement(By.xpath("//*[@class ='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
        ilkUrun.click();
        Thread.sleep(1000);


        // Sayfayı kapatınız
        //driver.close();

    }
}