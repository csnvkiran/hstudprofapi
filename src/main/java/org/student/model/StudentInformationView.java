package org.student.model;




import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Immutable
@Table(name="STUDENT_INFO_V")
public class StudentInformationView implements Serializable {

    @Id
    @Column(name="STUD_ID")
    private Long StudentId;

    @Column(name = "STUD_NAME")
    private String studentName;


    public StudentInformationView(){

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
