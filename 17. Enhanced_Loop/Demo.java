
class Student{

    String name;
    int rollno;
    int marks;

}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Mano";
        s1.rollno = 01;
        s1.marks = 90;
    
        Student s2 = new Student();
        s2.name = "Subu";
        s2.rollno = 02;
        s2.marks = 92;

        Student markList[] = new Student[2];
        markList[0] = s1;
        markList[1] = s2;

        for (Student mark : markList) {
            System.out.println(mark.name + " " + mark.rollno + " " + mark.marks );

            // int this enhanced loop the array's value is assigned to variable mark one at a time
        }

    }
}
