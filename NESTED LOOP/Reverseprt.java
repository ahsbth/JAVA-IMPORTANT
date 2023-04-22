import java.util.*;
class Reverseprt
{
    public static void main(String args[])
    {
        int i,r,rv,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m=i;
            rv=0;
            while(m>0)
            {
                r=m%10;
                rv=rv*10+r;
                m=m/10;
            }
            System.out.println(rv);
        }
    }
}