/*
1.3.1 Write a program that takes three integer command-line arguments and
prints equal if all three are equal, and not equal otherwise.
 */

public class Equals3 {

    public static void main(String[] args)

    {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

     if (a == b && b == c && a == c)
         System.out.println("true");
     else
         {
         System.out.println("false");
         }
    }
}
