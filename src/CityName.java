import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)//create main method
    {
        System.out.print("Please enter any first alphabet ");//use enter the input
        Scanner scanner=new Scanner(System.in);//create object for Scanner class
        char first=scanner.next().charAt(0);
        switch (first)//apply if else condition
        {
            case 'A':
                System.out.println("Anand");
                break;
            case'B':
                System.out.println("Baroda");
                break;
            case'C':
                System.out.println("Chennai");
                break;
            case'D':
                System.out.println("Dakor");
                break;
            case'E':
                System.out.println("Etah");
                break;
            case'F':
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Except AtoF invalid");


        }


    }
}
