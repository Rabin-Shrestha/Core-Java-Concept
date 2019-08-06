package main.coreJava;

public interface Interface1 {
    void method1();
}
  interface  Interface2
{
    void method2();
}

interface  Interface3 extends  Interface1, Interface2
{
    void method3();
}

class TestMultipleInterface implements Interface3
{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}