/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class Lesson {
    private String lessonId;
    private String lessonName;
    private String lessonDetail;
    private String courseId;

    public Lesson() {
    }

    public Lesson(String lessonId, String lessonName, String lessonDetail, String courseId) {
        this.lessonId = lessonId;
        this.lessonName = lessonName;
        this.lessonDetail = lessonDetail;
        this.courseId = courseId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getLessonDetail() {
        return lessonDetail;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setLessonDetail(String lessonDetail) {
        this.lessonDetail = lessonDetail;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
}
