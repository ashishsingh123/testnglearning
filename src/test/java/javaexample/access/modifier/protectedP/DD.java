package javaexample.access.modifier.protectedP;



public class DD {
    protected  int i=1;
    protected void add()
    {

            System.out.println("Hello");

    }
}

class EE
{
    public static void main(String a[])
    {
        DD aa=new DD();

        System.out.println(aa.i);
       // aa.DD();
    }
}
