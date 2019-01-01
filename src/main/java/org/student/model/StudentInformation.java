package org.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="student_info")
public class StudentInformation implements Serializable {

    @Id
    @Column(name="STUD_ID")
    private Long StudentId;

    @Column(name = "STUD_NAME")
    private String studentName;


    public StudentInformation(){

    }

    public StudentInformation(Long id, String name){
        this.StudentId = id;
        this.studentName = name;
    }
    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
