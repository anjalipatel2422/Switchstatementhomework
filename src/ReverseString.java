import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        String input="Apple for Apple";
        StringBuilder input1=new StringBuilder();
        input1.append(input);
        input1=input1.reverse();
        System.out.println(input1);

    }
}
