package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // Ekranı tam sayfa yapmak için bu kodu yazarız.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // her satır için 15 saniye bekler,erken açılırsa diğer satıra geçer, 15 saniye içinde açılmazsa failed verir.

        // Amazon'a gidin
        driver.get("https://www.amazon.com");

        System.out.println("Actual Title " + driver.getTitle()); // Amazon Sayfasının Title'nı getirir.

        System.out.println("Actual Url " + driver.getCurrentUrl()); // Amazon Sayfasının Url'ni getirir.

        driver.close();
        // driver.quit(); birden fazla sayfa varsa hepsini kapatir
    }
}
