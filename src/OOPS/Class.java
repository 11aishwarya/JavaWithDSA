package OOPS;

public class Class {
    // Basic concept of class and object and how to use object with the reference of class
    //about constructor
    public static void main(String[] args) {


        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];

        Student kunal = new Student();

        kunal.greeting();

        Student random2 = new Student();

        Student one = new Student();
        Student two = one;

        one.name = "Something Something";
        System.out.println(two.name);

        System.out.println(kunal.rollno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}
class Student{
    int rollno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is " +this.name);
    }
    Student(){
//        this.rollno = 13;
//        this.name = "Aish";
//        this.marks = 88.5f;
        // this is how you call a constructor from another constructor
        // internally this like : new Student()
        this(13,"default person",90.0f);
    }
    Student(int rno,String name , float marks){
        this.rollno = rno;
        this.name = name;
        this.marks = marks;
    }
}


