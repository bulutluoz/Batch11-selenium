package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {


    //1. Yeni bir class olusturun (TekrarTesti)
    //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
    //   doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
    //   doğru URL'yi yazdırın.
    //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
    //5. Youtube sayfasina geri donun
    //6. RefrSayfayi yenileyin
    //7. Amazon sayfasina donun
    //8. Sayfayi tamsayfa yapin
    //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
    //   doğru başlığı(Actual Title) yazdırın.
    //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
    //11.Sayfayi kapatin
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //   doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            driver.navigate().to("https://www.youtube.com/");
            String actualYoutubeTitle=driver.getTitle();
            String expectedYoutubeTitle= "youtube";

            if (actualYoutubeTitle.equals(expectedYoutubeTitle)){
                System.out.println("Youtube title testi PASS");
            }else {
                System.out.println("Youtube title testi FAILED");
                System.out.println("Actual Title : " + actualYoutubeTitle);
            }


        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //   doğru URL'yi yazdırın.
         String actualYoutubeURL=driver.getCurrentUrl();
         String arananKelime="youtube" ;
         if (actualYoutubeURL.contains(arananKelime))  {
             System.out.println("URL icerik testi PASS");
         } else {
             System.out.println("URL icerik testi FAILED");
             System.out.println("URL " + arananKelime + " icermiyor");
         }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //   doğru başlığı(Actual Title) yazdırın.
        String actualAmazonTitle= driver.getTitle();
        String arananAmazonKelime="Amazon";

        if (actualAmazonTitle.contains(arananAmazonKelime)){
            System.out.println("Amazon baslik testi PASS");
        } else {
            System.out.println("Amazon baslik testi FAILED");
            System.out.println("Title " + arananAmazonKelime + " icermiyor");
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualAmazonURL=driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";

        if (actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("Amazon URL testi PASS");
        } else {
            System.out.println("Amazon URL testi FAILED");
            System.out.println("Aktuel amazon URL " + actualAmazonURL);
        }

        //11.Sayfayi kapatin
        driver.close();

    }

}
