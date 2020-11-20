class First
{
      private int b;
        int a;
    
First()
{
}
public void setB(int b)
{
this.b=b;
}
public int getB()
{
return b;
}

First(int a)
{
this.a=a;
}
 public int getA()
 {
 return a;
  }
 
 public int meth(int a)
 {
	 System.out.println("meth="+a);
	return a; 
 }
}
public class Second
{
 public static void main(String args[])
{

 First s2=new First();
 s2.setB(5);
System.out.println("Constructor Defult="+s2.getB());



 First s1=new First(20);
 System.out.println("Constructor="+s1.getA());
 
 First m1=new First();
m1.meth(99);

 }
}
