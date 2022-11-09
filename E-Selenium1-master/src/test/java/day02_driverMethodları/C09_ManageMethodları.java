package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_ManageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        İleride wait konusunu daha genis ele alacağız.
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir yüklenme süresine ihtiyaç vardır
        Veya bir WebElementin kullanılabilmesi için zamana ihtiyaç olabilir.
        implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek Maximum süreyi belirleme olanağı tanır.
         */

        /*
        implicitlyWait : kısacası bir siteye giderken maxium 15 saniye bekler, eğer fazla sürerse rapor eder
        daha erken bağlanırsa diğer işlemleri yapmaya devam eder.
        Temel amaç açılana kadar beklemek,
         */


    }
}
