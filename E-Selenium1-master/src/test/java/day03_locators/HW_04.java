package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class HW_04 {
    public static void main(String[] args) {
         /*
       1. Bir class oluşturun : AmazonSearchTest
       2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
       a. web sayfasına gidin. https://www. amazon.com/
       b. Search(ara) “city bike”
       c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
       e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
     */
        System.setProperty("webdriver.chrome.driver", "E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // b. Search(ara) “city bike”
        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike" + Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi=aramaSonucu.get(0).getText();
        // liste olarak geliyor biz burda 0.indexli yani 1-16 of 128 results for "city bike" yazıyı istemiş oluyoruz.
        System.out.println(sonucYazisi);

         // d. Sadece sonuc sayisini yazdiriniz  ******ARRAY KULLANDIK*****
         String []  sonucYazisiE= sonucYazisi.split(" ");
         System.out.println("City Bike arama sonucu" + sonucYazisiE[2]);

         //  LAMBDA İLE YAPALİM (SONUC YAZİSİNİ)     ********ONEMLI*********
         Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach( System.out::println);
         // bosluklardan bol 3. ye kadar al sonra 2.sini al yazd


         // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın  ******LIST KULLANDIK******
         List<WebElement> ilkResim = driver.findElements(By.className("s-image"));
         // 120 Tane resim var biz birinci resime tıklamak istiyoruz o yüzden get(0) dedik.
         WebElement ilkResimWE=ilkResim.get(0);
         ilkResimWE.click();
    }
}
