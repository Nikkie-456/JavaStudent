package src.org.thecodevillage.intro;

/**
 * Created by Administrator on 9/26/2017.
 */
public class CampusFunction {

    public static int add(int x,int y,int z){
        return x+y+z;
    }

    public static int sum1(int x){
        return x;
    }

    public static int multiply(int a,int b) {
        return a * b;
    }

    public static int division(int a,int b)
    {return a / b;}

    public static int subt(int a,int b)
    {return a-b;}

    public static int getremainder(int a,int b)
    {return a % b;}

    public static  double divide(double m,double n)
    {return m/n;}

    public static int average(int x,int y,int z)
    {
        return ((x+y+z)/3);
    }

    public static int avge(int sum)
    {
        return (sum/3);
    }

    public static String grade(int marks) {
        String grade="";

        if (marks >= 80) {
            grade ="A";
        } else if (marks >= 70 && marks < 80) {
            grade = "B";
        }
        else if ( marks >= 50 && marks < 60) {
            grade = "C";
        }
        else if (marks >= 40 && marks < 50 ) {
            grade = "D";
        }
        else {
            grade = "E";
        }

        return grade;
    }
}
