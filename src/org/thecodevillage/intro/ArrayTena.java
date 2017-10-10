package src.org.thecodevillage.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 10/10/2017.
 */
public class ArrayTena {

    public static void main (String [] ten) {

        List<String> object =new ArrayList<>();
        object.add("Nicolus");
        object.add("Stanley");
        object.add("Hilda");
        object.add("Elkana");
        object.add("Daisy");

        for (int l =0; l < object.size(); l++)

        {
            String myValue1 = object.get(l);
            System.out.println("Object Name:" +myValue1);
        }

        List<Integer> object1 = new ArrayList<>();

        object1.add(10);
        object1.add(30);
        object1.add(20);
        object1.add(40);
        object1.add(50);

        for (int n =0; n < object1.size(); n++)

        {
            int myValue = object1.get(n);
            System.out.println("Student Name:" +myValue);
        }

        List<College> collegeList = new ArrayList<>();

         College  college = new College();

         college.setName("Billy");
         college.setRegno("REG/452/2017");
         collegeList.add(college);


        for (int q =0; q < collegeList.size(); q++)

        {
            College myValue2 = collegeList.get(0);
            System.out.println("Student Name:" +myValue2.getName()+"\t"+myValue2.getRegno());
        }


    }
}
