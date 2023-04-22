class Outer
{
    void test()
    {
        Inner ob=new Inner();
        ob.show();
    }
    void msg()
    {
        System.out.println("Hello from msg");
    }
    class Inner
    {
        void show()
        {
            System.out.println("hello from show");
            msg();

        }
    }

}
class Demo
{
    public static void main(String args[])
    {
        Outer obj=new Outer();
        obj.test();
    }
}