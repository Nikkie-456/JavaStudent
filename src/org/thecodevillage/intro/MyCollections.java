package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.Student1;
import src.org.thecodevillage.common.Student_main;
import src.org.thecodevillage.common.Studentfunction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Administrator on 9/23/2017.
 */
public class MyCollections {
    //hashmap
    //List
    //Array
    //ArrayList
    //LinkedList

   static int marks[] =new int[10];
   static String name[]=new String[10];
   static String Stud2[]=new String[10];


    public static void main (String[] args){
        marks[0] = 40;
        marks[1] = 60;
        marks[2] = 80;
        marks[3] = 90;
        marks[4] = 50;
        marks[5] = 70;
        marks[6] = 60;
        marks[7] = 80;
        marks[8] = 90;
        marks[9] = 70;

        int arrayLength = marks.length;
        int sum2 =0;

        name[0] ="Nicolus";
        name[1] ="Steve";
        name[2] ="Max";
        name[3] ="Pete";
        name[4] ="Nicole";
        name[5] ="Ryan";
        name[6] ="Taylor";
        name[7] ="Sia";
        name[8] ="Billy";
        name[9] ="Jim";

        System.out.println("$$"+arrayLength);

        // for loop

       for (int i=0; i< marks.length; i++) {
           System.out.println("Item"+i+"\t Value:"+marks[i]);
           sum2 = sum2+marks[i];
          // sum2+ =marks[i];
       }

       for (int z=0; z < marks.length; z++) {
           System.out.println("Item"+z+"\t Value:"+name[z]);
       }

        System.out.println("Sum2::"+sum2);



       //while loop

        int counter = 0;

        while (counter < marks.length) {System.out.println("Marks While Loop##"+marks[counter]);
        counter++;}

        //do while
        int cnt = 12;
        do{
            if (cnt > marks.length)
                    System.out.println("Position not defined in system");
            else
                {
            System.out.println("Marks Do While##"+marks[cnt]);
            cnt++;}
        }
       while (cnt < marks.length);


        String grade="A";

        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Merit");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Weak");
                break;
            case "E":
                System.out.println("Very Weak");
                break;
            default:
                System.out.println("Not Defined");
        }

        /**
         * List
         */

        List<Integer> myList=new ArrayList<>();
        myList.add(50);
        myList.add(30);
        myList.add(90);
        myList.add(70);
        myList.add(80);

        int ctr = 0;

        while (ctr < myList.size()){
            System.out.println("MyList##"+myList.get(ctr));
            System.out.println("MyList##"+myList.size());
            ctr++;
        }

        System.out.println("MyList##"+myList.get(0));
        System.out.println("MyList##"+myList.size());

        // for loop shortcut

        for (Integer item: myList) {
            System.out.println("MyList##"+item);}


        List<String> myList1=new ArrayList<>();
        myList1.add("Nicolus");
        myList1.add("Daisy");
        myList1.add("Hilda");
        myList1.add("Elkana");
        myList1.add("June");
        myList1.add("Jack");

        int cnt1 = 0;

        while (cnt1 < myList1.size()) {
            System.out.println("MyList1##"+myList1.get(cnt1));
            System.out.println("MyList1##"+myList1.size());
            cnt1++;
        }


      Car toyota= new Car();
        toyota.setName("Axio");
        toyota.setColor("Grey");
      Car subaru = new Car();
        subaru.setName("Legacy");
        subaru.setColor("White");
      Car nissan = new Car();
        nissan.setName("Fuga");
        nissan.setColor("Blue");

        List<Car> vehicleDetails=new ArrayList<>();

        vehicleDetails.add(toyota);
        vehicleDetails.add(subaru);
        vehicleDetails.add(nissan);

        int cnt2 = 0;

        while (cnt2 < vehicleDetails.size()) {
            System.out.println("vehicleDetails##"+vehicleDetails.get(0).getName());
            System.out.println("vehicleDetails##"+vehicleDetails.size());
            cnt2++;
        }

        for (int p=0; p < vehicleDetails.size(); p++)
        {
            System.out.println("Item"+p+"\t Value:"+vehicleDetails.get(p).getName()+"\t Color:"+vehicleDetails.get(p).getColor());

        }












    }

}

