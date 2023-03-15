/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class LessonProgress {
    private String username;
    private String courseId;
    private String lessonId;

    public LessonProgress() {
    }

    public LessonProgress(String username, String courseId, String lessonId) {
        this.username = username;
        this.courseId = courseId;
        this.lessonId = lessonId;
    }

    public String getUsername() {
        return username;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }
    
}
