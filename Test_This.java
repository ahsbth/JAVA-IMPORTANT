class Test_this
{ 
    int a;
    Test_this(int a)
    {
        this.a=a;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
       Test_this t=new Test_this(100);
       t.show(); 
    }
}