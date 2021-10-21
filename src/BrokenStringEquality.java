
import java.util.Scanner;

public class BrokenStringEquality
{
    public static void main(String[] args)
    {
        String s1, s2;
		
        System.out.println("Enter two lines of text:");
        Scanner keyboard = new Scanner(System.in);
        s1 = keyboard.nextLine( );
        s2 = keyboard.nextLine( );
		
	// this comparison is BROKEN!		
        if (s1==s2)
            System.out.println("The two lines are equal.");
        else
            System.out.println("The two lines are not equal.");
     }
}



