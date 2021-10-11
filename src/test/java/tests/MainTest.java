package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import steps.LoginSteps;

public class MainTest extends BaseTest {

    @Test
    public void loginPositiveTest() {

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login("liza.khval@mail.ru", "Polina123");

        Assert.assertTrue(true);
    }
}
