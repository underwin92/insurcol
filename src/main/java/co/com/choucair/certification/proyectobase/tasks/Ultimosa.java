package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import co.com.choucair.certification.proyectobase.userinterface.Ultimosapage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ultimosa implements Task {
    public static Ultimosa fin() {
        return Tasks.instrumented(Ultimosa.class);
    }

    @Override


    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Enter.theValue("1234Edgar*").into(Ultimosapage.INPUT_PASSWORD),
        Enter.theValue("1234Edgar*").into(Ultimosapage.INPUT_PASSWORD_REPEAT),

        Click.on(Ultimosapage.CHECK_1),
        Click.on(Ultimosapage.CHECK_2),
        Click.on(Ultimosapage.CHECK_3),
        Click.on(Ultimosapage.BUTTON_FINAL)
);
    }
}
