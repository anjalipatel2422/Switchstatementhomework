import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)//Create main method
    {
        Scanner scanner=new Scanner(System.in);//create new object for Scanner class
        System.out.println("Enter any alphabet");//user input any alphabet
        char ch =scanner.next().charAt(0);//declare variable
        switch (ch)// apply switch condition

        {
            case 'A': case'E': case'I': case'O': case'U':
                System.out.println(ch+ " is vowel");
                break;
            case 'a': case'e': case'i': case'o': case'u':
                System.out.println(ch+  "is vowel");
                break;
            default:
                System.out.println(ch+ " is consonant");

        }


}}
