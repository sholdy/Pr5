import java.util.Scanner;

public class Task2
{
    public static void Check(int x, int k)
    {
        if (x == k)
        {
            System.out.print(x);
            return;
        }
        else if (x % k == 0)
        {
            System.out.print(k+" ");
            Check(x/k, k);
        }
        else if (x/2>k)
        {
            System.out.print(x);
            return;
        }
        else Check(x, k + 1);
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Введите число: ");
        int x=input.nextInt();
        System.out.println("Все простые множители данного числа с учётом кратности: ");
        Check(x, 2);
    }
}