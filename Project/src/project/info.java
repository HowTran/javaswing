/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author lenovo
 */

public class info {
    int id;
    String fullname, gender, email, topic, student_id;

    public info() {
    }

    public info(int id, String fullname, String gender, String email, String topic, String student_id) {
        this.id = id;
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.topic = topic;
        this.student_id = student_id;
    }

    public info(String fullname, String gender, String email, String topic, String student_id) {
        this.fullname = fullname;
        this.gender = gender;
        this.email = email;
        this.topic = topic;
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    
} 

