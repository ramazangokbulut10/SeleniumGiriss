package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_GetPageSource {
    public static void main(String[] args) {

        // Amazon sitesine gidip, kaynak kodlarında "Spend Less" yazdığını test edin.

        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        String sayfaKaynakKodları = driver.getPageSource();
        String arananKelime = "Gateway";
        if (sayfaKaynakKodları.contains(arananKelime)){
            System.out.println("Kaynak Kodu Testi PASSED");
        } else {
            System.out.println("Kaynak Kodlarinda " +arananKelime + " yok,test FAILED");
        }

        driver.close();
    }
}
