package kr.hs.study.bean;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("Testbean1의 기본생성자");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = "spring0";
    }

    public TestBean1(int data1){
        System.out.println("Testbean1의 int data1");
        this.data1 = data1;
        this.data2 = 1.1;
        this.data3 = "spring1";
    }

    public TestBean1(double data2){
        System.out.println("Testbean1의 int data2");
        this.data1 = 2;
        this.data2 = data2;
        this.data3 = "spring3";
    }

    public TestBean1(String data3){
        System.out.println("Testbean1의 int data3");
        this.data1 = 3;
        this.data2 = 3.3;
        this.data3 = data3;
    }

    // TestBean1 t2 = new TesBean(1234);
    public void prData(){
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
        System.out.println("====================================");
    }

}

