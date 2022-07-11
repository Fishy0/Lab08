import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            int year;
            int month;
            int day;
            int hours;
            int minutes;
            year = SafeInput.getRangedInt(in, "Enter the birth year (1950-2010): ", 1950, 2010);
            month = SafeInput.getRangedInt(in, "Enter the birth month (1-12): ", 1, 12);
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    day = SafeInput.getRangedInt(in, "Enter the birthday (1-31): ", 1, 31);
                    break;
                case 4: case 6: case 9: case 11:
                    day = SafeInput.getRangedInt(in, "Enter the birthday (1-30): ", 1, 30);
                    break;
                case 2:
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                        day = SafeInput.getRangedInt(in, "Enter the birthday (1-29): ", 1, 29);
                    }
                    else
                        day = SafeInput.getRangedInt(in, "Enter the birthday (1-28): ", 1, 28);
                    break;
                default:
                    day = -1;
                    break;
            }
            hours = SafeInput.getRangedInt(in, "Enter the birth hour (1-24): ", 1, 24);
            minutes = SafeInput.getRangedInt(in, "Enter the birth time (minutes, 1-59): ", 1, 59);


            System.out.println("\nYour birth time is: " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes);

        }
    }