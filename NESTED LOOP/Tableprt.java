import java.util.*;
class Tableprt
{
    public static void main(String args[])
    {
        int i,n,x,t,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m=i;
            x=1;
            while(x<=10)
            {
                t=m*x;
                x++;
                System.out.println(t);
            }

        }
    }
}