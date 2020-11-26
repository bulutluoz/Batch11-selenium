package day03;
// 1. Bir class oluşturun: LocatorsIntro
// 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//		a. http://a.testaddressbook.com adresine gidin, sayfayi tamsayfa yapin.
//		b. Sign in butonuna basin
//		c. email textbox,password textbox, and signin button elementlerini locate ediniz..
//		d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//				i. Username : testtechproed@gmail.com
//				ii. Password : Test1234!
//		e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//		f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
//				doğrulayin(verify).
//3. Sayfada kac tane link oldugunu bulun.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {

        // 1. Bir class oluşturun: LocatorsIntro
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //		a. http://a.testaddressbook.com adresine gidin, sayfayi tamsayfa yapin.

        driver.get("http://a.testaddressbook.com");
        //		b. Sign in butonuna basin
        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();


        //		c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Thread.sleep(3000);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

        //		d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç
        //		(sign in)buttonunu tıklayın:
        //				i. Username : testtechproed@gmail.com
        //				ii. Password : Test1234!
         emailTextBox.sendKeys("testtechproed@gmail.com");
         passwordTextBox.sendKeys("Test1234!");
         signInButonu.click();

        //		e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));
        if (kullaniciAdi.isDisplayed()){
            System.out.println("kullanici adi testtechproed@gmail.com PASS");
        } else {
            System.out.println("kullanici adi testtechproed@gmail.com FAILED");
        }

        //		f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        //				doğrulayin(verify).

        WebElement adresLinki = driver.findElement(By.linkText("Addresses"));
        if (adresLinki.isDisplayed()){
            System.out.println("Adres linki gorundu testi PASS");
        } else {
            System.out.println("Adres linki gorundu testi FAILED");
        }

        WebElement signOutText = driver.findElement(By.linkText("Sign out"));

        if (signOutText.isDisplayed()){
            System.out.println("Sign out gorundu testi PASS");
        } else {
            System.out.println("sign out gorundu testi FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linkListesi.size() + " tane link var");

        // 4. linkleri yazdiralim
        System.out.println("sayfadaki linkler");
        for (WebElement w : linkListesi
             ) {
            System.out.println(w.getText());
        }

        driver.close();
    }

}
