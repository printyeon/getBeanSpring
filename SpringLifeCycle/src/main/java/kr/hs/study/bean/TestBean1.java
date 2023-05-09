package kr.hs.study.bean;

public class TestBean1 {
    TestBean1(){
        System.out.println("생성자");
    };
    public void init_method(){
        System.out.println("init_method");
    };

    public void destroy_method(){
        System.out.println("destroy_method");
    };
}
