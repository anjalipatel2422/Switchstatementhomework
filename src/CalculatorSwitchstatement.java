import java.util.Scanner;

public class CalculatorSwitchstatement
{
    public static void main(String[] args)//create main method
    {
        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter first number");//user input first number
        int num1=scanner.nextInt();
        System.out.println("Enter second number");//user input second number
        int num2=scanner.nextInt();
        System.out.println("Enter any operator(+,-,*,/)");//user input any operator
        char operator=scanner.next().charAt(0);
        double result;
        switch (operator)//apply switch case condition
        {
            case '+':
                result=num1+num2;
                break;
            case'-':
                result=num1-num2;
                break;
            case'*':
                result=num1*num2;
                break;
            case'/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid! operator is wrong");
                return;

        }
       System.out.println(num1+""+operator+" "+num2+":"+result);
    }
}
