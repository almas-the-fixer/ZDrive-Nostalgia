import java.util.*;
class Stu2
{
    int id,age;
    String name;
    Stu2(int id,String name,int age)
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
        Stu2 s1 = new Stu2(1,"Almas",18);
        Stu2 s2 = new Stu2(2,"Harsh",19);
        Stu2 s3 = new Stu2(3,"Nihar",19);
        Stu2 s4 = new Stu2(4,"Burhan",18);
        Stu2 s5 = new Stu2(5,"Nishant",19);

        LinkedList <Stu2> li = new LinkedList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);

        for(Stu2 i:li)
        {
            i.Display();
        }
    }
}