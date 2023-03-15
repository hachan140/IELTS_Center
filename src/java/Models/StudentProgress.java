/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class StudentProgress {
    private String username;
    private String courseId;
    private int progress;
    private String classId;
   
    

    public StudentProgress() {
    }

    public StudentProgress(String username, String courseId, int progress, String classId) {
        this.username = username;
        this.courseId = courseId;
        this.progress = progress;
        this.classId = classId;
     
    }

    public String getUsername() {
        return username;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getProgress() {
        return progress;
    }

    public String getClassId() {
        return classId;
    }

   

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

   

    
}
