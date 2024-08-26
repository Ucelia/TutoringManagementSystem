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
public class Tutor {
    private int tutorId;
    private String fullName;
    private String gender;
    private String email;
    private String courseName;
    private String password;

    public Tutor() {
    }

    public Tutor(int tutorId, String fullName, String gender, String email, String courseName, String password) {
        this.tutorId = tutorId;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.courseName = courseName;
        this.password = password;
    }

    public int getTutorId() {
        return tutorId;
    }

    public void setTutorId(int tutorId) {
        this.tutorId = tutorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
