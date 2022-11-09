package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek
        driver.get() yerine driver.navigate().to() methodunu kullanırız.
        Ve sonrasında forward(), back(), refresh() methodlarını kullanabiliriz.
         */

        System.setProperty("webdriver.chrome.driver", "E-Selenium1-master/src/resources/drivers/chromedriver.e xe");
        WebDriver driver = new ChromeDriver(); // driver objenin adı istersen Aleyna koy :)
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://amazon.com");
        // driver.navigate().to() methodu sayfada ileri geri yapicaksak kullanilir
        //driver.get() methodu gibi bizi istedigimiz Url'e goturur

        driver.navigate().to("https://techproeducation.com");

        // tekrar amazon a donelim
        Thread.sleep(3000);
        driver.navigate().back(); // geri

        //  tekrar techproed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); // ileri

        // Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //  sayfayi kapatiniz
        driver.quit();
    }

}
