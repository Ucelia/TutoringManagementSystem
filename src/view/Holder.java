/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Celia
 */
public class Holder {
    public static String FullName;
    public static String Email;
    public static String tutorName;

    public Holder() {
    }

    public Holder(String FullName, String Email, String tutorName) {
        this.FullName = FullName;
        this.Email = Email;
        this.tutorName = tutorName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    
    
    
    
}
