package steps;

import org.openqa.selenium.WebDriver;
import pages.CreateProjectPage;
import pages.DashboardPage;
import pages.ProjectListPage;

public class ProjectSteps {

    private WebDriver driver;

    public ProjectSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void createProjectSteps(String nameProject){
        DashboardPage dashboardPage = new DashboardPage(driver,true);
        dashboardPage.getButtonCreateProject().click();
        CreateProjectPage createProjectPage = new CreateProjectPage(driver,true);
        createProjectPage.getNameProject().sendKeys(nameProject);
        createProjectPage.getButtonAddProject().submit();
    }

    public void addProjectStep(String newName){
        ProjectListPage projectListPage = new ProjectListPage(driver,true);
        projectListPage.getProject().click();
        projectListPage.getNewName().clear();
        projectListPage.getNewName().sendKeys(newName);
        projectListPage.getButtonSaveProject().click();
    }

    public void deleteProjectStep(){
        ProjectListPage projectListPage = new ProjectListPage(driver,true);
        projectListPage.getButtonDelete().click();
        projectListPage.getCheckbox().click();
        projectListPage.getOKCheckbox().click();
    }
}
