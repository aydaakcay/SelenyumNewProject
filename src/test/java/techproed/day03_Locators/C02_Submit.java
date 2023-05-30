package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");


        //Arama kutusunu locate edip iphone aratalım
        WebElement aramakutusu = driver.findElement(By.name("field-keywords"));
        aramakutusu.sendKeys("iphone");
        Thread.sleep(3000);
        aramakutusu.submit();  // Keys.ENTER yerine kullanılır.





        //Sayfayı kapatalım
        driver.close();
    }
}
