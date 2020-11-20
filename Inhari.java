class A
{
int a=15;
void disp1()
{
System.out.println("in A method"+a);
}
A(int a)
{
this.a=a;
System.out.println("in A constructor"+a);
}
}
class B extends A

{
int b=20;
void disp2()
{
System.out.println("in B method"+b);
}
B(int b)
{
super(10);
this.b=b;
System.out.println("in B constructor"+b);
}
}
class C extends A
{
int c=30;
void disp2()
{
System.out.println("in B method"+c);
}
C(int c)
{
super(10);
this.c=c;
System.out.println("in B constructor"+c);
}
}
public class Inhari
{
public static void main(String args[])
{
	B b1=new B(12);
        C b2=new C(100);
}
}