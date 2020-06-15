package javaexample.superP;

class SuperClass1
{
    int i;    //Field

    SuperClass1(int j)
    {
        System.out.println("Super Class Constructor");
    }

    void methodOfSuperClass()     //method
    {
        System.out.println("From method of super class");
    }
}

class SubClass extends SuperClass1
{
    SubClass()
    {
        super(10);
        //Calling statement to super class constructor
    }

    void methodOfSubClass()
    {
        System.out.println(super.i);  //super class field is accessed
        super.methodOfSuperClass();  // super class method is called
        System.out.println("From method of sub class");
    }

    public static void main(String a[])
    {
        new SubClass().methodOfSubClass();
    }
}