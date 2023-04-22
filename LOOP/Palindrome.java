import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int n,r,rev=0,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        m=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(m==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}