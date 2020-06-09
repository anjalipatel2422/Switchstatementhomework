import java.util.Scanner;

public class OddEven

{
    public static void main(String[] args)//create main method
    {
        System.out.println("Enter any number of your choice");//user first  input his/her choice no.
        Scanner scanner = new Scanner(System.in);//create new object for Scanner class
        int number = scanner.nextInt();//declare variable

        switch (number%2)//apply switch case condition
        {
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}
