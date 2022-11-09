package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

      // WebElement, bir sayfada etkileşimli olan veya olmayan her şeye denir.
      // Amazonda incele dedikten sonra :
      // Tag'lar mor , attribute'ler sarı, attribute value'ler mavi renktedirler.

        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amozonda "Nutella" aratiniz
        driver.get("https://www.amazon.com/");

         /*
         driver.findelement() methodu bize bir "WebElement" döner, bizde bunu eğer birde fazla kullanacaksak
        " WebElement" datatipinde variable oluştururuz.
         */
         //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella" + Keys.ENTER);

        // "name" locateri ile aldık aşağıda mesela.
        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır

        // "class" locateri ile aldık aşağıda mesela.
        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));

        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */

        // partialLinkText ordaki değerinin belirli kısmını yazman yeterlidir.
        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();
    }

}
