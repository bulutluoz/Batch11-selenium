package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Google ana sayfasina gidelim . https://www.google.com/
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //Sayfa basliginin (title) “google” oldugunu dogrulayin. (verify)

        String actualResult=driver.getTitle();
        String expectedResult="google";

        if (actualResult.equals(expectedResult)){
            System.out.println("Page Title testi PASS");
        } else {
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title : " + actualResult);
        }

       // Navigate to youtube homepage https://www.youtube.com/

        driver.navigate().to("https://www.youtube.com/");
        String actualURL= driver.getCurrentUrl();

       // Verify if youtube homepage url is “www.youtube.com”
        // aktuel url= https://www.youtube.com/  beklenen url = www.youtube.com
        String expectedURL="www.youtube.com";

        if (actualURL.equals(expectedURL)){
            System.out.println("URL testi PASS");
        } else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL : " + actualURL);
        }


        driver.close();



    }

}
