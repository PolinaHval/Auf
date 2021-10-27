package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import steps.LoginSteps;

public class MainTest extends BaseTest {

    @Test
    public void loginPositiveTest() {

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());
        Assert.assertTrue(true);
    }

    @Test
    public void loginNegativeTest() {

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login("fail", readProperties.getPassword());
        Assert.assertEquals(new LoginPage(driver,false).getErrorMessage(),
                "Email/Login or Password is incorrect. Please try again.");
    }

}
