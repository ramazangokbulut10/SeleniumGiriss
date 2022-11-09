package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ManageMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.manage().window().maximize();
        // maximize iken boyutları alalım.
        System.out.println("Maximize Konum " +driver.manage().window().getPosition());
        System.out.println("Maximize Boyut " +driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        // fullscreen iken boyutları alalım.
        System.out.println("Fullscreen Konum " +driver.manage().window().getPosition());
        System.out.println("Fullscreen Boyut " +driver.manage().window().getSize());

        driver.manage().window().minimize(); // simge durumunda küçültür.


    }
}
