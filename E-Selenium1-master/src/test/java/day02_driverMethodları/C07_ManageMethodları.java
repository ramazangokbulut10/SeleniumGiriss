package day02_driverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_ManageMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere Konumu = "+driver.manage().window().getPosition()); // acilan browser'ın konumunu verir
        System.out.println("Pencere Olculeri ="+driver.manage().window().getSize()); // Acilan browser'in olculerini verir

        Thread.sleep(2000); // iki saniye bekle dedik !

        // Pencerenin konumunu ve buyuklugunu degistirelim.
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("Yeni Pencere Konumu = "+driver.manage().window().getPosition()); // acilan browser'ın konumunu verir
        System.out.println("Yeni Pencere Olculeri ="+driver.manage().window().getSize()); // Acilan browser'in olculerini verir



    }
}
