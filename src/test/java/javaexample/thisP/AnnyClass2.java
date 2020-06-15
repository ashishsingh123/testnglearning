package javaexample.thisP;

class SuperClassOne
{
    void methodOne()
    {
        System.out.println("From Super Class");
    }
}

class SubClassOne extends SuperClassOne
{
    public SubClassOne()
    {
        System.out.println("constructors");
        //super();
        //compile time error
        //super() calling statement must be first statement in constructor
    }
    void methodTwo()
    {
        //super();
        //this();
        //compile time error
        //you should call super() and this()
        //calling statements only in constructors.
    }
}