import java.util.Locale;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name...??");
        String name = scan.next();
        System.out.println("Hello " + name.toUpperCase() + ", Have a Good Day...!!");

        System.out.println("Please enter any number from 1 to 7 to find a Day:");
        System.out.println(scan.hasNextInt());
        int num = scan.nextInt();

        switch (num){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}
