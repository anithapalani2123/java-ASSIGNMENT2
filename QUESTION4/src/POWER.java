import java.util.Scanner;
public class POWER{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=scan.nextInt();
        System.out.print("Enter the second number: ");
        int b=scan.nextInt();
        int result=recursion(a,b);
        System.out.println("Answer: "+result);

    }
    static int recursion(int a,int b)
    {

        if(b==0)
            return 1;
        else
            return a*(recursion(a,b-1));
    }
}