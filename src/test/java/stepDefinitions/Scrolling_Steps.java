package stepDefinitions;

import PageObjects.Scrolling_PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Scrolling_Steps {

    private final Scrolling_PO scrolling_po;

    public Scrolling_Steps(Scrolling_PO scrolling_po) {
        this.scrolling_po = scrolling_po;
    }

    @Given("I access the webdriver university scrolling page")
    public void i_access_the_webdriver_university_scrolling_page() {
        scrolling_po.navigateTo_WebDriverUniversity_Scrolling_Page();
    }

    @Then("the last zone should initially be outside the viewport")
    public void the_last_zone_should_initially_be_outside_the_viewport() {
        Assert.assertFalse(scrolling_po.isZone4_InViewport(), "Zone 4 should start below the fold");
    }

    @When("I scroll to the last zone")
    public void i_scroll_to_the_last_zone() {
        scrolling_po.scrollTo_Zone4();
    }

    @Then("the last zone should be visible in the viewport")
    public void the_last_zone_should_be_visible_in_the_viewport() {
        Assert.assertTrue(scrolling_po.isZone4_Displayed(), "Zone 4 is not displayed");
        Assert.assertTrue(scrolling_po.isZone4_InViewport(), "Zone 4 is not in the viewport after scrolling");
        Assert.assertEquals(scrolling_po.getZone4_Text(), "Dont forget to scroll to me!");
    }
}
