package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.SecondStepPage;
import co.com.choucair.prueba.userinterface.ThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


public class ThirdStep implements Task {
    public static ThirdStep register() {return Tasks.instrumented(ThirdStep.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(ThirdStepPage.SELECT_DEVICE),
                Enter.theValue(data.get(0).getStrDevice()).into(DEVICE),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_DEVICE),
                Click.on(ThirdStepPage.SELECT_MODEL),
                Enter.theValue(data.get(0).getStrModelDevice()).into(MODELDEVICE),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_MODELDEVICE),
                Click.on(ThirdStepPage.SELECT_SYSTEM),
                Enter.theValue(data.get(0).getStrOsDevice()).into(OSDEVICE),
                SendKeys.of(Keys.ENTER).into(ThirdStepPage.INPUT_SYSTEM),
                Click.on(ThirdStepPage.BUTTON_GO));

    }
}
