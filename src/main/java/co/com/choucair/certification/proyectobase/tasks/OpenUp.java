package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;
import org.aspectj.apache.bcel.classfile.Module;

public  class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
   public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
