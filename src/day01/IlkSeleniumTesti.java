package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        //driver.close(); // sadece calisilan browser'i kapatir
        driver.quit(); // acik olan tum browser'lari kapatir



    }

}
