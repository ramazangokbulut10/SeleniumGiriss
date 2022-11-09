package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElemeentMethodları {
    public static void main(String[] args) {

         /*
        Amazon sayfasina gidiniz
        Arama kutusunu locate ediniz
        Arama kutusunun tagName'inin input old test ediniz
        Arama kutusunun name atributu'nun field-keywords oldugunu test ediniz
         */

        System.setProperty("webdriver.chrome.driver", "E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasına gidiniz.
        driver.get("https://amazon.com");

        // Arama Kutusunun locatini alınız.
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

        //  Arama kutusunun tagName'inin input oldugunu test ediniz
        String expectedTagName="input";
        String actualTagName=searchBox.getTagName();

        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED"+actualTagName);
        }else
            System.out.println("TagName testi FAILED");

        //  Arama kutusunun name atributu'nun field-keywords oldugunu test ediniz
        String expectedAtributeName="field-keywords";
        String actualAtributeName=searchBox.getAttribute("name");
        if (actualAtributeName.equals(expectedAtributeName)){
            System.out.println("Atribute TESTI PASSED");
        }else
            System.out.println("Attribute TESTI FAILED");

        // Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusunun konumunu = " + searchBox.getLocation());

        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        WebElemenİsmi.getTagName()  --> Daha once locate ettiğimiz bir webElementin tagName'ni döndürür bunun için "input" döner
        WebElemenİsmi.getAttribute()  --> Daha once locate ettiğimiz bir webElementin attribute degerini döndürür
                                                                                  bunun için "field-keywords" döner

         */



    }
}
