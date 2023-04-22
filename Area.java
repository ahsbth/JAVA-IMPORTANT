class Rectangle extends Thread
{
    int l,b;
    Scanner sc=new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter lenght and breadth of rectangle=");
        l=sc.nextInt();
        b=sc.nextInt();
        float a=l*b;
        System.out.println("Area of Rectangle="+a);
    }
}
class Triangle extends Thread
{
    float b,h;
    Scanner sc=new Scanner(System.in);
    public void run()
    {
        System.out.println("Enter value base and height=");
        b=sc.nextFloat();
        h=sc.nextFloat();
        double a=0.5*b*h;
        System.out.println("Area of Triangle="+a);

    }

}
class Area
{
public static void main(String args[])
{
    Rectangle r=new Rectangle();
    Triangle t=new Triangle();
    r.start();
    t.start();
    r.run();
    t.run();
}
}