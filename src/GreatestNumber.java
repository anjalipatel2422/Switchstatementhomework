import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {//create main method
        Scanner scanner = new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter the first number");//user input first number
        int a = scanner.nextInt();
        System.out.println("Enter the second number");//user input second number
        int b = scanner.nextInt();
        System.out.println("Enter the third number");//user input third number
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is :" + a);
        } else if (b > c) {
            System.out.println("Largest number is : " + b);
        } else {
            System.out.println("Largest number is : " + c);
        }


    }


}

