import java.util.*;
class Student
{
    int std_id,marks_1,marks_2,marks_3,total_marks;
    String name;

    Student(int id,String name,int marks_1,int marks_2,int marks_3)
    {
        this.std_id = id;
        this.name = name;
        this.marks_1 = marks_1;
        this.marks_2 = marks_2;
        this.marks_3 = marks_3;
        this.total_marks = marks_1 + marks_2 + marks_3;
    }

    void Display()
    {
        System.out.println("ID: "+std_id+"\n"+"Name: "+name+"\n"+"Marks in Subject 1: "+marks_1+"\n"+"Marks in Subject 2: "+marks_2+"\n"+"Marks in Subject 3: "+marks_3+"\n"+"Total Marks: "+total_marks+"\n");
    }

    public static void main(String args[])
    {
        Student s1 = new Student(1,"Almas",50,60,70);
        Student s2 = new Student(2,"Harsh",50,70,50);
        Student s3 = new Student(3,"Nihar",50,55,60);
        Student s4 = new Student(4,"Burhan",60,40,40);
        Student s5 = new Student(5,"Vishal",50,55,55);

        LinkedList <Student> li = new LinkedList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);

        for(Student i:li)
        {
            i.Display();
        }
    }
}