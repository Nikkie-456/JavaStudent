package src.org.thecodevillage.common;

import src.org.thecodevillage.intro.College;
import src.org.thecodevillage.intro.College;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 9/29/2017.
 */
public class Mydbcon {


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

         //viewStudent();
        //updateStudent();
        //deleteStudent();
        //insertStudent();

    }


      //View data

    public static void viewStudent() {
        ResultSet rs_2=null;
        PreparedStatement pstmt =null;
        Connection conn =null;
        try {
            conn = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
           // String sql = "Select id,name,course,dateofbirth,registration,javamarks,phpmarks,pythonmarks from tbl_students where id in (12)";
            String sql = "Select * from tbl_students";
            pstmt = conn.prepareStatement(sql);
            rs_2 = pstmt.executeQuery(sql);
            while (rs_2.next()) {

                int id = rs_2.getInt("id");
                String name = rs_2.getString("name");
                String course = rs_2.getString("course");
                String dateofbirth = rs_2.getString("dateofbirth");
                String registration = rs_2.getString("registration");
                int javamarks = rs_2.getInt("javamarks");
                int phpmarks = rs_2.getInt("phpmarks");
                int pythonmarks = rs_2.getInt("pythonmarks");
                System.out.println(id + "\t" + name + "\t" + course + "\t" + dateofbirth + "\t" + registration + "\t" + javamarks + "\t" + phpmarks + "\t" + pythonmarks);
            }

        } catch (Exception z) {
            System.out.println(z);
            System.out.println("View Data");
        } finally {
            try {
                rs_2.close();
                pstmt.close();
                conn.close();
            }
            catch (SQLException g) {
                g.printStackTrace();
            }

        }
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

    public static void insertStudent(College pupils) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = getDbConnection("jdbc:mysql://localhost:3306/students_db", "root", "");
            System.out.println("Insert new record...");
            String sql = "insert into tbl_students (name,registration,course,javamarks,phpmarks,pythonmarks,dateofbirth) values (?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, pupils.getName());
            statement.setString(2, pupils.getRegno());
            statement.setString(3, pupils.getCourse());
            statement.setInt(4, pupils.getJvMarks());
            statement.setInt(5, pupils.getPhMarks());
            statement.setInt(6, pupils.getPyMarks());
            statement.setString(7, pupils.getBirthDate());

            statement.executeUpdate();

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


