package src.org.thecodevillage.common;

import java.util.Scanner;

/**
 * Created by Administrator on 9/19/2017.
 */
public class Student_main {

    public static void main(String[] args) {

        String one = "";
        String two = "";

        int java_marks=0;
        int php_marks=0;
        int css_marks=0;

        int a = 0;
        int b = 0;
        int sum = 0;
        int percentage = 0;
        char grade;


        Scanner scanner = new Scanner(System.in);

        Student1 studentDetails = new Student1();

        System.out.println("Enter Student Name");
        studentDetails.setName(scanner.nextLine());

        System.out.println("Enter Student Registration No");
        studentDetails.setRegno(scanner.nextLine());

        System.out.println("Enter Student Date Of Birth");
        studentDetails.setDateOfBirth(scanner.nextLine());


        System.out.println("Enter Student Course");
        studentDetails.setCourse(scanner.nextLine());

        System.out.println("Enter Java Marks");
        studentDetails.setJava_marks(scanner.nextInt());

        System.out.println("Enter Php Marks");
        studentDetails.setPhp_marks(scanner.nextInt());

        System.out.println("Enter Python Marks");
        studentDetails.setCss_marks(scanner.nextInt());

        sum = Studentfunction.add(studentDetails.getJava_marks(),studentDetails.getPhp_marks(),studentDetails.getCss_marks());
        percentage = Studentfunction.average(sum);


        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70 && percentage < 80) {
            grade = 'B';
        } else if ( percentage >= 50 && percentage < 60) {
            grade = 'C';
        } else if (percentage >= 40 && percentage < 50 ) {
            grade = 'D';
        } else {
            grade = 'E';
        }


        System.out.println("Student Output");
        System.out.println("name:"+studentDetails.getName());
        System.out.println("regno:"+studentDetails.getRegno());
        System.out.println("dateOfBirth:"+studentDetails.getDateOfBirth());
        System.out.println("course:"+studentDetails.getCourse());
        System.out.println("java_marks:"+studentDetails.getJava_marks());
        System.out.println("php_marks:"+studentDetails.getJava_marks());
        System.out.println("css_marks:"+studentDetails.getCss_marks());
        System.out.println("Sum##"+sum);
        System.out.println("grade:"+grade);







    }

    public static int sum(int java_marks,int php_marks,int css_marks){
        return java_marks+css_marks+php_marks;
    }
}
