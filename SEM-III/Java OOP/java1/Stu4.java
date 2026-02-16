import java.util.*;
class Stu4
{
    int id,age;
    String name;
    Stu4(int id,String name,int age)
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
        Stu4 s1 = new Stu4(1,"Almas",18);
        Stu4 s2 = new Stu4(2,"Harsh",19);
        Stu4 s3 = new Stu4(3,"Nihar",19);
        Stu4 s4 = new Stu4(4,"Burhan",18);
        Stu4 s5 = new Stu4(5,"Nishant",19);

        Vector <Stu4> li = new Vector<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);

        for(Stu4 i:li)
        {
            i.Display();
        }
    }
}