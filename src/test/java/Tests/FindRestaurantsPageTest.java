package Tests;

import PageObjects.BasePageObject;
import PageObjects.FindRestaurantsPage2;
import Utilities.DriverManage;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;


public class FindRestaurantsPageTest extends DriverManage {

    private FindRestaurantsPage2 findRestaurantsPage;

    @Before
    public void navigateToFindRestaurantsPage() {
        System.out.println("Inside the navigateToFindRestaurantsPage");
        driver.get("http://localhost:3000");
        findRestaurantsPage = new FindRestaurantsPage2(driver);
    }

    @Test
    public void searchValidInputs() {
        findRestaurantsPage.enterName("Fun Restaurant");
        findRestaurantsPage.enterAddress("MountainView123,5643");
            BasePageObject searchResultsPage = findRestaurantsPage.findRestaurants();
        assertThat(10, is(equalTo(20)));
    }
}
