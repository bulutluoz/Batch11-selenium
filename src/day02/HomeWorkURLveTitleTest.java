package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//1. Yeni bir class olusturalim (Homework)
//2. ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook ”
//   oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
//3. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’I
//   yazdirin.
//4. https ://www.walmart.com sayfasina gidin.
//5. Sayfa basliginin “Walmart.com ” icerdigini
//6. Tekrar “facebook” sayfasina donun
//7. Sayfayi yenileyin
//8. Sayfayi tam sayfa (maximize) yapin
//9. Browser’i kapatin

public class HomeWorkURLveTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //1. Yeni bir class olusturalim (Homework)
        //2. ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook ”
        //   oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualFacebookTitle=driver.getTitle();
        String expectedFacebookTitle ="facebook";
        if (actualFacebookTitle.equals(expectedFacebookTitle)){
            System.out.println("Facebook title testi PASS");
        } else {
            System.out.println("Facebook title testi FAILED \nAktuel Facebook title : " + actualFacebookTitle +
                    "\nExpected Facebook Title : "+expectedFacebookTitle);
        }
        //3. Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’I yazdirin.
        String actualFacebookURL = driver.getCurrentUrl();
        String arananFacebookURLKelime="facebook";
        if (actualFacebookURL.contains(arananFacebookURLKelime)){
            System.out.println("Facebook URL aranan kelime testi PASS");
        } else{
            System.out.println("Facebook URL aranan kelime testi FAILED");
            System.out.println("Aktuel Facebook URL'i " + arananFacebookURLKelime +" kelimesini icermiyor");
        }
        //4. https ://www.walmart.com sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com ” icerdigini dogrulayin
        String actualWallmartTitle=driver.getTitle();
        String arananKelimeWallmartTitle="Walmart.com";

        if (actualWallmartTitle.contains(arananKelimeWallmartTitle)){
            System.out.println("Wallmart title aranan kelime testi PASS");
        } else {
            System.out.println("Wallmart title aranan kelime testi FAILED");
               }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9. Browser’i kapatin
        driver.close();
    }
}
