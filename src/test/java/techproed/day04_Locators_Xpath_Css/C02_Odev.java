package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Odev {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Techproeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
       // WebElement reklamPenceresi = driver.findElement(By.xpath("//*[@class ='eicon-close']"));
      //  reklamPenceresi.click();
        Thread.sleep(1000);


        //Arama bölümünde qa aratalım
         driver.findElement(By.id("elementor-search-form-9f26725")).sendKeys("qa", Keys.ENTER);

         // WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='elementor-search-form-9f2672']"));
        // aramaKutusu.sendKeys("qa",Keys.ENTER);
        Thread.sleep(1000);




        //Sayfa başlığının qa içerdiğini doğrulayalım
        String actualTitle = driver.getTitle();
        String expectedTitle =("qa");
        if(actualTitle.contains(expectedTitle)){ // içeriyorsa
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement CarrerOpportun = driver.findElement(By.xpath("(//*[@class ='elementor-post__title'])[1]"));
        boolean gorunurMu = CarrerOpportun.isDisplayed();
        System.out.println(gorunurMu);
        boolean erisilebilirMi = CarrerOpportun.isEnabled();
        System.out.println(erisilebilirMi);


        //Carrer Opportunities In QA linkine tıklayalım
        CarrerOpportun.click();


        //Başlığın Opportunities içerdiğini test edelim
        String baslik = driver.getTitle();
        System.out.println(baslik);

        if(driver.getTitle().contains("Opportunities")) {
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");


        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        driver.navigate().back();

        String Url = driver.getCurrentUrl(); // Sayfanın Url adresi alındı ve "Url" ' ye atandı
        String dogrulaUrl = "https://techproeducation.com/";
        if(Url.equals(dogrulaUrl)){
            System.out.println("Test PASSED");
        } else System.out.println("Test FAILED");



        //Sayfayı Kapatınız
        driver.close();




    }
}
