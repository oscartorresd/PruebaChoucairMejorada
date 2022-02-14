package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class FirstStep implements Task {
    public static FirstStep registerUser(){
        return Tasks.instrumented(FirstStep.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrName()).into(NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LASTNAME)
                Enter.theValue(data.get(0).getStreEmail()).into(EMAIL)
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BIRTHMONTH)
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(BIRTHDAY)
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BIRTHYEAR)
                Enter.theValue(data.get(0).getStrLanguage()).into(LANGUAGE)
                SendKeys.of(Keys.ENTER).into(FirstStepPage.INPUT_LANGUAGES),
                Click.on(FirstStepPage.BUTTON_GO));


    }
}
