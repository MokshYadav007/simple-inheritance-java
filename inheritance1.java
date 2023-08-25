package Inheritance;

class papa 
{
   int age= 45;

}

class beta extends papa
{  
  void sleep()
  {
   System.out.println("the age is "+ age);
  }
  }

class beta2 extends beta
{
     
}
public class inheritance21
{ 
public static void main(String[] args)
  {
    beta2 b2= new beta2();
    b2.sleep(); 

}

}
