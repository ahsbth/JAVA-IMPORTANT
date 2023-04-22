import java.util.*;
class Factorialprt
{
    public static void main(String args[])
    {
        int i,m,n;
        long fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a vlue of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {  
            fact=1;
            m=i;
            while(m>0)
            {
                fact=fact*m;
                m--;
            }
           
            System.out.println(fact);
        }

    }
}