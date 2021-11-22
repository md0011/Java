import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("\"Calculator\"");

        float num_1, num_2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a first number:");
        num_1 = scan.nextFloat();

        System.out.println("Enter a second number:");
        num_2 = scan.nextFloat();

        String prompt = "\nEnter 0 for Addition\n" +
                "Enter 1 for Subtraction\n" +
                "Enter 2 for Multiplication\n" +
                "Enter 3 for Division\n";
        System.out.print(prompt);

        int input = scan.nextInt();

        switch (input){
            case 0:
                System.out.println("Adding " + num_1 + " and " + num_2);
                System.out.println("The result is:");
                System.out.println(num_1 + num_2);
                break;

            case 1:
                System.out.println("Subtracting " + num_2 + " from " + num_1);
                System.out.println("The result is:");
                System.out.println(num_1 - num_2);
                break;

            case 2:
                System.out.println("Multiplying " + num_1 + " and " + num_2);
                System.out.println("The result is:");
                System.out.println(num_1 * num_2);
                break;

            case 3:
                System.out.println("Dividing " + num_1 + " by " + num_2);
                System.out.println("The result is:");
                System.out.println(num_1 / num_2);
                break;

            default:
                System.out.println("Invalid Input...");
        }
    }
}
