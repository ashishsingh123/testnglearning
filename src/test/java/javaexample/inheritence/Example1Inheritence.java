package javaexample.inheritence;

import javaexample.access.modifier.privateP.GG;

class Example1{
    int i=1;
    static int j=2;

        }

public class Example1Inheritence extends Example1{
     int i=1;
             static int j=2;
    public static void main(String a[])
    {
        Example1Inheritence aa=new Example1Inheritence();
        System.out.println(aa.i);

        System.out.println(Example1Inheritence.j);

    }
}
