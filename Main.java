import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("TItle: \n");

        // random variables
        int num = 10;
        String text = "Java is really boring";
        double dec = 5.75;
    
        // jhon

        System.out.println("Num: " + num);
        System.out.println("Text: " + text);
        System.out.println("Decimal: " + dec);

        if (num > 5) {
            System.out.println("num is greater than 5");
        } else {
            System.out.println("num is 5 or less");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Loops: " + (i+ 1));
        }
        // call method?
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        greetUser(name);
        scanner.close();
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}