package javaexample.interfaceP;

abstract interface InterfaceClass1
{
   public static final int i = 0;

}

class AnyClass7 implements InterfaceClass1
{
    void methodOne()
    {
        //Following statement gives compile time error.

   //   InterfaceClass.i = 10;

        //final field can not be re-assigned
    }
}