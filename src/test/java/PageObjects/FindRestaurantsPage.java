package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindRestaurantsPage extends BasePageObject {

    public FindRestaurantsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="customerName")
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
        if(this.findRestaurantsButton.isEnabled()){
            this.findRestaurantsButton.click();
        }
        return new SearchResultsPage(driver);
    }


}
