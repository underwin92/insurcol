package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Ultimosapage extends PageObject {
    public static final Target INPUT_PASSWORD =Target.the("where do we write the Password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_REPEAT =Target.the("where do we write the Password REPEAT").located(By.id("confirmPassword"));
    public static final Target CHECK_1 =Target.the("1 CHECK").located(By.xpath("//*[contains(text(),'STAY INFORMED!')]")/*By.id("newsletterOptIn")*/);
    public static final Target CHECK_2 =Target.the("2 CHECK").located(By.id("termOfUse"));
    public static final Target CHECK_3 =Target.the("3 CHECK").located(By.id("privacySetting"));
    public static final Target BUTTON_FINAL = Target.the("FINAL").located(By.xpath("//*[contains(text(),'Complete Setup')]"));

}
