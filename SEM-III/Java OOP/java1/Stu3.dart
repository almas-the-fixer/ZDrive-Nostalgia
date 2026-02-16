import java.util.*;
class Stu3
{
    int id,age;
    String name;
    Stu3(int id,String name,int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void Display()
    {
        System.out.println("ID: "+id+"\n"+"Name: "+name+"\n"+"Age: "+age+"\n");
    }
    public static void main(String args[])
    {
        Stu3 s1 = new Stu3(1,"Almas",18);
        Stu3 s2 = new Stu3(2,"Harsh",19);
        Stu3 s3 = new Stu3(3,"Nihar",19);
        Stu3 s4 = new Stu3(4,"Burhan",18);
        Stu3 s5 = new Stu3(5,"Nishant",19);

        Stack <Stu3> li = new Stack<>();
        li.push(s1);
        li.push(s2);
        li.push(s3);
        li.push(s4);
        li.push(s5);

        for(Stu3 i:li)
        {
            i.Display();
        }
    }
3