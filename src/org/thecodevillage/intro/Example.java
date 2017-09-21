package src.org.thecodevillage.intro;

import src.org.thecodevillage.common.Studentfunction;

import java.util.Scanner;

public class Example{
public static void main(String[] args) { 

 String str="one";
 
 String str1="two";
 
 int x = 5;
 int y = 10;


 Scanner scanner=new Scanner(System.in);
 System.out.println("enter the first number");
 x=scanner.nextInt();

 System.out.println("enter the second number");
 y=scanner.nextInt();

  Car Carbrand=new Car();
  System.out.println("Enter Vehilce Name");
  Carbrand.setName(scanner.nextLine());
  String name="";
  name=scanner.nextLine();


  System.out.println("Vehicle Color");
  Carbrand.setColor(scanner.nextLine());
  String color="";
  color=scanner.nextLine();

  System.out.println("Vehicle Mileage");
  Carbrand.setMileage(scanner.nextInt());


  System.out.println("Car Output");
  System.out.println("name:"+Carbrand.getName());
  System.out.println("color:"+Carbrand.getColor());
  System.out.println("mileage:"+Carbrand.getMileage());
  System.out.println("amount:"+Carbrand.getAmount());

 x = y+x+5+7;
 y--;
 double m=0;
 double n=0;
 int sum=0;
 int prod=0;
 int din =0;
 int subtr =0;
 int getremainder =0;
 m =100.125;
 n =10.1;

 double result = Studentfunction.divide(m,n);

 prod = Studentfunction.multiply(x,y);
 din = Studentfunction.division(x,y);
 subtr =Studentfunction.subt(x,y);
 getremainder = Studentfunction.getremainder(x,y);
 double results=0;
 result=Studentfunction.divide(m,n);
 
System.out.println("We are learning java Today");
System.out.println("Prod##"+prod);
System.out.println("Din##"+din);
System.out.println("Subtr##"+subtr);
System.out.println("Subtr##"+subtr);
System.out.println("double##"+result);

} 


}