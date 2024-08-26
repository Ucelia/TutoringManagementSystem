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



/**
 *
 * @author Celia
 */
public class CourseDao {
    private String dbUrl="jdbc:mysql://localhost:3306/tutoring_management_system_db";
    private String username="root";
    private String passwd="";

    public CourseDao() {
    }
    
     public String addCourse(Course courseObj){
        try{
            
           Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           
           String sql ="insert into course (course_code,course_name) values(?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           
           pst.setString(1, courseObj.getCourseCode());
           pst.setString(2, courseObj.getCourseName());
           
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
                return "course added Successfully";
            }else{
                return "Course not added";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "SERVER ERROR";
        //SERVER ERROR
        //Course added already
    }
     
     public List<Course> allCourses(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from course";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<Course> courseList = new ArrayList<>();
            while(result.next()){
                Course courseObj = new Course();
                courseObj.setCourseCode(result.getString("course_code"));
                courseObj.setCourseName(result.getString("course_name"));
                courseList.add(courseObj);
            }
            con.close();
            return courseList;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     
     public Course searchCourse(Course courseObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from course where course_code=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, courseObj.getCourseCode());
            ResultSet result = pst.executeQuery();
            Course theCourse = new Course();
            boolean flag = false;
            while(result.next()){
                theCourse.setCourseCode(result.getString("course_code"));
                theCourse.setCourseName(result.getString("course_name"));
                flag=true;
            }
            
            con.close();
            if(flag){
                System.out.println("Course Code: "+theCourse.getCourseCode());
                return theCourse;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     
     public String updateCourse(Course courseObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           String sql ="update course set course_name=? where course_code=?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,courseObj.getCourseName());
           pst.setString(2, courseObj.getCourseCode());
            //execute query
            int rowAffected = pst.executeUpdate();
            con.close();
            if(rowAffected >=1){
//                con.close();
                return "Course updated Successfully";
            }else{
//                con.close();
                return "Course not updated";
            }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return "Server Error!!";
    }
     
     public String deleteCourse(Course courseObj){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "delete from course where course_code=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, courseObj.getCourseCode());
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "Course deleted successfully";
           }else{
               return "Course not deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
