package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginSteps;
import steps.ProjectSteps;

public class ProjectTests extends BaseTest {

    @Test(priority = 1)
    public void createProjectTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.createProjectSteps(readProperties.getName());

        Assert.assertTrue(true);
    }

    @Test (priority = 2)
    public void addProjectTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.addProjectStep(readProperties.getNewName());

        Assert.assertTrue(true);
    }

    @Test (priority = 3)
    public void  deleteProjectTest(){
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.login(readProperties.getUserName(), readProperties.getPassword());
        ProjectSteps projectSteps = new ProjectSteps(driver);
        projectSteps.deleteProjectStep();

        Assert.assertTrue(true);
    }

}
