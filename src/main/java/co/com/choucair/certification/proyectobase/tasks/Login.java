package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
            Enter.theValue("Edgar").into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue("Carlos").into(ChoucairLoginPage.INPUT_PASSWORD),
            Enter.theValue("underoap@gmail.com").into(ChoucairLoginPage.INPUT_EMAIL),
            Enter.keyValues("February").into(ChoucairLoginPage.INPUT_MONTH),
            Enter.keyValues("8").into(ChoucairLoginPage.INPUT_BIRDDAY),
            Enter.keyValues("2004").into(ChoucairLoginPage.INPUT_BIRDYEAR),
                    Click.on(ChoucairLoginPage.ENTER_BUTTON));




    }
}
