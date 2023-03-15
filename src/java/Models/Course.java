/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Course {
    private String courseId;
    private String courseName;
    private String detail;
    private int fee;

    public Course() {
    }

    public Course(String courseId, String courseName, String detail, int fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.detail = detail;
        this.fee = fee;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDetail() {
        return detail;
    }

    public int getFee() {
        return fee;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
}
