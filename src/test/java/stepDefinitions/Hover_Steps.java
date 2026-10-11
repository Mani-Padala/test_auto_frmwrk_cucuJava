package stepDefinitions;

import PageObjects.Hover_PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Hover_Steps {

    private final Hover_PO hover_po;

    public Hover_Steps(Hover_PO hover_po) {
        this.hover_po = hover_po;
    }

    @Given("I access the webdriver university actions page")
    public void i_access_the_webdriver_university_actions_page() {
        hover_po.navigateTo_WebDriverUniversity_Actions_Page();
    }

    @When("I hover over the first hover button")
    public void i_hover_over_the_first_hover_button() {
        hover_po.hoverOver_FirstButton();
    }

    @Then("I should see the revealed hover content {string}")
    public void i_should_see_the_revealed_hover_content(String expectedText) {
        Assert.assertEquals(hover_po.getRevealed_ContentText(), expectedText);
    }
}
