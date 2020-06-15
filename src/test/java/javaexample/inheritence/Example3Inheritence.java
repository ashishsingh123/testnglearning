package javaexample.inheritence;

class Example3{
    Example3()
    {

        System.out.println("Class Example3 Constructor");
    }

}
public class Example3Inheritence extends Example3{

    Example3Inheritence()
    {
        super();
        System.out.println("Class A Constructor");
    }
}
