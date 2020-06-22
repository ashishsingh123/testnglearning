package javaexample.Override;

class SuperClass_3
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}

class SubClass_3 extends SuperClass_3
{
    //This class will have two methodOfSuperClass() methods.
    //one is from super class which takes no argument
    //and one is below method which takes one argument
    void methodOfSuperClass(int i)
    {
        System.out.println(i);
    }
}

 class MethodOverloading
{
    public static void main(String[] args)
    {
        SuperClass_3 superclass = new SuperClass_3();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass_3 subclass = new SubClass_3();
        subclass.methodOfSuperClass();          //Output : From Super Class
        subclass.methodOfSuperClass(10);       // Output : 10
    }
}

