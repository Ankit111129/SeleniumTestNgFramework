package com.thequalityacademy.tests.VWO;

import com.thequalityacademy.baseTest.COmmonToAllTest;
import com.thequalityacademy.driver.DriverManager;
import com.thequalityacademy.page.POM.improved_POM.LoginPage1;
import com.thequalityacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVMOLogin_02_Prop_Improved_POM  extends COmmonToAllTest {



    private static final Logger logger = LogManager.getLogger(TestVMOLogin_02_Prop_Improved_POM.class);
    @Owner("Ankit")
    @Description("Verify that with invalid email, pass, error message is shown on ")
    @Test

    public void test_negative_vwo_login() {
        logger.info("Browser is started....");

        LoginPage1 loginPage = new LoginPage1(DriverManager.getDriver());
        logger.info("Verifying the Invalid credentials....");
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
        logger.info("Final Assert Verifications....");
        // System.out.println(error_msg); No now!!
        logger.info(error_msg.toString());

        logger.error("Failed to verify");
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }

}
