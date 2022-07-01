package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TestingPage extends CommonMethods {
    @FindBy(id="userId")
    public WebElement emailBox;

    @FindBy(name="Password")
    public WebElement passBox;

    @FindBy(name="company")
    public WebElement companyBox;

    @FindBy(xpath="//input[@value='Submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/section[2]/div/div[2]/div/div/div/div[1]/input[1]")
    public WebElement nameBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/section[2]/div/div[2]/div/div/div/div[1]/input[2]")
    public WebElement lastNameBox;

    public TestingPage() {
        PageFactory.initElements(driver, this);
    }
}