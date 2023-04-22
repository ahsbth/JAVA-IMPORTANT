import java.util.*;
class Palindromeprt
{
    public static void main(String args[])
    {
        int i,n,m,mn,r,rv;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {  
            mn=i;
            m=i;
            rv=0;
            while(m>0)
            {
                r=m%10;
                rv=rv*10+r;
                m=m/10;
            }
            if(mn==rv)
            {
                System.out.println(rv);
            }
        }
    }
}