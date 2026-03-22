package com.thequalityacademy.tests.VWO;

import com.thequalityacademy.page.POM.VMO.LoginPage;
import com.thequalityacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVMOLogin_02_Prop_Improved_POM {

    @Owner("Ankit")
    @Description("Verify that with invalid email, pass, error message is shown on ")
    @Test

    public void test_negative_vmo_login()
    {
        WebDriver driver = new ChromeDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage loginPage = new LoginPage(driver);
    String error_msg = loginPage.LoginToVMOInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }

}
