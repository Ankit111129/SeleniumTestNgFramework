package com.thequalityacademy.page.POM.VMO;

import com.thequalityacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//page class

public class LoginPage {

    WebDriver driver ;
    public LoginPage(WebDriver driver)
    {
    this.driver = driver;
    }
    //page locator

    private By userName = By.cssSelector("input#login-username");
    private By passWord = By.cssSelector("input#login-password");
    private By clickBtn = By.cssSelector("button#js-login-btn");
    private By errorMsg = By.cssSelector("div.notification-box-description");

    //page action

    public String LoginToVMOInvalidCreds(String usr, String pwd)
    {

        driver.findElement(userName).sendKeys(usr);
        driver.findElement(passWord).sendKeys(pwd);
        driver.findElement(clickBtn).click();
        WaitHelpers.checkVisibility(driver, errorMsg);
        String error_Msg_Text = driver.findElement(errorMsg).getText();
        return error_Msg_Text;
    }

    public void LoginToVMOvalidCreds(String usr, String pwd)
    {

        driver.findElement(userName).sendKeys(usr);
        driver.findElement(passWord).sendKeys(pwd);
        driver.findElement(clickBtn).click();

    }


}
