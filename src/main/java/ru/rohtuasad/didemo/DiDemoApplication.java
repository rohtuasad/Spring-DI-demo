package ru.rohtuasad.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.rohtuasad.didemo.controllers.DemoController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        DemoController controller = (DemoController)ctx.getBean("demoController");
        System.out.println(controller.hello());
    }
}
