package src.org.thecodevillage.intro;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 9/26/2017.
 */
public class Vehicle_main {

    public static void main(String[] args){

        List<Pupils> MyPupils = new ArrayList<>();
        int noOfPupils =0;
        Scanner  scanner= new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        noOfPupils =scanner.nextInt();


        // Variables

        int sumJv  =0;
        int sumPhp =0;
        int sumPyt =0;
        int avgJv  =0;
        int avgPhp =0;
        int avgPyt =0;
        String gradesJv ="";
        String gradesPhp="";
        String gradesPyt="";

        // End Of Variables


        //Beginning Of Loop

        for (int q =0; q < noOfPupils; q++)

        {



            Pupils Pupils = new Pupils();
            System.out.println("Enter Student Name"+(q+1));
            Pupils.setName(scanner.next());

            System.out.println("Enter Student  Registration No."+(q+1));
            Pupils.setRegno(scanner.next());

            System.out.println("Enter Student Date Of Birth."+(q+1));
            Pupils.setBirthDate(scanner.next());

            System.out.println("Enter Student Course"+(q+1));
            Pupils.setCourse(scanner.next());

            System.out.println("Enter Student Java Marks"+(q+1));
            Pupils.setJvMarks(scanner.nextInt());

            System.out.println("Enter Student Php Marks"+(q+1));
            Pupils.setPhMarks(scanner.nextInt());

            System.out.println("Enter Student Python Marks"+(q+1));
            Pupils.setPyMarks(scanner.nextInt());

            sumJv = PupilFunctions.add(Pupils.getJvMarks(),Pupils.getJvMarks(),Pupils.getJvMarks());
            sumPhp = PupilFunctions.add(Pupils.getPhMarks(),Pupils.getPhMarks(),Pupils.getPhMarks());
            sumPyt = PupilFunctions.add(Pupils.getPyMarks(),Pupils.getPyMarks(),Pupils.getPyMarks());

            avgJv  = PupilFunctions.avge(sumJv);
            avgPhp = PupilFunctions.avge(sumPhp);
            avgPyt = PupilFunctions.avge(sumPyt);

            gradesJv = VehicleFunction.grade(avgJv);
            gradesPhp = VehicleFunction.grade(avgPhp);
            gradesPyt = VehicleFunction.grade(avgPyt);

            MyPupils.add(Pupils);

        }
        System.out.println("Pupils Loop Output");
        System.out.println("Average Java Marks##"+avgJv);
        System.out.println("Average Php Marks##"+avgPhp);
        System.out.println("Average  Python Marks##"+avgPyt);
        System.out.println("Total Java Marks##"+sumJv);
        System.out.println("Total Php Marks##"+sumPhp);
        System.out.println("Total Python Marks##"+sumPyt);
        System.out.println("Java Grade##"+gradesJv);
        System.out.println("Php Grade##"+gradesPhp);
        System.out.println("Python Grade##"+gradesPyt);
        //System.out.println(MyPupils.size());
    }



}
