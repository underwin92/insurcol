package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the(" button that show us the the form to login").located(By.xpath("//*[contains(text(),'Join Today')]"));
    public static final Target INPUT_USER = Target.the("where do we write the firstName").located(By.id("firstName"));
    public static final Target INPUT_PASSWORD =Target.the("where do we write the lastName").located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_MONTH =Target.the("where do we write the birthMonth").located(By.id("birthMonth"));
    public static final Target INPUT_BIRDDAY =Target.the("where do we write the birthDay").located(By.id("birthDay"));
    public static final Target INPUT_BIRDYEAR =Target.the("where do we write the birthYear").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//*[contains(text(),'Next: Location')]"));
}
