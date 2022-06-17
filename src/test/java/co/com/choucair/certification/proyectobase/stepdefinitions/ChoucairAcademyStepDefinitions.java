package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

  /*  @Given("^ than brandon wants to learn automation at the academy Choucari$")
    public void thanBrandonwantstoLearnAutomationAnTheAcademyChoucair(){
    OnStage.theActorCalled(  "Brandon").wasAbleTo(OpenUp.thePage());
    }
    @When("^ he search for the course Recursos Automaticacion Bamcolombia on the choucair academy plataform$")
    public void HeSearchForTheCourseRecursosAutomaticacionBamcolombiaOnTheChoucairAcademyPlataform(){

    }

    @Then("^ he finds the couse called resources recursos automatizacion bancolombia")
    public void HeFindsTheCouseCalledResourcesRecursosAutomatizacionBancolombia(){

    }*/


    @Given("^than brandon wants to learn automation at yhe academy Choucair$")
    public void than_brandon_wants_to_learn_automation_at_yhe_academy_Choucair() {
        // Write code here that turns the phrase above into concrete actions
        //OnStage.theActorCalled(  "Brandon").wasAbleTo(OpenUp.thePage());
        OnStage.theActorCalled(  "Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void he_search_for_the_course_Recursos_Automatizacion_Bancolombia_on_the_choucair_academy_platform(String course) {
    OnStage.theActorCalled(  "Brandon").wasAbleTo(Search.the());//theActorInTheSpotlight().attemptsTo(Search.the());
        OnStage.theActorCalled(  "Brandon").wasAbleTo(Siguiente.the());
        OnStage.theActorCalled(  "Brandon").wasAbleTo(Ultimosa.fin());
       // Write code here that turns the phrase above into concrete actions

    }

    @Then("^he finds the cousrse called resources recursos automaticacion bancolombia$")
    public void he_finds_the_cousrse_called_resources_recursos_automaticacion_bancolombia() {
      //theActorInTheSpotlight().attemptsTo(Search.the());

    }








}
