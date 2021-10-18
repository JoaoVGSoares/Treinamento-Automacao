package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPageElementMapper {

    @FindBy(id = "id_gender1")
    public WebElement gender1;

    @FindBy(id = "id_gender2")
    public WebElement gender2;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastName;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postCode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "alias")
    public WebElement alias;

    @FindBy(css = "#submitAccount > span")
    public WebElement submitBtn;


}
