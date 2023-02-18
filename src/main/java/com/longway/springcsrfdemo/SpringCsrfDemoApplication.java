package com.longway.springcsrfdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCsrfDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCsrfDemoApplication.class, args);
    }

}

class Main {
    public static void main(String ... args  ) {
        Sayable sayable = System.out::println;
        sayable.say("Salom");
    }
    @FunctionalInterface
    interface Sayable {
        void say(String word);
    }
}

