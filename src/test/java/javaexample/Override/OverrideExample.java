package javaexample.Override;

class SuperClass_2
{
     void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }

}

class SubClass_2 extends SuperClass_2
{


    public void methodOfSuperClass()
    {

        //Compile time error, can't reduce visibility of overrided method
        //here, visibility must be protected or public but not private or default
    }
}
