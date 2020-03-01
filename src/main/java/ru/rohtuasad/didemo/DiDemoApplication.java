package ru.rohtuasad.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.rohtuasad.didemo.controllers.ConstructorBasedController;
import ru.rohtuasad.didemo.controllers.DemoController;
import ru.rohtuasad.didemo.controllers.PropertyInjectedController;
import ru.rohtuasad.didemo.controllers.SetterInjectedController;
import ru.rohtuasad.didemo.propertiesexample.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        System.out.println(((DemoController)ctx.getBean("demoController")).hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorBasedController.class).sayHello());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());
    }
}
