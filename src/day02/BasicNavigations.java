package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.navigate().to("https://www.youtube.com/");
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //Sayfayi Refresh(yenile) yapalim

        driver.navigate().refresh();
        //5. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.close();
    }
}
