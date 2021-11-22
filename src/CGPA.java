import java.util.Scanner;


public class CGPA {

    //This function returns mark if it is not above 100
    public static float getMarks(String sub){
        Scanner scan1 = new Scanner(System.in);
        System.out.println(sub);
        float num1 = scan1.nextFloat();
        if (num1 > 100){
            System.out.println("Error");
            System.exit(1);
        }
        return num1;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name...??");
        String name = scan.nextLine();
        System.out.println("Hello " + name.toUpperCase() + ",");
        System.out.println("Enter your marks out of 100 :-");

        String subjects[] = {"Java", "Software Engineering", "Mobile Application Development", "Python", "C++"};
        float result = 0;
        for (String sub : subjects) {
            result += getMarks(sub);
        }
        result /= 50;
        System.out.print("CGPA is: " + result);

    }
}
