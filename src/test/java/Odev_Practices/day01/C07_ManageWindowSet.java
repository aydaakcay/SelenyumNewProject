package Odev_Practices.day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {

    public static void main(String[] args) throws InterruptedException {

        /*
        Yeni bir Class olusturalim.C07_ManageWindowSet
    Amazon soyfasina gidelim. https://www.amazon.com/
    Sayfanin konumunu ve boyutlarini yazdirin
    Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
    Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
     Sayfayi kapatin

     C04_MAnageMethods_ImplicityWait
********

Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin
         */


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");  // Önemli
        WebDriver driver = new ChromeDriver();  // Önemli



        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu : " +driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(800,800));
        Thread.sleep(3000);

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Point actualPosition = driver.manage().window().getPosition();
        Point expectedPosition = new Point(100,100); // Degeri point döndürdüğü icin atamayı point expected.. yaptık
        if(actualPosition.equals(expectedPosition)){
            System.out.println("Test PASSED");
        }else System.out.println("Test Failed --> " + actualPosition);

        Dimension actualSize = driver.manage().window().getSize();
        Dimension expectedSize = new Dimension(800,800);
        if(actualSize.equals(expectedSize)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED --> " +actualSize);

        // Sayfayi kapatin
        driver.close();

        }










    }

