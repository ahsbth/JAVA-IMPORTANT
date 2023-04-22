import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        int n,x,add,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n=");
        n=sc.nextInt();
        m=n;
        add=0;
        x=1;
        while(x<=n/2)
        {
            if(n%x==0)
            {
                add=add+x;
            }
            x++;
        }
        if(add==n)
        {
            System.out.println("Perfect no");
        }
        else
        {
            System.out.println("not perfect no");
        }

    }
}