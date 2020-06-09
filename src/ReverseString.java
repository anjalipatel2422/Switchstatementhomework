import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {//create main method
        String input="Apple for Apple";
        StringBuilder input1=new StringBuilder();//create new object
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);

    }
}
