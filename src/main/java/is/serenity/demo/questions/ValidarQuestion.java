package is.serenity.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarQuestion implements Question<Boolean> {

    private final String Dashboard;

    public ValidarQuestion(String dashboard) {
        Dashboard = dashboard;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
