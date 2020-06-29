package javaexample.exceptionP;

public class ExceptionHandling10
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};   //String array containing one null object

        for (int i = 0; i < s.length; i++)
        {
            try     //Outer try block
            {
                int a = s[i].length();    //This statement may throw NullPointerException

                try    //Inner try block
                {
                    a = Integer.parseInt(s[i]);    //This statement may throw NumberFormatException
                }
                catch (NumberFormatException ex)   //Inner catch block
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(NullPointerException ex)     //Outer catch block
            {
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}
