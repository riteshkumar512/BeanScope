package in.kumar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        OrderService order=context.getBean(OrderService.class);
        OrderService order1=context.getBean(OrderService.class);
        System.out.println(order == order1);
    }

}