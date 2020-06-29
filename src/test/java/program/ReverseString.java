package program;

 class JavaExample {

    public static void main(String[] args) {
        String str = "Welcome to Beginnersbook";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        System.out.println(reverseString(str.substring(1)) + str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
