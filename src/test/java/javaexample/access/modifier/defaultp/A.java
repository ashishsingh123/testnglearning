package javaexample.access.modifier.defaultp;

 class A {
    int i;

    void add()
    {
        System.out.println("Hello");
    }
}
class B
{
    public static void main(String a[])
    {
        A aa=new A();
        System.out.println(aa.i);
        aa.add();
    }
}
