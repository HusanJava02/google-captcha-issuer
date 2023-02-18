package com.longway.springcsrfdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

class SpringCsrfDemoApplicationTests {

    @Test
    void contextLoads() {

        Random random = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }
    }

    @Test
    void test2() {
        Sayable sayable = System.out::println;
        sayable.say("Salom");
    }
    @FunctionalInterface
    interface Sayable {
        public void say(String word);
    }

}
