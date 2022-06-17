package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SiguientePage  extends PageObject {
    public static final Target BUTTON_LAST = Target.the("paso 2 ").located(By.xpath("//*[contains(text(),'Next: Last Step')]"));

}
