package io.alamincsme;

import org.springframework.stereotype.Component;

@Component
public class AopClass {
    public void hello() {
        System.out.println("Hello World");
    }

    public void printSomething(String message) {
        System.out.println(message);
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
