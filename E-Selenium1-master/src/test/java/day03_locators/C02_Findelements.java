package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Findelements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amozonda "Nutella" aratiniz
        driver.get("https://www.amazon.com/");

        // Amazon sayfasindaki tag'lari link(a) olanlarin sayisini yazdiriniz
        List<WebElement> linkListesi = driver.findElements(By.tagName("a")); // sürekli değişiyor pek önemli değil.
        System.out.println("Sayfadaki link sayisi : " + linkListesi.size());

        // findElements() aradigimiz tum tag'lari getirir
        // findElement() aradigimiz bir webElementin ilk elementini getirir

        driver.close(); // Sayfayı kapatır.

    }
}
