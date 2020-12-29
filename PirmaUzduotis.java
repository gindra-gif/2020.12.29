package Atsiskaitymas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class PirmaUzduotis {

    private String baseURL = "https://demo.opencart.com/";

    public WebDriver invokeDriver() {
        ChromeOptions nustatymai = new ChromeOptions();
        nustatymai.addArguments("--ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(nustatymai);

    }

    @Test
    public void PirmaUzduotis() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = invokeDriver();
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        System.out.println("Testas prasidejo");
        driver.get(baseURL);
        Thread.sleep(5000);

        driver.findElement(By.partialLinkText("My Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Login")).click();
        Thread.sleep(3000);

        List<WebElement> textDemo= driver.findElements(By.xpath("//*[contains(text(),'New Customer')]"));
        System.out.println("Number of web elements: " +textDemo.size());
        System.out.println("New Customer is displayed");

        List<WebElement> textDemo1= driver.findElements(By.xpath("//*[contains(text(),'Returning Customer')]"));
        System.out.println("Number of web elements: " +textDemo.size());
        System.out.println("Returning Customer is displayed");



        System.out.println("New Customer is displayed");

        System.out.println("Testas baigesi");

        driver.quit();
    }


}

