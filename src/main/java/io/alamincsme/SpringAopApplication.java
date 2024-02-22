package io.alamincsme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);
        AopClass aopClass = context.getBean(AopClass.class);
        aopClass.hello();
        aopClass.printSomething("Mohammad Alamin");
        System.out.println(aopClass.sum(10,20));

        AnotherClass anotherClass = context.getBean(AnotherClass.class);
        System.out.println(anotherClass.anotherMethod(10));

       //learning success.

    }

}
