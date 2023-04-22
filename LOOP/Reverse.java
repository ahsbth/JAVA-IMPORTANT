import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        int n,r,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse="+rev);

    }
}