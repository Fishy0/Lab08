import java.util.Scanner;
public class FavNumbers
{
     public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            double favDouble;
            int favInt;
            favDouble = SafeInput.getDouble(in, "Enter your favorite double");
            favInt = SafeInput.getInt(in, "Enter your favorite int");
            System.out.println("\nYour favorite double is: " + favDouble);
            System.out.println("\nYour favorite integer is: " + favInt);
        }
}
