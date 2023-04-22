import java.io.*;
class Factorial
{
    public static void main(String args[]) throws IOException
    {
        int n;
        long fact=1;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a value of n=");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("Factoraial="+fact);
    }
}