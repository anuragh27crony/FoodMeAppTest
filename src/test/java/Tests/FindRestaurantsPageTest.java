package Tests;

import PageObjects.FindRestaurantsPage;
import Utilities.DriverManage;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;


public class FindRestaurantsPageTest extends DriverManage {

    private FindRestaurantsPage findRestaurantsPage;

    @Before
    public void navigateToFindRestaurantsPage() {
        System.out.println("Inside the navigateToFindRestaurantsPage");
        driver.get("http://localhost:3000");
        findRestaurantsPage = new FindRestaurantsPage(driver);
    }

    @Test
    public void searchValidInputs() {
        findRestaurantsPage.enterName("Fun Restaurant");
        findRestaurantsPage.enterAddress("MountainView123,5643");
        findRestaurantsPage.findRestaurants();
        assertThat(10, is(equalTo(20)));
    }

}