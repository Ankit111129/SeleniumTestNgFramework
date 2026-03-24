package com.thequalityacademy.page.POM.improved_POM;

import com.thequalityacademy.base.CommonToAllPage;
import com.thequalityacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends CommonToAllPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.xpath("//span[@data-qa='lufexuloga']");

    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }

}
