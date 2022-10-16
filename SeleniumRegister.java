package com.juaracoding;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumRegister {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();


        //Maximize the browser
        driver.manage().window().maximize();

        String url = "https://shop.demoqa.com/my-account";

        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement reg_userName =
                driver.findElement(By.xpath("//*[@id='reg_username']"));
        reg_userName.sendKeys("Dwi Febrian Ramadhan");
        System.out.println("input user name");

        driver.findElement(By.id("reg_password")).sendKeys("qwerty123*");
        System.out.println("input password");

        driver.findElement(By.id("reg_email")).sendKeys("dwifebrian@gmail.com");
        System.out.println("input email");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement buttonRegister = driver.findElement(By.xpath("//*[@class ='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']"));
        buttonRegister.click();
    }
}