package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search implements Task {
    private String course;
                       public WebDriver  driver ;

    public Search() {
        this.course = course;
    }

    public static Search the(){
    return Tasks.instrumented(Search.class);
}
    @Override

    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(

       Enter.theValue("Bucaramanga").into(SearchCoursePage.INPUT_CITY),
       Hit.the(Keys.ARROW_DOWN).keyIn(SearchCoursePage.INPUT_CITY),

    Enter.theValue("").into(SearchCoursePage.INPUT_ZIP),
       Enter.theValue("680005").into(SearchCoursePage.INPUT_ZIP)  ,
       Click.on(SearchCoursePage.BUTTON_DEVICES)
      );
             /*   try {
 actor.attemptsTo(
      Enter.theValue("680005").into(SearchCoursePage.INPUT_ZIP)  ,
       Click.on(SearchCoursePage.BUTTON_DEVICES)
      );                                                                                     }finally {

                actor.attemptsTo(
                                Enter.theValue("680005").into(SearchCoursePage.INPUT_ZIP)  ,
                        Click.on(SearchCoursePage.BUTTON_DEVICES)
                          );
                }
  /* actor.attemptsTo(
        Enter.theValue("680005").into(SearchCoursePage.INPUT_ZIP)  ,
         Click.on(SearchCoursePage.BUTTON_DEVICES)
        );   */

    }
}
