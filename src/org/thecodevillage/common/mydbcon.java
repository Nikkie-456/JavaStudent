package src.org.thecodevillage.common;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 9/29/2017.
 */
public class mydbcon {


    public static void main(String args[]) {
        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from tbl_students;");
            while (rs.next())
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("course"));
            con.close();
        } catch (Exception i) {
            System.out.println(i);
            i.printStackTrace();
        }

        updateStudent();
        deleteStudent();
        insertStudent();

    }

        // Update Section

    public static void updateStudent(){

        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
            System.out.println("Updating statement...");
            Statement stmt = con.createStatement();
            int rs1 = stmt.executeUpdate("Update tbl_students " + "SET course = 'Commerce' WHERE id in (1,2)");
            System.out.println("Result:"+rs1);
            con.close();

        } catch (Exception j) {
            System.out.println(j);
            j.printStackTrace();
        }


    }


    // Delete Section

    public static void deleteStudent(){

        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
            System.out.println("Delete statement...");
            Statement stmt = con.createStatement();
            int rs1 = stmt.executeUpdate("Delete from  tbl_students " + " WHERE id in (6)");
            System.out.println("Result:"+rs1);
            con.close();

        } catch (Exception k) {
            System.out.println(k);
            k.printStackTrace();
        }


    }


    // Insert Section

    public static void insertStudent() {
        try {
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
            System.out.println("Insert new record...");
            String sql = ("insert into tbl_students (name,registration,course,javamarks,phpmarks,pythonmarks,dateofbirth) values ('Biko','456324','IT',75,65,80,'20070906')");
            PreparedStatement statement = con.prepareStatement(sql);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);

        } catch (Exception m) {
            System.out.println(m);
            System.out.println("Insert Error");
        }
    }



    public static  Connection getDbConnection(String url,String username,String password) {
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        }
        catch (Exception h) {
            System.out.println(h);
            h.printStackTrace();
        }
        return con;
        }

    }


