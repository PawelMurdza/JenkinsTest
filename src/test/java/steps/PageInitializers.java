package steps;

import pages.*;

public class PageInitializers {

    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static PersonalDetailsPage personalDetailsPage;
    public static DashboardPage dash;
    public static TestingPage testingPage;

    public static void intializePageObjects(){
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        personalDetailsPage = new PersonalDetailsPage();
        dash = new DashboardPage();
        testingPage = new TestingPage();
    }

}