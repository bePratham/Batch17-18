package OOPs;

public class Main {
    public static void main(String[] args) {
        // int []rollno=new int[5];
        // String []name = new String[5];

        // rollno[0]=1;
        // name[0]="Prashant";

        // rollno[1]=2;
        // name[1]="Rohit";
        // System.out.println("Student 1 details : Roll no : "+rollno[0]+" and Name : "+name[0]);
        // System.out.println("Student 1 details : Roll no : "+rollno[1]+" and Name : "+name[1]);

        Student s1 = new Student();

        // System.out.println(s1.name);
        // System.out.println(s1.rollno);

        // s1.name = "Rakesh";
        // s1.rollno=12;

        // System.out.println(s1.name);
        // System.out.println(s1.rollno);

        Student s2 = new Student();
        
        // System.out.println(s2.name);
        // System.out.println(s2.rollno);
        

        Student dStudent=new Student();
        System.out.println(dStudent);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student{
    int rollno;
    String name;

    Student(String name, int rollno){
        this.name= name;
        this.rollno = rollno;
    }
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    Student(){
        this(12,"DEfault person");
    }
}

