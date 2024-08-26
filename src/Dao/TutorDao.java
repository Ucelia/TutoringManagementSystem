/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import model.Course;
import model.Student;
import model.Tutor;

/**
 *
 * @author Celia
 */
public class TutorDao {
    private String dbUrl="jdbc:mysql://localhost:3306/tutoring_management_system_db";
    private String username="root";
    private String passwd="";

    public TutorDao() {
    }
    
    public String registerTutor(Tutor tutorObj, String gender, String courseName){
        try{
            
           Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           
           String sql ="insert into tutor (full_name,gender,email,course_name,password) values(?,?,?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           
           pst.setString(1, tutorObj.getFullName());
           pst.setString(2, gender);
           pst.setString(3, tutorObj.getEmail());
           pst.setString(4, courseName);
           pst.setString(5, tutorObj.getPassword());
           
            
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
                return "Registered Successfully";
            }else{
                return "Not registered";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "Server Error!!";
    }
    
    public String loginTutor(String email, String password) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, passwd);

        String sql = "SELECT * FROM tutor WHERE email = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, email);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            // If a matching record is found, return "Login Successful"
            con.close();
            return "Login Successful";
        } else {
            // If no matching record is found, return "Login Failed"
            con.close();
            return "Login Failed";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "Server Error!!";
    }
    
    public List<Tutor> allTutors(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from tutor";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<Tutor> tutorList = new ArrayList<>();
            while(result.next()){
                Tutor tutortObj = new Tutor();
                tutortObj.setTutorId(result.getInt("tutor_id"));
                tutortObj.setFullName(result.getString("full_name"));
                tutortObj.setGender(result.getString("gender"));
                tutortObj.setEmail(result.getString("email"));
                tutortObj.setCourseName(result.getString("course_name"));
                tutortObj.setPassword(result.getString("password"));
                tutorList.add(tutortObj);
            }
            con.close();
            return tutorList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Course> allCourses(){
         try {
             Connection con=DriverManager.getConnection(dbUrl, username, passwd);
            String sql="Select * from course";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet result=pst.executeQuery();
            List<Course> courseList= new ArrayList<>();
            while(result.next()){
                Course crs=new Course();
                crs.setCourseName(result.getString("course_Name"));
                courseList.add(crs);
            }
            con.close();
            return courseList; 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
          return null;
   
}
    
    public String deleteTutor(Tutor obj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "delete from tutor where email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, obj.getEmail());
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "Tutor deleted successfully";
           }else{
               return "Tutor not deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "SEVER ERROR";
    }
    
    
    
    public Tutor searchTutor(Tutor tutorObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from tutor";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            Tutor theTutor = new Tutor();
            boolean flag = false;
            while(result.next()){
                theTutor.setFullName(result.getString("full_name"));
                theTutor.setGender(result.getString("gender"));
                theTutor.setEmail(result.getString("email"));
                theTutor.setCourseName(result.getString("course_name"));
                theTutor.setPassword(result.getString("password"));
                flag=true;
            }
            
            con.close();
            if(flag){
                
                return theTutor;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public String updateTutor(Tutor tutorObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           String sql ="update tutor set gender=?,email=?,course_name=?,password=? where full_name=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1, tutorObj.getGender());
           pst.setString(3,tutorObj.getCourseName());
           pst.setString(2, tutorObj.getEmail());
           pst.setString(4,tutorObj.getPassword());
          pst.setString(5,tutorObj.getFullName());
            //execute query
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
//                con.close();
                return "Tutor updated Successfully";
            }else{
//                con.close();
                return "Tutor not updated";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "Server Error!!";
    }
    
}
