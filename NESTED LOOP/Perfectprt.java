import java.util.*;
class Perfectprt
{
    public static void main(String args[])
    {
        int n,i,m,x,add,mn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           add=0;
           mn=i;
            m=i;
            x=1;
            while(x<=m/2)
            {
                if(m%x==0)
                {
                    add=add+x;
                }
                x++;
            }
            if(mn==add)
            {
                System.out.print(mn);
            }
        }
    }
}