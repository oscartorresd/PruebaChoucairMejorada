package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairPruebaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that oscar needs a new user to enter utest$")
    public void thatOscarNeedsANewUserToEnterUtest() throws Exception{
        theActorCalled("Oscar").wasAbleTo(OpenUp.thepage(), (Register.onThePage()));
    }

    @When("^you go to utest\\.com and click on join today you will find the form to create a new user$")
    public void youGoToUtestComAndClickOnJoinTodayYouWillFindTheFormToCreateANewUser(List<Utest_Data> data) throws Exception{
        theActorInTheSpotlight().attemptsTo(FirstStep.registerUser(data), (SecondStep.toRegister(data)), ThirdStep.register(data), FourthStep.registers(data));
    }

    @Then("^he fills out the form and obtains the new user to enter utest$")
    public void heFillsOutTheFormAndObtainsTheNewUserToEnterUtest(List<Utest_Data> data) {;
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)))
    }

}
