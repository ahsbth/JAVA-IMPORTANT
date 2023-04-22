import java.util.*;
class Display
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter value 10 values=");
        for(i=0;i<10;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("10 values are");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
       
    }
}