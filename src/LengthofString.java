import java.util.Scanner;

public class LengthofString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value");
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int length=0;

        for (char o:ch)
        {
            length++;
        }

        System.out.println("Length of "+str+" : "+length);
    }
}
