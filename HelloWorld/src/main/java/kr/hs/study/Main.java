package kr.hs.study;

import kr.hs.study.HelloWorld.HelloWorld;
import kr.hs.study.HelloWorld.HelloWorldEn;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        HelloWorld h1 = ctx.getBean("he", HelloWorld.class);
        callMethod(h1);
        ctx.close();
    }

    static void callMethod(HelloWorld h1){
        h1.sayHello();

    }
}