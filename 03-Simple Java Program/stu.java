import java.util.*;


public class stu 
{
    int rn,age;
    String name,fname;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll nuber: ");
        rn=sc.nextInt();
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter age: ");
        age=sc.nextInt();
        System.out.print("Enter father's name: ");
        fname=sc.next();          
    }
    void display()
    {
        System.out.println("Roll nuber: "+rn);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Father's name: "+fname);
    }
               
}


class student
{
   public static void main(String[] args) 
    {
        stu obj=new stu();
        obj.input();              
        obj.display();
    } 
}
