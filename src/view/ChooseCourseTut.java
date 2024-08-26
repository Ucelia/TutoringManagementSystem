/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.StudTutorDao;
import Dao.StudentDao;
import Dao.TutorDao;
import java.util.List;
import javax.swing.JOptionPane;
import model.Course;
import model.Student;
import model.StudentTutor;
import model.Tutor;

/**
 *
 * @author Celia
 */
public class ChooseCourseTut extends javax.swing.JFrame {

    String selectedCourse;
    String tutorName; 
    /**
     * Creates new form StudentDashboard
     */
    public ChooseCourseTut() {
        initComponents();
        studentCourse();
        
    }
    
    private void studentCourse(){
      StudentDao dao=new StudentDao();
        List<Course> courses=dao.allCourse();
        if(courses!=null){
            for(Course studcourse: courses){
            courseNameCombo.addItem(String.valueOf(studcourse.getCourseName()));
            
       }
    }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tutorCombo = new javax.swing.JComboBox<>();
        courseNameCombo = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        logoutLink = new javax.swing.JLabel();
        viewCourseBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fullNameTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 30)); // NOI18N
        jLabel1.setText("Choose a course and a tutor:");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel4.setText("Tutor:");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel5.setText("Course:");

        tutorCombo.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        tutorCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tutorComboMouseClicked(evt);
            }
        });

        courseNameCombo.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        courseNameCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseNameComboMouseClicked(evt);
            }
        });
        courseNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameComboActionPerformed(evt);
            }
        });

        submitBtn.setBackground(java.awt.SystemColor.textHighlight);
        submitBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.textHighlight);
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        logoutLink.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        logoutLink.setForeground(new java.awt.Color(51, 51, 255));
        logoutLink.setText("Logout");
        logoutLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLinkMouseClicked(evt);
            }
        });

        viewCourseBtn.setBackground(java.awt.SystemColor.textHighlight);
        viewCourseBtn.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        viewCourseBtn.setText("View Courses");
        viewCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourseBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel6.setText("Full Name:");

        fullNameTxt.setFont(new java.awt.Font("Mongolian Baiti", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(courseNameCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 357, Short.MAX_VALUE)
                                            .addComponent(fullNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tutorCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(logoutLink)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(viewCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(fullNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(courseNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tutorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(logoutLink)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tutorComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tutorComboMouseClicked

        tutorName = tutorCombo.getSelectedItem().toString();
        
    }//GEN-LAST:event_tutorComboMouseClicked

    private void courseNameComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseNameComboMouseClicked

       selectedCourse = courseNameCombo.getSelectedItem().toString();
        
    }//GEN-LAST:event_courseNameComboMouseClicked

    private void courseNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameComboActionPerformed
        
    String selectedCourse = courseNameCombo.getSelectedItem().toString();
    // Clear existing items in tutorCombo
    tutorCombo.removeAllItems();
    StudentDao dao =new StudentDao();

    // Populate tutorCombo based on the selected course
    List<Tutor> tutors = dao.allTutor(selectedCourse);
    if (tutors != null) {
        for (Tutor tutor : tutors) {
            tutorCombo.addItem(String.valueOf(tutor.getFullName()));
        }
    }
    }//GEN-LAST:event_courseNameComboActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       if(fullNameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Full Name is Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);
        }else if(courseNameCombo.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Course Name is Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);
        }else if(tutorCombo.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Tutor Name is Mandatory","Mandatory Field",JOptionPane.WARNING_MESSAGE);
        }
        
       selectedCourse = courseNameCombo.getSelectedItem().toString();
       tutorName = tutorCombo.getSelectedItem().toString();
        StudentTutor theStudTut= new StudentTutor();
        theStudTut.setFullName(fullNameTxt.getText()); 
        theStudTut.setCourseName(selectedCourse);
        theStudTut.setTutorName(tutorName);

       StudTutorDao dao = new StudTutorDao();
       String feedback = dao.takeCourse(theStudTut);
       JOptionPane.showMessageDialog(this, feedback);
       
       fullNameTxt.setText(""); 
       courseNameCombo.setSelectedItem("");
       tutorCombo.setSelectedItem("");
       
    }//GEN-LAST:event_submitBtnActionPerformed

    private void logoutLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLinkMouseClicked
        HomePage st = new HomePage();
        st.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutLinkMouseClicked

    private void viewCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourseBtnActionPerformed
        StudentDashboard st = new StudentDashboard();
        st.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewCourseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseCourseTut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseCourseTut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseCourseTut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseCourseTut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseCourseTut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> courseNameCombo;
    public static javax.swing.JTextField fullNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutLink;
    private javax.swing.JButton submitBtn;
    public static javax.swing.JComboBox<String> tutorCombo;
    private javax.swing.JButton viewCourseBtn;
    // End of variables declaration//GEN-END:variables
}
