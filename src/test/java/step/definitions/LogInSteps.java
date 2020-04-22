package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {
    @Given("^User is on NetBanking landing page$")
    public void userIsOnNetBankingLandingPage() {

        System.out.println("-----GitStuff ------ ");
        System.out.println(("-----Architect framework rebuilding ------ "));
    }

    @When("User log into the application with user name and password")
    public void userLogIntoTheApplicationWithUserNameAndPassword() {

        System.out.println("-----123 GitStaff------ ");
        System.out.println(("-----Architect framework rebuilding ------ "));

    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {

        System.out.println("-----Test 123...------ ");

        System.out.println(("-----Architect framework rebuilding ------ "));

    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
    }
}
