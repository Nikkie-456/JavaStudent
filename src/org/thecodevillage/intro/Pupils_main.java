package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.Student1;
import src.org.thecodevillage.common.Studentfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 9/24/2017.
 */
public class Pupils_main {

    public static void main (String [] args) {

        String one = "";
        String two = "";

        int JvMarks=0;
        int PhMarks=0;
        int PyMarks=0;

        int a = 0;
        int b = 0;

        int sum = 0;
        int sum_1 =0;
        int sum_2 =0;
        int sum_3 =0;

        int avg =0;
        int avg_1 =0;
        int avg_2 =0;
        int avg_3 =0;


        int avgJv =0;
        int avgPh =0;
        int avgPy =0;

        int totJvMarks =0;
        int totPhMarks =0;
        int totPyMarks =0;




        Scanner scanner = new Scanner(System.in);

        //First Pupil

        Pupils Pupil1 = new Pupils();

        System.out.println("Enter Student Name");
        Pupil1.setName(scanner.nextLine());

        System.out.println("Enter Student Registration No");
        Pupil1.setRegno(scanner.nextLine());

        System.out.println("Enter Student Date Of Birth");
        Pupil1.setBirthDate(scanner.nextLine());


        System.out.println("Enter Student Course");
        Pupil1.setCourse(scanner.nextLine());

        System.out.println("Enter Java Marks");
        Pupil1.setJvMarks(scanner.nextInt());

        System.out.println("Enter Php Marks");
        Pupil1.setPhMarks(scanner.nextInt());

        System.out.println("Enter Python Marks");
        Pupil1.setPyMarks(scanner.nextInt());

        sum = PupilFunctions.add(Pupil1.getJvMarks(),Pupil1.getPhMarks(),Pupil1.getPyMarks());
        avg = PupilFunctions.avge(sum);

        //Second Pupil

        Scanner scanner2 = new Scanner(System.in);

        Pupils Pupil2 = new Pupils();

        System.out.println("Enter Second Student Name");
        Pupil2.setName(scanner2.nextLine());

        System.out.println("Enter Second Student Registration No");
        Pupil2.setRegno(scanner2.nextLine());

        System.out.println("Enter Second Student Date Of Birth");
        Pupil2.setBirthDate(scanner2.nextLine());


        System.out.println("Enter Second Student Course");
        Pupil2.setCourse(scanner2.nextLine());

        System.out.println("Enter Second Java Marks");
        Pupil2.setJvMarks(scanner2.nextInt());

        System.out.println("Enter Second Php Marks");
        Pupil2.setPhMarks(scanner2.nextInt());

        System.out.println("Enter Second Python Marks");
        Pupil2.setPyMarks(scanner2.nextInt());

        sum_1 = PupilFunctions.add(Pupil2.getJvMarks(),Pupil2.getPhMarks(),Pupil2.getPyMarks());
        avg_1 = PupilFunctions.avge(sum_1);

        //Third Pupil

        Scanner scanner3 = new Scanner(System.in);

        Pupils Pupil3 = new Pupils();

        System.out.println("Enter Third Student Name");
        Pupil3.setName(scanner3.nextLine());

        System.out.println("Enter Third Student Registration No");
        Pupil3.setRegno(scanner3.nextLine());

        System.out.println("Enter Third Student Date Of Birth");
        Pupil3.setBirthDate(scanner3.nextLine());


        System.out.println("Enter Third Student Course");
        Pupil3.setCourse(scanner3.nextLine());

        System.out.println("Enter Third Java Marks");
        Pupil3.setJvMarks(scanner3.nextInt());

        System.out.println("Enter Third Php Marks");
        Pupil3.setPhMarks(scanner3.nextInt());

        System.out.println("Enter Third Python Marks");
        Pupil3.setPyMarks(scanner3.nextInt());

        sum_2 = PupilFunctions.add(Pupil3.getJvMarks(),Pupil3.getPhMarks(),Pupil3.getPyMarks());
        avg_2 = PupilFunctions.avge(sum_2);

        sum_3 = PupilFunctions.add(sum,sum_1,sum_2);
        avg_3 = PupilFunctions.average(avg,avg_1,avg_2);

        totJvMarks = PupilFunctions.add(Pupil1.getJvMarks(),Pupil2.getJvMarks(),Pupil3.getJvMarks());
        totPhMarks = PupilFunctions.add(Pupil1.getPhMarks(),Pupil2.getPhMarks(),Pupil3.getPhMarks());
        totPyMarks = PupilFunctions.add(Pupil1.getPyMarks(),Pupil2.getPyMarks(),Pupil3.getPyMarks());



        System.out.println("Pupils Output");
        System.out.println("First Pupil Name:"+Pupil1.getName());
        System.out.println("Second Pupil Name:"+Pupil2.getName());
        System.out.println("Third Pupil Name:"+Pupil3.getName());
        System.out.println("First Pupil Regno:"+Pupil1.getRegno());
        System.out.println("Second Pupil Regno:"+Pupil2.getRegno());
        System.out.println("Third Pupil Regno:"+Pupil3.getRegno());
        System.out.println("First Pupil dateOfBirth:"+Pupil1.getBirthDate());
        System.out.println("Second Pupil dateOfBirth:"+Pupil2.getBirthDate());
        System.out.println("Third Pupil dateOfBirth:"+Pupil3.getBirthDate());
        System.out.println("First Pupil Course:"+Pupil1.getCourse());
        System.out.println("Second Pupil Course:"+Pupil2.getCourse());
        System.out.println("Third Pupil Course:"+Pupil3.getCourse());
        System.out.println("First Pupil Java Marks:"+Pupil1.getJvMarks());
        System.out.println("Second Pupil Java Marks:"+Pupil2.getJvMarks());
        System.out.println("Third Pupil Java Marks:"+Pupil3.getJvMarks());
        System.out.println("First Pupil Php Marks:"+Pupil1.getPhMarks());
        System.out.println("Second Pupil Php Marks:"+Pupil2.getPhMarks());
        System.out.println("Third Pupil Php Marks:"+Pupil3.getPhMarks());
        System.out.println("First Pupil Python Marks:"+Pupil1.getPyMarks());
        System.out.println("Second Pupil Python Marks:"+Pupil2.getPyMarks());
        System.out.println("Third Pupil Python Marks:"+Pupil3.getPyMarks());
        System.out.println("First Pupil Sum##"+sum);
        System.out.println("Second Pupil Sum##"+sum_1);
        System.out.println("Third Pupil Sum##"+sum_2);
        System.out.println("Total Sum##"+sum_3);
        System.out.println("First Pupil Average##"+avg);
        System.out.println("Second Pupil Average##"+avg_1);
        System.out.println("Third Pupil Average##"+avg_2);
        System.out.println("Total Average##"+avg_3);


        Pupils javaDetails= new Pupils();
        javaDetails.setName("Java Marks");
        javaDetails.setMarks(totJvMarks);

        Pupils phpDetails = new Pupils();
        phpDetails.setName("Php Marks");
        phpDetails.setMarks(totPhMarks);

        Pupils pythonDetails = new Pupils();
        pythonDetails.setName("Python Marks");
        pythonDetails.setMarks(totPyMarks);

        List<Pupils> myMarksList =new ArrayList<>();

        myMarksList.add(javaDetails);
        myMarksList.add(phpDetails);
        myMarksList.add(pythonDetails);


        for (int q =0; q < myMarksList.size(); q++)
        {
            System.out.println("Pupil Details"+q+"\t Subject:"+myMarksList.get(q).getName()+"\t Marks:"+myMarksList.get(q).getMarks());

        }
    }
}
;