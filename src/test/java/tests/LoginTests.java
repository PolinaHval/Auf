package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setName("liza.khval@mail.ru");
        loginPage.setPsw("Polina123");
        loginPage.setButton();

        Assert.assertTrue(true);
    }
}
