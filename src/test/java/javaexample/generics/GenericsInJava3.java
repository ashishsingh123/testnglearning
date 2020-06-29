package javaexample.generics;

class GenericClass4
{
    //Declaring T as bounded type to Number class

    public static <T extends Number> void printNumbers(T[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }
}

public class GenericsInJava3
{
    public static void main(String[] args)
    {
        //Passing Integer[] array while calling printNumbers()

        GenericClass4.printNumbers(new Integer[] {new Integer(10), new Integer(20), new Integer(30), new Integer(40)} );

        //Passing Double[] array while calling printNumbers()

        GenericClass4.printNumbers(new Double[] {new Double(21.45), new Double(20.45), new Double(34.87), new Double(48.36)} );

        //Passing String[] array while calling printNumbers(), it gives compile time error

        //GenericClass.printNumbers(new String[] {"one", "Two", "Three", "Four"});    //Compile time error
    }
}
