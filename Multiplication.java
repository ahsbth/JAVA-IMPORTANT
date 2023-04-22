import java.util.*;
class Multiplication
{
    public static void main(String args[])
    {
        int mat1[][]=new int[2][3];
        int mat2[][]=new int[2][3];
        int mat3[][]=new int[2][3];
        int i,j,k,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for first 2*3 matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter value for Second 2*3 matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat1[i][j]);
            }
            System.out.println();
        }
         System.out.println("Second Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat2[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                sum=0;
                for(k=0;k<j;k++)
                {
                    sum=sum+mat1[i][k]*mat2[k][j];
                }
                mat3[i][j]=sum;
            }
        }
        System.out.println("Multiplication");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat3[i][j]);
            }
            System.out.println();
        }

    }
}