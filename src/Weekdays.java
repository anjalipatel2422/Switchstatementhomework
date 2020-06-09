import java.util.Scanner;

public class Weekdays
{

    public static void main(String[] args) { //create main method
        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter weekday number(1 to 7): ");//user any weekday number
        int weekday=scanner.nextInt();//declare variable
        switch (weekday)//apply switch case condition
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Except 1 to 7 invalid");
                break;
        }
        System.out.println("The day is" +weekday);
    }
}
