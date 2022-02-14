package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Register implements Task{
    private  List<Utest_Data>data;

    public Register(List<Utest_Data> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegisterPage.BUTTON_REGISTER));
    }
}
