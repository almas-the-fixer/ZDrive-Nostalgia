import java.util.*;
class Stu1
{
    int id,age;
    String name;
    Stu1(int id,String name,int age)
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
        Stu1 s1 = new Stu1(1,"Almas",18);
        Stu1 s2 = new Stu1(2,"Harsh",19);
        Stu1 s3 = new Stu1(3,"Nihar",19);
        Stu1 s4 = new Stu1(4,"Burhan",18);
        Stu1 s5 = new Stu1(5,"Nishant",19);

        ArrayList <Stu1> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);

        for(Stu1 i:li)
        {
            i.Display();
        }
    }
}