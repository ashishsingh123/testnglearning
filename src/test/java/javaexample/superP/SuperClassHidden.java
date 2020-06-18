package javaexample.superP;

class AA{
    int  i=5;
    AA(int i){
        this.i=i;
    }
    AA()
    {

    }
}
public class SuperClassHidden extends AA {

    public static void main(String a[])
    {
       new AA(7);

    }
}
