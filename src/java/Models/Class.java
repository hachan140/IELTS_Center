/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Class {
    private String classId;
    private String cId;
    private Date startDate;
    private Date endDate;
    private String mentorUsername;

    public Class() {
    }

    public Class(String classId, String cId, Date startDate, Date endDate, String mentorUsername) {
        this.classId = classId;
        this.cId = cId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mentorUsername = mentorUsername;
    }

    public String getClassId() {
        return classId;
    }

    public String getcId() {
        return cId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getMentorUsername() {
        return mentorUsername;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setMentorUsername(String mentorUsername) {
        this.mentorUsername = mentorUsername;
    }

    

    

   
    
    
}
