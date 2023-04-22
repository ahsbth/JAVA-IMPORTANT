import java.util.*;
class Table
{
    public static void main(String args[])
    {
        int n,x,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  value of n=");
        n=sc.nextInt();
        x=1;
        while(x<=10)
        {
            t=n*x;
            System.out.println(t);
            x++;
        }
    }

}