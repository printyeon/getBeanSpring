package kr.hs.study;

import kr.hs.study.bean.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("method", TestBean1.class);

        //System.out.print("init : ");
        //t1.init_method();

        //System.out.print("destroy : ");
        //t1.destroy_method();

        ctx.close();
    }

}