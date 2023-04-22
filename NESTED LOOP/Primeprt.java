import java.util.*;
class Primeprt
{
    public static void main(String args[])
    {
        int i,n,m,x,add,mn;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n=");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {   
            mn=i+1;
            m=i;
            add=0;
            x=1;
            while(x<=m)
            {
                if(m%x==0)
                {
                    add=add+x;
                }
                x++;
            }
            if(mn==add)
            {
                System.out.print(m);
            }
        }
    }
}