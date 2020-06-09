import java.util.Scanner;

public class PositiveNegativeZero
{

    public static void main(String[] args) {//create main method
        System.out.println("Please enter any number");//user input any number
        Scanner scanner = new Scanner(System.in);// create new object for Scanner class
        int x = scanner.nextInt();//declare variable
        int y;
        if (x > 0)
        {
            y=1;
        }
        else if(x<0){
            y=2;
        }
        else
            y=3;
        switch (y)
        {
            case 1:
                System.out.println("This number is positive"+x);
                break;
            case 2:
                System.out.println("This number is negative"+x);
                break;
            default:
                System.out.println("This number is Zero"+x);
        }

    } }


