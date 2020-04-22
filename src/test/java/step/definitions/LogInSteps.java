package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {
    @Given("^User is on NetBanking landing page$")
    public void userIsOnNetBankingLandingPage() {

        System.out.println("-----Person who has downloaded GitDemo------ ");
    }

    @When("User log into the application with user name and password")
    public void userLogIntoTheApplicationWithUserNameAndPassword() {

        System.out.println("-----123456778Person who downloaded GitDemo------ ");

    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {

        System.out.println("-----Love love more love Person who downloaded GitDemo------ ");

    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
    }
}
