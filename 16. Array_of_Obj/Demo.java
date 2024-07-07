
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
    
        Student s3 = new Student();
        s3.name = "Sathy";
        s3.rollno = 03;
        s3.marks = 95;

        Student marklist[] = new Student[3];
        marklist[0] = s1;
        marklist[1] = s2;
        marklist[2] = s3;

        for (int i = 0; i < marklist.length; i++) {
            System.out.println(marklist[i].name + " " + marklist[i].marks);
        }
    }  
}