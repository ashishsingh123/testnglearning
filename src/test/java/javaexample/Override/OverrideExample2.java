package javaexample.Override;

class SuperClass_1
{
    void firstMethodOfSuperClass()
    {
        System.out.println("From Super Class");
    }

    double secondMethodOfSuperClass()
    {
        return 0.0;
    }

    Object thirdMethodOfSuperClass()
    {
        return new Object();
    }
}

class SubClass_1 extends SuperClass_1
{
   /* int firstMethodOfSuperClass()
    {
        //Compile time error, return type must be void not int
    }

    void secondMethodOfSuperClass()
    {
        //Complie time error, return type must be double not void
    }*/

    Integer thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return 6;
    }
}
