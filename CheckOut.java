import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0;
        boolean finished = false;
        do{

            total += SafeInput.getRangedDouble(in, "Enter the price of the item: ", .50, 10.00);
            if(SafeInput.getYNConfirm(in, "Do you want to continue Y/N?")){
                finished = false;
            }
            else{
                finished = true;
            }


        }while(!finished);

        System.out.println("Your total is: " + total);


    }
}
