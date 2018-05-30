package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindRestaurantsPage2 extends BasePageObject {

    public FindRestaurantsPage2(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using="customerName")
    private WebElement customerName;

    @FindBy(id="address")
    private WebElement deliveryAddress;

    @FindBy(tagName = "button")
    private WebElement findRestaurantsButton;


    public void enterName(String fullName){
        if(this.customerName.isEnabled()) {
            this.customerName.clear();
            this.customerName.sendKeys(fullName);
        }
    }

    public void enterAddress(String fullDeliveryAddress){
        if(this.deliveryAddress.isEnabled()){
            this.deliveryAddress.sendKeys(fullDeliveryAddress);
        }
    }

    public SearchResultsPage findRestaurants(){
        this.clickOn(findRestaurantsButton,driver);
        return new SearchResultsPage(driver);
    }


}
