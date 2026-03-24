package com.thequalityacademy.tests.VWO;

import com.thequalityacademy.page.POM.normal_POM.VMO.DashboardPage;
import com.thequalityacademy.page.POM.normal_POM.VMO.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVMOLogin_01_Normal_POM {

    //D
    //L
    //Verification

    @Owner("Ankit")
    @Description("Verify with that invalid email password, error message")
    @Test

    public void test_negative_vmo_login()
    {

        // Driver Manager - 1- Driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        //Page class code(POM Code) -2 - Locator
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.LoginToVMOInvalidCreds("abc@gmail.com", "123456" );
        //Assertion -  -V
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");

        driver.quit();

        //aptest@tempumail.cc
        //https://www.1secmail.cc/en/view/5DpN3ovLqA8lYaZeMJ6VjPOyPBnxyQG0rbkdPzKE9OwWg1
    }

    @Owner("Ankit")
    @Description("Verify with that valid email password, login and open dashboard page")
    @Test

    public void test_positive_vmo_login()
    {

        // Driver Manager - 1- Driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        //Page class code(POM Code) -2 - Locator
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginToVMOvalidCreds("cxh04@tempumail.cc", "ILoveDrive#08" );
        //Assertion -  -V

        DashboardPage dashboardPage = new DashboardPage(driver);
        String userNameLoggedIn = dashboardPage.loggedInuserName();

        Assert.assertEquals(userNameLoggedIn, "Kishore J");
        driver.quit();

        //aptest@tempumail.cc 123456
        //fvy07@tempumail.cc
        //https://www.1secmail.cc/en/view/5DpN3ovLqA8lYaZeMJ6VjPOyPBnxyQG0rbkdPzKE9OwWg1
    }



}
