package com.thequalityacademy.tests.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestVMOInvalidLogin_without_POM {

    @Test

    public void VMOTestWithoutPOM() {


        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com/#/login");

        WebElement userName = driver.findElement(By.cssSelector("input#login-username"));
        userName.sendKeys("ap@gmail.com");

        WebElement passWord = driver.findElement(By.cssSelector("input#login-password"));
        passWord.sendKeys("123456");

        WebElement clickBtn = driver.findElement(By.cssSelector("button#js-login-btn"));
        clickBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.notification-box-description")));

        WebElement errorMessage = driver.findElement(By.cssSelector("div.notification-box-description"));

        Assert.assertEquals(errorMessage.getText(), "Your email, password, IP address or location did not match");


    }
}
