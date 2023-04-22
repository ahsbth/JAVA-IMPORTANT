import java.util.*;
 class Prime
   {
       public static void main(String args[])
       {
           int n,x,add,m;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a no =");
           n=sc.nextInt();
           m=n+1;
           add=0;
           x=1;
           while(x<=n)
           {
               if(n%x==0)
               {
                   add=add+x;
               }
               x++;
           }
           if(add==m)
           {
               System.out.println("prime no");
           }
           else
           {
               System.out.println("not prime");
           }
        
       }
   }