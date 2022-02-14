package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.FirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class Answer implements Question<boolean> {
    private List<Utest_Data> data):

    public Answer  toThe(List<Utest_Data> data){
    this.data=data;
    }
    public static Answer toThe(List<Utest_Data> data){
    return new Answer(data);
    }
    @Override
    public Boolean answeredBy(Actor){
    String text_button_end = Text.of(FourthStep.BUTTON:SETUP).viewedBy(actor).asString();
    return data.get(0).getstrEndText().equals(text_button_end);
    }
}
