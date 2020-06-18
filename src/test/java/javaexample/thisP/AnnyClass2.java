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
        //super();
        this(6);
        System.out.println("constructors");
        //super();
        //compile time error
        //super() calling statement must be first statement in constructor
    }
    public SubClassOne(int n)
    {
        //super();
        //this();
        System.out.println("constructors");
        //super();
        //compile time error
        //super() calling statement must be first statement in constructor
    }
    void methodTwo()
    {
        //super();
       // this();
        //compile time error
        //you should call super() and this()
        //calling statements only in constructors.
    }
}