package Odev_Practices.day02_Mayıs30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class gitup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //iphone aratınız
        WebElement aramakutusu = driver.findElement(By.name("field-keywords"));
        aramakutusu.sendKeys("iphone");
        Thread.sleep(1000);
        aramakutusu.submit();

        //çıkan sonuç yazısını konsola yazdırınız
        List<WebElement> results = driver.findElements(By.className("sg-col-inner"));
        WebElement result = results.get(0);
        System.out.println(result.getText());

        String [] sonucSayisi =  result.getText().split(" ");
        System.out.println(sonucSayisi[2]);

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız.
        //List<WebElement> products = driver.findElements(By.className("s-image"));

        for (int i = 0; i < 5 ; i++) {
            List<WebElement> urunler = driver.findElements(By.className("s-image"));
            Thread.sleep(1000);
            urunler.get(i).click();
            Thread.sleep(1000);
            System.out.println((i+1)+". Urun basligi : "+driver.getTitle());
            driver.navigate().back();
            Thread.sleep(1000);

        }
        driver.close();

    }
}