package stepDefinitions;

import PageObjects.Dropdown_PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Dropdown_Steps {

    private final Dropdown_PO dropdown_po;

    public Dropdown_Steps(Dropdown_PO dropdown_po) {
        this.dropdown_po = dropdown_po;
    }

    @Given("I access the webdriver university dropdown page")
    public void i_access_the_webdriver_university_dropdown_page() {
        dropdown_po.navigateTo_WebDriverUniversity_Dropdown_Page();
    }

    @When("I select {string} from the dropdown {string}")
    public void i_select_from_the_dropdown(String optionText, String dropdownId) {
        dropdown_po.selectOption_ByVisibleText(dropdownId, optionText);
    }

    @Then("the dropdown {string} should have the value {string} selected")
    public void the_dropdown_should_have_the_value_selected(String dropdownId, String expectedValue) {
        Assert.assertEquals(dropdown_po.getSelected_Value(dropdownId), expectedValue);
    }
}
