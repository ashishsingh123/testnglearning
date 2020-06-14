package javaexample.access.modifier.privateP;

class PrivateTest
{
    private int i;
    private String s;
    private void methodOfClassA()
    {
        //Private Method
        System.out.println(i);  //Private field can be used within class
        B b = new B();          //Private inner class can be used within class
    }

    private class B
    {
        //Private Inner Class
    }
}

class C extends PrivateTest
{
    void methodOfClassC()
    {
        //System.out.println(i);  Private member can not be inherited
        PrivateTest a = new PrivateTest();
       // System.out.println(a.i);     Private field can not be used outside the class
        //a.methodOfClassA();          Private method can not be used outside the class
        //A.B b = new A.B();           Private inner class can not be used outside the class
    }
}
