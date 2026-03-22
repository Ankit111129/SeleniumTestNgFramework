package com.thequalityacademy.page.POM.VMO;

import com.thequalityacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {


    WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;

    }

    private By userNameOnDashboard = By.xpath("//span[@data-qa = 'lufexuloga']");

    public String loggedInuserName()
    {
        WaitHelpers.waitJvmWait(10000);

        driver.get("https://app.vwo.com/#/dashboard?accountId=1207845");

        WaitHelpers.waitJvmWait(5000);
        return  driver.findElement(userNameOnDashboard).getText();
    }


}
