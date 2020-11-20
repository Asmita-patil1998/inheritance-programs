
class B
{
static int a=10;
       int b=11;
static void Disp()
{
System.out.println("static" +a);
//System.out.println("static" +b);//not acc
}
void Disp1()
{
System.out.println(" static" +a);
System.out.println("non static" +b);
}
}
public class A
{

       public static void main(String args[])
	
	{ 
		
	  B s1=new B();
          s1.Disp();
          s1.Disp1();		
	}

}
