package src.org.thecodevillage.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 10/7/2017.
 */
public class mult {

    public static void main (String [] bm) {
        int mul =0;
        int k =4;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number Of Students");
       // mul =scanner.nextInt();
        mul =10;

        for (int q =1; q <= mul; q++) {
            System.out.println(+k+"\t" +"X"+"\t"+q+"\t"+" = "+(k*q));
        }
    }
}
