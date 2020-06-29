package javaexample.interfaceP;

interface MyInterface3{

    default void add(){
        System.out.println("Newly added default method1");
    }
    void existingMethod(String str);
}
interface MyInterface2{

    default void add(){
        System.out.println("Newly added default method2");
    }
    void disp(String str);
}
class Example2 implements MyInterface3, MyInterface2{
    // implementing abstract methods
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public void disp(String str){
        System.out.println("String is: "+str);
    }
    //Implementation of duplicate default method
    public void add(){
        System.out.println("Implementation of default method");
        MyInterface2.super.add();
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        MyInterface2 mp2=obj;
        //calling the default method of interface
        obj.add();
        
    }
}
