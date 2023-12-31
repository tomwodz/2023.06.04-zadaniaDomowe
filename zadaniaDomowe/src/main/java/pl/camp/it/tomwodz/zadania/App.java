package pl.camp.it.tomwodz.zadania;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.it.tomwodz.zadania.configuration.AppConfiguration;

import pl.camp.it.tomwodz.zadania.core.ICore;


public class App {

    public static void main(String[] args) {
        ApplicationContext box =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        ICore core= box.getBean(ICore.class);
        core.start();
    }
}
