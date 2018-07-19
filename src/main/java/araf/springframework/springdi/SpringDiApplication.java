package araf.springframework.springdi;

import araf.springframework.springdi.controller.ConstructorInjectedController;
import araf.springframework.springdi.controller.GetterInjectedController;
import araf.springframework.springdi.controller.HomeController;
import araf.springframework.springdi.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        HomeController homeController = (HomeController) ctx.getBean("homeController");

        System.out.println(homeController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }


}
