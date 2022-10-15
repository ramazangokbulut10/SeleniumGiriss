package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {

        // Seleniumun temel görevi, insanların manuel olarak yaptığı şeyleri otomosyana dökmesidir.
        // Web Uygulamarını "Selenium" ile test ederiz.
        // Mobil uygulamaları "Appium" ile test ederiz.

        // Kod ilk başta geliştirmeye başladığından itibaren, test edilmeye başlar.

        // ExpectedResult = Beklenen Sonuç   Bunu Requirement verir ( bunu test etmemimizi isteyen kişi söyler)
        // ActualResult =  Gerçekleşen Sonuç

        // Bug : Yazdığımız kodun beklenmeyen davranış sergilemesidir.

        // Manual (Functional) Testing = Manul Testtir.
        // Tüm Otomasyon Tester'lar, herhangi bir otomasyon yapmadan, önce uygulamayı anlamak için mutlaka yapılmalıdır.

        // Test Otomation : Otomasyon Testidir
        // Java ve Selenium kodlarının yaptığı olaydır.

        // Seleniumun yapamadıkları
        // Performans Testi yapamaz.
        // Handle Captcha(ben robot değilim)

         /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */

        // Driver yolunu sağ tik copy path reference > Path From Repository Root üzerinden alırız.
        System.setProperty("webdriver.chrome.driver","E-Selenium1-master/src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver(); // WebDriver interface old icin tek basina obje olusturamiyoruz
                                             // bu sebeple ChromeDriver ı kullandik
                                             // bu sadece pencere acar

        driver.get("https://www.amazon.com"); // burada ise gitmek istedigimiz sayfayi yazariz
        System.out.println("Actual Title :" +driver.getTitle()); // baslik yazdirir
        System.out.println("Actual Url :"+driver.getCurrentUrl()); //sayfa Url'ini getirir
        System.out.println("DenemeGithub");
        System.out.println(driver.getPageSource()); // gittigimiz sitedeki kaynak kodlarini getirir
                                                    // cok kullanilmaz
        driver.close();


    }
}
