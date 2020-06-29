package javaexample.abstractP;

abstract class AbstractClass1
{
    void methodOne()
    {
        //Concrete Method
    }

    void methodTwo()
    {
        //Concrete Method
    }
}

 class Abstraction1
{
    public static void main(String[] args)
    {
       // AbstractClass1 a = new AbstractClass1();  //Compile time error
        //You can't create objects to AbstractClass
        //even though it does not contain any abstract methods.
    }
}
