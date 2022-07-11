import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        String UCID = "";
        UCID = SafeInput.getRegExString(in, "Enter a UC ID", "(M|m)\\d{5}");
        System.out.println("Your UCID M number is " + UCID.substring(1));

        String OoSsVvQq = "";
        OoSsVvQq = SafeInput.getRegExString(in, "Enter a choice: Open, Save, View, or Quit (O/S/V/Q)", "[OoSsVvQq]");
        String choice;
        if (OoSsVvQq.equalsIgnoreCase("O")){
            choice = "Open";
        }
        else if (OoSsVvQq.equalsIgnoreCase("S")){
            choice = "Save";
        }
        else if (OoSsVvQq.equalsIgnoreCase("V")){
            choice = "View";
        }
        else{
            choice = "Quit";
        }

            System.out.println("Your menu choice is: " + choice);
    }
}
