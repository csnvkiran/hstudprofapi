package org.student.service;

import org.student.model.StudentInformation;

import java.util.List;

public interface IStudentInformationService {

    public List<StudentInformation> findAll();
}
