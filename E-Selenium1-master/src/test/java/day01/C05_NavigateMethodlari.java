package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

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
