package src.org.thecodevillage.intro;


import src.org.thecodevillage.common.Mydbcon;

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



            Pupils pupils = new Pupils();
            System.out.println("Enter Student Name"+(q+1));
            pupils.setName(scanner.next());

            System.out.println("Enter Student  Registration No."+(q+1));
            pupils.setRegno(scanner.next());

            System.out.println("Enter Student Date Of Birth."+(q+1));
            pupils.setBirthDate(scanner.next());

            System.out.println("Enter Student Course"+(q+1));
            pupils.setCourse(scanner.next());

            System.out.println("Enter Student Java Marks"+(q+1));
            pupils.setJvMarks(scanner.nextInt());

            System.out.println("Enter Student Php Marks"+(q+1));
            pupils.setPhMarks(scanner.nextInt());

            System.out.println("Enter Student Python Marks"+(q+1));
            pupils.setPyMarks(scanner.nextInt());

            sumJv = PupilFunctions.add(pupils.getJvMarks(),pupils.getJvMarks(),pupils.getJvMarks());
            sumPhp = PupilFunctions.add(pupils.getPhMarks(),pupils.getPhMarks(),pupils.getPhMarks());
            sumPyt = PupilFunctions.add(pupils.getPyMarks(),pupils.getPyMarks(),pupils.getPyMarks());

            avgJv  = PupilFunctions.avge(sumJv);
            avgPhp = PupilFunctions.avge(sumPhp);
            avgPyt = PupilFunctions.avge(sumPyt);

            gradesJv = VehicleFunction.grade(avgJv);
            gradesPhp = VehicleFunction.grade(avgPhp);
            gradesPyt = VehicleFunction.grade(avgPyt);

            Mydbcon.insertStudent(pupils);
            Mydbcon.viewStudent();
            MyPupils.add(pupils);

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
