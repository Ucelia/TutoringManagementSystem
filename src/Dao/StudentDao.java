
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
import model.StudentTutor;
import model.Tutor;

/**
 *
 * @author Celia
 */
public class StudentDao {
    private String dbUrl="jdbc:mysql://localhost:3306/tutoring_management_system_db";
    private String username="root";
    private String passwd="";

    public StudentDao() {
    }
    
     public String registerStudent(Student studentObj){
        try{
            
           Connection con = DriverManager.getConnection(dbUrl,username,passwd);
           
           String sql ="insert into student (full_name,email,password) values(?,?,?)";
           PreparedStatement pst = con.prepareStatement(sql);
           
           pst.setString(1, studentObj.getFullName());
           pst.setString(2, studentObj.getEmail());
           pst.setString(3, studentObj.getPassword());
           
            
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
     
     
     public String loginStudent(String email, String password) {
    try {
        Connection con = DriverManager.getConnection(dbUrl, username, passwd);

        String sql = "SELECT * FROM student WHERE email = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, email);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            // If a matching record is found, return "Login Successful"
            //con.close();
            return "Student Login Successful";
        } else {
            // If no matching record is found, return "Login Failed"
            //con.close();
            return "Login Failed";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "Server Error!!";
    }
     
     public String deleteStudent( String email){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "delete from student where email=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "Student deleted successfully";
           }else{
               return "Student not deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
     
     
     
     /*public String deleteStudTut( String full_name){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "delete course_name,tutor_name from studenttutor where full_name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, full_name);
            int rowAffected= pst.executeUpdate();
            con.close();
           if(rowAffected>0){
               return "Student deleted successfully";
           }else{
               return "Student not deleted";
           }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }*/
     
     
     
     public List<Student> allStudent(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from student";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            List<Student> studentList = new ArrayList<>();
            while(result.next()){
                Student studentObj = new Student();
                studentObj.setStudentId(result.getInt("student_id"));
                studentObj.setFullName(result.getString("full_name"));
                studentObj.setEmail(result.getString("email"));
                studentObj.setPassword(result.getString("password"));
                studentList.add(studentObj);
            }
            con.close();
            return studentList;
        }catch(Exception ex){
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
      
      public List<Tutor> allTutor(String course){
        List<Tutor> tutors = new ArrayList<>();
        String sql = "SELECT * FROM tutor WHERE course_name = ?";

        try (Connection con = DriverManager.getConnection(dbUrl, username, passwd);
             PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            preparedStatement.setString(1, course);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Tutor tutor = new Tutor();
                    // Set tutor properties based on the ResultSet
                    tutor.setFullName(resultSet.getString("full_name"));
                    // tutor.setGender(resultSet.getString("gender"));
                    // ... (other properties)
                    tutors.add(tutor);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace(); // Handle or log the exception
        }

        return tutors;
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
      
      public List<String> getTutorInfoForStudent(String studentFullName) {
        List<String> tutorInfo = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
            String query = "SELECT tutor_name, course_name FROM studenttutor WHERE full_name = ?";

            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, studentFullName);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        tutorInfo.add(resultSet.getString("tutor_name"));
                        tutorInfo.add(resultSet.getString("course_name"));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();  // Handle the exception according to your application's needs
        }

        return tutorInfo;
    }
      
      
      
      public List<String> getTutorInfoByEmail(String tutorEmail) {
        List<String> tutorInfo = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
            String query = "SELECT tutor_name, course_name FROM tutor WHERE email = ?";

            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, tutorEmail);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        tutorInfo.add(resultSet.getString("tutor_name"));
                        tutorInfo.add(resultSet.getString("course_name"));
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();  // Handle the exception according to your application's needs
        }

        return tutorInfo;
    }
      
     public List<Student> getStudentsByCourse(String courseName) {
        List<Student> students = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(dbUrl, username, passwd)) {
            String query = "SELECT * FROM student WHERE course_name = ?";

            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, courseName);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Student student = new Student();
                        student.setStudentId(resultSet.getInt("student_id"));
                        student.setFullName(resultSet.getString("full_name"));
                        student.setEmail(resultSet.getString("email"));
                        student.setPassword(resultSet.getString("password"));
                        // Add more attributes as needed

                        students.add(student);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();  // Handle the exception according to your application's needs
        }

        return students;
    } 
     
     public Student findStud(){
        try{
            Connection con = DriverManager.getConnection(dbUrl, username, passwd);
            String sql = "select * from student";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet result = pst.executeQuery();
            Student theStud = new Student();
            boolean flag = false;
            while(result.next()){
                theStud.setFullName(result.getString("full_name"));
                theStud.setEmail(result.getString("email"));
                theStud.setTutorName(result.getString("tutor_name"));
                 flag=true;
            }
            
            con.close();
            if(flag){
              
                return theStud;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   
}
     
     

