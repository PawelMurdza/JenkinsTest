package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.TestingPage;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestingSiteSteps extends CommonMethods {
  String name;
  String password;
  String company;
  String lastName;
    @When("user provides {string} sheet and submits")
    public void userProvidesSheetAndSubmits(String sheetName) throws InterruptedException {
        List<Map<String, String>> newEmployees = ExcelReader.excelIntoMap(Constants.TESTINGDATA_FILEPATH, sheetName);
        Iterator<Map<String, String>> itr = newEmployees.iterator();
        while (itr.hasNext()){
            Map<String, String> mapNewEmp = itr.next();
            ((JavascriptExecutor)driver).executeScript("arguments[0].value=arguments[1]", testingPage.emailBox, mapNewEmp.get("email"));
            //sendText(testingPage.emailBox,mapNewEmp.get("email"));
            sendText(testingPage.passBox,mapNewEmp.get("password"));
            sendText(testingPage.companyBox,mapNewEmp.get("company"));
            click(testingPage.submitBtn);

        }
    }
    @Then("user successfully submitted data")
    public void user_successfully_submitted_data() {
        System.out.println("sent");
    }

    @Given("user is navigated to app")
    public void userIsNavigatedToApp() {
        openBrowserAndLauchApplication();
    }


    @When("user sends Pawel and Testing")
    public void userSendsPawelAndTesting(DataTable dataTable) throws InterruptedException {
        Thread.sleep(2000);
List<Map<String,String>> entryData = dataTable.asMaps(String.class,String.class);
name = entryData.get(0).get("name");
lastName = entryData.get(0).get("lastName");
driver.findElement(By.xpath("(//*[name()='svg'])[10]")).click();
//getJSExecutor().executeScript("document.querySelector(\"input[placeholder='First Enter name']\").disable = false");
sendText(testingPage.nameBox,name);
getJSExecutor().executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled = false");
sendText(testingPage.lastNameBox,lastName);
Thread.sleep(3000);
    }
    @Then("it is done")
    public void itIsDone() {
        System.out.println("success");
    }
}
