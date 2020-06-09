import java.util.Scanner;

public class NumberKeys
{
    public static void main(String[] args) //create main method
    {
        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter  any number from 0-9");//user input any num from 0-9
         int number=scanner.nextInt();//declare variable
        switch (number)//apply switch case condition
        {
            case 0:
                case 1:
                    case 2:
                        case 3:
                            case 4:
                                case 5:
                                    case 6:
                                        case 7:
                                            case 8:
                                                case 9:
                System.out.println("number is "+number);
                break;
                default:
                System.out.println("Not allowed");



        }
    }
}
