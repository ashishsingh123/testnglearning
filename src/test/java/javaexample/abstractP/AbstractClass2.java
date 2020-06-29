package javaexample.abstractP;

abstract class AbstractClass2
{
    abstract void abstractMethodOne();  //Abstract Method

    abstract void abstractMethodTwo();  //Abstract Method
    AbstractClass2(){
    super();
    }
}

class ConcreteClass1 extends AbstractClass2
{
    ConcreteClass1()
    {
        super();
    }
    void abstractMethodOne()
    {
        //abstractMethodOne() is implemented
    }

    //This class must implement second abstract method also,
    //otherwise, this class has to be declared as abstract

    void abstractMethodTwo()
    {
        //abstractMethodTwo() is also implemented.
        //No need to declare this class as abstract
    }
    public static void main(String a[])
    {
        ConcreteClass1 cs=new ConcreteClass1();
    }
}
