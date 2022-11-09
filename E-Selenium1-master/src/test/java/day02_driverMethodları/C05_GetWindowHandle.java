package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_GetWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle()); //  CDwindow-6C67366C80BC9F9222201935E6321122
                                                      // hashKod verir
    }
}
