package com.example.stepDefinitions;

import com.example.pages.FormFilingPage;
import com.example.pages.OpenTheTestPageAndAcceptCookies;
import com.example.pages.PolicePlanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinitons {
    @Given("I open the BTA website")
    public void i_open_the_bta_website() {
        new OpenTheTestPageAndAcceptCookies().openPage();
    }
    @And("Accept cookies")
    public void acceptCookies() {
        new OpenTheTestPageAndAcceptCookies().acceptCookies();
    }
    @And("I click to the travel insurance")
    public void iClickToTheTravelInsurance() {
        new OpenTheTestPageAndAcceptCookies().clickToTravelInsurance();
    }
    @And("I change the country to India")
    public void iChangeTheCountryToIndia() {
        new FormFilingPage().selectCorrectRegion();
    }
    @Then("I Validate that the travel point was changed")
    public void iValidateThatTheTravelPointWasChanged() {
        new FormFilingPage().regionChangesVerify();
    }
    @And("I change the activity")
    public void iChangeTheActivity() {
        new FormFilingPage().changeActivity();
    }


    @Then("I validate that activity is Sports")
    public void iValidateThatActivityIsSports() {
        new FormFilingPage().validateActivity();
    }

    @And("I go to the second step")
    public void iGoToTheSecondStep() {
        new FormFilingPage().clickToReceiveOfferButton();
    }

    @And("I check what is covered in Optimal+")
    public void iCheckWhatIsCoveredInOptimal() {
        new PolicePlanPage().checkOptimalPlan();
    }

    @And("I validate that the form is open")
    public void iValidateThatTheFormIsOpen() {
        new PolicePlanPage().verifyThatFormIsOpen();
    }

    @And("I close the form and go to the next step")
    public void iCloseTheFormAndGoToTheNextStep() {
        new PolicePlanPage().closeTheFormAndGoToTheNextStep();
    }

    @Then("I validate that the traveler form is displayed and empty")
    public void iValidateThatTheTravelerFormIsDisplayedAndEmpty() {
        new PolicePlanPage().travelerDataVerifying();
    }
}
