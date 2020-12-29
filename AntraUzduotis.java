package Atsiskaitymas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class AntraUzduotis {

    private String baseURL = "https://demo.opencart.com/";

    public WebDriver invokeDriver() {
        ChromeOptions nustatymai = new ChromeOptions();
        nustatymai.addArguments("--ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(nustatymai);

    }

    @Test
    public void AntraUzduotis() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = invokeDriver();
        driver.manage().window().maximize();


        System.out.println("Testas prasidejo");
        driver.get(baseURL);
        Thread.sleep(5000);


        System.out.println("Testas baigesi");

        driver.quit();
    }


}
