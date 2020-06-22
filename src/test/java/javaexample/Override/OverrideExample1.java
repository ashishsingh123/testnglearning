package javaexample.Override;

class SuperClass
{
    int i=5;
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}

class SubClass extends SuperClass
{
    int i=6;
    void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
}

 class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         //Output : From Super Class
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();          //Output : From Sub Class
        SuperClass sp=new SubClass();

        sp.methodOfSuperClass(); // To call Subclaa method
        System.out.println(sp.i);//To access Parent class variable
    }
}
