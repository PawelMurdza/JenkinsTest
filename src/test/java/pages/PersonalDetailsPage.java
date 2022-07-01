package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalDetailsPage extends CommonMethods {
    @FindBy(id = "personal_txtEmpFirstName")
    public WebElement FirstNameField;

    @FindBy(id = "personal_txtEmpMiddleName")
    public WebElement MiddleNameField;

    @FindBy(id = "personal_txtEmpLastName")
    public WebElement LastNameField;

    public PersonalDetailsPage(){
        PageFactory.initElements(driver,this);
    }
}
