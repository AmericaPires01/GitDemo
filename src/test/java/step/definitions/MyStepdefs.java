package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

public class MyStepdefs {


    @Given("^page is showing$")
    public void pageIsShowing() {

        System.out.println(("-----development branch ------ "));
    }

    @When("^clicking button$")
    public void clickingButton() {
        System.out.println(("-----development branch Architect ------ "));
    }

    @Then("i log in")
    public void iLogIn() {

        System.out.println(("-----Architect framework rebuilding ------ "));
    }



    //new scenario


}
