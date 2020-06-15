package javaexample.inheritence;


class Example2 extends java.lang.Object{
    Example2(int n)
    {
        System.out.println("Class A Constructor");
    }



}

public class Example2Inheritence extends Example2{


    Example2Inheritence()
    {
        super(5);
    }
}
