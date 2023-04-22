import java.util.*;
class Sort
{
    public static void main(String args[])
    {
        int i,j,temp;
        int ar[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 values=");
        for(i=0;i<10;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Befor Decending order");
        for(i=0;i<10;i++)
        {
            System.out.println(ar[i]);
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(ar[i]>ar[j])
                {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                
                }
            }
        }
        System.out.println("After Decndimg order");
        for(i=0;i<10;i++)
        {
            System.out.println(ar[i]);
        }
    }


}