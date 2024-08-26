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
import model.Course;
import model.Student;
import model.StudentTutor;

/**
 *
 * @author Celia
 */
public class StudTutorDao {
    private String dbUrl="jdbc:mysql://localhost:3306/tutoring_management_system_db";
    private String username="root";
    private String passwd="";

    public StudTutorDao() {
    }
    
    public String takeCourse(StudentTutor studTutObj){
        try{
            
           Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           
           String sql ="insert into studenttutor (full_name,course_name,tutor_name) values(?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           
           pst.setString(1, studTutObj.getFullName());
           pst.setString(2, studTutObj.getCourseName());
           pst.setString(3, studTutObj.getTutorName());
           
            
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
                return "Submitted Successfully";
            }else{
                return "Failed to submit";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "Server Error!!";
    }
    
    
    public List<Course> allCourse(){
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
    
    
    public List<StudentTutor> allStudTutor(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from studenttutor";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<StudentTutor> studTutorList = new ArrayList<>();
            while(result.next()){
                StudentTutor studTutObj = new StudentTutor();
                studTutObj.setFullName(result.getString("full_name"));
                studTutObj.setCourseName(result.getString("course_name"));
                studTutObj.setTutorName(result.getString("tutor_name"));
                studTutorList.add(studTutObj);
            }
            con.close();
            return studTutorList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public StudentTutor searchStud(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from studenttutor";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet result = pst.executeQuery();
            StudentTutor theStudTut = new StudentTutor();
            boolean flag = false;
            while(result.next()){
                theStudTut.setFullName(result.getString("full_name"));
                theStudTut.setCourseName(result.getString("course_name"));
                theStudTut.setTutorName(result.getString("tutor_name"));
                 flag=true;
            }
            
            con.close();
            if(flag){
              
                return theStudTut;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
}
