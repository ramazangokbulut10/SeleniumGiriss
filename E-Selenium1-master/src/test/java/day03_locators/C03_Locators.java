package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //        b. Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click(); // sadece bir defa kullanacağımız için bir variablea koymadık.

        //        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));

        //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        emailTextbox.sendKeys("testtechproed@gmail.com");
        //        ii. Password : Test1234!
        password.sendKeys("Test1234!");
        // (sign in)buttonunu tıklayın
        signin.click();

        //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualUser = driver.findElement(By.className("navbar-text"));
        String actualSonuc = actualUser.getText(); // WebElementteki bilgileri doğrudan yazdıramayız,
        // O yüzden onu bir "String" variablena atayıp, W"ebElement"'i getText() methodu ile bilgileri alıyoruz.
        String expectedUser = "testtechproed@gmail.com";

        if (actualSonuc.equals(expectedUser)){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        //----- BASKA COZUMU
        if (actualUser.isDisplayed()) {
            System.out.println("ActualUser Testi PASSED" +actualUser.getText());
        }else
            System.out.println("ActualUser Testi FAILED");
      /*
      Bir Webelementin uzerindeki yaziyi konsolda yazdirabilmek icin getText() methodu kullanilir
      */

        //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        if (addresses.isDisplayed()){ // isDisplayed() methodu bize true yada false döner.Görünüyorsa passed görünmüyorsa failed.
            System.out.println("Adresses testi PASSED");
        }else
            System.out.println("Adresses testi FAILED");

        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()){ // isDisplayed() methodu bize true yada false döner.Görünüyorsa passed görünmüyorsa failed.
            System.out.println("SignOut testi PASSED");
        }else
            System.out.println("SignOut testi FAILED");

        //        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a")); // "a" tagları tamamen link olduğu için "a" yazıyoruz doğrudan.
        System.out.println("Linklerin sayisi : "+linklerListesi.size());


        // WebElementlerden oluşan bir listen varsa direkt yazdıramazsın,direkt yazdırırzak referanslarını yazdırmış oluruz.
        // forEach loop , ya da diğer loopları kullanmak zorundasın.


        // 4. Linkleri yazdiriniz
        //Yazdıracağımız verinin data tipi,  adı each olsun,  linklerlistesindeki webElementleri
        for (WebElement                      each          :linklerListesi
        ) {
            System.out.println("Linkler"+each.getText());
            // each biz dedik oraya istediğimiz her şeyi koyabiliriz.
        }

        driver.close(); // Sayfayı Kapatır.

    }
}
