import java.util.Scanner;

public class Task3
{
    public static String Check(String str, int begin, int end)
    {
        if(begin==end || begin>end)
        {
            return "Да";
        }
        else if (str.charAt(begin)==str.charAt(end))
        {
            return Check(str, begin+1, end-1);
        }
        else return "Нет";
    }

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("\nВведите слово: ");
        String str=input.nextLine();
        System.out.println("Данное слово является палиндромом? "+Check(str, 0, str.length()-1));
    }
}