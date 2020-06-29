package javaexample.generics;

class GenericClass3<T extends Number>    //Declaring Number class as upper bound of T
{
    T t;

    public GenericClass3(T t)
    {
        this.t = t;
        System.out.println(t);
    }

    public T getT()
    {
        return t;
    }
}
class GenericsInJava1
{
    public static void main(String[] args)
    {
        //Creating object by passing Number as a type parameter

        GenericClass3<Number> gen1 = new GenericClass3<Number>(123);

        //Creating object by passing Integer as a type parameter

        GenericClass3<Integer> gen2 = new GenericClass3<Integer>(new Integer(456));

        //Creating object by passing Double as a type parameter

        GenericClass3<Double> gen3 = new GenericClass3<Double>(new Double(23.589));

        //Creating object by passing Long as a type parameter

        GenericClass3<Long> gen4 = new GenericClass3<Long>(new Long(12));

        //While Creating object by passing String as a type parameter, it gives compile time error

       // GenericClass3<String> gen5 = new GenericClass3<String>("I am string");   //Compile time error
    }
}
