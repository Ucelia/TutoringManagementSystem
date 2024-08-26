/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Celia
 */
public class StudentTutor {
    private String fullName;
    private String courseName;
    private String tutorName;

    public StudentTutor() {
    }

    public StudentTutor(String fullName, String courseName, String tutorName) {
        this.fullName = fullName;
        this.courseName = courseName;
        this.tutorName = tutorName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    
    
    
}
