package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.SecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


public class SecondStep implements Task {
    private List<Utest_Data> data;
    public  SecondStep(List<Utest_Data> data){
        this.data=data;
    }


    public static SecondStep toRegister(List<Utest_Data> data){
        return Tasks.instrumented(SecondStep.class, data);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                SendKeys.of(Keys.ARROW_DOWN).into(SecondStepPage.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(SecondStepPage.INPUT_CITY),
                Enter.theValue(data.get(0).getStrZip()).into(ZIP)
                Click.on(SecondStepPage.SELECT_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY)
                Click.on(SecondStepPage.BUTTON_GO));
    }
}
