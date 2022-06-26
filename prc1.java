import java.io.*;
import java.net.*;
class data
{
    protected int a,b;
    public void read(int x,int y)
    {
        a=x;
        b=y;
    }
}
class sum extends data
{
    privtate int sum;
    public void add()
    {
        sum=a+b;
    }
    public void display()
    {
        system.out.println("sum="+sum);
    }
}
class main
{
    public static void main(string args[])
    {
        int x,y;
        scanner sc = new scanner(system.in);
        system.out.println("enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        Sum=x=new sum();
        s.read(x,y);
        s.add();
        s.display();
        
    }
}


