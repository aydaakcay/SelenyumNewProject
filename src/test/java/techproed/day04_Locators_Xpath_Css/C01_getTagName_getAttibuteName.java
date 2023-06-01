package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagName_getAttibuteName {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver.", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
        // 1- amazon.com'a gidip arama kutusunu locate edin
         2- arama kutusunun tagName'inin input oldugunu test edin
         3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
         4- sayfayı kapatınız
         */

        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement  aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        //  2- arama kutusunun tagName'inin input oldugunu test edin
            String actualTagname = aramaKutusu.getTagName();
            System.out.println(actualTagname);
            String expectedTagName = "input";
            if(actualTagname.equals(expectedTagName)){
                System.out.println("Test PASSED ");
            } else System.out.println("Test  FAILED");



        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin

        String actualAttributeName = aramaKutusu.getAttribute("name");
        System.out.println(actualAttributeName);
        String expectedAttributeName = "field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");




        // 4- sayfayı kapatınız
        driver.close();








    }
}
