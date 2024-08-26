
package model;

/**
 *
 * @author Celia
 */
public class Student {
    private int studentId;
    private String fullName;
    private String email;
    private String tutorName;
    private String courseName;
    private String password;

    public Student() {
    }

    public Student(int studentId, String fullName, String email, String tutorName, String courseName, String password) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.tutorName = tutorName;
        this.courseName = courseName;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
   
}
