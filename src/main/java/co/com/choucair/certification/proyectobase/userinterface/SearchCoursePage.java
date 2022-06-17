package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage  extends PageObject {
    public static final Target INPUT_CITY =Target.the("CIUDAD").located(By.id("city"));
    public static final Target INPUT_ZIP =Target.the("zip").located(By.id("zip"));
    public static final Target INPUT_COUNTRY_1 =Target.the("Despegable ").located(By.className("caret pull-right"));
    public static final Target INPUT_COUNTRY =Target.the("Ciudad ").located(By.id("ui-select-choices-row-2-0"));
    public static final Target BUTTON_DEVICES = Target.the("paso 2 ").located(By.xpath("//*[contains(text(),'Next: Devices')]"));

}

