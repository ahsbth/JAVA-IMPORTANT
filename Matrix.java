import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        int mat[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for 2*3 matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println();
        }
    }
}