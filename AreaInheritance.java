package Inheritance;
import java.util.Scanner;

abstract class shape
{
    float radius;
    float length;
    float breadth;
    float area;
    Scanner sc= new Scanner(System.in);
    abstract public void input();
    abstract public void calculation();
    public void disp()
    {
        System.out.println("The area is "+ area);
    }
}

class Rectangle extends shape
{
    public void input()
    {
        System.out.println("The calculation of area for different shapes is below: ");
        System.out.println("The length of rectangle is : ");
        length = sc.nextFloat();
        System.out.println("The breadth of rectangle is : ");
        breadth = sc.nextFloat();
    }
    public void calculation()
    {
        area = length*breadth;
    }
}

class Square extends shape
{
    public void input()
    {
        System.out.println("The length of square is : ");
        length = sc.nextFloat();
    }
    public void calculation()
    {
        area = length*length;
    }


}

class Circle extends shape
{
    public void input()
    {
        System.out.println("The radius of circle is : ");
        radius = sc.nextFloat();
    }
    public void calculation()
    {
        area = 3.14f * radius * radius;
    }
}

class new2
{
    public void poly(shape ref)
    {
        ref.input();
        ref.calculation();
        ref.disp();
    }

}
public class AreaInheritance {
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle ci = new Circle();
        new2 n = new new2();
        n.poly(rec);
        n.poly(sq);
        n.poly(ci);
    }
}
